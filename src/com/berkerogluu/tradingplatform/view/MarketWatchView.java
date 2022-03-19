package com.berkerogluu.tradingplatform.view;

import javax.swing.*;
import java.awt.*;

public class MarketWatchView extends JPanel{

    public MarketWatchView(){
        this.setBounds(40,80,200,200);
        this.setBackground(Color.GRAY);
    }

    public JPanel getPanel(){
        return this;
    }

}
