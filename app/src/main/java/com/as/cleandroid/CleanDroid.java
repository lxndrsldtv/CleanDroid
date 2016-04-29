package com.as.cleandroid;

import android.app.Application;

/**
 * Created by alex.soldatov on 28/04/16.
 */
public class CleanDroid extends Application {

    private LoginComponent mLoginComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        mLoginComponent = DaggerLoginComponent.builder()
                .appModule(new AppModule(this))
                .loginModule(new LoginModule())
                .build();
    }

    public LoginComponent getLoginComponent() {
        return mLoginComponent;
    }
}
