package com.myapp.services;

import com.myapp.models.dto.JwtAuthenticationResponse;
import com.myapp.models.dto.RefreshTokenRequest;
import com.myapp.models.dto.SignInRequest;
import com.myapp.models.dto.SignUpRequest;
import com.myapp.models.entities.User;

public interface AuthenticationService {

    User signUp(SignUpRequest signUpRequest);

    JwtAuthenticationResponse signIn(SignInRequest signInRequest);

    JwtAuthenticationResponse refreshToken(RefreshTokenRequest refreshTokenRequest);

}
