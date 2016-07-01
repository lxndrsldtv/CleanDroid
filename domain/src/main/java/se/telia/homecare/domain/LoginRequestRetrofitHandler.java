package se.telia.homecare.domain;

import java.io.IOException;

import javax.annotation.security.DeclareRoles;
import javax.annotation.security.RolesAllowed;
import javax.inject.Inject;

import retrofit2.*;

/**
 * Created by alex.soldatov on 29/04/16.
 */

@DeclareRoles({"Admin", "Manager", "Employee"})
public class LoginRequestRetrofitHandler {

    private AlleatoService mAlleatoService = null;

    @Inject
    public LoginRequestRetrofitHandler(AlleatoService aAlleatoService) {
        mAlleatoService = aAlleatoService;
    }

    @RolesAllowed({"Admin", "Manager"})
    public LoginResponse handle (LoginRequest aLoginRequest) {

//        HashMap<String, String> _FormUrlEncoding = new HashMap<String, String>();
//
//        _FormUrlEncoding.put(aLoginRequest.getLoginActionCodeParameterName().toString(),
//                             aLoginRequest.getLoginActionCodeParameterValue().toString());
//
//        _FormUrlEncoding.put(aLoginRequest.getDeviceIdParameterName().toString(),
//                             aLoginRequest.getDeviceIdParameterValue().toString());
//
//        _FormUrlEncoding.put(aLoginRequest.getUserNameParameterName().toString(),
//                             aLoginRequest.getUserNameParameterValue().toString());
//
//        _FormUrlEncoding.put(aLoginRequest.getPasswordParameterName().toString(),
//                             aLoginRequest.getPasswordParameterValue().toString());
//
//        _FormUrlEncoding.put(aLoginRequest.getLocaleCodeParameterName().toString(),
//                             aLoginRequest.getLocaleCodeParameterValue().toString());
//
//        Call <LoginResponse> call = mAlleatoService.loginUser(_FormUrlEncoding);

        Call<LoginResponse> call =
                mAlleatoService.loginUser(aLoginRequest.getmLoginRequestHashMap());

        Response<LoginResponse> response = null;

        try {
            response = call.execute();
        }
        catch (IOException e ) {
            // handle error
            e.printStackTrace();
        }

        return response.body();
    }
}
