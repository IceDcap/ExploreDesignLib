package com.icedcap.exploredesignlib;

import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.icedcap.exploredesignlib.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        binding.setModelview(new MainViewModel());
    }

    public class MainViewModel {
        public Class<?> snackbar = SnackbarActivity.class;
        public Class<?> fab = FABActivity.class;
        public Class<?> textInput = TextInputActivity.class;
        public Class<?> navigation = NavigationActivity.class;
        public Class<?> tab = TabActivity.class;
        public Class<?> coordinator = CoordinatorActivity.class;
        public Class<?> collapse = ToolBarActivity.class;
        public Class<?> parallax = ParallaxActivity.class;

        public void startActivity(Class<?> cls) {
            MainActivity.this.startActivity(new Intent(MainActivity.this, cls));
        }
    }
}
