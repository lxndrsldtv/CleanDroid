package se.telia.homecare.domain;

import java.util.HashMap;

/**
 * Created by alex.soldatov on 29/04/16.
 */
public class LoginRequest {

    private  CharSequence mLoginActionCodeParameterName = "loginaction";
    private Integer mLoginActionCodeParameterValue;

    private CharSequence mDeviceIdParameterName = "deviceid";
    private CharSequence mDeviceIdParameterValue;

    private CharSequence mUserNameParameterName = "username";
    private CharSequence mUserNameParameterValue;

    private CharSequence mPasswordParameterName = "password";
    private CharSequence mPasswordParameterValue;

    private CharSequence mLocaleCodeParameterName = "lang";
    private CharSequence mLocaleCodeParameterValue;

    private HashMap mLoginRequestHashMap;

    public LoginRequest(HashMap aLoginRequestHashMap)
    {
        setRequestHasMap(aLoginRequestHashMap);
    }

    public LoginRequest(Integer aLoginActionCode, CharSequence aDeviceId, CharSequence aUserName,
                        CharSequence aPassword, CharSequence aLocaleCode)
    {
        setLoginActionCodeParameterValue(aLoginActionCode);
        setDeviceIdParameterValue(aDeviceId);
        setUserNameParameterValue(aUserName);
        setPasswordParameterValue(aPassword);
        setLocaleCodeParameterValue(aLocaleCode);
    }

    public CharSequence getLoginActionCodeParameterName() {
        return mLoginActionCodeParameterName;
    }

    public void setLoginActionCodeParameterName(CharSequence aLoginActionCodeParameterName) {
        mLoginActionCodeParameterName = aLoginActionCodeParameterName;
    }

    public Integer getLoginActionCodeParameterValue() {
        return mLoginActionCodeParameterValue;
    }

    public void setLoginActionCodeParameterValue(Integer aLoginActionCodeParameterValue) {
        mLoginActionCodeParameterValue = aLoginActionCodeParameterValue;
    }

    
    
    public CharSequence getDeviceIdParameterName() {
        return mDeviceIdParameterName;
    }

    public void setDeviceIdParameterName(CharSequence aDeviceIdParameterName) {
        mDeviceIdParameterName = aDeviceIdParameterName;
    }

    public CharSequence getDeviceIdParameterValue() {
        return mDeviceIdParameterValue;
    }

    public void setDeviceIdParameterValue(CharSequence aDeviceIdParameterValue) {
        mDeviceIdParameterValue = aDeviceIdParameterValue;
    }

    
    
    public CharSequence getUserNameParameterName() {
        return mUserNameParameterName;
    }

    public void setUserNameParameterName(CharSequence aUserNameParameterName) {
        mUserNameParameterName = aUserNameParameterName;
    }
    
    public CharSequence getUserNameParameterValue() {
        return mUserNameParameterValue;
    }

    public void setUserNameParameterValue(CharSequence aUserNameParameterValue) {
        mUserNameParameterValue = aUserNameParameterValue;
    }


    
    public CharSequence getPasswordParameterName() {
        return mPasswordParameterName;
    }

    public void setPasswordParameterName(CharSequence aPasswordParameterName) {
        mPasswordParameterName = aPasswordParameterName;
    }
    
    public CharSequence getPasswordParameterValue() {
        return mPasswordParameterValue;
    }

    public void setPasswordParameterValue(CharSequence aPasswordParameterValue) {
        mPasswordParameterValue = aPasswordParameterValue;
    }

    
    
    public CharSequence getLocaleCodeParameterName() {
        return mLocaleCodeParameterName;
    }

    public void setLocaleCodeParameterName(CharSequence aLocaleCodeParameterName) {
        mLocaleCodeParameterName = aLocaleCodeParameterName;
    }

    public CharSequence getLocaleCodeParameterValue() {
        return mLocaleCodeParameterValue;
    }

    public void setLocaleCodeParameterValue(CharSequence aLocaleCodeParameterValue) {
        mLocaleCodeParameterValue = aLocaleCodeParameterValue;
    }



    public void setRequestHasMap(HashMap aLoginRequestHashMap) {
        mLoginRequestHashMap = aLoginRequestHashMap;
    }

    public HashMap getmLoginRequestHashMap() {
        return mLoginRequestHashMap;
    }
}