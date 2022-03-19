package com.berkerogluu.tradingplatform.view;

import javax.swing.JFrame;
import java.awt.*;

public class FrameView extends JFrame{

    public FrameView(){
        this.setTitle("Trading Platform");
        this.setLayout(null);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(new Dimension(600,400));
        this.setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);
        this.setVisible(true);
    }

    public JFrame getFrame(){
        return this;
    }
}

