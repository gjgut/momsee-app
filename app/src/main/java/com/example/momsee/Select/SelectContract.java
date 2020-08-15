package com.example.momsee.Select;

import com.example.momsee.BaseContract;
import com.example.momsee.Login.LoginContract;

public interface SelectContract {
    interface View extends BaseContract.View{
    }

    interface  Presenter extends BaseContract.Presenter<LoginContract.View>{

        @Override
        void setView(LoginContract.View view);
    }
}
