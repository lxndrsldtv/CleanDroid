package com.as.cleandroid.gui.login;

import android.util.Log;

/**
 * Created by alex.soldatov on 27/04/16.
 */
public class TestLoginView implements LoginView {

    //LoginPresenter mLoginPresenter;
    LoginInteractor mLoginInteractor;

    CharSequence UserName;
    CharSequence Password;

//    public TestLoginView(LoginPresenter aLoginPresenter, LoginInteractor aLoginInteractor) {
//        mLoginPresenter = aLoginPresenter;
//        mLoginInteractor = aLoginInteractor;
//
//        mUserName = mLoginPresenter.getUserName();
//        mPassword = mLoginPresenter.getPassword();
//    }

    public void setInteractor(LoginInteractor aLoginInteractor) {
        mLoginInteractor = aLoginInteractor;
    }

    public void setUserName(CharSequence UserName) {
        this.UserName = UserName;
    }

    public void setPassword(CharSequence Password) {
        this.Password = Password;
    }

    public void showErrorWrongUserNameFormat() {
        Log.d("LOGIN VIEW:", "showErrorWrongUserNameFormat: Wrong format of UserName");
    }

    public void showErrorWrongUserPassword() {
        Log.d("LOGIN VIEW:", "showErrorWrongUserPassword: Wrong user password");
    }

    public void showErrorWrongUserLoginCredentials() {
        Log.d("LOGIN VIEW:", "showErrorWrongUserLoginCredentials: Wrong user login credentials");
    }

    public void onUserNameChange(CharSequence aUserName) {
        UserName = aUserName;
        mLoginInteractor.setUserName(UserName);
    }

    public void onPasswordChange(CharSequence aPassword) {
        Password = aPassword;
        mLoginInteractor.setUserPassword(Password);
    }

    public void onLogin() {
        mLoginInteractor.doLogin();
    }

    @Override
    public void showErrorInvalidUserName() {
        System.out.println("showErrorInvalidUserName");
    }

    @Override
    public void showErrorUserNameShouldNotBeEmpty() {
        System.out.println("showErrorUserNameShouldNotBeEmpty");

    }

    @Override
    public void showErrorInvalidUserPassword() {
        System.out.println("showErrorInvalidUserPassword");

    }

    @Override
    public void showErrorUserPasswordShouldNotBeEmpty() {
        System.out.println("showErrorUserPasswordShouldNotBeEmpty");

    }
}
