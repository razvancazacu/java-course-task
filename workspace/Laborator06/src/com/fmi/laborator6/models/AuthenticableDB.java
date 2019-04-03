package com.fmi.laborator6.models;

public interface AuthenticableDB extends Authenticable {

    private void performDBAuth(){
        performAuthentication();
    }
}
