package com.berkerogluu.tradingplatform.view;

import javax.swing.JFrame;

public class FrameView extends JFrame{

    public FrameView(){
        // Frame
        this.setTitle("Trading Platform");
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        this.setVisible(true);
    }

    public JFrame getFrame(){
        return this;
    }
}

