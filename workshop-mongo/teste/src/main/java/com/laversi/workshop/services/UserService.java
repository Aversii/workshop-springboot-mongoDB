package com.laversi.workshop.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.laversi.workshop.domain.User;
import com.laversi.workshop.dto.UserDTO;
import com.laversi.workshop.repository.UserRepository;
import com.laversi.workshop.services.exception.ObjectNotFoundException;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepo;

    public List<User> findAll(){
        return userRepo.findAll();        
    }

    public User findById(String id){
        Optional<User> user = userRepo.findById(id);
        if(!user.isPresent()){
        throw new ObjectNotFoundException("404 - object not found");

        }
        return user.get();
    }

    public User insert(User obj){
        return userRepo.insert(obj);
    }

    public void delete(String id){
        findById(id);
        userRepo.deleteById(id);
    }

public User update(User obj){
    Optional<User> newObj = userRepo.findById(obj.getId());
    if (newObj.isPresent()) {
        updateData(newObj.get(), obj);
        return userRepo.save(newObj.orElseThrow());
    } else {
        throw new ObjectNotFoundException("404 - object not found");
    }
}

    private void updateData(User newObj, User obj) {
        newObj.setName(obj.getName());
        newObj.setEmail(obj.getEmail());        
    }

    public User fromDTO(UserDTO objDto){
        return new User(objDto.getId(), objDto.getName(), objDto.getEmail());        
    }



    
}
