package com.codeclan.example.fileManager.projections;

import com.codeclan.example.fileManager.models.Folder;
import com.codeclan.example.fileManager.models.User;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedFolders", types = User.class)
public interface EmbedFolders {
    String getName();
    List<Folder> getFolders();
}
