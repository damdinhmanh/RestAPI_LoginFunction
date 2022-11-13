package com.example.loginfunction.controller;

import com.example.loginfunction.model.User;
import com.example.loginfunction.request.UpsertUserRequest;
import com.example.loginfunction.response.LoginResponse;
import com.example.loginfunction.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("login")
    public LoginResponse loginRequest(@RequestBody UpsertUserRequest request) {
        return userService.loginRequest(request);
    }

}
