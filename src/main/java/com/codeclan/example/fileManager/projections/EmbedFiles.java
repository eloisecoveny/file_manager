package com.codeclan.example.fileManager.projections;

import com.codeclan.example.fileManager.models.File;
import com.codeclan.example.fileManager.models.Folder;
import org.springframework.data.rest.core.config.Projection;

import java.util.List;

@Projection(name = "embedFiles", types = Folder.class)
public interface EmbedFiles {
    String getName();
    List<File> getFiles();
}
