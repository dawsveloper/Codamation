package com.daws.projects.codamation;

import android.app.Application;

import com.androidnetworking.AndroidNetworking;

public class CodamationApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        AndroidNetworking.initialize(this);
    }
}
