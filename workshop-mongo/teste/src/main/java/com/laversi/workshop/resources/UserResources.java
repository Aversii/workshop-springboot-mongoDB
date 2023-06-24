package com.laversi.workshop.resources;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.laversi.workshop.domain.User;

@RestController
@RequestMapping(value = "/users")
public class UserResources {

    @GetMapping
    public ResponseEntity<List<User>> findAll(){
        User usuario = new User("1", "null", "null@gmail.com");
        User usuario2 = new User("2", "joao", "joao@gmail.com");
        List<User> list = new ArrayList<>();
        list.addAll(Arrays.asList(usuario,usuario2));
        return ResponseEntity.ok().body(list);
    }
    
}
