package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class IEBrowserTest extends BrowserTest {
    public static void main(String[] args) throws InterruptedException {
        String projectPath = System.getProperty("user.dir");
        System.setProperty("webdriver.ie.driver", projectPath + "/drivers/iedriver/IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();

        test(driver);
    }
}