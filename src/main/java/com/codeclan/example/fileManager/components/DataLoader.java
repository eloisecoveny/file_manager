package com.codeclan.example.fileManager.components;

import com.codeclan.example.fileManager.models.File;
import com.codeclan.example.fileManager.models.Folder;
import com.codeclan.example.fileManager.models.User;
import com.codeclan.example.fileManager.repositories.FileRespository;
import com.codeclan.example.fileManager.repositories.FolderRepository;
import com.codeclan.example.fileManager.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    FileRespository fileRepository;

    @Autowired
    FolderRepository folderRepository;

    @Autowired
    UserRepository userRepository;

    public DataLoader() {
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {

        User user = new User("Eloise");
        userRepository.save(user);

        Folder CV = new Folder("CV", user);
        folderRepository.save(CV);

        Folder screenGrabs = new Folder("Screen_Grabs", user);
        folderRepository.save(screenGrabs);

        File curriculumVitae = new File("CV_draft", "doc", 65.7, CV);
        fileRepository.save(curriculumVitae);

        File sunnyDay = new File("Sunny_Day", "jpg", 220.87, screenGrabs);
        fileRepository.save(sunnyDay);

        File holiday = new File("Holiday_Photo", "png", 520.43, screenGrabs);
        fileRepository.save(holiday);

    }
}
