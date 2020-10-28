package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactPage extends AbstractPage{
    @FindBy(xpath = "(//*[contains(text(),'Contact')] )[2]")
    protected WebElement contact;

}
