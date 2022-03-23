package com.berkerogluu.tradingplatform.view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

public class MarketWatchView extends JTable {

    public MarketWatchView() {

        String[] columnNames = { "Symbol", "Ask", "Bid", "Spread" };
        String[][] data = {{"USDJPY","136.500","136.502","2"}};

        DefaultTableModel mModel = new DefaultTableModel(data, columnNames){
            @Override
            public boolean isCellEditable(int row, int column){
                    return false;
            }
        };

        this.setModel(mModel);
        this.setPreferredScrollableViewportSize(this.getPreferredSize());
        this.setFillsViewportHeight(true);
    }

    public JScrollPane getTable(){
        return new JScrollPane(this);
    }
}
