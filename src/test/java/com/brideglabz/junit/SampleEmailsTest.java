package com.brideglabz.junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class SampleEmailsTest {
    @BeforeAll
    static void displayMsg() {
        System.out.println("Welcome Sample Emails to Test");
    }

    @AfterEach
    public void afterMsgDisplay() {
        System.out.println("Passed");
    }

    @Test
    void given_email_should_returnTrue() {
        EmailValidation validation = new EmailValidation();
        Boolean result = validation.email1("abc");
        Assertions.assertEquals(result, true);

    }
    @Test
    void given_email1_should_returnTrue() {
        EmailValidation validation = new EmailValidation();
        Boolean result1 = validation.email2("abc@gmail");
        Assertions.assertEquals(result1, true);

    }
    @Test
    void given_email2_should_returnTrue() {
        EmailValidation validation = new EmailValidation();
        Boolean result2 = validation.email3("abc@gmail.com");
        Assertions.assertEquals(result2, true);

    }
    @Test
    void given_email3_should_returnTrue() {
        EmailValidation validation = new EmailValidation();
        Boolean result3 = validation.email4("abc.xyz@gmail.com");
        Assertions.assertEquals(result3, true);

    }
    @Test
    void given_email4_should_returnTrue() {
        EmailValidation validation = new EmailValidation();
        Boolean result4 = validation.email5("abc.xyz@gmail.com");
        Assertions.assertEquals(result4, true);

    }
}
