package com.example.momsee.Login;

import com.example.momsee.BaseContract;


//***********Contract = Activity, Presenter 에서 사용되는 모든 메서드를 정의

//email, pw 입력 -> 또왔어요
//입력, 미입력과 무관하게  -> 처음왔어요 -> 회원가입 화면

public interface LoginContract {
    interface View extends BaseContract.View{
    }

    interface  Presenter extends BaseContract.Presenter<View>{

        @Override
        void setView(View view);

        //email, pw 입력값 넘기는 메서드 필요
        void setEmail(String email, String pw);

        //email, pw 입력값 받아서 유효성 검사 후 return 하는 메서드 필요
        Boolean getEmail();
    }
}
