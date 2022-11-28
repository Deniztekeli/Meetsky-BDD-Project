package com.meetsky.step_definitions;

import com.meetsky.pages.LoginPage;
import com.meetsky.pages.ProfileSettingsPage;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;

public class Login_StepDefinition {

    LoginPage loginPage = new LoginPage();

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
/*
        Driver.getDriver().get("https://qa.meetsky.net/index.php/login?clear=1");
        basePage.usernameButton.sendKeys("Employee121");
        basePage.passwordButton.sendKeys("Employee123");
        basePage.loginButton.click();

 */
        loginPage.login();
    }


}
