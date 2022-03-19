package com.berkerogluu.tradingplatform;

import com.berkerogluu.tradingplatform.controller.Controller;
import com.berkerogluu.tradingplatform.view.*;

public class TradingPlatformClient {
    public static void main(String args[]){
        MainView mMainView = new MainView();
        Controller mController = new Controller(mMainView);
        mController.initController();

        //mMainView.getFrame().setTitle("test");
    }
}
