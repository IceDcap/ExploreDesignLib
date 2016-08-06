package com.icedcap.exploredesignlib;

import android.databinding.BaseObservable;

import java.io.Serializable;

/**
 * Author: doushuqi
 * Date: 16-8-5
 * Email: shuqi.dou@singuloid.com
 * LastUpdateTime:
 * LastUpdateBy:
 */
public class ObservableString extends BaseObservable implements Serializable {
    static final long serialVersionUID = 1L;
    private String mValue;

    /**
     * Wraps the given object and creates an observable object
     *
     * @param value The value to be wrapped as an observable.
     */
    public ObservableString(String value) {
        mValue = value;
    }

    /**
     * Creates an empty observable object
     */
    public ObservableString() {
    }

    /**
     * @return the stored value.
     */
    public String get() {
        return mValue;
    }

    /**
     * Set the stored value.
     */
    public void set(String value) {
        if (value == null || !value.equals(mValue)) {
            mValue = value;
            notifyChange();
        }
    }
}
