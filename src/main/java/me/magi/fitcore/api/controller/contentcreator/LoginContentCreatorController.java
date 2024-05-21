package me.magi.fitcore.api.controller.contentcreator;

import me.magi.fitcore.dto.LoginDto;
import me.magi.fitcore.dto.pojo.LoginUserResponse;
import me.magi.fitcore.model.entity.ContentCreatorEntity;
import me.magi.fitcore.model.entity.UserEntity;
import me.magi.fitcore.model.services.jwt.AuthenticationContentCreatorService;
import me.magi.fitcore.model.services.jwt.AuthenticationUserService;
import me.magi.fitcore.model.services.jwt.JwtService;
import org.apache.catalina.Authenticator;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/api/v1")
public class LoginContentCreatorController {

    private final JwtService jwtService;

    private final AuthenticationContentCreatorService authenticationContentCreatorService;

    public LoginContentCreatorController(JwtService jwtService, AuthenticationContentCreatorService authenticationUserService) {
        this.jwtService = jwtService;
        this.authenticationContentCreatorService = authenticationUserService;
    }

    @PostMapping("/contentCreator/login")
    public ResponseEntity<LoginUserResponse> authenticate(@RequestBody ContentCreatorEntity loginUserDto) {
        ContentCreatorEntity authenticatedUser = authenticationContentCreatorService.authenticate(loginUserDto);

        String jwtToken = jwtService.generateToken(authenticatedUser);

        LoginUserResponse loginUserResponse = new LoginUserResponse();
        loginUserResponse.setExpiresIn(jwtService.getExpirationTime());
        loginUserResponse.setToken(jwtToken);

        return ResponseEntity.ok(loginUserResponse);
    }

}
