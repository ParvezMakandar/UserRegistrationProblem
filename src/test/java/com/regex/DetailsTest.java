package com.regex;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DetailsTest {
    @Test
    public void moodtest() {
        String expectedresult = "HAPPY";
        String actualresult = HappyOrSad.moodanalyze("HAPPY");
        Assert.assertEquals(expectedresult, actualresult);
    }


    @Test
    public void firstname() {
        String firstname="Zaid";
        Assert.assertTrue(ValidateDetailsTest.name(firstname));
    }
    @Test
    public void lastname() {
        String lastname="Mak";
        Assert.assertTrue(ValidateDetailsTest.name(lastname));
    }
    @Test
    public void mail() {
        String mail="zaid.72@gmail.com";
        Assert.assertTrue(ValidateDetailsTest.mail(mail));
    }@Test
    public void phonenumber() {
        String phonenumber="91 8147340746";
        Assert.assertTrue(ValidateDetailsTest.phonenumber(phonenumber));
    }@Test
    public void password() {
        String password="Zaid@72";
        Assert.assertTrue(ValidateDetailsTest.password(password));
    }



}