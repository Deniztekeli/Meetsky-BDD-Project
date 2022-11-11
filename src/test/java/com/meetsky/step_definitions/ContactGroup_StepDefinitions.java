package com.meetsky.step_definitions;

import com.meetsky.pages.BasePage;
import com.meetsky.pages.ContactGroupPage;
import com.meetsky.utilities.BrowserUtils;
import com.meetsky.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class ContactGroup_StepDefinitions {

    BasePage basePage = new BasePage();
    ContactGroupPage contactGroupPage = new ContactGroupPage();

    @And("the user enters the contacts menu")
    public void theUserEntersTheContactsMenu() {
        BrowserUtils.waitForVisibility(contactGroupPage.contactsButtonDash,15);
        contactGroupPage.contactsButtonDash.click();
    }

    @When("user click plus + sign on Groups tab")
    public void userClickPlusSignOnGroupsTab() {
    BrowserUtils.waitForVisibility(contactGroupPage.plusButtonNewGroup,10);
    contactGroupPage.contactsButtonDash.click();
    }

    @And("user enter a group name")
    public void userEnterAGroupName() {
        BrowserUtils.waitForVisibility(contactGroupPage.plusButtonNewGroup,15);
        contactGroupPage.plusButtonNewGroup.click();

            BrowserUtils.sleep(2);
        BrowserUtils.waitForVisibility(contactGroupPage.newGroupInputArea,15);
        contactGroupPage.newGroupInputArea.sendKeys("test6");
    }

    @And("user click the arrow on the right side of the input box")
    public void userClickTheArrowOnTheRightSideOfTheInputBox() {
        contactGroupPage.arrowInputArea.click();
        BrowserUtils.sleep(2);
    }

    @Then("user should able to create a new group successfully")
    public void userShouldAbleToCreateANewGroupSuccessfully() {
        Driver.getDriver().navigate().refresh();

        BrowserUtils.sleep(5);
        for (WebElement eachGroup : contactGroupPage.listOfGroups) {
            if(eachGroup.getText().equals("test1")){
                System.out.println("Adding new group verification---PASSED");
            }else{
                System.out.println("Adding new group verification---FAILED");
                break;
            }
        }
    }

    @And("user enter an already existed group name")
    public void userEnterAnAlreadyExistedGroupName() {
        BrowserUtils.waitForVisibility(contactGroupPage.plusButtonNewGroup,15);
        contactGroupPage.plusButtonNewGroup.click();

        BrowserUtils.sleep(3);
        BrowserUtils.waitForVisibility(contactGroupPage.newGroupInputArea,15);
        contactGroupPage.newGroupInputArea.sendKeys("EU9");
    }

    @Then("user should not able to create a new group")
    public void userShouldNotAbleToCreateANewGroup() {
        BrowserUtils.waitForVisibility(contactGroupPage.alreadyExistGroupMessage,10);
        Assert.assertTrue(contactGroupPage.alreadyExistGroupMessage.isDisplayed());
    }

    @When("user click on the Not grouped icon on the left side menu")
    public void userClickOnTheNotGroupedIconOnTheLeftSideMenu() {
    BrowserUtils.waitForVisibility(contactGroupPage.notGrouped,10);
        contactGroupPage.notGrouped.click();
    }

    @And("select one of those existing contacts")
    public void selectOneOfThoseExistingContacts() {
        BrowserUtils.waitForVisibility(contactGroupPage.firstNonGroupedContact,10);
       contactGroupPage.firstNonGroupedContact.click();
        //test 7
    }

    @And("click on the group dropdown menu where places contact's info menu")
    public void clickOnTheGroupDropdownMenuWherePlacesContactSInfoMenu() {
        BrowserUtils.waitForVisibility(contactGroupPage.addContactInGroup,10);
        contactGroupPage.addContactInGroup.click();


    }

    @Then("user should able to see all group names")
    public void userShouldAbleToSeeAllGroupNames() {

        for (WebElement each : contactGroupPage.allGroupNames) {
            System.out.println("each.getText() = " + each.getText());
        }
        for (WebElement each : contactGroupPage.listOfGroupsInContactInfo) {
            System.out.println("each.getText() = " + each.getText());
        }

       //turn back here

       Assert.assertTrue(contactGroupPage.allGroupNames.contains( contactGroupPage.listOfGroupsInContactInfo));

    }

    @And("select one of those group names")
    public void selectOneOfThoseGroupNames() {
            BrowserUtils.waitForVisibility(contactGroupPage.EU8DropDown,10);
            contactGroupPage.EU8DropDown.click();

    }

    @Then("user should see selected contact is under the selected group menu")
    public void userShouldSeeSelectedContactIsUnderTheSelectedGroupMenu() {
        contactGroupPage.EU8.click();
        BrowserUtils.sleep(3);
        for (WebElement each : contactGroupPage.EU8ContactList) {
            BrowserUtils.waitForVisibility(each,5);
            if(each.getText().contains("test7")){
                System.out.println("Test7 is in the EU8 group---PASSED");
            }
        }
    }

    @When("user click the any contact from the list")
    public void userClickTheAnyContactFromTheList() {
        BrowserUtils.waitForVisibility(contactGroupPage.firstNonGroupedContact,10);
        contactGroupPage.firstNonGroupedContact.click();
    }

    @And("user click the dropdown menu under the Add new property")
    public void userClickTheDropdownMenuUnderTheAddNewProperty() {
        BrowserUtils.waitForVisibility(contactGroupPage.addNewPropertyButton,10);
        contactGroupPage.addNewPropertyButton.click();
    }

    @And("user click the Birthday property")
    public void userClickTheBirthdayProperty() {
        contactGroupPage.birthdayButton.click();
    }

    @Then("user should able to see Birthday property in the contact info page")
    public void userShouldAbleToSeeBirthdayPropertyInTheContactInfoPage() {
        BrowserUtils.waitForVisibility(contactGroupPage.birthdayProperty,10);
        Assert.assertTrue(contactGroupPage.birthdayProperty.isDisplayed());
    }
}