package com.as.cleandroid;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by alex.soldatov on 28/04/16.
 */

@Module
public class LoginModule {

    @Provides @Singleton
    Presenter provideLoginPresenter() {
        return new LoginPresenter();
    }
}
