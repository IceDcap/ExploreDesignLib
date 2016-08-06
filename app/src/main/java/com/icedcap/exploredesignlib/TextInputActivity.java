package com.icedcap.exploredesignlib;

import android.databinding.DataBindingUtil;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.icedcap.exploredesignlib.databinding.ActivityTextInputBinding;

/**
 * Author: doushuqi
 * Date: 16-8-4
 * Email: shuqi.dou@singuloid.com
 * LastUpdateTime:
 * LastUpdateBy:
 */
public class TextInputActivity extends AppCompatActivity {
    private static final String KEY = "KEY";
    private EmailViewModel mViewModel;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().setTitle(R.string.btn_textview_floating_label);
        if (null == savedInstanceState) {
            mViewModel = new EmailViewModel();
        } else {
            mViewModel = (EmailViewModel) savedInstanceState.getSerializable(KEY);
        }
        ActivityTextInputBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_text_input);
        binding.setViewModel(mViewModel);
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putSerializable(KEY, mViewModel);
    }
}
