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

    @FindBy(id= "headerName-container")
    public WebElement orderByNameButton;

    @FindBy(xpath = "//span[.='Name']/following-sibling::span[@class='sort-indicator hidden icon-triangle-s']")
    public WebElement orderByNameButtonDesc;

    @FindBy(xpath = "//span[.='Name']/following-sibling::span[@class='sort-indicator hidden icon-triangle-n']")
    public WebElement orderByNameButtonAsc;

    // "//span[.='Name']/following-sibling::span[@class='sort-indicator hidden icon-triangle-s']"
    // //span[@class='sort-indicator icon-triangle-s']
    // //span[.='Name']

    @FindBy(xpath = "//tbody[@id='fileList']//tr")
    public List<WebElement> fileList;

    @FindBy(id = "headerSize")
    public WebElement orderBySizeButton;

    @FindBy(xpath = "//span[.='Size']/following-sibling::span[@class='sort-indicator hidden icon-triangle-s']")
    public WebElement orderBySizeButtonDesc;

    @FindBy(xpath = "//span[.='Size']/following-sibling::span[@class='sort-indicator hidden icon-triangle-n']")
    public WebElement orderBySizeButtonAsc;
            // "//span[.='Size']/following-sibling::span[@class='sort-indicator hidden icon-triangle-s']")
    // //span[.='Size']

    @FindBy(id = "headerDate")
    public WebElement orderByModifiedButton;

    @FindBy(xpath = "//span[.='Modified']/following-sibling::span[@class='sort-indicator hidden icon-triangle-s']")
    public WebElement orderByModifiedButtonDesc;

    @FindBy(xpath = "//span[.='Modified']/following-sibling::span[@class='sort-indicator hidden icon-triangle-n']")
    public WebElement orderByModifiedButtonAsc;
    //xpath = "//span[.='Modified']/following-sibling::span[@class='sort-indicator hidden icon-triangle-s']")
    // //span[.='Modified']

    @FindBy(xpath = "//tr[@data-type='dir']")
    public  List<WebElement> folderList;

    @FindBy(xpath = "//label[@for='select_all_files']")
    public  WebElement selectAllFilesOption;

    @FindBy(xpath = "(//a[@class='name sort columntitle']/span)[1]")
    public WebElement totalSelectedFolderNumber;

    @FindBy(xpath = "(//a[@class='size sort columntitle']/span)[1]")
    public WebElement totalSelectedFolderSize;


    @FindBy(id = "view-toggle")
    public WebElement toggleViewButton;

    @FindBy(xpath = "//table[@class='list-container has-controls view-grid']")
    public WebElement fileTableWithGrid;

    @FindBy(xpath = "//table[@class='list-container has-controls']")
    public WebElement fileTableWithoutGrid;







}
