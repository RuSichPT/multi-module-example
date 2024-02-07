package com.example.application.controller;

import com.example.library.dto.UserDto;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

@RestController
public class UserController {
    private final HashMap<Long, UserDto> map = new HashMap<>();

    @PostConstruct
    private void init() {
        map.put(1L, new UserDto("Pavel", 27, "Java developer"));
        map.put(2L, new UserDto("Ivan", 20, "C++ developer"));
    }

    @GetMapping("/user/{id}")
    public UserDto getUser(@PathVariable long id) {
        return map.get(id);
    }

}
