package com.example.user.latihanretrofit.api.model;

public class Login {
    final String email;
    final String password;

    public Login (
            String email,
            String password){
        this.email=email;
        this.password=password;
    }
}
