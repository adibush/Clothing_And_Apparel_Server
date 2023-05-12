package com.example.Clothing_And_Apparel.service;

import com.example.Clothing_And_Apparel.security.model.AuthenticationRequest;
import com.example.Clothing_And_Apparel.security.model.AuthenticationResponse;
import com.example.Clothing_And_Apparel.security.model.AuthenticationRequest;
import com.example.Clothing_And_Apparel.security.model.AuthenticationResponse;

public interface AuthenticationService {
    AuthenticationResponse createAuthenticationToken(AuthenticationRequest authenticationRequest) throws Exception;
}
