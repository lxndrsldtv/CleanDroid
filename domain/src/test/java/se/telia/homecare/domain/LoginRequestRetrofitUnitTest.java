package se.telia.homecare.domain;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * To work on unit tests, switch the Test Artifact in the Build Variants view.
 */
public class LoginRequestRetrofitUnitTest {
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
    }
}