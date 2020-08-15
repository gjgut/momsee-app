package com.example.momsee.Register;

import com.example.momsee.BaseContract;
import com.example.momsee.MainModel;

public class RegisterPresenter implements RegisterContract.Presenter{

    BaseContract.View mainView;
    MainModel mainModel;

    //생성자
    public RegisterPresenter(BaseContract.View view){
        mainView= view;
        //mainModel = new MainModel(this);
    }
    @Override
    public void setView(RegisterContract.View view) {

    }
}
