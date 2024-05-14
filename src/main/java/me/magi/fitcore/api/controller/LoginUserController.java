package me.magi.fitcore.api.controller;

import me.magi.fitcore.dto.LoginDto;
import me.magi.fitcore.dto.pojo.LoginUserResponse;
import me.magi.fitcore.model.entity.UserEntity;
import me.magi.fitcore.model.services.jwt.AuthenticationService;
import me.magi.fitcore.model.services.jwt.JwtService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class LoginUserController {
    private final JwtService jwtService;

    private final AuthenticationService authenticationService;

    public LoginUserController(JwtService jwtService, AuthenticationService authenticationService) {
        this.jwtService = jwtService;
        this.authenticationService = authenticationService;
    }

    @PostMapping("/login")
    public ResponseEntity<LoginUserResponse> authenticate(@RequestBody LoginDto loginUserDto) {
        UserEntity authenticatedUser = authenticationService.authenticate(loginUserDto);

        String jwtToken = jwtService.generateToken(authenticatedUser);

        LoginUserResponse loginUserResponse = new LoginUserResponse();
        loginUserResponse.setExpiresIn(jwtService.getExpirationTime());
        loginUserResponse.setToken(jwtToken);

        return ResponseEntity.ok(loginUserResponse);
    }

}