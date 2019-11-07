package tests;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.TestBase;

import static org.junit.Assert.assertEquals;

public class LoginPage extends TestBase {

    @Test
    public void positiveLogin() {
       pages.loginPage().login();
       Assert.assertFalse("LOGIN FAILED", Driver.getDriver().getCurrentUrl().equals(ConfigurationReader.getProperty("url")));

    }

    @Test
    public void negativeLogin(){
        pages.loginPage().login("wrongQuoreID", "wrongPassword");
        String actualMessage = pages.loginPage().getErrorMessage();
        Assert.assertEquals("Oops! Your Quore ID or password is incorrect.", actualMessage);
    }


}
