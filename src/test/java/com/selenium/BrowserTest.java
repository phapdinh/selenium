package com.selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BrowserTest {
    public static void main(String[] args) {
        String url = "https://ancient-springs-57162.herokuapp.com/";
        WebDriver driver = new FirefoxDriver();
        driver.get(url);
    }
}