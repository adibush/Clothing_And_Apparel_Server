package com.example.Clothing_And_Apparel.security.model;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Lazy;

import java.io.Serializable;

public class AuthenticationRequest implements Serializable {

    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //need default constructor for JSON Parsing
    public AuthenticationRequest() {}
    public AuthenticationRequest( String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }
}