package com.meetsky.step_definitions;

import com.meetsky.pages.BasePage;
import com.meetsky.pages.FileFunctionality_Page;
import com.meetsky.pages.LoginPage;
import com.meetsky.utilities.BrowserUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

public class FileFunctionality_StepDefinitions {

    FileFunctionality_Page fileFunctionality_page = new FileFunctionality_Page();
    BasePage basePage = new BasePage();

//precondition
    @Given("the user enter the files section")
    public void the_user_enter_the_files_section() {
        BrowserUtils.sleep(20);
        fileFunctionality_page.filesMenu.click();
    }




//first scenario
    @When("user click three dots of the created file")
    public void user_click_three_dots_of_the_created_file() {
        BrowserUtils.sleep(10);
        fileFunctionality_page.treeDots.click();
    }
    @When("user select add to favorites link")
    public void user_select_add_to_favorites_link() {
        fileFunctionality_page.addToFav.click();
    }
    @Then("user should see selected file has a star icon")
    public void user_should_see_selected_file_has_a_star_icon() {
        fileFunctionality_page.favoritesButton.click();
    }




//Second scenario
    //user_click_three_dots_of_the_created_file --> add to first
    @When("user select rename and write new name and click enter")
    public void user_select_rename_and_write_new_name_and_click_enter() {
        BrowserUtils.sleep(10);
        fileFunctionality_page.treeDots.click();
        fileFunctionality_page.addToFav.click();
        fileFunctionality_page.renameBtn.click();
        fileFunctionality_page.renameBtn.sendKeys("New Name"+ Keys.ENTER);

    }
    @Then("user should see new name on the file")
    public void user_should_see_new_name_on_the_file() {
        WebElement assertRename = fileFunctionality_page.assertRename;
        Assert.assertTrue(assertRename.isDisplayed());
    }




//Third Scenario
    @When("user click icon next to tree dots")
    public void user_click_icon_next_to_tree_dots() {
        fileFunctionality_page.shareIcon.click();
    }
    @When("user select comment section")
    public void user_select_comment_section() {
        fileFunctionality_page.comments.click();
    }
    @Then("user should be able to add comments")
    public void user_should_be_able_to_add_comments() {
        fileFunctionality_page.addComment.sendKeys("FirstComment"+ Keys.ENTER);
    }


//Fourth Scenario
    //user_click_icon_next_to_tree_dots

    //user_select_comment_section
    @When("user click on tree dots near the username")
    public void user_click_on_tree_dots_near_the_username() {
        fileFunctionality_page.shareIcon.click();
        fileFunctionality_page.comments.click();
        fileFunctionality_page.commentTreeDot.click();
    }
    @Then("user should be able to delete comment")
    public void user_should_be_able_to_delete_comment() {
        fileFunctionality_page.removeComment.click();
    }





}
