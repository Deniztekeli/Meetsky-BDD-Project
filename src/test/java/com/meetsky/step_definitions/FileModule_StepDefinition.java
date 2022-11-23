package com.meetsky.step_definitions;

import com.meetsky.pages.FileModulePage;
import com.meetsky.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileModule_StepDefinition {

    FileModulePage fileModulePage = new FileModulePage();

    WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);



    @Given("User is on the Files page")
    public void userIsOnTheFilesPage() throws InterruptedException {
        Thread.sleep(2000);
        fileModulePage.fileIcon.click();
    }

    @When("User clicks on the + button")
    public void userClicksOnTheButton() {
        fileModulePage.plusButton.click();
    }


    @And("User clicks on the {string} button")
    public void userClicksOnTheButton(String string) {
        if (string.equals("New folder")){
            fileModulePage.newFolderButton.click();
        } else if (string.equals("New text file")) {
            fileModulePage.newTextFileButton.click();
        }
    }

    @And("User enter new folder name and press enter")
    public void userEnterNewFolderName() {
        fileModulePage.newFolderNameInput.sendKeys("My folder" + Keys.ENTER);
    }


    @Then("New folder is displayed on the page")
    public void newFolderIsDisplayedOnThePage() {
        wait.until(ExpectedConditions.visibilityOf(fileModulePage.myFolder));
        Assert.assertTrue(fileModulePage.myFolder.isDisplayed());
    }

    @When("User clicks on the three dots button of {string}")
    public void userClicksOnTheThreeDotsButtonOf(String fileName) {
        if (fileName.equals("Folder1")){
            fileModulePage.threeDotsFolder1.click();
        } else if (fileName.equals("deleted folder")) {
            fileModulePage.threeDotsDeletedFolder.click();
        }
    }

    @And("User clicks on the Move or copy button")
    public void userClicksOnTheMoveOrCopyButton() {
        fileModulePage.moveCopyButton.click();
    }

    @And("User clicks on the one of the folders")
    public void userClicksOnTheOneOfTheFolders() {
        fileModulePage.myFolderSelectToMove.click();
    }

    @And("User clicks on the move button")
    public void userClicksOnTheMoveButton() {
        fileModulePage.moveButton.click();
    }

    @Then("User move the chosen file to new folder")
    public void userMoveTheChosenFileToNewFolder() {
        fileModulePage.myFolder.click();
        wait.until(ExpectedConditions.visibilityOf(fileModulePage.movedFileInMyFolder));
        Assert.assertTrue(fileModulePage.movedFileInMyFolder.isDisplayed());
    }

    @And("User clicks on the delete folder button")
    public void userClicksOnTheDeleteFolderButton() {
        fileModulePage.deleteFolderButton.click();
    }

    @And("User clicks on the Deleted files button")
    public void userClicksOnTheDeletedFilesButton() {
        fileModulePage.deletedFilesButton.click();
    }

    @Then("Deleted file is displayed on the page")
    public void deletedFileIsDisplayedOnThePage() {
        Assert.assertTrue(fileModulePage.deletedFile.isDisplayed());
    }

    @Then("The total number of files and folders are displayed under the files list table")
    public void theTotalNumberOfFilesAndFoldersAreDisplayedUnderTheFilesListTable() {
        String expectedNumberOfFiles = "2 folders and 1 file";
        String filesCount = fileModulePage.numberOfFiles.getText();
        String foldersCount = fileModulePage.numberOfFolders.getText();
        String actualNumberOfFiles = foldersCount+" and "+ filesCount;
        Assert.assertEquals(expectedNumberOfFiles,actualNumberOfFiles);
    }

    @And("User clicks on the New text file button")
    public void userClicksOnTheNewTextFileButton() {
        fileModulePage.newTextFileButton.click();
    }

    @And("User enter file name and press enter")
    public void userEnterFileNameAndPressEnter() {
        fileModulePage.newTextFileInput.sendKeys("My new file" + Keys.ENTER);
        fileModulePage.X_Button.click();
    }

    @Then("New text file is displayed on the page")
    public void newTextFileIsDisplayedOnThePage() {
        Assert.assertTrue(fileModulePage.newTextFileCreated.isDisplayed());
    }



}
