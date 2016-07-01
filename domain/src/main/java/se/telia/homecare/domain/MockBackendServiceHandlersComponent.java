package se.telia.homecare.domain;

import javax.inject.Singleton;

import dagger.Component;

/**
 * Created by alex.soldatov on 28/04/16.
 */

@Singleton
@Component (modules = {MockBackendModule.class})
public interface MockBackendServiceHandlersComponent {

    LoginRequestRetrofitHandler getLoginRequestHandler ();
    
}
