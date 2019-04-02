package com.codeclan.example.fileManager.repositories;

import com.codeclan.example.fileManager.models.Folder;
import com.codeclan.example.fileManager.projections.EmbedFiles;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedFiles.class)
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
