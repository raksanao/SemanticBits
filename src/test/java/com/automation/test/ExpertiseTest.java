package com.automation.test;

import com.automation.Utlities.Driver;
import com.automation.pages.ExpertisePage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ExpertiseTest extends AbstractTestBase {

    ExpertisePage expertisePage = new ExpertisePage();
    @Test
    public void test(){
        expertisePage.navigateTo("Expertise","Software Development");
        String actualTitle2 = Driver.getDriver().getTitle();
        System.out.println(actualTitle2);
        String ExpertisePageTitleExpected = "Software Development – SemanticBits";
        Assert.assertEquals(ExpertisePageTitleExpected, Driver.getDriver().getTitle());
    }
    }


