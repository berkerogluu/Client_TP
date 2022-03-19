package tradingplatform;

import tradingplatform.Controller.Controller;
import tradingplatform.View.*;

public class Main {
    public static void main(String args[]){
        MainView mMainView = new MainView();
        Controller mController = new Controller(mMainView);
        mController.initController();

        //mMainView.getFrame().setTitle("test");
    }
}
