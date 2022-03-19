package com.berkerogluu.tradingplatform;

import com.berkerogluu.tradingplatform.Controller.Controller;
import com.berkerogluu.tradingplatform.View.*;

public class Main {
    public static void main(String args[]){
        MainView mMainView = new MainView();
        Controller mController = new Controller(mMainView);
        mController.initController();

        //mMainView.getFrame().setTitle("test");
    }
}
