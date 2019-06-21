package com.kk.SpringDataJPADemo.commandLineRunner;

import com.kk.SpringDataJPADemo.models.User;
import com.kk.SpringDataJPADemo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserCRUDCommand_LineRunner implements CommandLineRunner {

    @Autowired
    UserRepository userRepository;
    private User user1;

    @Override
    public void run(String... args) throws Exception{
        User user1 = new User("Kumar", "Kartikeya");
        userRepository.save(user1);
    }
}
