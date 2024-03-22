package com.marco.workshopmongodb.controllers;


import com.marco.workshopmongodb.domain.User;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping(value = "/users")
public class UserController {

    @GetMapping
    public ResponseEntity<List<User>> findAll() {
        User maria = new User("1", "Maria", "maria@gmail.com");
        User wender = new User("2", "wender", "wender123@gmail.com");
        List<User> list = new ArrayList<>(Arrays.asList(maria, wender));
        return ResponseEntity.ok().body(list);
    }
}
