package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class UserRegistrationRegex {
    public static void main( String[] args ) {
        UserRegistrationRegex regex = new UserRegistrationRegex();
        regex.firstNameInput();
    }

    public void firstNameInput() {

        String firstNameInput = "Sandeep";
        String regex = "^[[a-z]{1}A-Z]{1,}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(firstNameInput);
        if (matcher.matches()) {
            System.out.println("\n VALID  Name ");
        } else {
            System.out.println("\n invalid Name");
        }
    }
}