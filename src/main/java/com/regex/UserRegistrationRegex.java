package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class UserRegistrationRegex
{
    public static void main(String[] args) {
        UserRegistrationRegex regex = new UserRegistrationRegex();
        regex.firstNameInput();
        regex.lastNameInput();
        regex.emailInput();
        regex.numberInput();
        regex.passwordInput1();
        regex.passwordInput2();
        regex.passwordInput3();
        regex.passwordInput4();
    }

    public void firstNameInput() {
        String firstNameInput = "Parvez";
        String regex = "^[[a-z]{1}A-Z]+$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(firstNameInput);
        if (matcher.matches()) {
            System.out.println("\n Valid Name ");
        } else {
            System.out.println("\n Invalid Name");
        }
    }

    public void lastNameInput() {

        String lastNameInput = "Makandar";
        String regex = "^[[a-z]{1}A-Z]{2,}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(lastNameInput);
        if (matcher.matches()) {
            System.out.println("\n Valid LastName ");
        } else {
            System.out.println("\n Invalid LastName");
        }
    }

    public void emailInput()
    {
        String emailInput = "parvezhm050@gmail.com";
        String regex = "^[a-z0-9]+([_+-.][0-9a-z]+)*@[a-z]+.[a-z]{2,3}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(emailInput);
        if (matcher.matches()) {
            System.out.println("\n Valid E-mail ID ");
        } else {
            System.out.println("\n Invalid  E-mail ID");
        }
    }

    public void numberInput() {
        String numberInput = "91 8147340746";
        String regex = "^[0-9]{2}\\s[0-9]{10}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(numberInput);
        if (matcher.matches()) {
            System.out.println("\n Valid  Mobile Number " );
        } else {
            System.out.println("\n Invalid  Mobile Number");
        }
    }

    public void passwordInput1() {
        String passwordInput1 = "ParvezMakandar";
        String regex = "^[a-zA-Z]{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(passwordInput1);
        if (matcher.matches()) {
            System.out.println("\n Valid : rule 1 passed " );
        } else {
            System.out.println("\n Invalid : rule 2 not passed ");
        }
    }

    public void passwordInput2() {
        String passwordInput2 = "ParvezMakandar";
        String regex = "^[a-zA-Z]{8,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(passwordInput2);
        if (matcher.matches()) {
            System.out.println("\n Valid : rule 2 passed" );
        } else {
            System.out.println("\n Invalid : rule 2 not passed ");
        }
    }

    public void passwordInput3() {
        String passwordInput3 = "ParvezMakandar72";
        String regex = "^[a-zA-Z]{8,}[0-9]{1,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(passwordInput3);
        if (matcher.matches()) {
            System.out.println("\n Valid : rule 3 passed " );
        } else {
            System.out.println("\n Invalid : rule 3 not passed ");
        }
    }

    public void passwordInput4() {
        String passwordInput4 = "ParvezMakandar@72";
        String regex = "^[a-zA-Z]{8,}[  0-9]{2,}[@-_]$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(passwordInput4);
        if (matcher.matches()) {
            System.out.println("\n Valid : rule 4 passed " );
        } else {
            System.out.println("\n Invalid : rule 4 not passed ");
        }
    }
}