package com.example.repository;

import com.example.model.entity.DeveloperUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface DeveloperUserRepository extends JpaRepository<DeveloperUser, UUID> {

    DeveloperUser findDeveloperUserByEmail(String email);
    Boolean existsDeveloperUserByEmail(String email);
}
