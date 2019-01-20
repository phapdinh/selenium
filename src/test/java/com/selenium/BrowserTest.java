package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

class BrowserTest {
    static public void portfolioTest(WebDriver driver) throws InterruptedException {
        String url = "https://ancient-springs-57162.herokuapp.com/";
        int[] projectIds = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        driver.get(url);

        for(int id : projectIds) {
            driver.findElement(By.xpath(String.format("//*[@data-target='#project%d']", id))).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath(String.format("//div[@id='project%d']//button[@type='button'][contains(text(),'Close')]", id))).click();
            Thread.sleep(1000);
        }
    }

    static public void googleTest(WebDriver driver) throws InterruptedException {
        driver.get("https://google.com");
        //enter text in search box
        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("Automation Step by Step");
        searchBox.sendKeys(Keys.RETURN);
        Thread.sleep(2000);

        driver.close();
    }
}