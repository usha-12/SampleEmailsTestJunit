package com.brideglabz.junit;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

public class SampleEmailsTest {
    @BeforeAll
static void displayMsg(){
    System.out.println("Welcome Sample Emails to Test");
    }
    @AfterEach
    public void afterMsgDisplay(){
        System.out.println("Passed");
    }
    @Test

void given_email_should_returnTrue(){
        EmailValidation validation = new EmailValidation();
        Boolean result = validation.email1("abc");
        Assertions.assertEquals(result, true);

}

}
