package com.icedcap.exploredesignlib;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import com.icedcap.exploredesignlib.databinding.ActivitySnackbarBinding;

/**
 * Author: doushuqi
 * Date: 16-8-4
 * Email: shuqi.dou@singuloid.com
 * LastUpdateTime:
 * LastUpdateBy:
 */
public class SnackbarActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivitySnackbarBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_snackbar);
        binding.setViewmodel(new SnackbarViewModel());
        getSupportActionBar().setTitle(R.string.btn_snack_bar);
    }

}
