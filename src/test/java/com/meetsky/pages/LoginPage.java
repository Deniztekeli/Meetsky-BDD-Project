package com.meetsky.pages;

import com.meetsky.utilities.ConfigurationReader;
import com.meetsky.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    public LoginPage() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id = "user")
    public WebElement usernameButton;

    @FindBy(id = "password")
    public WebElement passwordButton;

    @FindBy(id = "submit-form")
    public WebElement loginButton;


    public void login() {
        Driver.getDriver().get(ConfigurationReader.getProperty("meetsky.url"));
        usernameButton.sendKeys(ConfigurationReader.getProperty("meetsky.username.melek"));
        passwordButton.sendKeys(ConfigurationReader.getProperty("meetsky.password"));
        loginButton.click();
    }

}

