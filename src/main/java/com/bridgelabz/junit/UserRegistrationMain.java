package com.bridgelabz.junit;

import java.util.Scanner;

public class UserRegistrationMain {
    public static void main(String[] args) {
        UserRegister registration = new UserRegister();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter First Name: ");
        String firstName = scanner.nextLine();
        registration.validateFirstName(firstName);

        System.out.println("Enter Last Name: ");
        String lastName = scanner.nextLine();
        registration.validateLastName(lastName);

        System.out.println("Enter Email: ");
        String email = scanner.nextLine();
        registration.validateEmail(email);

        System.out.println("Enter Phone-Number");
        String number = scanner.nextLine();
        registration.validatePhoneNumber(number);

        System.out.println("Enter Password: ");
        String password = scanner.nextLine();
        registration.validatePassword(password);

        registration.register();
    }
}
