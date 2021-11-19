package com.springboot.springbootftproject.Controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import antlr.collections.List;

//import com.mongodb.client.ListCollectionsIterable;
import com.springboot.springbootftproject.Entity.User;
import com.springboot.springbootftproject.Exception.ResourceNotFoundException;
import com.springboot.springbootftproject.Repository.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.support.Repositories;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;

@RestController
@RequestMapping("/api,v1")
public class UserController {

    /**
    //get all user list
    @GetMapping("/User")
    public List<User>listAll(){
    //public List<User>getAllUsers(){
      //  return userRepository.findAll();
    }
    //Create user
    @PostMapping
    public User CreateUser(@Validated @RequestBody User user){
        return userRepository.save(user);
    }   
    //get user id
    @GetMapping("/User/{id}")
    public ResponseEntity<User>getUserByID(@PathVariable(value="id")int UserId) 
        throws ResourceNotFoundException{
        User user=userRepository.findById(UserId)
            .orElseThrow(() -> new ResourceNotFoundException("User not found for this ID ::"+UserId));
        return ResponseEntity.ok().body(user);
    } 
    //update  user
    @PutMapping("/User/{id}")
    public ResponseEntity<User> updateUser(@PathVariable(value="id")int UserId,@RequestBody User userDetails) 
        throws ResourceNotFoundException{
    User user=userRepository.findById(UserId)
    .orElseThrow(() -> new ResourceNotFoundException("User not found for this ID ::"+UserId));
    user.setName(userDetails.getName());
    user.setEmail(userDetails.getEmail());
    userRepository.save(user);
    return ResponseEntity.ok().body(user);
    }

       //Delete user id
    @DeleteMapping("/User/{id}")
    public ResponseEntity<?> deleteUser(@PathVariable(value="id")int UserId) 
       throws ResourceNotFoundException{
   userRepository.findById(UserId)
       .orElseThrow(() -> new ResourceNotFoundException("User not found for this ID ::"+UserId));
    userRepository.deleteById(UserId);
    return ResponseEntity.ok().body(); 
       } */
}