package com.as.cleandroid;

/**
 * Created by alex.soldatov on 29/04/16.
 */
public class Session {
    CharSequence token;

    public CharSequence getToken() {
        return token;
    }

    public void setToken(CharSequence token) {
        this.token = token;
    }

    public boolean tokenIsValid() {
        if ( null != token ) return token.length() > 0;
        else return false;
    }

    public boolean tokenIsInvalid() {
        return !tokenIsValid();
    }
}
