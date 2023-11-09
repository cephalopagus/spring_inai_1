package com.example.spring_inai_1.controller;

import com.example.spring_inai_1.entity.UserEntity;
import com.example.spring_inai_1.repository.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserRepo userRepo;

    @PostMapping
    public ResponseEntity registration(@RequestBody UserEntity user) {
        try {
            userRepo.save(user);
            return ResponseEntity.ok("Data is saved!");
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Data isn't saved!");
        }
    }


    @GetMapping
    public ResponseEntity getUser(){
        try {
            return ResponseEntity.ok("Server is working!");
        }catch (Exception e){
            return ResponseEntity.badRequest().body("Error!");
        }
    }
}
