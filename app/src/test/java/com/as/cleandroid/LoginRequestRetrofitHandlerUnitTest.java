package com.as.cleandroid;

import android.util.Log;

import org.junit.Test;

import java.io.IOException;
import java.util.logging.Logger;

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
public class LoginRequestRetrofitHandlerUnitTest {
    @Test
    public void login_request_retrofit_handler_successfully_do_login () throws Exception {


        OkHttpClient.Builder builder = new OkHttpClient.Builder();

        HttpLoggingInterceptor httpLoggingInterceptor = new HttpLoggingInterceptor();

        // Can be Level.BASIC, Level.HEADERS, or Level.BODY
        // See http://square.github.io/okhttp/3.x/logging-interceptor/ to see the options.
        httpLoggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        builder.networkInterceptors().add(httpLoggingInterceptor);
        OkHttpClient theOkHttpClient = builder.build();

        //public static final
        //String BASE_URL = "https://comfort-integration.alleato.se/";
        String BASE_URL = "http://localhost:9090/"; // local test
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .client(theOkHttpClient)
                .build();

        AlleatoService theAlleatoService = retrofit.create(AlleatoService.class);

        LoginRequestRetrofitHandler theRRH = new LoginRequestRetrofitHandler(theAlleatoService);

        LoginRequest _LoginRequest = new LoginRequest(1, "2d38cbcbeb3c4d9btelia",
                "evgeny.akhundzhanov@hiq.ru", "Telia2015", "en");

        LoginResponse _LoginResponse = theRRH.handle(_LoginRequest);

        System.out.println("LOGIN RESPONSE: Token = " + _LoginResponse.getToken());
        System.out.println("LOGIN RESPONSE: Error = " + _LoginResponse.getErrorDescription());

        assertNotNull ("the login response does not return token", _LoginResponse);
    }
}