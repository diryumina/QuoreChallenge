package pages.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.ConfigurationReader;
import utilities.Driver;
import utilities.Pages;


public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);}


    @FindBy (id = "username")
    WebElement quoreIdElement;

    @FindBy (id = "password")
    WebElement passwordElement;

    @FindBy (css = "span.button-text")
    WebElement logInElement;

    @FindBy (xpath = "//a[@href = '#'][1]")
    WebElement forgotPasswordElement;

    @FindBy (css = ".forgot-quoreid")
    WebElement forgotQuoreIdElement;

    @FindBy (css = ".green")
    WebElement learnQuoreElement;

    @FindBy (css = ".message.flex-grow-1")
    WebElement errorMessageElement;


    public String pageTitle(){
        return Driver.getDriver().getTitle();
    }

    public void login(){
        String quoreId = ConfigurationReader.getProperty("quoreId");
        String password = ConfigurationReader.getProperty("password");
        quoreIdElement.sendKeys(quoreId);
        passwordElement.sendKeys(password);
        logInElement.click();
    }

    public void login(String quoreId, String password){
        quoreIdElement.sendKeys(quoreId);
        passwordElement.sendKeys(password);
        logInElement.click();

    }

    public String getErrorMessage(){
        return errorMessageElement.getText();
    }


}
