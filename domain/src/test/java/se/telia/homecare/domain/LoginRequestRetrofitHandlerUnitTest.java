package se.telia.homecare.domain;

import org.junit.Test;

import java.util.HashMap;
import static org.junit.Assert.assertNotNull;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class LoginRequestRetrofitHandlerUnitTest {
    @Test
    public void login_request_retrofit_handler_successfully_do_login () throws Exception {

        MockBackendServiceHandlersComponent _mbshc =
                DaggerMockBackendServiceHandlersComponent.builder()
                .mockBackendModule(new MockBackendModule())
                .build();

        LoginRequestRetrofitHandler _lrrh = _mbshc.getLoginRequestHandler();

        LoginRequest _lrq = new LoginRequest(new HashMap() {
            {
                put("loginaction", "1");
                put("deviceid", "2d38cbcbeb3c4d9btelia");
                put("username", "evgeny.akhundzhanov@hiq.ru");
                put("password", "Telia2015");
                put("lang", "en");
            }
        });

        LoginResponse _lrs = _lrrh.handle(_lrq);

        System.out.println("LOGIN RESPONSE: Token = " + _lrs.getToken());
        System.out.println("LOGIN RESPONSE: Error = " + _lrs.getErrorDescription());

        assertNotNull ("the login response does not return token", _lrs);
    }
}