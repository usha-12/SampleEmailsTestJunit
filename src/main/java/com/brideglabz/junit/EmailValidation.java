package com.brideglabz.junit;

import java.util.regex.Pattern;

public class EmailValidation {
    public static final String EMAIL_FIRST="^[0-9a-zA-Z]*";
    public static final String EMAIL_DOMAIN= "^[0-9a-zA-Z]*[@][a-zA-Z]+$";
    public static final String EMAIL_DOT =  "^[0-9a-zA-Z]*[@][a-zA-Z]+[.][a-z]{2,4}$";
    public Boolean email1(String email1) {
        return (Pattern.matches(EMAIL_FIRST, email1));
        }

    public Boolean email2(String email2) {
        return (Pattern.matches(EMAIL_DOMAIN, email2));
    }

    public Boolean email3(String email3) {
        return (Pattern.matches(EMAIL_DOT, email3));
    }
}

