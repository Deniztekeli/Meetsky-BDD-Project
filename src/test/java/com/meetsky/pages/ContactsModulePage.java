package com.meetsky.pages;

import com.meetsky.utilities.Driver;
import org.openqa.selenium.support.PageFactory;

public class ContactsModulePage {

    public ContactsModulePage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
}
