package com.codeclan.example.fileManager.repositories;

import com.codeclan.example.fileManager.models.User;
import com.codeclan.example.fileManager.projections.EmbedFolders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(excerptProjection = EmbedFolders.class)
public interface UserRepository extends JpaRepository<User, Long> {
}
