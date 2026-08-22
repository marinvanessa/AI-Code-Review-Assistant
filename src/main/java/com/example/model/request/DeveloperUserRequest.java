package com.example.model.request;

import jakarta.validation.constraints.NotNull;
import lombok.Getter;

@Getter
public class DeveloperUserRequest {
    @NotNull
    private String firstName;
    @NotNull
    private String lastName;
    @NotNull
    private String email;
    @NotNull
    private String password;
}
