package com.meetsky.step_definitions;

import com.meetsky.pages.BasePage;
import com.meetsky.pages.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;

public class Login_StepDefinition {

    BasePage basePage = new BasePage();
    LoginPage loginPage=new LoginPage();

    @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
    loginPage.login();
    }
}
