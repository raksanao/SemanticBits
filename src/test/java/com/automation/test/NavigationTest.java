package com.automation.test;

import com.automation.Utlities.Driver;
import com.automation.pages.ExpertisePage;
import org.testng.Assert;
import org.testng.annotations.Test;
public class NavigationTest extends AbstractTestBase {
    ExpertisePage expertisePage = new ExpertisePage();
    @Test
    public void test1() {
        String expectedTitle = "SemanticBits – SemanticBits specializes in the design and development of software systems for the health and life sciences industries";
        String actualTitle = Driver.getDriver().getTitle();
        String ExpertisePageTitleExpected = "Expertise – SemanticBits";
        Assert.assertEquals(actualTitle, expectedTitle);
        expertisePage.navigateTo("Expertise");
        Assert.assertEquals(ExpertisePageTitleExpected, Driver.getDriver().getTitle());
    }

    @Test// goes to page clicks to domain and Clinical Genomics – SemanticBits
    public void test2() {
       // ExpertisePage expertisePage = new ExpertisePage();
        String expectedTitle = "SemanticBits – SemanticBits specializes in the design and development of software systems for the health and life sciences industries";
        String actualTitle = Driver.getDriver().getTitle();
        System.out.println(actualTitle);
        String ExpertisePageTitleExpected = "Clinical Genomics – SemanticBits";
        Assert.assertEquals(actualTitle, expectedTitle);

        expertisePage.navigateTo("Domains", "Clinical Genomics");
        String actualTitle2 = Driver.getDriver().getTitle();
        System.out.println(actualTitle2);
        Assert.assertEquals(ExpertisePageTitleExpected, Driver.getDriver().getTitle());
        //Clinical Genomics – SemanticBits
    }
    @Test
    public void test3(){
        expertisePage.navigateTo("Expertise","Big Data");
        String actualTitle2 = Driver.getDriver().getTitle();
        System.out.println(actualTitle2);
        String ExpertisePageTitleExpected = "Big Data – SemanticBits";
        Assert.assertEquals(ExpertisePageTitleExpected, Driver.getDriver().getTitle());



    }
    @Test
    public void test4() {
        expertisePage.clickToSearch("hello");

    }
//    public  void test5(){
//        JavascriptExecutor jse6 = (JavascriptExecutor) driver;
//        jse6.executeScript("window.scrollBy(0,250)", "");
//    }
           }










