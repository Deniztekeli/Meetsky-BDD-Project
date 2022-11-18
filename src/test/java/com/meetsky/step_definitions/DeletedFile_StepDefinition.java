package com.meetsky.step_definitions;

import com.meetsky.pages.BasePage;
import com.meetsky.pages.DeletedFilesPage;
import com.meetsky.utilities.BrowserUtils;
import com.meetsky.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class DeletedFile_StepDefinition {

    BasePage basePage = new BasePage();
    DeletedFilesPage deletedFilesPage = new DeletedFilesPage();


    @When("user clicks on files module")
    public void user_clicks_on_files_module() {
        BrowserUtils.waitFor(5);
        deletedFilesPage.pageModule.click();

    }
    @And("user clicks on deleted files sub-module")
    public void user_clicks_on_deleted_files_sub_module() {
        BrowserUtils.waitFor(10);
      deletedFilesPage.deleteFilesButton.click();
    }
    @And("user should see the recent deleted file in the first line of the deletes list")
    public void user_should_see_the_recent_deleted_file_in_the_first_line_of_the_deletes_list() {
        BrowserUtils.waitFor(5);
        /*ArrayList<String> list3= new ArrayList<>();
        for (WebElement eachWebElement : deletedFilesPage.deletedFilesList){
        }
         */
        System.out.println(deletedFilesPage.deletedFilesList2.getText());
    }
    @Then("deleted files are ordered by newest to oldest")
    public void deleted_files_are_ordered_by_newest_to_oldest() {
        BrowserUtils.waitFor(5);
        ArrayList<String> list = new ArrayList<>();
        for(WebElement eachWebElement : deletedFilesPage.deletedItemsDateList){
            System.out.println(list.add(eachWebElement.getAttribute("data-sort")));
        }
        ArrayList<String>list2 =new ArrayList<>();
        for(WebElement eachWebElement : deletedFilesPage.deletedItemsDateList){
            list2.add(eachWebElement.getAttribute("data-sort"));
        }
        Collections.sort(list);
        System.out.println(list);
        System.out.println(list2);
        Assert.assertEquals(list, list2);

    }

  /*  @When("user clicks on  deleted button to order by newest to oldest or visa versa")
    public void user_clicks_on_deleted_button_to_order_by_newest_to_oldest_or_visa_versa() {
       BrowserUtils.waitFor(5);
       deletedFilesPage.sortByDateButton.click();
    }

   */
    @And("user can see deleted item by by newest to oldest or visa versa")
    public void user_can_order_deleted_items() {
        BrowserUtils.waitFor(5);
       // System.out.println(deletedFilesPage.sortByDateButton.getText());

        List<String> list3 = new ArrayList<>();
        for(WebElement each: deletedFilesPage.sortByDateButton){
            System.out.println(list3.add(each.getAttribute("data-sort")));

        };
        List<String> list4 = new ArrayList<>();
        for(WebElement each: deletedFilesPage.sortByDateButton){
            System.out.println(list4.add(each.getAttribute("data-sort")));

        };

        Collections.sort(list3);
        System.out.println(list3);
        System.out.println(list4);
        Assert.assertEquals(list4, list3);
        BrowserUtils.waitFor(5);
        }

    @And("user clicks on Name button")
    public void user_clicks_on_name_button() {
        BrowserUtils.waitFor(5);
        BrowserUtils.clickWithJS(deletedFilesPage.nameButton);
        BrowserUtils.waitFor(5);
    }
    @Then("user can order alphabetically all the deleted files based on their names")
    public void user_can_order_alphabetically_all_the_deleted_files_based_on_their_names() {
        System.out.println(deletedFilesPage.deletedLastFileDate.getText());

        ArrayList<String> deletedFileByName  = new ArrayList<>();
        for (WebElement each: deletedFilesPage.orderByNameList){
            deletedFileByName.add(each.getAttribute("data-sort"));

        }
        ArrayList<String> deletedFileByName2  = new ArrayList<>();
        for (WebElement each: deletedFilesPage.orderByNameList){
            deletedFileByName2.add(each.getAttribute("data-sort"));
        }
        Collections.sort(deletedFileByName);
        System.out.println(deletedFileByName);
        System.out.println(deletedFileByName2);
        Assert.assertEquals(deletedFileByName2,deletedFileByName);

    }

    @When("user clicks on three dots")
    public void user_clicks_on_three_dots() {
        BrowserUtils.waitFor(10);
        BrowserUtils.clickWithJS(deletedFilesPage.threeDots);
    }
    @And("users clicks on delete permanently button")
    public void users_clicks_on_delete_permanently_button() {
        BrowserUtils.waitFor(5);
       BrowserUtils.doubleClick(deletedFilesPage.deletePermanentlyButton);

    }
    @Then("user can delete the file permanently from website")
    public void user_can_delete_the_file_permanently_from_website() {
        BrowserUtils.waitFor(5);
        deletedFilesPage.fileToDeletePermanently.isDisplayed();
    }

    @When("user clicks on the restore button near to the three dots' selection")
    public void user_clicks_on_the_restore_button_near_to_the_three_dots_selection() {
       BrowserUtils.waitFor(5);
        deletedFilesPage.restoreButton.click();

        BrowserUtils.waitFor(5);
        System.out.println("deletedFilesPage.lastDeletedFileName.getText() = " + deletedFilesPage.lastDeletedFileName.getText());
    }
    @And("user clicks on recent file button")
    public void user_clicks_on_recent_file_button() {
        BrowserUtils.waitFor(5);
        deletedFilesPage.recentFiles.click();

    }
    @Then("user can see the restored file into the list of file")
    public void user_can_see_the_restored_file_into_the_list_of_file() {
       BrowserUtils.waitFor(5);
        deletedFilesPage.lastDeletedFileName.isDisplayed();

    }

}
