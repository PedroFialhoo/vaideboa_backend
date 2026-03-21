package com.example.vaideboa.Dtos;


public class UserDto {
    private final String nome;
    private final String username;
    private final String password;
    
    public UserDto(String nome, String username, String password){
        this.nome = nome;
        this.username = username;
        this.password = password;
    }
    public String getNome() {
        return nome;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
}
