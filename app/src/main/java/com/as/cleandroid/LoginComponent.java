package com.as.cleandroid;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by alex.soldatov on 28/04/16.
 */

@Singleton
@Component (modules = {AppModule.class, LoginModule.class})
public interface LoginComponent {

    void inject(LoginActivity aLoginActivity);
}
