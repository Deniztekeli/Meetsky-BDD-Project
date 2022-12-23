package com.meetsky.pages;

import com.meetsky.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class FileModulePage {
    public FileModulePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//a[@aria-label='Files'])[1]")
    private WebElement fileIcon;
    public WebElement getFileIcon() {
        return fileIcon;
    }

    @FindBy(css = "a.button.new")
    public WebElement plusButton;

    @FindBy(xpath = "//span[.='New folder']")
    public WebElement newFolderButton;


    @FindBy (id = "view11-input-folder")
    public WebElement newFolderNameInput;

    @FindBy (xpath = "//tr[@data-file='My folder']")
    public WebElement myFolder;

    @FindBy (xpath = "(//a[@class='action action-menu permanent'])[2]")
    public WebElement threeDotsFolder1;

    @FindBy (xpath = "(//a[@class='action action-menu permanent'])[1]")
    public WebElement threeDotsDeletedFolder;



    @FindBy (xpath = "//a[@data-action='MoveCopy']")
    public WebElement moveCopyButton;

    @FindBy (xpath = "//tr[@data-entryname='My folder']")
    public WebElement myFolderSelectToMove;

    @FindBy (xpath = "//button[.='Move to My folder']")
    public WebElement moveButton;

    @FindBy (xpath = "//tr[@data-file]")
    public WebElement movedFileInMyFolder;

    @FindBy (xpath = "//a[@data-action='Delete']")
    public WebElement deleteFolderButton;

    @FindBy (linkText = "Deleted files")
    public WebElement deletedFilesButton;

    @FindBy (css = "span[title='deleted folder']")
    public WebElement deletedFile;

    @FindBy(xpath = "//span[.='1 file']")
    public WebElement numberOfFiles;

    @FindBy(xpath = "//span[.='2 folders']")
    public WebElement numberOfFolders;


    @FindBy(xpath = "(//span[.='New text file'])[1]")
    public WebElement newTextFileButton;

    @FindBy(id = "view11-input-file")
    public WebElement newTextFileInput;

    @FindBy (xpath = "//button[@class='action-item action-item--single header-close undefined undefined has-tooltip']")
    public WebElement X_Button;

    @FindBy(xpath = "//span[.='My new file']")
    public WebElement newTextFileCreated;














}
