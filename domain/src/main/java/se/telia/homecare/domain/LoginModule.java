package se.telia.homecare.domain;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by alex.soldatov on 28/04/16.
 */

@Module
public class LoginModule {

//    @Provides @Singleton
//    LoginPresenter provideLoginPresenter() {
//        return new LoginPresenter();
//    }

    @Provides @Singleton
    AlleatoService provideAlleatoService() {
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

        return retrofit.create(AlleatoService.class);
    }
}
