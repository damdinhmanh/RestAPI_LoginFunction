package com.example.loginfunction.exception;

public class PasswordWrongException extends RuntimeException {
    public PasswordWrongException(String password) {
        super("Password= " + password + " ->is not correct!");
    }
}
