package com.sheep.test;

import com.sheep.model.Card;
import com.sheep.model.Cell;
import com.sheep.model.Layer;
import com.sheep.model.Map;
import com.sheep.util.MapUtil;

import javax.swing.*;
import java.util.List;

public class TestRenderMap extends JFrame {

    private Map map = MapUtil.build(3);

    public TestRenderMap() {
        // 1. init window
        init();

        // 2. render map
        List<Layer> list = map.getList();

        for (int i = 0; i < list.size(); i++) {
            renderLayer(list.get(i));
        }

        // 3. auto refresh
        autoRefresh();
    }

    private void renderLayer(Layer layer) {
        Cell[][] cells = layer.getCells();

        for (int row = 0; row < cells.length; row++) {
            for (int col = 0; col < cells[row].length; col++) {
                Card card = cells[row][col].getCard();
                int x = col * 50;
                int y = row * 50;
                card.setBounds(x, y, 50, 50);
                this.getContentPane().add(card);
            }
        }
    }

    private void init() {
        this.setTitle("羊了个羊");
        this.setSize(450, 800);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        this.setLayout(null); //绝对布局
        this.setBounds(0, 0, 450, 800);

        this.setLocationRelativeTo(null); //居中

        this.setVisible(true);
    }

    private void autoRefresh() {

        JFrame start = this;

        new Thread(new Runnable() {
            @Override
            public void run() {
                while (true) {
                    start.repaint();
                    try {
                        Thread.sleep(40);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
    }

    public static void main(String[] args) {
        new TestRenderMap();
    }
}


