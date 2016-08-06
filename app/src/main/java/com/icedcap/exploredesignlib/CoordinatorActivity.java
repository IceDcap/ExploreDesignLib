package com.icedcap.exploredesignlib;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.icedcap.exploredesignlib.databinding.ActivityCoordinatorBinding;

/**
 * Author: doushuqi
 * Date: 16-8-5
 * Email: shuqi.dou@singuloid.com
 * LastUpdateTime:
 * LastUpdateBy:
 */
public class CoordinatorActivity extends AppCompatActivity {
    ActivityCoordinatorBinding mBinding;
    private String[] mTabTexts = {
            "first", "second", "third", "fourth", "fifth", "sixth", "seventh", "eighth"
    };

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = DataBindingUtil.setContentView(this, R.layout.activity_coordinator);
        mBinding.setViewModel(new CoordinatorViewModel());
        init();
    }

    private void init() {
        mBinding.pager.setAdapter(new FragmentPagerAdapter(getSupportFragmentManager()) {
            @Override
            public Fragment getItem(int position) {
                return PagerFragment.newInstance();
            }

            @Override
            public int getCount() {
                return mTabTexts.length;
            }

            @Override
            public CharSequence getPageTitle(int position) {
                return mTabTexts[position];
            }
        });

//        for (String text : mTabTexts) {
//            mBinding.tab.addTab(mBinding.tab.newTab().setText(text));
//        }
        mBinding.tab.setupWithViewPager(mBinding.pager);
    }
}
