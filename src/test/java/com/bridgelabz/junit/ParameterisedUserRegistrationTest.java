package com.bridgelabz.junit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ParameterisedUserRegistrationTest {
    UserRegister emailTest;
    private final boolean expected;
    private String emailCheck;

    public ParameterisedUserRegistrationTest(UserRegister emailTest, boolean expected) {
        this.emailTest = emailTest;
        this.expected = expected;
    }

    @Before
    public void setUp() {
        emailTest = new UserRegister();
    }

    @Parameterized.Parameters
    public static Collection<Object[]> testData() {
        Object[][] data = new Object[][]{
                {"abc@yahoo.com", true},
                {"abc-100@yahoo.com", true},
                {"abc.100@yahoo.com", true},
                {"abc111@abc.com", true},
                {"abc-100@abc.net", true},
                {"abc.100@abc.com.au", true},
                {"abc@1.com", true},
                {"abc@yahoo.com.com", true},
                {"abc+100@yahoo.com", true},
                {"abc@.com", false}
        };
        return Arrays.asList(data);
    }

    @Test
    public void testUserRegis() {
        Assert.assertEquals(expected, emailTest.validateEmail(emailCheck));
    }
}
