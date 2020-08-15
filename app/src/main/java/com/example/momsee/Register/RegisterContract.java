package com.example.momsee.Register;


import com.example.momsee.BaseContract;

public interface RegisterContract  {
    interface View extends BaseContract.View{

    }
    interface Presenter extends BaseContract.Presenter<View>{
        @Override
        void setView(View view);
    }
}
