package com.berkerogluu.app;

import com.berkerogluu.controller.Controller;
import com.berkerogluu.model.FixApiModel;
import com.berkerogluu.view.Core;

public class App {
    public static void main(String[] args){
        Core core = new Core();
        core.init();

        FixApiModel fixApiModel = new FixApiModel();

        Controller controller = new Controller(core, fixApiModel);
        controller.init();
    }
}
