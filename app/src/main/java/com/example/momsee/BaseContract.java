package com.example.momsee;

//공용 인터페이스 구현
public class BaseContract {

    public interface View{
        //View method
    }

    public interface Presenter<T>{
        //뷰 연결
        void setView (T view);
    }
}
