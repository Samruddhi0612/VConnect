package com.example.authentication;

public class User {

    // variables for storing our data.
    private String name, description, date;

    public User() {
        // empty constructor
        // required for Firebase.
    }

    // Constructor for all variables.
    public User(String name, String desc, String date) {
        this.name = name;
        this.description = desc;
        this.date = date;
    }

    // getter methods for all variables.
    public String getCourseName() {
        return name;
    }

    public void setCourseName(String name) {
        this.name = name;
    }

    public String getCourseDescription() {
        return description;
    }

    // setter method for all variables.
    public void setCourseDescription(String description) {
        this.description = description;
    }

    public String getCourseDuration() {
        return date;
    }

    public void setCourseDuration(String date) {
        this.date = date;
    }
}
