package com.icedcap.exploredesignlib;

import android.support.design.widget.Snackbar;
import android.view.View;

/**
 * Author: doushuqi
 * Date: 16-8-4
 * Email: shuqi.dou@singuloid.com
 * LastUpdateTime:
 * LastUpdateBy:
 */
public class SnackbarViewModel {

    public void showCommonMessage(View v) {
        Snackbar.make(v, "Hi, I am a SnackBar.", Snackbar.LENGTH_LONG).show();
    }

    public void showWithHandle(View v) {
        Snackbar.make(v, "文章收藏成功", Snackbar.LENGTH_LONG)
                .setAction("编辑标签", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                })
                .show();
    }
}
