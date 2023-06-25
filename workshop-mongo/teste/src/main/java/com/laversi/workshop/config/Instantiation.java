package com.laversi.workshop.config;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.TimeZone;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.laversi.workshop.domain.Post;
import com.laversi.workshop.domain.User;
import com.laversi.workshop.dto.AuthorDTO;
import com.laversi.workshop.repository.PostRepository;
import com.laversi.workshop.repository.UserRepository;

@Configuration
public class Instantiation implements CommandLineRunner {

    @Autowired
    private UserRepository userRepo;
    @Autowired
    private PostRepository postRepo;
    

    @Override
    public void run(String... args) throws Exception {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        sdf.setTimeZone(TimeZone.getTimeZone("GMT"));

        userRepo.deleteAll();
        postRepo.deleteAll();

        User pedro = new User("1", "Pedro", "pedro@gmail.com");
        User manoela = new User("2", "Manoela", "manoela@gmail.com");
        User yuri = new User("3", "Yuri", "yuri@gmail.com");

        Post post1 = new Post(null, sdf.parse("23/01/2018"), "Partiu Viagem", "Fui para Tangamandápio",new AuthorDTO(pedro));
        Post post2 = new Post(null, sdf.parse("23/05/2018"), "Partiu Trabalho", "Fui para o Trabalho =/",new AuthorDTO(pedro));
        Post post3 = new Post(null, sdf.parse("25/12/2018"), "Partiu Natal", "Fui para o polo norte",new AuthorDTO(yuri));

               
        userRepo.saveAll(Arrays.asList(pedro, manoela, yuri));
        postRepo.saveAll(Arrays.asList(post1,post2,post3));     
        
    }
    
    
} 
