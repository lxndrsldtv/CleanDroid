package com.as.cleandroid;

/**
 * Created by alex.soldatov on 27/04/16.
 */
public abstract class LoginView {

    public abstract void setInteractor(LoginInteractor aLoginInteractor);
    public abstract void setUserName(CharSequence aUserName);
    public abstract void setPassword(CharSequence aPassword);
    public abstract void showErrorWrongUserNameFormat();
    public abstract void showErrorWrongUserPassword();
    public abstract void showErrorWrongUserLoginCredentials();

}
