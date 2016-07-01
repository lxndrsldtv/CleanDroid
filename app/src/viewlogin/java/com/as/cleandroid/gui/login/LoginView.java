package com.as.cleandroid.gui.login;

/**
 * Created by alex.soldatov on 27/04/16.
 */
public interface LoginView {

    //void setInteractor(LoginInteractor aLoginInteractor);
    //void setUserName(CharSequence aUserName);
    //void setPassword(CharSequence aPassword);
    void showErrorInvalidUserName();
    void showErrorUserNameShouldNotBeEmpty();
    void showErrorInvalidUserPassword();
    void showErrorUserPasswordShouldNotBeEmpty();
    //void setLoginActionHandler(LoginPresenter aLoginPresentor);

}
