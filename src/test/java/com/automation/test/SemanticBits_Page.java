package com.automation.test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;


import java.util.concurrent.TimeUnit;

public class SemanticBits_Page {
    public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://semanticbits.com/");

        System.out.println("SemanticBits webpage Displayed");

        //Maximise browser window
        driver.manage().window().maximize();

//        //Adding wait
        driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);

        //Instantiate Action Class
        Actions actions = new Actions(driver);
        //Retrieve WebElement 'BigData' to perform mouse hover
        WebElement expertise = driver.findElement(By.xpath("(//a[text()='Expertise'])[1]"));

        //Mouse hover menuOption 'Music'
        actions.moveToElement(expertise).perform();
        System.out.println("Done Mouse hover on 'Expertise'");
        Assert.assertEquals(expertise.getText(), "Expertise");

//      WebElement search= driver.findElement(By.xpath("//span[@class='icon-salient-search']"));
//      search.click();
//      Thread.sleep(3000);
//
    }
@Test
        public void test() throws InterruptedException {
    WebDriverManager.chromedriver().setup();
    WebDriver driver = new ChromeDriver();
    driver.get("https://semanticbits.com/");
//WebElement search=driver.findElement(By.xpath("//li[@id='search-btn']"));
//search.click();
//Thread.sleep(5000);
//WebElement inp=driver.findElement(By.xpath("//*[@id='s']"));
//inp.sendKeys("hello");
   // WebElement logo = driver.findElement(By.xpath("//header/div[1]/div[1]/div[1]/a[1]/img[3]']"));
    //System.out.println(logo);
    //Assert.assertEquals(logo.getText(), "Sematicbits");


    ((JavascriptExecutor) driver)
            .executeScript("window.scrollTo(0, document.body.scrollHeight)");
    driver.quit();


}


}
