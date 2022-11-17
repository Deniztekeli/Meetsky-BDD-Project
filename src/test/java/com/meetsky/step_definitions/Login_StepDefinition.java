package com.meetsky.step_definitions;

import com.meetsky.pages.LoginPage;
import com.meetsky.pages.ProfileSettingsPage;
import com.meetsky.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Login_StepDefinition {

    LoginPage basePage = new LoginPage();
    ProfileSettingsPage profileSettingsPage = new ProfileSettingsPage();

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {

        Driver.getDriver().get("https://qa.meetsky.net/index.php/login?clear=1");
        basePage.usernameButton.sendKeys("Employee91");
        basePage.passwordButton.sendKeys("Employee123");
        basePage.loginButton.click();

        /*
        LoginPage loginPage = new LoginPage();
    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        loginPage.login();
    }
         */

    }
    @When("the user clicks on the Profile button")
    public void the_user_clicks_on_the_profile_button() {
        profileSettingsPage.profileButton.click();
    }

    @When("the user clicks Settings button under the Profile option")
    public void the_user_clicks_settings_button_under_the_profile_option() {
        profileSettingsPage.settingsButton.click();
    }



}
