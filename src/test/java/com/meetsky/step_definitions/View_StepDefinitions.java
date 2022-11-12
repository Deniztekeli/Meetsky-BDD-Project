package com.meetsky.step_definitions;

import com.meetsky.pages.LoginPage;
import com.meetsky.pages.ViewPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class View_StepDefinitions {

    ViewPage viewPage = new ViewPage();


    @When("user click files menu")
    public void userClickFilesMenu() {
        viewPage.filesLink.click();
    }

    @And("user select name option to order the folders")
    public void userSelectNameOptionToOrderTheFolders() {
        viewPage.orderByNameButton.click();
    }

    @Then("user should see the folders ordered by name")
    public void userShouldSeeTheFoldersOrderedByName() {
    }
    List<WebElement> folderList = new ArrayList<>();



    @And("user select size option to order the folders")
    public void userSelectSizeOptionToOrderTheFolders() {
    }

    @Then("user should see the folders ordered by size")
    public void userShouldSeeTheFoldersOrderedBySize() {
    }

    @And("user select name option to order the modified")
    public void userSelectNameOptionToOrderTheModified() {
    }

    @Then("user should see the folders ordered by modified date")
    public void userShouldSeeTheFoldersOrderedByModifiedDate() {
    }

    @And("user click the toggle-view button")
    public void userClickTheToggleViewButton() {
    }

    @Then("user should be able to change the view of the folders as side by side and in a column")
    public void userShouldBeAbleToChangeTheViewOfTheFoldersAsSideBySideAndInAColumn() {
    }

    @And("user select all the files option")
    public void userSelectAllTheFilesOption() {
    }

    @Then("user should be able to select all files at once and should able to see total files number")
    public void userShouldBeAbleToSelectAllFilesAtOnceAndShouldAbleToSeeTotalFilesNumber() {
    }
}
