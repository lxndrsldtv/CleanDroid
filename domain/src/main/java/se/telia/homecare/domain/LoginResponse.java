    package se.telia.homecare.domain;

import com.google.gson.annotations.SerializedName;

/**
 * Created by alex.soldatov on 29/04/16.
 */
public class LoginResponse {
//  "token":"ee32402b3513b4f45dfb18c6d6dabeef"}
//  {"error":"Wrong username or password"}

    String token;
    String error;

    public CharSequence getToken () {
        return token;
    }

    public CharSequence getErrorDescription () {
        return error;
    }

}