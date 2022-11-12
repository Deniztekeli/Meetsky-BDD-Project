package com.meetsky.step_definitions;

import com.meetsky.pages.LoginPage;
import io.cucumber.java.en.Given;

public class Login_StepDefinition {

    LoginPage basePage = new LoginPage();

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
    basePage.login();
    }
}
