package com.meetsky.step_definitions;

import com.meetsky.pages.TasksPage_MeetSky;
import com.meetsky.utilities.BrowserUtils;
import com.meetsky.utilities.ConfigurationReader;
import com.meetsky.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.junit.Assert.*;

public class Task_Functions_StepDefinitions {

    TasksPage_MeetSky tasksPage_meetSky = new TasksPage_MeetSky();
    WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);

    @When("User should click TASKS icon at the top")
    public void user_should_click_tasks_icon_at_the_top() {
        tasksPage_meetSky.tasksButton.click();
    }

    //AC-01 --> DONE
    @When("Click add list on the left column")
    public void click_add_list_on_the_left_column() {
        tasksPage_meetSky.addListButton.click();
    }

    @When("Enter a list name and click enter")
    public void enter_a_list_name_and_click_enter() {
        tasksPage_meetSky.newListName.sendKeys(ConfigurationReader.getProperty("new.list.name") + Keys.ENTER);

    }

    @Then("Verify that user can see all the created lists")
    public void verify_that_user_can_see_all_the_created_lists() {

        boolean result = false;

        BrowserUtils.sleep(3);
        for (WebElement eachListName : tasksPage_meetSky.allListNames) {
            if (eachListName.getText().equals(ConfigurationReader.getProperty("new.list.name"))) {
                result = true;
                if (result) {
                    break;
                }
            }
        }
        assertTrue(result);
    }


    //AC-01_1 NEGATIVE --> DONE

    @Then("Verify that the already exist message is displayed")
    public void verify_that_the_already_exist_message_is_displayed() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(tasksPage_meetSky.a_list));
        tasksPage_meetSky.newListName.sendKeys("a");
        assertTrue(tasksPage_meetSky.isAlreadyUsed_error_message.isDisplayed());
    }


    //AC-02 --> DONE

    @When("Enter a task name and click enter on Add a task too... box")
    public void enter_a_task_name_and_click_enter_on_add_a_task_too_box() {
        tasksPage_meetSky.a_list.click();
        tasksPage_meetSky.input_a_task_to_a.sendKeys(ConfigurationReader.getProperty("new.task.name") + Keys.ENTER);
    }

    @Then("Verify that user can able to create new task and it should appear on the page")
    public void verify_that_user_can_able_to_create_new_task_and_it_should_appear_on_the_page() {

        BrowserUtils.sleep(3);

        boolean result = false;

        for (WebElement eachTaskName : tasksPage_meetSky.allTaskList) {
            if (eachTaskName.getText().equals(ConfigurationReader.getProperty("new.task.name"))) {
                result = true;
                if (result) {
                    break;
                }
            }
        }

        assertTrue(result);

    }


    //AC-03 --> DONE
    public static String firstElements_name;

    @When("Click on the checkbox near the task name")
    public void click_on_the_checkbox_near_the_task_name() {
        tasksPage_meetSky.a_list.click();
        BrowserUtils.sleep(3);
        firstElements_name = tasksPage_meetSky.firstElementsName.getText();
        tasksPage_meetSky.firstElementsCheckBox.click();
    }

    @Then("Verify that the completed task is appeared in the COMPLETED tasks tab")
    public void verify_that_the_completed_task_is_appeared_in_the_completed_tasks_tab() {
        tasksPage_meetSky.completedTasks_tab.click();

        boolean result = false;

        BrowserUtils.sleep(3);

        for (WebElement eachFileName : tasksPage_meetSky.allFilesName_in_Completed) {
            if (eachFileName.getText().contains(firstElements_name)) {
                result = true;
                if (result) {
                    break;
                }
            }
        }

        assertTrue(result);

    }

    public static String firstStarElementName;

    //AC-04 --> DONE
    @When("Click on the star icon on the right side of task line")
    public void click_on_the_star_icon_on_the_right_side_of_task_line() {
        tasksPage_meetSky.a_list.click();
        firstStarElementName = tasksPage_meetSky.firstFilenameStared_in_a_file.getText();

        tasksPage_meetSky.firstStarIcon_in_a_file.click();

    }

    @Then("Verify that the task is appeared in the IMPORTANT tasks tab")
    public void verify_that_the_task_is_appeared_in_the_important_tasks_tab() {

        wait.until(ExpectedConditions.elementToBeClickable(tasksPage_meetSky.important_tasks_tab));
        tasksPage_meetSky.important_tasks_tab.click();

        boolean result = false;

        for (WebElement eachFileName : tasksPage_meetSky.allFilesName_in_important) {

            if (eachFileName.getText().equals(firstStarElementName)){
                result=true;
                if (result){
                    break;
                }
            }

        }

        assertTrue(result);
    }


    //AC-05 -->DONE

    @Then("Verify that the number of uncompleted tasks next to current tab")
    public void verify_that_the_number_of_uncompleted_tasks_next_to_current_tab() {
        wait.until(ExpectedConditions.visibilityOf(tasksPage_meetSky.currentTaskNumbers));
        assertTrue(tasksPage_meetSky.currentTaskNumbers.isDisplayed());
    }


}
