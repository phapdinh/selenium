package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrowserTest {
    public static void main(String[] args) {
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.ie.driver", projectPath + "/drivers/iedriver/IEDriverServer.exe");
        String url = "https://ancient-springs-57162.herokuapp.com/";
        WebDriver driver = new InternetExplorerDriver();

        driver.get(url);
    }
}