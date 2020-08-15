package com.example.momsee.Login;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.momsee.BaseContract;
import com.example.momsee.R;
import com.example.momsee.Register.RegisterActivity;
import com.example.momsee.Select.SelectActivity;

     /* *** 참고 - 유용하니 다들 알아두시길 ***
        1.Ctrl+D(블록 안잡았을때) -커서에 위치하고 있는 줄의 코드를 바로 아랫줄에 복사해준다.
        2.Ctrl+D(블록 잡았을때) -블록 잡은 부분을 바로 옆에 그대로 복사해준다
        3.Alt+Insert        -코드를 자동으로 생성해준다(Override Methods 유용) -> 이것보단 9번이 더 편함
        4.Shift+F6 -        -이름변경(필수)
        4.Ctrl+Alt+L        -코드 자동 정렬
        5.Ctrl+Alt+Shift+S  -Project Structure
        6.Shift+F10         -프로젝트 실행 (필수)
        7.Ctrl+F11          -북마크(기억력이 좋다면 정말 편리함)
        8.Alt+방향키         -편집기창(코딩하는 공간)전환
        9.Ctrl+O            -오버라이드
      */

 //첫화면 - 또오셨나요/처음오셨나요 선택
public class LoginActivity extends AppCompatActivity implements  LoginContract.View{
   BaseContract.Presenter presenter;
   private Button btnLogin,btnRegister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        presenter = new LoginPresenter(this);

        //presenter 와 연결
        presenter.setView(this);

        btnLogin = (Button)findViewById(R.id.btnLogin);
        btnRegister = (Button)findViewById(R.id.btnRegister);

        View.OnClickListener click = new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                switch (v.getId()){
                    case R.id.btnLogin:
                        Intent intentLogin = new Intent(getApplicationContext(), SelectActivity.class);
                        startActivity(intentLogin);
                        break;
                    case R.id.btnRegister:
                        Intent intentRegister = new Intent(getApplicationContext(), RegisterActivity.class);
                        startActivity(intentRegister);
                        break;
                }
            }
        };
        btnLogin.setOnClickListener(click);
        btnRegister.setOnClickListener(click);
    }
}

//        btnLogin.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(getApplicationContext(), SelectActivity.class);
//                startActivity(intent);
//            }
//        });
