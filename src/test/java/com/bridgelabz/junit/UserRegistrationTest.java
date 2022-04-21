package com.bridgelabz.junit;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    boolean result;
    UserRegister performTest = new UserRegister();

    @Test
    public void firstNameTest() {
        result = performTest.validateFirstName("Durgesh");
        Assert.assertEquals(true, result);
    }

    @Test
    public void lastNameTest() {
        result = performTest.validateLastName("Chavan");
        Assert.assertEquals(true, result);
    }

    @Test
    public void emailTest() {
        result = performTest.validateEmail("dbc@gmail.com");
        Assert.assertEquals(true, result);
    }

    @Test
    public void phoneNumberTest() {
        result = performTest.validatePhoneNumber("+91-1234567890");
        Assert.assertEquals(true, result);
    }

    @Test
    public void passwordTest() {
        result = performTest.validatePassword("Dc@123$xy#z");
        Assert.assertEquals(true, result);
    }
}
