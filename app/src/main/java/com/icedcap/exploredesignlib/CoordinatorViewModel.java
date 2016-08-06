package com.icedcap.exploredesignlib;

import android.support.design.widget.Snackbar;
import android.view.View;

/**
 * Author: doushuqi
 * Date: 16-8-5
 * Email: shuqi.dou@singuloid.com
 * LastUpdateTime:
 * LastUpdateBy:
 */
public class CoordinatorViewModel {

    public void fabClick(View v) {
        Snackbar.make(v, "Hello World!", Snackbar.LENGTH_SHORT)
                .setAction("UNDO", new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {

                    }
                }).show();
    }
}
