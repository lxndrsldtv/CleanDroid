package se.telia.homecare.domain;

import java.util.HashMap;

/**
 * Created by alex.soldatov on 29/04/16.
 */
public class LoginRequestRetrofit extends HashMap <String, String> {

    public LoginRequestRetrofit(Integer aLoginActionCode,
                                CharSequence aDeviceId,
                                CharSequence aUserName,
                                CharSequence aPassword,
                                CharSequence aLocaleCode)
    {
        super();
        initialize(aLoginActionCode, aDeviceId, aUserName, aPassword, aLocaleCode);
    }

    public LoginRequestRetrofit(LoginRequest aLoginRequest)
    {
        super();
        initialize(aLoginRequest.getLoginActionCodeParameterValue(),
                   aLoginRequest.getDeviceIdParameterValue(),
                   aLoginRequest.getUserNameParameterValue(),
                   aLoginRequest.getPasswordParameterValue(),
                   aLoginRequest.getLocaleCodeParameterValue());
    }

    private void initialize(Integer aLoginActionCode,
                            CharSequence aDeviceId,
                            CharSequence aUserName,
                            CharSequence aPassword,
                            CharSequence aLocaleCode)
    {
        this.put("loginaction", aLoginActionCode.toString());
        this.put("deviceid",    aDeviceId.toString());
        this.put("username",    aUserName.toString());
        this.put("password",    aPassword.toString());
        this.put("lang",        aLocaleCode.toString());
    }

}