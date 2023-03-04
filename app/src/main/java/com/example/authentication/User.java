package com.example.authentication;

public class User {

    public String name;
    public String desc ;
    public String date;

    public User() {
        // Default constructor required for calls to DataSnapshot.getValue(User.class)
    }

    public User(String username, String descp, String datel) {
        this.name = username;
        this.desc = descp;
        this.date = datel;
    }

}
