package com.berkerogluu.tradingplatform.view;

import javax.swing.JFrame;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class FrameView extends JFrame{

    public FrameView(){
        GraphicsEnvironment mEnv = GraphicsEnvironment.getLocalGraphicsEnvironment();
        this.setTitle("Trading Platform");
        this.setLayout(new BorderLayout());
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(new Dimension(800,600));
        this.setLocationRelativeTo(null);
        this.setExtendedState(getExtendedState() | JFrame.MAXIMIZED_BOTH);
    }

    public JFrame getFrame(){
        return this;
    }
}

