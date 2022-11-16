package com.meetsky.pages;

import com.meetsky.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ProfileSettingsPage {

    public ProfileSettingsPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//div[@id='expand']")
    public WebElement profileButton;

    @FindBy(xpath = "//a[@href='/index.php/settings/user']")
    public WebElement settingsButton;

    @FindBy(xpath = "//label[@for='displayname']")
    public WebElement fullNameTitle;

    @FindBy(xpath = "//label[@for='email']")
    public WebElement emailTitle;

    @FindBy(xpath = "//label[@for='phone']")
    public WebElement phoneNumberTitle;

    @FindBy(xpath = "//input[@id='displayname']")
    public WebElement fullNameTab;

    @FindBy(xpath = "//input[@id='initial-state-settings-profileEnabledGlobally']")
    public WebElement popUpPasswordTab;

    @FindBy(xpath = "//button[@class='primary']")
    public WebElement popUpConfirmButton;

    @FindBy(xpath = "(//a[@class='federation-menu'])[2]")
    public WebElement privatePhoneNumber;

    @FindBy(xpath = "//a[@class='menuitem action action-v2-private permanent active']")
    public WebElement privateOption;

    @FindBy(xpath = "//label[@for='localeinput']")
    public WebElement localeOption;

    @FindBy(xpath = "//span[@id='localeexample-time']")
    public WebElement currentLocalTime;




}
