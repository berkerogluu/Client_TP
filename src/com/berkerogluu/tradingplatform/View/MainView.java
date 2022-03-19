package com.berkerogluu.tradingplatform.View;

import javax.swing.*;
import java.util.Locale;
import java.util.ResourceBundle;

public class MainView extends JFrame{
    private static ResourceBundle mBundle;

    public MainView(){
        // -Language Support-
        // Locale.setDefault(new Locale("en_US"));
        Locale.getDefault();
        mBundle = ResourceBundle.getBundle("MainView");

        // Frame
        this.setTitle(mBundle.getString("TITLE"));
        this.setVisible(true);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setExtendedState(this.getExtendedState() | JFrame.MAXIMIZED_BOTH);
    }

    public JFrame getFrame(){
        return this;
    }
}

