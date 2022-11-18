package com.meetsky.pages;

import com.meetsky.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class DeletedFilesPage {
    public DeletedFilesPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath ="(//ul[@id='appmenu']//a)[2]")
    public WebElement pageModule;

    @FindBy (xpath ="//a[.='Deleted files']")
    public WebElement deleteFilesButton;

    @FindBy(xpath ="//span[@class='nametext extra-data']")
    public List<WebElement>deletedFilesList;

    @FindBy(xpath ="//span[@class='nametext extra-data']")
    public WebElement deletedFilesList2;

    @FindBy(xpath ="(//a[@data-sort='mtime'])[11]")
    public List<WebElement> deletedItemsDateList;

    @FindBy(xpath ="(//a[@data-sort='mtime'])[11]")
            //th[@class='column-mtime']")
            //span[@class='sort-indicator icon-triangle-n']")
    public List<WebElement> sortByDateButton;

    @FindBy(xpath = "(//span[@class='modified live-relative-timestamp'])[3]")
    public WebElement deletedLastFileDate;

    @FindBy(xpath ="(//a[@data-sort='name'])[11]")
            //span[@class='sort-indicator icon-triangle-n'])[2]")
            //th[@class='column-name']" )
    public WebElement nameButton;

    @FindBy(xpath ="(//a[@data-sort='name'])[11]")
            //span[@class=\"nametext extra-data\"]" )
    public List<WebElement> orderByNameList;

    @FindBy(xpath = "//span[@title='Notes/New note.txt']")
    public WebElement fileToDeletePermanently;

    @FindBy(xpath = "//div[@id='app-content-trashbin']//tbody//tr/td[2]/a/span[2]/a[2]")
            //id = "app-content-trashbin")
            //a[@class='action action-menu permanent']")
            //*[@id='fileList']/tr[1]/td[2]/a/span[3]/a[2]/span[1]")
            //(a[@data-action='menu'])[1]")
            //(span[@class='icon icon-more'])[3]")
            //(//a[@class=\"action action-menu permanent\"])[1]")
            //(//span[@class='icon icon-more'])[3]")
            //(a[@data-action='menu'])[1]")
            //a[@class='action action-menu permanent'])[1]")
    public WebElement threeDots;

    @FindBy(xpath ="//*[@id='fileList']/tr/td[2]/div/ul/li[1]/a/span[2]")
            //span[@class='icon icon icon-delete']" )
    public WebElement deletePermanentlyButton;

    @FindBy(xpath ="(//a[@data-action='Restore'])[1]")
    public WebElement restoreButton;

    @FindBy(xpath ="//a[.='Recent']" )
    public WebElement recentFiles;

    @FindBy(xpath = "(//span[@class='innernametext'])[1]")
    public WebElement lastDeletedFileName;









}
