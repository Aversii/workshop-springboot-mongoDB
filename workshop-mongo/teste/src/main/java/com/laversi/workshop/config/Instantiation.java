package com.laversi.workshop.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.laversi.workshop.domain.User;
import com.laversi.workshop.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepo;
    

    @Override
    public void run(String... args) throws Exception {
        userRepo.deleteAll();
        User pedro = new User(null, "Pedro", "pedro@gmail.com");
        User manoela = new User(null, "Manoela", "manoela@gmail.com");
        User yuri = new User(null, "Yuri", "yuri@gmail.com");
        userRepo.saveAll(Arrays.asList(pedro, manoela, yuri));        
    }
    
    
} 
