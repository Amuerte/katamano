package com.manomano.kata.infrastructure.controller;

import com.manomano.kata.domain.User;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Configuration
@RestController
@RequestMapping(value = "/api", produces = MediaType.APPLICATION_JSON_VALUE)
public class UserController {

    @GetMapping("/user/{userId}")
    public ResponseEntity<User> getUserById(@PathVariable int userId) {
        return ResponseEntity.ok(new User());
    }
}
