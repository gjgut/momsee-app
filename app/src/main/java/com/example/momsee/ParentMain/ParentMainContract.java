package com.example.momsee.ParentMain;

import com.example.momsee.BaseContract;

public interface ParentMainContract {
    interface View extends BaseContract.View {
    }

    interface Presenter extends BaseContract.Presenter<View> {

        @Override
        void setView(View view);
    }
}
