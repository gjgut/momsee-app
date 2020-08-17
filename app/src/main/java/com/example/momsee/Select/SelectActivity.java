package com.example.momsee.Select;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.momsee.ChildLogin.ChildLoginActivity;
import com.example.momsee.ParentMain.ParentMainActivity;
import com.example.momsee.R;

//또왔어요 -> 부모/자녀 기기 선택
public class SelectActivity extends AppCompatActivity {
    private Button btnChild,btnParent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select);

        btnChild = (Button) findViewById(R.id.btnChild);
        btnParent = (Button) findViewById(R.id.btnParent);

        View.OnClickListener click = new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                switch (v.getId()) {
                    case R.id.btnParent:
                        Intent intent2 = new Intent(getApplicationContext(), ParentMainActivity.class);
                        startActivity(intent2);
                        break;
                    case R.id.btnChild:
                        Intent intent = new Intent(getApplicationContext(), ChildLoginActivity.class);
                        startActivity(intent);
                        break;
                }
            }
        };
        btnChild.setOnClickListener(click);
        btnParent.setOnClickListener(click);
    }
}
