package ru.hiq.security;

import java.util.Set;

import javax.annotation.security.RolesAllowed;

/**
 * Created by alexander.soldatov on 12/05/16.
 */
public class Principal {
    private String userName;
    private Set<Authority> authorities;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }


    public Set<Authority> getAuthorities() {
        return authorities;
    }

    public void setAuthorities(Set<Authority> authorities) {
        this.authorities = authorities;
    }

    @RolesAllowed({"ADMIN", "USER"})
    public void addAuthority(Authority authority) {
        authorities.add(authority);
    }

    public boolean hasAuthority(Authority authority) {
        return authorities.contains(authority);
    }

}
