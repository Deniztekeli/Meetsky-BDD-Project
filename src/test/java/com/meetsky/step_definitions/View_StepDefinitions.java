package com.meetsky.step_definitions;

import com.meetsky.pages.LoginPage;
import com.meetsky.pages.ViewPage;
import com.meetsky.utilities.BrowserUtils;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class View_StepDefinitions {

    ViewPage viewPage = new ViewPage();
    LoginPage basePage = new LoginPage();


    @When("user click files menu")
    public void userClickFilesMenu() {
        viewPage.filesLink.click();
    }

    @And("user select name option to order the folders")
    public void userSelectNameOptionToOrderTheFolders() {
        BrowserUtils.sleep(10);
        BrowserUtils.waitForVisibility(viewPage.orderByNameButton,15);
        viewPage.orderByNameButton.click();
    }

    @Then("user should see the folders ordered by name")
    public void userShouldSeeTheFoldersOrderedByName() {


    ArrayList<String> list = new ArrayList<>();
        for (WebElement eachWebElement : viewPage.folderList) {
            list.add(eachWebElement.getAttribute("data-file").toUpperCase());
        }
        ArrayList<String> list2 = new ArrayList<>();
        for (WebElement eachWebElement : viewPage.folderList) {
            list2.add(eachWebElement.getAttribute("data-file").toUpperCase());
        }
         Collections.sort(list);
        System.out.println(list);
        System.out.println(list2);
        Assert.assertEquals(list,list2);
}

    @And("user select size option to order the folders")
    public void userSelectSizeOptionToOrderTheFolders() {
        BrowserUtils.sleep(10);
        BrowserUtils.waitForVisibility(viewPage.orderBySizeButton,10);
        viewPage.orderBySizeButton.click();
    }

    @Then("user should see the folders ordered by size")
    public void userShouldSeeTheFoldersOrderedBySize() {
        int n=0;
        ArrayList<String> list = new ArrayList<>();
        int[] arr = new int[6];
        for (WebElement eachWebElement : viewPage.folderList) {
            list.add(eachWebElement.getAttribute("data-size"));
            int integer = Integer.parseInt(eachWebElement.getAttribute("data-size"));
            arr[n++] = integer;
        }
        int n2=0;
        ArrayList<String> list2 = new ArrayList<>();
        int[] arr2 = new int[6];
        for (WebElement eachWebElement : viewPage.folderList) {
            list2.add(eachWebElement.getAttribute("data-size"));
            int integer = Integer.parseInt(eachWebElement.getAttribute("data-size"));
            arr2[n2++] = integer;
        }

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        //System.out.println(list);
        //Collections.sort(list);
       // System.out.println(list);
        System.out.println(Arrays.toString(arr2));
        Assert.assertEquals(Arrays.toString(arr),Arrays.toString(arr2));
    }

    @And("user select name option to order the modified")
    public void userSelectNameOptionToOrderTheModified() {
        BrowserUtils.sleep(10);
        BrowserUtils.waitForVisibility(viewPage.orderByModifiedButton,10);
        viewPage.orderByModifiedButton.click();
    }

    @Then("user should see the folders ordered by modified date")
    public void userShouldSeeTheFoldersOrderedByModifiedDate() {

        ArrayList<String> list = new ArrayList<>();
        for (WebElement eachWebElement : viewPage.folderList) {
            list.add(eachWebElement.getAttribute("data-mtime"));
        }
        ArrayList<String> list2 = new ArrayList<>();
        for (WebElement eachWebElement : viewPage.folderList) {
            list2.add(eachWebElement.getAttribute("data-mtime"));
        }
        Collections.sort(list);
        System.out.println(list);
        System.out.println(list2);
        Assert.assertEquals(list,list2);
    }


    @And("user click the toggle-view button")
    public void userClickTheToggleViewButton() {
        viewPage.toggleViewButton.click();
    }

    @Then("user should be able to change the view of the folders as side by side and in a column")
    public void userShouldBeAbleToChangeTheViewOfTheFoldersAsSideBySideAndInAColumn() {
        Assert.assertTrue(viewPage.fileTableWithGrid.getAttribute("class").contains("grid"));

    }

    @And("user select all the files option")
    public void userSelectAllTheFilesOption() {
        viewPage.selectAllFilesOption.click();
    }

    @Then("user should be able to select all files at once and should able to see total files number")
    public void userShouldBeAbleToSelectAllFilesAtOnceAndShouldAbleToSeeTotalFilesNumber() {
        Assert.assertTrue(viewPage.totalSelectedFolderSize.isDisplayed());
    }
}
