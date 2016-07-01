package com.as.cleandroid.gui.login;


//import org.springframework.security.authentication.AuthenticationManager;
//import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
//import org.springframework.security.core.Authentication;
//import org.springframework.security.core.AuthenticationException;
//import org.springframework.security.core.context.SecurityContextHolder;

import se.telia.homecare.domain.User;

/**
 * Created by alex.soldatov on 27/04/16.
 */
public class LoginPresenter {

    LoginView loginView = null;
    User user;

//    AuthenticationManager am;


    public LoginPresenter () {
        //am = new SampleAuthenticationManager();
    }

    public void setLoginView (LoginView aLoginView) {
        loginView = aLoginView;
    }

//    public void setView(View LoginView) {
//        this.LoginView = (LoginView) LoginView;
//    }

    public void askUserToFillLoginAndPassword(User aUser) {
        user = aUser;

        // TODO:
        // AppUserInteface.showLoginView();

//        loginView.setInteractor(this);
//        loginView.setUserName(aUser.getName());
//        loginView.setPassword(aUser.getPassword());
//        loginView.setLoginActionHandler(this);
    }

//    public void setUserName(CharSequence aUserName) {
//        user.setName(aUserName);
//        if ( user.hasInvalidName() ) loginView.showErrorInvalidUserName();
//    }
//
//    public void setUserPassword(CharSequence aPassword) {
//        user.setPassword(aPassword);
//        if ( user.hasInvalidPassword() ) loginView.showErrorInvalidUserPassword();
//    }

    public void doLogin(CharSequence name, CharSequence password) {

        boolean _ready_to_login = true;

//        user.setName(name);
//        if ( user.hasInvalidName() ) {
//            loginView.showErrorInvalidUserName();
//            _ready_to_login = false;
//        }
//
//        user.setPassword(password);
//        if ( user.hasInvalidPassword() ) {
//            loginView.showErrorInvalidUserPassword();
//            _ready_to_login = false;
//        }

        if ( ! _ready_to_login ) return;

//        try {
//            Authentication request = new UsernamePasswordAuthenticationToken(name, password);
//            Authentication result = am.authenticate(request);
//            SecurityContextHolder.getContext().setAuthentication(result);
//            if (null!= loginView) loginView.showErrorInvalidUserPassword();
//        } catch(AuthenticationException e) {
//            System.out.println("Authentication failed: " + e.getMessage());
//        }
    }

}
