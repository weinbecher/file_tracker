package com.codeclan.example.fileTracker.repositories;


import com.codeclan.example.fileTracker.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
