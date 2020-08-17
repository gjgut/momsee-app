package com.example.momsee.ChildLogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.momsee.ChildMain.ChildMainActivity;
import com.example.momsee.ParentMain.ParentMainActivity;
import com.example.momsee.R;

public class ChildLoginActivity extends AppCompatActivity {
    Button btnChildLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child_login);

        btnChildLogin = (Button) findViewById(R.id.btnChildLogin);

        View.OnClickListener click = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btnChildLogin:
                        Intent intent = new Intent(getApplicationContext(), ChildMainActivity.class);
                        startActivity(intent);
                        break;
                }
            }
        };
        btnChildLogin.setOnClickListener(click);
    }
}
