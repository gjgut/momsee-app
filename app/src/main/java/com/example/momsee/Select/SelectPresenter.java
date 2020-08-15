package com.example.momsee.Select;

import com.example.momsee.BaseContract;
import com.example.momsee.Login.LoginContract;
import com.example.momsee.MainModel;

//공용 인터페이스 BaseContract의 Presenter를 상속받아 구현
public class SelectPresenter implements SelectContract.Presenter {
    BaseContract.View mainView;
    MainModel mainModel;

    //생성자
    public SelectPresenter(BaseContract.View view) {
        mainView = view;
    }

    //뷰 연결
    @Override
    public void setView(LoginContract.View view) {
        this.mainView = view;
    }
}

