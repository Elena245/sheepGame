package com.sheep.view;
/*
    游戏的启动入口
 */

import javax.swing.*;
import java.awt.*;

public class Start extends JFrame {
    public Start() throws HeadlessException {
        this.setTitle(("羊了个羊"));
        this.setSize(400, 800);
        this.setVisible(true);
        this.setLocationRelativeTo(null); //居中
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        new Start();
    }
}