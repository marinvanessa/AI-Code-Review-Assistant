package com.example.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;

@Entity
@Setter
@Getter
@NoArgsConstructor
public class DeveloperUser {

    @Id
    @GeneratedValue
    private UUID id;

    private String firstName;

    private String lastName;

    private String email;

    private String password;
}
