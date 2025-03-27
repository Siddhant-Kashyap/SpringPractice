package com.example.demo.Services;

import com.example.demo.Entity.User;
import com.example.demo.Repository.UserCrud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServices {
    @Autowired
    private UserCrud userCrud;
    public void createUserStory(User user){
        userCrud.save(user);
    }
    public List<User> getAll(){
        return userCrud.findAll();
    }
}
