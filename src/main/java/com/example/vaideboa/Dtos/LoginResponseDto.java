package com.example.vaideboa.Dtos;

public class LoginResponseDto {
    private final String username;
    private final String password;
    public LoginResponseDto(String username, String password) {
        this.username = username;
        this.password = password;
    }
    
    public String getUsername(){
        return this.username;
    }

    public String getPassword() {
        return password;
    }
    
}
