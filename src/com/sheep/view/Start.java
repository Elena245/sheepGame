package com.sheep.view;
/*
    游戏的启动入口
 */

import com.sheep.model.Card;

import javax.swing.*;
import java.awt.*;

public class Start extends JFrame {

    private Card background = new Card("背景草地");

    public Start() throws HeadlessException {
        init();
        // auto refresh the thread
        autoRefresh();
    }

    private void init() {
        this.setTitle("羊了个羊");
        this.setSize(450,  800);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null); //居中
        // add customised componet to current window
//        brand.setBounds(0,0,50,50);

        this.getContentPane().add(background);
        this.setVisible(true);
    }

    private  void autoRefresh(){
        Start start = this;
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
        new Start();
    }
}