package com.automation.test;


import com.automation.Utlities.Driver;
import com.automation.pages.ContactPage;
import com.automation.pages.ExpertisePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ContactTest extends AbstractTestBase{
    ExpertisePage expertisePage = new ExpertisePage();
    ContactPage contactPage=new ContactPage();


        @Test
        public void test1(){
            expertisePage.navigateTo("Contact");
            String expectedTitle = "Contact – SemanticBits";
            String actualTitle = Driver.getDriver().getTitle();
           // String ExpertisePageTitleExpected = "Contact – SemanticBits";
            Assert.assertEquals(actualTitle, expectedTitle);

            Assert.assertEquals(expectedTitle, Driver.getDriver().getTitle());
        }
        @Test
    public void test2(){
           
        }

}
