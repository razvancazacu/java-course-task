package com.fmi.laborator6.models;

public interface AuthenticableLDAP extends Authenticable{
    private void performLDAPAuth(){
        performAuthentication();
    }
}
