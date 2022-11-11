package com.meetsky.step_definitions;

import com.meetsky.pages.BasePage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class Login_StepDefinition {

    BasePage basePage = new BasePage();

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
    basePage.login();
    }
}
