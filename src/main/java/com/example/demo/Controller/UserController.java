package com.example.demo.Controller;

import com.example.demo.Entity.User;
import com.example.demo.Services.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;


@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserServices userServices;

    @GetMapping
    public ResponseEntity<List<User>> getUser(){
        return ResponseEntity.ok(userServices.getAll());
    }
    @PostMapping("/add")
    public ResponseEntity<Boolean> postUser(@RequestBody User req){
        userServices.createUserStory(req);
        return ResponseEntity.ok(true);
    }


}
