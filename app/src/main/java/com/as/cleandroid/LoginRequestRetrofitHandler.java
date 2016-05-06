package com.as.cleandroid;

import java.io.IOException;
import java.util.HashMap;

import retrofit2.*;

/**
 * Created by alex.soldatov on 29/04/16.
 */
public class LoginRequestRetrofitHandler {

    private AlleatoService mAlleatoService = null;

    public LoginRequestRetrofitHandler(AlleatoService aAlleatoService) {
        mAlleatoService = aAlleatoService;
    }

    public LoginResponse handle (LoginRequest aLoginRequest) {

        HashMap<String, String> _FormUrlEncoding = new HashMap<String, String>();

        _FormUrlEncoding.put("loginaction", aLoginRequest.getLoginActionCode().toString());
        _FormUrlEncoding.put("deviceid",    aLoginRequest.getDeviceId().toString());
        _FormUrlEncoding.put("username",    aLoginRequest.getUserName().toString());
        _FormUrlEncoding.put("password",    aLoginRequest.getPassword().toString());
        _FormUrlEncoding.put("lang",        aLoginRequest.getLocaleCode().toString());

        Call <LoginResponse> call = mAlleatoService.loginUser(_FormUrlEncoding);

        Response<LoginResponse> response = null;

        try {
            response = call.execute();
        }
        catch (IOException e ) {
            // handle error
            e.printStackTrace();
        }

        return response.body();
    }
}
