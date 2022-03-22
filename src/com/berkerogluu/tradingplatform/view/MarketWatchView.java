package com.berkerogluu.tradingplatform.view;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;

public class MarketWatchView{

    private JPanel mPanel;
    private JTable mTable;
    private JScrollPane mScrollPane;

    public MarketWatchView(){
        mPanel = new JPanel();
        mPanel.setBackground(Color.GRAY);


        String[] columnNames = { "Symbol", "Ask", "Bid", "Spread" };
        String[][] data = {{"USDJPY","136.500","136.502","2"}};

        DefaultTableModel mModel = new DefaultTableModel(data, columnNames){
            @Override
            public boolean isCellEditable(int row, int column){
                    return false;
            }
        };

        mTable = new JTable(mModel);
        mTable.setPreferredScrollableViewportSize(mTable.getPreferredSize());
        mTable.setFillsViewportHeight(true);

        mPanel.add(new JScrollPane(mTable));
    }

    public JPanel getPanel(){
        return mPanel;
    }

}
