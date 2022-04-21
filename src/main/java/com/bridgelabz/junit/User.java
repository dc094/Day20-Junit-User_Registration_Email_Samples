package com.bridgelabz.junit;

public class User {
    public final String firstName;
    public final String lastName;
    public final String email;
    public final String phoneNumber;
    public final String password;

    public User(String firstName, String lastName, String email, String phoneNumber, String password) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.phoneNumber = phoneNumber;
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getPassword() {
        return password;
    }
}
