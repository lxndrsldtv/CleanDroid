package com.as.cleandroid;

/**
 * Created by alex.soldatov on 29/04/16.
 */
public class User {
    CharSequence name;
    CharSequence password;

    public CharSequence getName() {
        return name;
    }

    public void setName(CharSequence name) {
        this.name = name;
    }

    public CharSequence getPassword() {
        return password;
    }

    public void setPassword(CharSequence password) {
        this.password = password;
    }

    public boolean hasValidName() {
        return true;
    }

    public boolean hasInvalidName() {
        return !hasValidName();
    }

    public boolean hasValidPassword() {
        return true;
    }

    public boolean hasInvalidPassword() {
        return !hasValidPassword();
    }
}
