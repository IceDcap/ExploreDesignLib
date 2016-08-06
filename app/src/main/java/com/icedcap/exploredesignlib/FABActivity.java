package com.icedcap.exploredesignlib;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.icedcap.exploredesignlib.databinding.ActivityFabBinding;

/**
 * Author: doushuqi
 * Date: 16-8-4
 * Email: shuqi.dou@singuloid.com
 * LastUpdateTime:
 * LastUpdateBy:
 */
public class FABActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityFabBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_fab);
        binding.setViewmodel(new FABViewModel());
        binding.setClickListener(new SnackbarViewModel());
        getSupportActionBar().setTitle(R.string.btn_fab);
    }

    public class FABViewModel {

    }
}
