package com.example.momsee.ChildLogin;

import com.example.momsee.BaseContract;

public interface ChildLoginContract {
    interface View extends BaseContract.View {
    }

    interface Presenter extends BaseContract.Presenter<View> {

        @Override
        void setView(View view);
    }
}

