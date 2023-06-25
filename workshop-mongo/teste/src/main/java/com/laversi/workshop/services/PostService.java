package com.laversi.workshop.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laversi.workshop.domain.Post;
import com.laversi.workshop.repository.PostRepository;
import com.laversi.workshop.services.exception.ObjectNotFoundException;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepo;

    public List<Post> findAll(){
        return postRepo.findAll();        
    }

    public Post findById(String id){
        Optional<Post> post = postRepo.findById(id);
        if(!post.isPresent()){
        throw new ObjectNotFoundException("404 - object not found");

        }
        return post.get();
    }   
}
