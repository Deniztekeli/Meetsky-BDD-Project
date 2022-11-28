package com.meetsky.pages;

import com.meetsky.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class ContactGroupPage {

    public ContactGroupPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//li[@data-id='contacts'])[1]")
    public WebElement contactsButtonDash;


    @FindBy(xpath = "(//button[@aria-label='Actions'])[1]")
    public WebElement plusButtonNewGroup;

    @FindBy(xpath = "//input[@class='action-input__input focusable']")
    public WebElement newGroupInputArea;

    @FindBy(xpath = "(//*[@class='material-design-icon__svg'])[32]")
    public WebElement arrowInputArea;

    @FindBy(xpath = "(//*[@class='app-navigation-entry__title'])")
    public List<WebElement> listOfGroups;

    @FindBy(xpath = "//*[.='This group already exists']")
    public WebElement alreadyExistGroupMessage;

    @FindBy(id= "notgrouped")
    public WebElement notGrouped;

    @FindBy(xpath= "(//div[@role='listitem'])[1]") //test 7
    public WebElement firstNonGroupedContact;


    @FindBy(xpath= "//input[@placeholder='Add contact in group']")
    public WebElement addContactInGroup;

    @FindBy(xpath= "//*[@id=\"app-content-vue\"]/div/div/div[3]/div/section/div[5]/div/div[2]/div[3]/ul/li")
    public List<WebElement> listOfGroupsInContactInfo;

    @FindBy(xpath= "//a[@class='app-navigation-entry-link']")
    public List<WebElement> allGroupNames;

    @FindBy(xpath= "//div[@title='EU8']")
    public WebElement EU8DropDown;

    @FindBy(xpath= "//span[@title='EU8']")
    public WebElement EU8;

    @FindBy(xpath= "//div[@role='listitem']")
    public List<WebElement> EU8ContactList;


    @FindBy(xpath="//div[@role='listitem']")
    public List<WebElement> allContactList;

    @FindBy(xpath="//input[@placeholder='Choose property type']")
    public WebElement addNewPropertyButton;

    @FindBy(xpath="//span[.='Birthday']")
    public WebElement birthdayButton;

    @FindBy(xpath="(//h3[@class='property__title property__row'])[3]/div")
    public WebElement birthdayProperty;




/*
    public WebElement ungroupedContact(){
        WebElement firstContact=null;
        for (WebElement each : notGroupedContactList) {
            firstContact= each;
            break;
        }
        return firstContact;

 */
    }













