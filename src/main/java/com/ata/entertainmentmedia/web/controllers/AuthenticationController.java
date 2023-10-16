package com.ata.entertainmentmedia.web.controllers;

import com.ata.entertainmentmedia.data.AuthenticationRequest;
import com.ata.entertainmentmedia.data.AuthenticationResponse;
import com.ata.entertainmentmedia.data.RegisterRequest;
import com.ata.entertainmentmedia.security.user.User;
import com.ata.entertainmentmedia.web.services.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthenticationController {


    private final AuthenticationService service;

    @GetMapping("/users")
    public List<User> getUsers(){
        return service.getUsers();
    }

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
