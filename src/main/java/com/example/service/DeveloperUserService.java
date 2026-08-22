package com.example.service;

import com.example.model.request.DeveloperUserRequest;
import com.example.model.entity.DeveloperUser;
import com.example.model.request.LoginUserRequest;
import com.example.repository.DeveloperUserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class DeveloperUserService {

    private final DeveloperUserRepository developerUserRepository;

    public DeveloperUser createUser(DeveloperUserRequest userRequest) {
        DeveloperUser user = new DeveloperUser();
        user.setFirstName(userRequest.getFirstName());
        user.setLastName(userRequest.getLastName());
        user.setEmail(userRequest.getEmail());
        user.setPassword(userRequest.getPassword());
        developerUserRepository.save(user);
        return user;
    }

    public DeveloperUser loginDeveloperUser(LoginUserRequest loginUserRequest) {
        DeveloperUser user = new DeveloperUser();
        user.setEmail(loginUserRequest.getEmail());
        user.setPassword(loginUserRequest.getPassword());
        return developerUserRepository.findDeveloperUserByEmail(loginUserRequest.getEmail());
    }
}
