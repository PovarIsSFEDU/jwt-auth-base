package com.plukash.jwtauthbase.controllers;


import com.plukash.jwtauthbase.entities.DTO.Auth.AuthMailRequest;
import com.plukash.jwtauthbase.entities.DTO.Auth.AuthResponse;
import com.plukash.jwtauthbase.entities.DTO.Auth.AuthUNameRequest;
import com.plukash.jwtauthbase.entities.DTO.Register.RegistrationRequest;
import com.plukash.jwtauthbase.services.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService service;

    @PostMapping("/register")
    public ResponseEntity<AuthResponse> register(
            @RequestBody RegistrationRequest request
    ) {
        return ResponseEntity.ok(service.register(request));
    }

    @PostMapping("/login")
    public ResponseEntity<AuthResponse> authenticateEmail(
            @RequestBody AuthMailRequest request
    ) {
        return ResponseEntity.ok(service.authenticateEmail(request));
    }


    @PostMapping("/login/uname")
    public ResponseEntity<AuthResponse> authenticateUName(
            @RequestBody AuthUNameRequest request
    ) {
        return ResponseEntity.ok(service.authenticateUName(request));
    }

}
