package com.as.cleandroid;

import com.google.gson.annotations.SerializedName;

/**
 * Created by alex.soldatov on 29/04/16.
 */
public class LoginRequest {

    @SerializedName("loginaction")
    private
    Integer mLoginActionCode;

    @SerializedName("deviceid")
    private
    CharSequence mDeviceId;

    @SerializedName("username")
    private
    CharSequence mUserName;

    @SerializedName("password")
    private
    CharSequence mPassword;

    @SerializedName("lang")
    private
    CharSequence mLocaleCode;

    public LoginRequest(Integer aLoginActionCode,
                        CharSequence aDeviceId,
                        CharSequence aUserName,
                        CharSequence aPassword,
                        CharSequence aLocaleCode)
    {
        setLoginActionCode(aLoginActionCode);
        setDeviceId(aDeviceId);
        setUserName(aUserName);
        setPassword(aPassword);
        setLocaleCode(aLocaleCode);
    }

    public Integer getLoginActionCode() {
        return mLoginActionCode;
    }

    public void setLoginActionCode(Integer aLoginActionCode) {
        mLoginActionCode = aLoginActionCode;
    }

    public CharSequence getDeviceId() {
        return mDeviceId;
    }

    public void setDeviceId(CharSequence aDeviceId) {
        mDeviceId = aDeviceId;
    }

    public CharSequence getUserName() {
        return mUserName;
    }

    public void setUserName(CharSequence aUserName) {
        mUserName = aUserName;
    }

    public CharSequence getPassword() {
        return mPassword;
    }

    public void setPassword(CharSequence aPassword) {
        mPassword = aPassword;
    }

    public CharSequence getLocaleCode() {
        return mLocaleCode;
    }

    public void setLocaleCode(CharSequence aLocaleCode) {
        mLocaleCode = aLocaleCode;
    }
}