package com.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class UserRegistrationRegex
{
    public static void main( String[] args )
    {
        UserRegistrationRegex regex = new UserRegistrationRegex();
        regex.firstNameInput();
        regex.lastNameInput();
    }
    public void firstNameInput() {
        String firstNameInput = "Parvez";
        String regex = "^[[a-z]{1}A-Z]{1,}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(firstNameInput);
        if (matcher.matches()) {
            System.out.println("\n Valid  Name ");
        } else {
            System.out.println("\n Invalid Name");
        }
    }
    public void lastNameInput()
    {
        String lastNameInput = "Makandar";
        String regex = "^[[a-z]{1}A-Z]{2,}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(lastNameInput);
        if (matcher.matches()) {
            System.out.println("\n Valid  lastName " );
        } else {
            System.out.println("\n Invalid lastName");
        }
    }
}