package com.bridgelabz;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    //UC-1
    public  void validFirstName() {
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{3,15}$");
        Matcher matcher = pattern.matcher("Bharti");
        if (matcher.matches()){
            System.out.println("valid");
        }else {
            System.out.println("invalid");
        }
    }
    // UC-2
    public  void validLastName() {
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{3,15}$");
        Matcher matcher = pattern.matcher("Fule");
        if (matcher.matches()){
            System.out.println("valid");
        }else {
            System.out.println("invalid");
        }
    }
    //UC-3
    public void  validEmail(){

        Pattern pattern = Pattern.compile("^(.+)@(.+)$");
        Matcher matcher = pattern.matcher("bhartif123@gmail.com");
        if (matcher.matches()){
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome To Regular Expression");
        UserRegistration regex = new UserRegistration();
        regex.validFirstName();
        regex.validLastName();
        regex.validEmail();

    }
}




