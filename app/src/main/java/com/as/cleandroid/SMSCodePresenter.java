package com.as.cleandroid;

/**
 * Created by alex.soldatov on 27/04/16.
 */
public class SMSCodePresenter implements Presenter {

    LoginView LoginView = null;

    public SMSCodePresenter() {
    }

    public void setView(View LoginView) {
        this.LoginView = (LoginView) LoginView;
    }
}
