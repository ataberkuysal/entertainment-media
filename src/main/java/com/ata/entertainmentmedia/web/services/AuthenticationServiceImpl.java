package com.ata.entertainmentmedia.web.services;

import com.ata.entertainmentmedia.data.AuthenticationRequest;
import com.ata.entertainmentmedia.data.AuthenticationResponse;
import com.ata.entertainmentmedia.data.RegisterRequest;
import com.ata.entertainmentmedia.utils.logging.Log;
import com.ata.entertainmentmedia.web.repos.UserRepo;
import com.ata.entertainmentmedia.security.config.JwtService;
import com.ata.entertainmentmedia.security.user.Role;
import com.ata.entertainmentmedia.security.user.User;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AuthenticationServiceImpl implements AuthenticationService{

    private final UserRepo repo;

    private final PasswordEncoder passwordEncoder;

    private final JwtService jwtService;

    private final AuthenticationManager authenticationManager;

    @Override
    @Log
    public List<User> getUsers() {
        return repo.findAll();
    }

    @Override
    @Log
    public AuthenticationResponse register(RegisterRequest request) {

        var user = User.builder()
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .email(request.getEmail())
                .password(passwordEncoder.encode(request.getPassword()))
                .role(Role.USER)
                .build();

        repo.save(user);

        var jwtToken = jwtService.generateToken(user);

        return AuthenticationResponse.builder()
                .token(jwtToken)
                .build();
    }

    @Override
    @Log
    public AuthenticationResponse authenticate(AuthenticationRequest request) {

        //Checks auth of user , else throws exception
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getEmail(), request.getPassword()
                )
        );

        var user = repo.findByEmail(request.getEmail())
                .orElseThrow();

        var jwtToken = jwtService.generateToken(user);

        return AuthenticationResponse.builder()
                .token(jwtToken)
                .build();
    }
}
