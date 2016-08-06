package com.icedcap.exploredesignlib;

import android.databinding.BindingAdapter;
import android.support.design.widget.TextInputLayout;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Pair;
import android.util.Patterns;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.io.Serializable;

/**
 * Author: doushuqi
 * Date: 16-8-4
 * Email: shuqi.dou@singuloid.com
 * LastUpdateTime:
 * LastUpdateBy:
 */
public class EmailViewModel implements Serializable {
    public ObservableString address = new ObservableString();
    public ObservableString password = new ObservableString();
    public ObservableString addressError = new ObservableString();
    public ObservableString passwordError = new ObservableString();


    @BindingAdapter("binding")
    public static void bindingEditText(EditText view, final ObservableString value) {
        Pair<ObservableString, TextWatcher> pair = (Pair) view.getTag(R.id.binding_observable);
        if (null == pair || pair.first != value) {
            if (pair != null) {
                view.removeTextChangedListener(pair.second);
            }
            TextWatcher textWatcher = new TextWatcher() {
                @Override
                public void beforeTextChanged(CharSequence s, int start, int count, int after) {

                }

                @Override
                public void onTextChanged(CharSequence s, int start, int before, int count) {
                    value.set(s.toString());
                }

                @Override
                public void afterTextChanged(Editable s) {

                }
            };
            view.setTag(R.id.binding_observable, new Pair<>(value, textWatcher));
            view.addTextChangedListener(textWatcher);
        }

        String newValue = value.get();
        if (!view.getText().toString().equals(newValue)) {
            view.setText(newValue);
        }
    }

    @BindingAdapter("error")
    public static void error(TextInputLayout view, final ObservableString value) {
        if (value.get() != null) {
            view.setErrorEnabled(true);
            view.setError(value.get());
        } else {
            view.setErrorEnabled(false);
        }
    }


    public void validate(View view) {
        int addressErrRes = 0;
        int passwordErrRes = 0;
        if (null == address.get() || address.get().equals("")) {
            addressErrRes = R.string.err_not_blank;

        } else if (!Patterns.EMAIL_ADDRESS.matcher(address.get()).matches()) {
            addressErrRes = R.string.err_address_invalidate;
        }
        if (null == password.get() || password.get().equals("")) {
            passwordErrRes = R.string.err_not_blank;
        }
        addressError.set(addressErrRes != 0 ? view.getResources().getString(addressErrRes) : null);
        passwordError.set(passwordErrRes != 0 ? view.getResources().getString(passwordErrRes) : null);
        if (addressErrRes == 0 && passwordErrRes == 0) {
            Toast.makeText(view.getContext(), address.get() +" - " + password.get(), Toast.LENGTH_LONG).show();
        }
    }
}
