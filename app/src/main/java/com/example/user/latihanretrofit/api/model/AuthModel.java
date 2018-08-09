package com.example.user.latihanretrofit.api.model;


//Register Auth Model
public class AuthModel {
    final String first_name;
    final String last_name;
    final String email;
    final String username;
    final String password;
    final String role;

    public AuthModel(String first_name,
            String last_name,
            String email,
            String username,
              String password,
            String role) {
        this.first_name =first_name ;
        this.last_name =last_name ;
        this.email =email  ;
        this.username =username ;
        this.password =password ;
        this.role =role ;
    }
}
