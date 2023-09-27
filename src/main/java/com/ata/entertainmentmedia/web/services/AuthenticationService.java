package com.ata.entertainmentmedia.web.services;

import com.ata.entertainmentmedia.data.AuthenticationRequest;
import com.ata.entertainmentmedia.data.AuthenticationResponse;
import com.ata.entertainmentmedia.data.RegisterRequest;
import com.ata.entertainmentmedia.security.user.User;

import java.util.List;

public interface AuthenticationService {

    List<User> getUsers();

    AuthenticationResponse register(RegisterRequest request);

    AuthenticationResponse authenticate(AuthenticationRequest request);
}
