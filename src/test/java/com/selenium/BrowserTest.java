package com.selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

class BrowserTest {
    static public void test(WebDriver driver) throws InterruptedException {
        String url = "https://ancient-springs-57162.herokuapp.com/";
        int[] projectIds = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        driver.get(url);

        for(int id : projectIds) {
            driver.findElement(By.xpath(String.format("//*[@data-target='#project%d']", id))).click();
            Thread.sleep(2000);
            driver.findElement(By.xpath(String.format("//div[@id='project%d']//button[@type='button'][contains(text(),'Close')]", id))).click();
            Thread.sleep(2000);
        }
    }
}