package com.icedcap.exploredesignlib;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.icedcap.exploredesignlib.databinding.ActivityToolbarBinding;

/**
 * Created by shuqi on 16-8-6.
 */
public class ToolBarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityToolbarBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_toolbar);
//        binding.toolbar.setTitle(R.string.btn_collapse);
        binding.collapsing.setTitle(getString(R.string.btn_collapse));
    }
}
