package com.fmi.laborator6.models;

public class User implements AuthenticableDB, AuthenticableLDAP {
    String name;
    String hashPassword;
    enum AuthType {
         BD,LDAP;
    }
    AuthType authType;

    @Override
    public void performAuthentication() {
        switch (authType){
            case BD:
                AuthenticableDB.super.performAuthentication();
                break;
            case LDAP:
                AuthenticableLDAP.super.performAuthentication();
                break;
        }
    }

    public User(AuthType authType) {
        this.authType = authType;
    }

}
