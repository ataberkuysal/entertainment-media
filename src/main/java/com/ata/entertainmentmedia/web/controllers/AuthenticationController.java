package com.ata.entertainmentmedia.web.controllers;

import com.ata.entertainmentmedia.data.AuthenticationRequest;
import com.ata.entertainmentmedia.data.AuthenticationResponse;
import com.ata.entertainmentmedia.data.RegisterRequest;
import com.ata.entertainmentmedia.web.services.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthenticationController {


    private final AuthenticationService service;

    @PostMapping("/register")
    public ResponseEntity<AuthenticationResponse> register(
                            @RequestBody RegisterRequest request
                            ) {
        return ResponseEntity.ok(service.register(request));
    }

    @PostMapping("/authenticate")
    public ResponseEntity<AuthenticationResponse> register(
                            @RequestBody AuthenticationRequest request
                            ) {
        return ResponseEntity.ok(service.authenticate(request));
    }
}
