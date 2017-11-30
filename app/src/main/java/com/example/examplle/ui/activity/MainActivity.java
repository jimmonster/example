package com.example.examplle.ui.activity;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import com.example.examplle.R;
import com.example.examplle.adapter.ViewPagerAdapter;
import com.example.examplle.helper.BottomNavigationViewHelper;
import com.example.examplle.ui.fragment.BaseFragment;

public class MainActivity extends AppCompatActivity {



    private BottomNavigationView mBottomNavigationView;
    private ViewPager mVpMainContainer;
    private MenuItem menuItem;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        initListener();
    }
    private void initView() {
        mVpMainContainer = (ViewPager) findViewById(R.id.vp_main_container);
        mBottomNavigationView = (BottomNavigationView) findViewById(R.id.bnv_main_bottom);
        BottomNavigationViewHelper.disableShiftMode(mBottomNavigationView);
    }
    private void initListener() {

        mBottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            public MenuItem menuItem;

            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                this.menuItem=item;

                switch (item.getItemId()) {
                    case R.id.ngbt_main_item1:
                        mVpMainContainer.setCurrentItem(0);
                        break;
                    case R.id.ngbt_main_item2:
                        mVpMainContainer.setCurrentItem(1);
                        break;
                    case R.id.ngbt_main_item3:
                        mVpMainContainer.setCurrentItem(2);
                        break;
                    case R.id.ngbt_main_item4:
                        mVpMainContainer.setCurrentItem(3);

                        break;
                }

                return true;
            }
        });

        mVpMainContainer.addOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                if (menuItem != null) {
                    menuItem.setChecked(false);
                } else {
                    mBottomNavigationView.getMenu().getItem(0).setChecked(false);
                }
                menuItem = mBottomNavigationView.getMenu().getItem(position);
                menuItem.setChecked(true);
            }

            @Override
            public void onPageScrollStateChanged(int state) {
            }
        });

        //禁止ViewPager滑动
//        viewPager.setOnTouchListener(new View.OnTouchListener() {
//            @Override
//            public boolean onTouch(View v, MotionEvent event) {
//                return true;
//            }
//        });

        setupViewPager(mVpMainContainer);
    }

    private void setupViewPager(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());

        adapter.addFragment(BaseFragment.newInstance("新闻"));
        adapter.addFragment(BaseFragment.newInstance("图书"));
        adapter.addFragment(BaseFragment.newInstance("发现"));
        adapter.addFragment(BaseFragment.newInstance("更多"));
        viewPager.setAdapter(adapter);

    }

}
