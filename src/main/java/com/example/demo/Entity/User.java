package com.example.demo.Entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@Document

public class User {

    @Id
    private String id ;
    private String name;
    private String role;
    private String story;
}
