package com.berkerogluu.tradingplatform.view;

import com.berkerogluu.tradingplatform.view.*;
import java.awt.*;

public class MainView {

    private FrameView mFrameView;
    private LeftPanelView mLeftPanelView;
    private MarketWatchView mMarketWatchView;

    public MainView(){
        mFrameView = new FrameView();
        mLeftPanelView = new LeftPanelView();
        mMarketWatchView = new MarketWatchView();

        mLeftPanelView.getPanel().add(mMarketWatchView.getTable());
        mFrameView.add(mLeftPanelView.getPanel(), BorderLayout.WEST);

        // End Render
        mFrameView.setVisible(true);
    }
}

