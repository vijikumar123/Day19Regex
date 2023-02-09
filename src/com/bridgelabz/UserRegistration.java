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
    //Uc-4
    public  void validContactNumber(){

        Pattern pattern = Pattern.compile("^[0-9]{1,2}\\s{1}[0-9]{10}$");
        Matcher matcher = pattern.matcher("91 9146075923");
        if (matcher.matches()){
            System.out.println("valid");
        }else {
            System.out.println("invalid");
        }
    }
    // UC-5
    public void validPasswordRule1(){
        Pattern pattern = Pattern.compile("^[a-z]{8,}+$");
        Matcher matcher = pattern.matcher("bhartiff");
        if (matcher.matches()){
            System.out.println("valid");
        }else {
            System.out.println("invalid");
        }
    }
    // UC-6
    public void validPasswordRule2() {
        Pattern pattern = Pattern.compile("^([A-Z]?[a-z]{8,})$");
        Matcher matcher = pattern.matcher("Bhartifule");
        if (matcher.matches()) {
            System.out.println("valid");
        } else {
            System.out.println("invalid");
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome To Regular Expression");
        UserRegistration regex = new UserRegistration();
        regex.validFirstName();
        regex.validLastName();
        regex.validEmail();
        regex.validContactNumber();
        regex.validPasswordRule1();
        regex.validPasswordRule2();

    }
}









