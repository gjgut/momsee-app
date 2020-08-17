package com.example.momsee.ChildMain;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import com.example.momsee.R;
import com.google.android.material.tabs.TabLayout;

public class ChildMainActivity extends AppCompatActivity {

    PagerAdapter adapter; //adapter 선언
    ViewPager viewPager; //viewPager 선언

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_child_main);

        //tablayout 참조, 그리고 tab 추가
        TabLayout tabLayout = findViewById(R.id.tabLayout);// 메인, 놀이, 설정, 게임, 채팅
        tabLayout.addTab((tabLayout.newTab().setText("메인")));
        tabLayout.addTab((tabLayout.newTab().setText("놀이")));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        //ViewPager 에 adapter set, TabLayout Listener 선언
        adapter = new PagerAdapter(getSupportFragmentManager(), tabLayout.getTabCount());
        viewPager = findViewById(R.id.viewPager);
        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new TabLayout.TabLayoutOnPageChangeListener(tabLayout));

        //Tab 이벤트에 대한 Listener
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
                adapter.notifyDataSetChanged();
            }

            @Override
            public void onTabUnselected(TabLayout.Tab tab) {

            }

            @Override
            public void onTabReselected(TabLayout.Tab tab) {

            }
        });
    }
}
