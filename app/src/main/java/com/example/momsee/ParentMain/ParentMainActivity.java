package com.example.momsee.ParentMain;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import com.example.momsee.R;
import com.google.android.material.tabs.TabLayout;

public class ParentMainActivity extends AppCompatActivity {

    PagerAdapter adapter; //adapter 선언
    ViewPager viewPager; //viewPager 선언

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parent_main);

        //tablayout 참조, 그리고 tab 추가
        TabLayout tabLayout = findViewById(R.id.tabLayout);
        tabLayout.addTab((tabLayout.newTab().setText("목록")));
        tabLayout.addTab((tabLayout.newTab().setText("채팅")));
        tabLayout.addTab((tabLayout.newTab().setText("위치")));
        tabLayout.addTab((tabLayout.newTab().setText("설정")));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

/*              tabGravity - tab의 정렬 방식에 대한 옵션입니다./"center" 탭을 가운데 정렬하여 표시합니다./"fill" 탭의 너비를 동일하게 정렬하여 표시합니다.
                tabMode  - tab의 표시 방식에 대한 옵션입니다./"fixed" 모든 탭을 화면에 표시되도록 설정합니다./"scrollable" 탭이 화면을 넘어갈 시 스크롤이 되도록 설정합니다.
                tabTextColor - tab안의 Text의 색상을 지정합니다.
                tabSelectedTextColor - tab 선택 시에, tab안의 Text의 색상을 지정합니다.
                tabIndicatorHeight - tab 하단의 Indicator의 높이를 지정합니다.
                tabIndicatorColor  - tab 하단의 Indicator의 색상을 지정합니다.*/

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
