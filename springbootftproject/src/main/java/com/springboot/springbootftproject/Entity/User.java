package com.springboot.springbootftproject.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import scala.collection.StringOps;
import scala.collection.StringParsers;

import javax.persistence.Column;

@Entity

@Table(name="User_tbl")
public class User {
      
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    @Column(name="id")
    private int id;
    
    @Column(name="name")
    private  String name;

    @Column(name="email")
    private  String email;
    //Constructor
    public User() {
        super();
    }
    public User(int id,String name,String email){
        super();
        this.id=id;
        this.name=name;
        this.email=email;   
    }
    
   
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
   
    public String getEmail() {
        return email;
    
    
    // standard constructors / setters / getters / toString
    
}
