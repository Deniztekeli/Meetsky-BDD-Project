package com.meetsky.step_definitions;

import com.meetsky.pages.BasePage;
import com.meetsky.pages.FileFunctionality_Page;
import com.meetsky.pages.LoginPage;
import com.meetsky.utilities.BrowserUtils;
import com.meetsky.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FileFunctionality_StepDefinitions {

    FileFunctionality_Page fileFunctionality_page = new FileFunctionality_Page();
    BasePage basePage = new BasePage();

//precondition
    @Given("the user enter the files section")
    public void the_user_enter_the_files_section() {
        fileFunctionality_page.filesLink.click();
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

    @When("user click three dots of the created file {int}")
    public void userClickThreeDotsOfTheCreatedFile(int arg0) {
        BrowserUtils.sleep(5);
        fileFunctionality_page.treDotsFor2.click();
    }

    @When("user select rename and write new name and click enter")
    public void user_select_rename_and_write_new_name_and_click_enter() {
        BrowserUtils.sleep(5);

        fileFunctionality_page.renameOption.click();

    }
    @Then("user should see new name on the file")
    public void user_should_see_new_name_on_the_file() {
        String expectedFileName = "New Name";
        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(expectedFileName+Keys.ENTER).perform();
        BrowserUtils.waitForVisibility(fileFunctionality_page.fileName,10);

        String actualFileName=fileFunctionality_page.fileName.getText();

        Assert.assertTrue(actualFileName.contains(expectedFileName) );
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
   /* @When("user click three dots of any comment and select delete")
    public void user_click_three_dots_of_any_comment_and_select_delete() {
        BrowserUtils.sleep(7);
        fileFunctionality_page.commentBtn.click();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.elementToBeClickable(fileFunctionality_page.commentThreeDots));
        fileFunctionality_page.commentThreeDots.click();
        fileFunctionality_page.deleteCommentOption.click();


    }*/

    @When("user click on three dots and select details option")
    public void userClickOnThreeDotsAndSelectDetailsOption() {
        fileFunctionality_page.dotThree.click();
        fileFunctionality_page.details.click();

        /*BrowserUtils.sleep(7);
        fileFunctionality_page.commentBtn.click();
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(),10);
        wait.until(ExpectedConditions.elementToBeClickable(fileFunctionality_page.commentThreeDots));
        fileFunctionality_page.commentThreeDots.click();
        fileFunctionality_page.deleteCommentOption.click();

         */
    }

    @And("user click on comment button")
    public void userClickOnCommentButton() {
        BrowserUtils.sleep(5);
        fileFunctionality_page.comntButton.click();
    }

    @And("user click three dots of any comment and select delete")
    public void userClickThreeDotsOfAnyCommentAndSelectDelete() {
        BrowserUtils.sleep(5);
        fileFunctionality_page.click3Dot.click();
    }

    @Then("user should see that comment is deleted")
    public void user_should_see_that_comment_is_deleted() {
        BrowserUtils.sleep(5);
        fileFunctionality_page.deleteCmnd.click();
        //Assert.assertTrue(fileFunctionality_page.commentDeletedMessage.isDisplayed());
        //Assert.assertTrue(fileFunctionality_page.tabComments.isDisplayed());
    }



}
