package com.as.cleandroid.gui.login;


/**
 * Created by alex.soldatov on 27/04/16.
 */
public interface LoginInteractor {

    public void setUserName(CharSequence aUserName);
    public void setUserPassword(CharSequence aPassword);
    public void doLogin();

}
