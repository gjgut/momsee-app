package com.example.momsee.ChildMain;

import com.example.momsee.BaseContract;

public interface ChildMainContract {
    interface View extends BaseContract.View {
    }

    interface Presenter extends BaseContract.Presenter<View> {

        @Override
        void setView(View view);
    }
}
