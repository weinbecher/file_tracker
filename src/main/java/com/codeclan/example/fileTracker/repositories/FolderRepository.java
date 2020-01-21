package com.codeclan.example.fileTracker.repositories;

import com.codeclan.example.fileTracker.models.File;
import com.codeclan.example.fileTracker.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}