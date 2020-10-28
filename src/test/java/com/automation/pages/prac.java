package com.automation.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class prac {
    public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"/chromedriver");
        System.setProperty("webdriver.chrome.driver",System.getProperty("user.dir")+"/chromedriver");
        WebDriver driver=new ChromeDriver();
        driver.get("http://google.com");
    }
}
