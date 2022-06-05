package com.berkerogluu.controller;

import com.berkerogluu.model.FixApiModel;
import com.berkerogluu.view.*;

public class Controller {

    private Core _core;
    private FixApiModel _fixApiModel;
    public Controller(Core c, FixApiModel f){
        _core = c;
        _fixApiModel = f;
    }

    public void init(){

        // Buy Button ActionListener
        _core.getCreateOrderPanel().getBuyButton().addActionListener(e->{
            _fixApiModel.logon();
        });
    }
}
