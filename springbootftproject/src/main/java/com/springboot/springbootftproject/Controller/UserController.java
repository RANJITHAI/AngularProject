package com.springboot.springbootftproject.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mongodb.client.ListCollectionsIterable;
import com.springboot.springbootftproject.Entity.User;
import com.springboot.springbootftproject.Repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;

@RestController
@RequestMapping("\api,v1")
public class UserController {

    @Autowired
    private UserRepository userRepository ;   
    
    //get all user list
    @GetMapping("/User")
    public List<User>getAllUsers(){
        return userRepository.findAll();
    }
    //Create user
    @PostMapping
    public User CreateUser(@Validated @RequestBody User user){
        return userRepository.save(user);
    }
    //get user id
    @GetMapping("/User/{id}")
    public ResponseEntity<User>getUserByID(@PathVariable(value="id")int Userid) 
            throws ResourceNotFoundException{
        User user=userRepository.findById(id)
            .orElseThrow(() -> new ResourceNotFoundException("User not found for this ID ::"+UserId));
        return ResponseEntity.ok().body(User);
    } 
    //update  user
    @PutMapping("/User/{id)")
    public User updateUser(@PathVariable(value="id")int Userid,@RequestBody User userEmail) 
        throws ResourceNotFoundException{
    User user=userRepository.findById(id)
        .orElseThrow(() -> new ResourceNotFoundException("User not found for this ID ::"+UserId));
    User.setName(userDetails.getName);
    User.setEmail(userDetails.getEmail);
    UserRepository.save(User);
    return ResponseEntity.ok().body(User);
    }

    //Delete user id




    

}
