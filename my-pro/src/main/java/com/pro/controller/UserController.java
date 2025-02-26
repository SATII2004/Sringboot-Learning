package com.pro.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pro.models.User;

@RestController  
public class UserController {

    @GetMapping("/users")
    public List<User> getUsers() {
       
    	List<User>users = new ArrayList<>();
    	
    	User user1 = new User("code","satish","codewithsatish@gmail.com","Giga12");
    	User user2 = new User("ram","sita","jaishreeram12@gmail.com","Hanuman");

    	users.add(user1);
    	users.add(user2);

    	return  users;
    }
}
