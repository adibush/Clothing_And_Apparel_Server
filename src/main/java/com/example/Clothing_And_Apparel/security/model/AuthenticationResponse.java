package com.example.Clothing_And_Apparel.security.model;


import org.springframework.context.annotation.Lazy;

import java.io.Serializable;

public class AuthenticationResponse implements Serializable {

    private final String jwt;

    public AuthenticationResponse( String jwt) {
        this.jwt = jwt;
    }

    public String getJwt() {
        return jwt;
    }
}