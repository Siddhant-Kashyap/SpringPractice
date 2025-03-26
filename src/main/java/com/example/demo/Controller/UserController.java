package com.example.demo.Controller;

import com.example.demo.Entity.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/user")
public class UserController {
    private final Map<Long, User> userMap = new HashMap<>();

    @GetMapping
    public ResponseEntity<ArrayList<User>> getUser(){
        return ResponseEntity.ok(new ArrayList<>(userMap.values()));
    }
    @PostMapping("/add")
    public ResponseEntity<Boolean> postUser(@RequestBody User req){
        userMap.put(req.getId(),req);
        return ResponseEntity.ok(true);
    }


}
