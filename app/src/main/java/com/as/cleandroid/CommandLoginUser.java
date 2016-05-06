package com.as.cleandroid;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.POST;

/**
 * Created by alex.soldatov on 29/04/16.
 */
public class CommandLoginUser implements Command {

    Integer mLoginActionCode;
    CharSequence mDeviceId;
    CharSequence mUserName;
    CharSequence mPassword;
    CharSequence mLocaleCode;

//    interface AlleatoService {
//        @POST("/service/rest")
//        Call<LoginResponse> loginUser();
//    }


    public CommandLoginUser(Integer aLoginActionCode,
                            CharSequence aDeviceId,
                            CharSequence aUserName,
                            CharSequence aPassword,
                            CharSequence aLocaleCode) {

        mLoginActionCode = aLoginActionCode;
        mDeviceId        = aDeviceId;
        mUserName        = aUserName;
        mPassword        = aPassword;
        mLocaleCode      = aLocaleCode;

//        public static final String BASE_URL = "https://comfort-integration.alleato.se/";
//        Retrofit retrofit = new Retrofit.Builder()
//                .baseUrl(BASE_URL)
//                .addConverterFactory(GsonConverterFactory.create())
//                .build();
//
//        retrofit.create(AlleatoService.class);


    }
}