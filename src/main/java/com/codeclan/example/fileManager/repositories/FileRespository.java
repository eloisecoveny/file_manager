package com.codeclan.example.fileManager.repositories;

import com.codeclan.example.fileManager.models.File;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FileRespository extends JpaRepository<File, Long> {
}
