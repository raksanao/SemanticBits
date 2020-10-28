package com.automation.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ExpertisePage extends AbstractPage{

  @FindBy(xpath = "(//*[contains(text(),'Software Development')])[2]")
    protected WebElement softwareDevelopment;

@FindBy(xpath = "(//*[contains(text(),'Cloud Services')])[2]")
    protected WebElement cloudServices;



}
