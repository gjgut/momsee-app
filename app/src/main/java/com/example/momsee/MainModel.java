package com.example.momsee;

import com.example.momsee.BaseContract;

// DATA 저장 및 관리
public class MainModel {
    BaseContract.Presenter presenter;
    public MainModel(BaseContract.Presenter presenter){
        this.presenter = presenter;
    }
}
