package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserTest {
    public static void main(String[] args) {
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.chrome.driver", projectPath + "/drivers/chromedriver/chromedriver.exe");
        String url = "https://ancient-springs-57162.herokuapp.com/";
        WebDriver driver = new ChromeDriver();
        driver.get(url);
    }
}