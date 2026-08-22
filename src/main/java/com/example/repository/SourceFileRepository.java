package com.example.repository;

import com.example.model.entity.SourceFile;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface SourceFileRepository extends JpaRepository<SourceFile, Long> {
}
