package com.sheep.test;

import com.sheep.model.Card;
import com.sheep.model.Cell;
import com.sheep.model.Layer;
import com.sheep.util.LayerUtil;
import com.sheep.view.Start;

import javax.swing.*;

public class TestRenderLayer extends JFrame {

    private Layer layer = LayerUtil.buildLayer(6,6);

    public TestRenderLayer(){
        // 1. init window
        init();

        // 2. render layer
        Cell[][] cells = layer.getCells();

        for (int row = 0; row < cells.length; row++) {
            for (int col = 0; col < cells[row].length; col++) {
                Card card = cells[row][col].getCard();
                this.getContentPane().add(card);
            }
        }

        // 3. auto refresh
        autoRefresh();
    }

    private  void init(){
        this.setTitle("羊了个羊");
        this.setSize(450,  800);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null); //居中

        this.setLayout(null); //绝对布局
        this.setBounds(0,0,450,800);
        this.setVisible(true);
    }

    private  void autoRefresh(){

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
        new TestRenderLayer();
    }
}


