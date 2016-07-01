package se.telia.homecare.domain;

/**
 * Created by alex.soldatov on 29/04/16.
 */
public class User {
    //login token or other identificator used to request user data and perform operations
    CharSequence id;

    CharSequence name;
    CharSequence password;

    CharSequence device_id;

    public void setName(CharSequence name) {
        this.name = name;
    }
    public CharSequence getName() {
        return name;
    }

    public void setPassword(CharSequence password) {
        this.password = password;
    }
    public CharSequence getPassword() {
        return password;
    }

    public boolean hasValidName() {
        return (null != name && name.toString().contains("@"));
    }
    public boolean hasInvalidName() {
        return !hasValidName();
    }

    public boolean hasValidPassword() {
        return (null != password && password.length() > 4);
    }
    public boolean hasInvalidPassword() {
        return !hasValidPassword();
    }


}
