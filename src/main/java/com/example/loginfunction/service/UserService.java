package com.example.loginfunction.service;

import com.example.loginfunction.exception.PasswordWrongException;
import com.example.loginfunction.exception.UsernameWrongException;
import com.example.loginfunction.model.User;
import com.example.loginfunction.repository.UserRepository;
import com.example.loginfunction.request.UpsertUserRequest;
import com.example.loginfunction.response.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    public LoginResponse loginRequest(UpsertUserRequest request) {
        Optional<User> user = userRepository.findByUsername(request.getUsername());
        if (user.isPresent()) {
            User currentUser = user.get();

            if (currentUser.getPassword().equals(request.getPassword())) {
                LoginResponse loginResponse = new LoginResponse(currentUser.getUsername(),
                        currentUser.getEmail(),
                        currentUser.getAvatar());
                return loginResponse;
            } else {
                throw new PasswordWrongException(request.getPassword());
            }
        } else {
            throw new UsernameWrongException(request.getUsername());
        }
    }
}
