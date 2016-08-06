package com.icedcap.exploredesignlib;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.icedcap.exploredesignlib.databinding.ActivityParallaxBinding;

/**
 * Created by shuqi on 16-8-6.
 */
public class ParallaxActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityParallaxBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_parallax);
    }
}
