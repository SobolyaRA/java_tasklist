package com.example.tasklist.service;

import com.example.tasklist.web.DTO.auth.JwtRequest;
import com.example.tasklist.web.DTO.auth.JwtResponse;

public interface AuthService {

    JwtResponse login(JwtRequest loginRequest);

    JwtResponse refresh(String refreshToken);
}
