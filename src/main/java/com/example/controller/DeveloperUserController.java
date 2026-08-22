package com.example.controller;

import com.example.model.entity.DeveloperUser;
import com.example.model.request.DeveloperUserRequest;
import com.example.model.request.LoginUserRequest;
import com.example.service.DeveloperUserService;
import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
public class DeveloperUserController {

    private final DeveloperUserService developerUserService;

    @PostMapping("/users")
    public void createDeveloperUser(@Valid @RequestBody DeveloperUserRequest userRequest) {
        log.atInfo().log("Creating user with email: {}", userRequest.getEmail());
        developerUserService.createUser(userRequest);
    }

    @PostMapping("/users/login")
    public void loginDeveloperUser(@Valid @RequestBody LoginUserRequest loginUserRequest) {
        log.atInfo().log("Logging user with email: {}", loginUserRequest.getEmail());
         DeveloperUser developerUser = developerUserService.loginDeveloperUser(loginUserRequest);
         log.atInfo().log("User logged in: {}", developerUser.getEmail());}
}
