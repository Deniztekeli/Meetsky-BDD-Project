package com.meetsky.pages;

import com.meetsky.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class TasksPage_MeetSky {

    public TasksPage_MeetSky() {
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//li[@data-id='tasks'])[1]")
    public WebElement tasksButton;

    @FindBy(xpath = "//span[@title='Add List…']")
    public WebElement addListButton;

    @FindBy(id = "newListInput")
    public WebElement newListName;

    @FindBy(xpath = "//li//span[@title]")
    public List<WebElement> allListNames;

    @FindBy(xpath = "//div[text()='The name \"a\" is already used.']")
    public WebElement isAlreadyUsed_error_message;

    @FindBy(xpath = "//span[@title='a']")
    public WebElement a_list;

    @FindBy(xpath = "//input[@placeholder='Add a task to \"a\"…']")
    public WebElement input_a_task_to_a;

    @FindBy(xpath = "//ol[@calendar-id=\"a\"]/li/div//div/div/span")
    public List<WebElement> allTaskList;

    @FindBy(xpath = "((//ol[@calendar-id='a'])[1]/li/div/div)[1]")
    public WebElement firstElementsCheckBox;

    @FindBy(xpath = "((//ol[@calendar-id='a'])[1]/li/div/div)[2]/div/span")
    public WebElement firstElementsName;

    @FindBy(xpath = "//span[@title='Completed']")
    public WebElement completedTasks_tab;

    @FindBy(xpath = "//div[@class='task-list']//*[@class='title']/span")
    public List<WebElement> allFilesName_in_Completed;

    @FindBy(xpath = "(//ol[@collection-id='uncompleted']//button)[2]")
    public WebElement firstStarIcon_in_a_file;

    @FindBy(xpath = "(//ol[@collection-id='uncompleted']/li//div[@class='title']/span)[1]")
    public WebElement firstFilenameStared_in_a_file;

    @FindBy(id = "collection_starred")
    public WebElement important_tasks_tab;

    @FindBy(xpath = "//div[@class='task-list']//div[@class='title']/span")
    public List<WebElement> allFilesName_in_important;

    @FindBy(xpath = "//li[@id='collection_current']//div[@class='app-navigation-entry__counter-wrapper']")
    public WebElement currentTaskNumbers;


}
