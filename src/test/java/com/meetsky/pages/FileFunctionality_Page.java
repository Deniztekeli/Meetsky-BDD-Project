package com.meetsky.pages;

import com.meetsky.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileFunctionality_Page {

    public FileFunctionality_Page(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//a[@aria-label='Files']")
    public WebElement filesLink;

    //1st scenario
    @FindBy(xpath = "//*[@id=\"fileList\"]/tr[1]/td[2]/a/span[3]/a[2]")
    public WebElement treeDots;

    @FindBy(xpath = "//a[@class='menuitem action action-favorite permanent']")
    public WebElement addToFav;

    @FindBy(xpath = "//*[@id=\"app-navigation\"]/ul/li[3]")
    public WebElement favoritesButton;


    //2nd Scenario
    @FindBy(xpath = "//*[@id=\"fileList\"]/tr[1]/td[2]/div/ul/li[5]/a")
    public WebElement renameOption;

    @FindBy(xpath = "//*[@id=\"fileList\"]/tr[1]/td[2]/a")
    public WebElement fileName;

    @FindBy(xpath = "//*[@id=\"fileList\"]/tr[1]/td[2]/a/span[3]/a[2]")
    public WebElement treDotsFor2;


    //3rd Scenario
    @FindBy(xpath = "//*[@id=\"fileList\"]/tr[1]/td[2]/a/span[3]/a[1]")
    public WebElement shareIcon;

    @FindBy(xpath = "//a[@id='comments']")
    public WebElement comments;

    @FindBy(xpath = "//div[@class='rich-contenteditable__input rich-contenteditable__input--empty']")
    public WebElement addComment;



    //4th Scenario
    @FindBy(xpath = "//*[@id=\"fileList\"]/tr[1]/td[2]/a/span[3]/a[2]")
    public WebElement dotThree;

    @FindBy(xpath = "//a[@class='menuitem action action-details permanent']")
    public WebElement details;


    @FindBy(xpath = "//*[@id=\"comments\"]")
    public WebElement comntButton;

    @FindBy(xpath = "//*[@id=\"tab-comments\"]/div/div[2]/div[1]/div[2]/div/div/button/span")
    public WebElement click3Dot;

    @FindBy(xpath = "//*[@id=\"menu-mzkee\"]/li[3]/button")
    public WebElement deleteCmnd;



}
