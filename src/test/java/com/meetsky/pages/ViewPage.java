package com.meetsky.pages;

import com.meetsky.utilities.ConfigurationReader;
import com.meetsky.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ViewPage {

    public ViewPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(id = "user")
    public WebElement usernameButton;

    @FindBy(id = "password")
    public WebElement passwordButton;

    @FindBy(id = "submit-form")
    public WebElement loginButton;

    @FindBy(xpath = "//a[@aria-label='Files']")
    public WebElement filesLink;

    @FindBy(xpath = "//span[.='Name']/following-sibling::span[@class='sort-indicator hidden icon-triangle-s']")
    public WebElement orderByNameButton;
    // //span[@class='sort-indicator icon-triangle-s']
    // //span[.='Name']

    @FindBy(xpath = "//tbody[@id='fileList']//tr")
    public List<WebElement> fileList;

    @FindBy(xpath = "//span[.='Size']/following-sibling::span[@class='sort-indicator hidden icon-triangle-s']")
    public WebElement orderBySizeButton;
    // //span[.='Size']

    @FindBy(xpath = "//span[.='Modified']/following-sibling::span[@class='sort-indicator hidden icon-triangle-s']")
    public WebElement orderByModifiedButton;
    // //span[.='Modified']


    public void login(){

        Driver.getDriver().get(ConfigurationReader.getProperty("meetsky.url"));
        usernameButton.sendKeys(ConfigurationReader.getProperty("meetsky.username.deniz"));
        passwordButton.sendKeys(ConfigurationReader.getProperty("meetsky.password"));
        loginButton.click();
    }

}
