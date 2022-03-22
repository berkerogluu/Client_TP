package com.berkerogluu.tradingplatform.view;

import com.berkerogluu.tradingplatform.view.*;

import javax.swing.*;
import java.awt.*;

public class MainView {

    private FrameView mFrameView;
    private MarketWatchView mMarketWatchView;

    public MainView(){
        mFrameView = new FrameView();
        mMarketWatchView = new MarketWatchView();

        mFrameView.add(mMarketWatchView.getPanel(), BorderLayout.WEST);

        // End Render
        mFrameView.setVisible(true);
    }
}

