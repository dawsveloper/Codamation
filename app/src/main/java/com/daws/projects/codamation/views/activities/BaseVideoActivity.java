package com.daws.projects.codamation.views.activities;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;

import com.daws.projects.codamation.utils.ActivityUtils;

public abstract class BaseVideoActivity <Binding extends ViewDataBinding> extends AppCompatActivity {
    protected Binding binding;
    abstract protected int attachLayout();

    protected String apikey = "AIzaSyC83eKwxkwpewZntciYDoP5q9DeDSkQDiQ";

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityUtils.fullscreenUI(getWindow());

        initData();
        initLayout();
    }

    protected void initData(){
        binding = DataBindingUtil.setContentView(this, attachLayout());
    }

    protected void initLayout(){

    }
}
