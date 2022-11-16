package com.meetsky.step_definitions;

import com.meetsky.pages.LoginPage;
import com.meetsky.pages.ProfileSettingsPage;
import com.meetsky.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ProfileSettings_StepDefinition {

   ProfileSettingsPage profileSettingsPage = new ProfileSettingsPage();

    @Then("user should see Full name, Email, and Phone Number options")
    public void user_should_see_full_name_email_and_phone_number_options() throws InterruptedException {
        profileSettingsPage.fullNameTitle.isDisplayed();
        profileSettingsPage.emailTitle.isDisplayed();
        profileSettingsPage.phoneNumberTitle.isDisplayed();
        Thread.sleep(2000);
    }

    @When("the user clicks under the Full name tab")
    public void the_user_clicks_under_the_full_name_tab() throws InterruptedException {
        profileSettingsPage.fullNameTab.click();
        Thread.sleep(2000);
    }


    @When("the user deletes the existing contact name")
    public void the_user_deletes_the_existing_contact_name() throws InterruptedException {
        profileSettingsPage.fullNameTab.clear();
        Thread.sleep(2000);
    }

    @Then("user writes a new Full name on the tab")
    public void user_writes_a_new_full_name_on_the_tab() {
        profileSettingsPage.fullNameTab.sendKeys("something else");
    }


    @When("the user clicks the dropdown of Phone number")
    public void the_user_clicks_the_dropdown_of_phone_number() {
        profileSettingsPage.privatePhoneNumber.click();
    }

    @Then("user able to click {string} option")
    public void user_able_to_click_option(String string) {
        profileSettingsPage.privateOption.click();
    }

    @When("the user goes to the Locale dropdown")
    public void the_user_goes_to_the_locale_dropdown() {
        profileSettingsPage.localeOption.isDisplayed();
    }

    @Then("user should see the current local time under dropdown")
    public void user_should_see_the_current_local_time_under_dropdown() {
        profileSettingsPage.currentLocalTime.isDisplayed();
    }


}
