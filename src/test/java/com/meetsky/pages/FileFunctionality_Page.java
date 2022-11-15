package com.meetsky.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class FileFunctionality_Page {

    //1st scenario
    @FindBy(xpath = "//*[@id=\"fileList\"]/tr[1]/td[2]/a/span[3]/a[2]/span[1]")
    public WebElement treeDots;

    @FindBy(xpath = "//a[@class='menuitem action action-favorite permanent']")
    public WebElement addToFav;

    @FindBy(xpath = "//*[@id=\"app-navigation\"]/ul/li[3]")
    public WebElement favoritesButton;


    //2nd Scenario
    @FindBy(xpath = "//a[@data-action='Rename']")
    public WebElement renameBtn;

    @FindBy(xpath = "//*[@id=\"fileList\"]/tr[1]/td[2]/a")
    public WebElement assertRename;


    //3rd Scenario
    @FindBy(xpath = "//*[@id=\"fileList\"]/tr[1]/td[2]/a/span[3]/a[1]")
    public WebElement shareIcon;

    @FindBy(xpath = "//a[@id='comments']")
    public WebElement comments;

    @FindBy(xpath = "//div[@class='rich-contenteditable__input rich-contenteditable__input--empty']")
    public WebElement addComment;



    //4th Scenario
    @FindBy(xpath = "//*[@id=\"tab-comments\"]/div/div[2]/div[1]/div[2]/div/div/button/span")
    public WebElement commentTreeDot;

    @FindBy(xpath = "//*[@id=\"menu-xogsy\"]/li[3]/button/span[2]")
    public WebElement removeComment;








}
