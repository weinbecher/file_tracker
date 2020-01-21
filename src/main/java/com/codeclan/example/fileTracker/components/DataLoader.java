package com.codeclan.example.fileTracker.components;

import com.codeclan.example.fileTracker.models.File;
import com.codeclan.example.fileTracker.models.Folder;
import com.codeclan.example.fileTracker.models.User;
import com.codeclan.example.fileTracker.repositories.FileRepository;
import com.codeclan.example.fileTracker.repositories.FolderRepository;
import com.codeclan.example.fileTracker.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    FileRepository fileRepository; //add layer between model and database.
    @Autowired
    FolderRepository folderRepository;
    @Autowired
    UserRepository userRepository;
    public DataLoader() {
    }
    public void run(ApplicationArguments args) {
        File letter = new File("letter","txt",38,"Documents");
        fileRepository.save(letter);

        File ruby = new File("ruby","rb",234,"Scripts");
        fileRepository.save(ruby);

        User sophia = new User("Sophia");
        userRepository.save(sophia);

        User nate = new User("Nate");
        userRepository.save(nate);

        Folder documents = new Folder("Documents", "Sophia");
        folderRepository.save(documents);


        Folder scripts = new Folder("Documents", "Sophia");
        folderRepository.save(scripts);

        sophia.addFolder(documents);
        nate.addFolder(scripts);


//        jack.addRaid(raid1);
//        jack.addRaid(raid2);
//
//        pirateRepository.save(jack);
//        raid2.addPirate(john);
//        raidRepository.save(raid2);
    }

}
