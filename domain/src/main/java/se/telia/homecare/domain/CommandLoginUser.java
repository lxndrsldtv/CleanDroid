package se.telia.homecare.domain;

/**
 * Created by alex.soldatov on 29/04/16.
 */
public class CommandLoginUser implements Command {

    Integer mLoginActionCode;
    CharSequence mDeviceId;
    CharSequence mUserName;
    CharSequence mPassword;
    CharSequence mLocaleCode;

    public CommandLoginUser(Integer aLoginActionCode,
                            CharSequence aDeviceId,
                            CharSequence aUserName,
                            CharSequence aPassword,
                            CharSequence aLocaleCode) {

        mLoginActionCode = aLoginActionCode;
        mDeviceId        = aDeviceId;
        mUserName        = aUserName;
        mPassword        = aPassword;
        mLocaleCode      = aLocaleCode;
    }
}