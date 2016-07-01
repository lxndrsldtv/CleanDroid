package ru.hiq.security;

public class Authentication {

    public Authentication(Principal principal) {
        this.principal = principal;
    }

    public boolean hasRole(String roleName) {
        return principal.hasAuthority(new Authority(roleName));
    }

    private Principal principal;
}
