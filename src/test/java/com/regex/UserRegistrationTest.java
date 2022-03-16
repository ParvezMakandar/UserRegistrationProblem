package com.regex;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.testng.annotations.Test;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class UserRegistrationTest {
    public boolean mailregex(String mailID) {
        String regex = "^[a-z0-9]{1,}+([_+-.][a-z0-9]{3,}+)*@[a-z0-9]+.[a-z]{2,3}+(.[a-z]{2,3}){0,1}$";
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(mailID);
        return matcher.matches();
    }

    @Test
    public void Mailcheck1() {
        UserRegistrationTest test = new UserRegistrationTest();
        String check = "1.abc@yahoo.com";
        assertTrue(test.mailregex(check));
    }

    @Test
    public void Mailcheck2() {
        UserRegistrationTest test = new UserRegistrationTest();
        String check = "2.abc-100@yahoo.com";
        assertTrue(test.mailregex(check));
    }

    @Test
    public void Mailcheck3() {
        UserRegistrationTest test = new UserRegistrationTest();
        String check = "3.abc.100@yahoo.com";
        assertTrue(test.mailregex(check));
    }

    @Test
    public void Mailcheck4() {
        UserRegistrationTest test = new UserRegistrationTest();
        String check = "2.abc111@abc.com";
        assertTrue(test.mailregex(check));
    }

    @Test
    public void Mailcheck5() {
        UserRegistrationTest test = new UserRegistrationTest();
        String check = "4.abc-100@abc.net";
        assertTrue(test.mailregex(check));
    }

    @Test
    public void Mailcheck6() {
        UserRegistrationTest test = new UserRegistrationTest();
        String check = "5.abc.100@abc.com.au";
        assertTrue(test.mailregex(check));
    }

    @Test
    public void Mailcheck7() {
        UserRegistrationTest test = new UserRegistrationTest();
        String check = "6.abc@1.com";
        assertTrue(test.mailregex(check));
    }

    @Test
    public void Mailcheck8() {
        UserRegistrationTest test = new UserRegistrationTest();
        String check = "7.abc@gmail.com.com";
        assertTrue(test.mailregex(check));
    }

    @Test
    public void Mailcheck9() {
        UserRegistrationTest test = new UserRegistrationTest();
        String check = "8.abc+100@gmail.com";
        assertTrue(test.mailregex(check));
    }

    @Test
    public void Mailcheck10() {
        UserRegistrationTest test = new UserRegistrationTest();
        String check = "abc";
        assertFalse(test.mailregex(check));
    }

    @Test
    public void Mailcheck11() {
        UserRegistrationTest test = new UserRegistrationTest();
        String check = "abc@.com.my";
        assertFalse(test.mailregex(check));
    }

    @Test
    public void Mailcheck12() {
        UserRegistrationTest test = new UserRegistrationTest();
        String check = "abc123@gmail.a";
        assertFalse(test.mailregex(check));
    }

    @Test
    public void Mailcheck13() {
        UserRegistrationTest test = new UserRegistrationTest();
        String check = "abc123@.com";
        assertFalse(test.mailregex(check));
    }

    @Test
    public void Mailcheck14() {
        UserRegistrationTest test = new UserRegistrationTest();
        String check = "abc123@.com.com";
        assertFalse(test.mailregex(check));
    }

    @Test
    public void Mailcheck15() {
        UserRegistrationTest test = new UserRegistrationTest();
        String check = ".abc@abc.com";
        assertFalse(test.mailregex(check));
    }

    @Test
    public void Mailcheck16() {
        UserRegistrationTest test = new UserRegistrationTest();
        String check = "abc()*@gmail.com";
        assertFalse(test.mailregex(check));
    }

    @Test
    public void Mailcheck17() {
        UserRegistrationTest test = new UserRegistrationTest();
        String check = "abc@gmail.com.aa.au";
        assertFalse(test.mailregex(check));
    }

    @Test
    public void Mailcheck18() {
        UserRegistrationTest test = new UserRegistrationTest();
        String check = "abc@%*.com";
        assertFalse(test.mailregex(check));
    }

    @Test
    public void Mailcheck19() {
        UserRegistrationTest test = new UserRegistrationTest();
        String check = "abc..2002@gmail.com";
        assertFalse(test.mailregex(check));
    }

    @Test
    public void Mailcheck20() {
        UserRegistrationTest test = new UserRegistrationTest();
        String check = "abc.@gmail.com";
        assertFalse(test.mailregex(check));
    }

    @Test
    public void Mailcheck21() {
        UserRegistrationTest test = new UserRegistrationTest();
        String check = "abc@abc@gmail.com";
        assertFalse(test.mailregex(check));
    }

    @Test
    public void Mailcheck22() {
        UserRegistrationTest test = new UserRegistrationTest();
        String check = "abc@gmail.com.1a";
        assertFalse(test.mailregex(check));
    }
}
