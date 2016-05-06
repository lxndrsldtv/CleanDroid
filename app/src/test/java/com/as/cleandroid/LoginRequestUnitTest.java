package com.as.cleandroid;

import org.junit.Test;

import java.io.IOException;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class LoginRequestUnitTest {
    @Test
    public void login_request_contains_constructor_arguments_in_map() throws Exception {

        LoginRequestRetrofit SUT = new LoginRequestRetrofit(1,
                                                  "2d38cbcbeb3c4d9btelia",
                                                  "evgeny.akhundzhanov@hiq.ru",
                                                  "Telia2015",
                                                  "en");

        assertEquals("the value of the loginaction is not correct",
                "1", SUT.get("loginaction"));

        assertEquals("the value of the deviceid is not correct",
                "2d38cbcbeb3c4d9btelia", SUT.get("deviceid"));

        assertEquals("the value of the username is not correct",
                "evgeny.akhundzhanov@hiq.ru", SUT.get("username"));

        assertEquals("the value of the password is not correct",
                "Telia2015", SUT.get("password"));

        assertEquals("the value of the lang is not correct",
                "en", SUT.get("lang"));


        OkHttpClient.Builder builder = new OkHttpClient.Builder();

        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();

        // Can be Level.BASIC, Level.HEADERS, or Level.BODY
        // See http://square.github.io/okhttp/3.x/logging-interceptor/ to see the options.
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        builder.networkInterceptors().add(httpLoggingInterceptor);
        OkHttpClient theOkHttpClient = builder.build();


        //public static final
        //String BASE_URL = "https://comfort-integration.alleato.se/";
        String BASE_URL = "http://localhost:9090/";
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(theOkHttpClient)
                .build();


        AlleatoService theAlleatoService = retrofit.create(AlleatoService.class);
        //TestService theTestService = retrofit.create(TestService.class);


        Call <LoginResponse> call = theAlleatoService.loginUser(SUT);
        //Call <LoginResponse> call = theTestService.loginUser(SUT);
        Response <LoginResponse> response = null;
        try {
            response = call.execute();
        } catch (IOException e ){
            // handle error
            e.printStackTrace();
        }

        assertNotNull ("the login response does not return token", response);

        //Log.d("LOGIN RESPONSE", response.get)
    }
}