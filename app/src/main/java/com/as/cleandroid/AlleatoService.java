package com.as.cleandroid;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by alex.soldatov on 29/04/16.
 */
public interface AlleatoService {

    @FormUrlEncoded
    @POST("service/rest")
    Call<LoginResponse> loginUser(@FieldMap Map<String, String> LoginRequestMap);

}