package com.example.momsee.Login;
import com.example.momsee.BaseContract;
import com.example.momsee.MainModel;

//View와 Model간의 전달 역할

//공용 인터페이스 BaseContract의 Presenter를 상속받아 구현
public class LoginPresenter implements LoginContract.Presenter{
    BaseContract.View mainView;
    MainModel mainModel;

    //생성자
    public LoginPresenter(BaseContract.View view){
        mainView= view;
        //mainModel = new MainModel(this);
    }

    //뷰 연결
    @Override
    public void setView(LoginContract.View view) {
        this.mainView = view;
    }

    @Override
    public Boolean getEmail() {
        return null;
    }

    @Override
    public void setEmail(String email, String pw) {

    }
}
