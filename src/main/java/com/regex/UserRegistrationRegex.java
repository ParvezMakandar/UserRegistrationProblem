package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class UserRegistrationRegex {
    public static void main(String[] args) {
        UserRegistrationRegex regex = new UserRegistrationRegex();
        regex.firstNameInput();
        regex.lastNameInput();
        regex.emailInput();
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
}