package com.codeclan.example.fileManager;

import com.codeclan.example.fileManager.models.File;
import com.codeclan.example.fileManager.models.Folder;
import com.codeclan.example.fileManager.models.User;
import com.codeclan.example.fileManager.repositories.FileRespository;
import com.codeclan.example.fileManager.repositories.FolderRepository;
import com.codeclan.example.fileManager.repositories.UserRepository;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class FileManagerApplicationTests {

	@Autowired
	FileRespository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	UserRepository userRepository;

	@Test
	public void contextLoads() {
	}

	@Test
	public void createFileAndMoveToFolder(){
		User user = new User("Eloise");
		userRepository.save(user);
		Folder folder = new Folder("CV", user);
		folderRepository.save(folder);
		File file = new File("CV_draft", "doc", 65.7, folder);
		fileRepository.save(file);
	}

}
