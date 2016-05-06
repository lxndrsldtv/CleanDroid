package com.as.cleandroid;


/**
 * Created by alex.soldatov on 27/04/16.
 */
public class LoginPresenter implements LoginInteractor {

    LoginView mLoginView = null;
    User mUser;

    public LoginPresenter () {
    }

    public LoginPresenter (LoginView aLoginView) {
        mLoginView = aLoginView;
    }

//    public void setView(View LoginView) {
//        this.LoginView = (LoginView) LoginView;
//    }

    public void askUserToFillLoginAndPassword(User aUser) {
        mUser = aUser;
        mLoginView.setInteractor(this);
        mLoginView.setUserName(aUser.getName());
        mLoginView.setPassword(aUser.getPassword());
    }

    public void setUserName(CharSequence aUserName) {
        mUser.setName(aUserName);
        if ( mUser.hasInvalidName() ) mLoginView.showErrorWrongUserNameFormat();
    }

    public void setUserPassword(CharSequence aPassword) {
        mUser.setPassword(aPassword);
        if ( mUser.hasInvalidPassword() ) mLoginView.showErrorWrongUserPassword();
    }

    public void doLogin() {
        if ( mUser.hasInvalidName() || mUser.hasInvalidPassword() ) {
            mLoginView.showErrorWrongUserLoginCredentials();
            return;
        }


    }
}
