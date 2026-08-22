package com.example.model.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.UUID;

@Entity
public class Review {

    @Id
    @GeneratedValue
    private UUID id;
}
