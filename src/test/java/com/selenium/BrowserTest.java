package com.selenium;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

class BrowserTest {
    static public void portfolioTest(WebDriver driver) throws InterruptedException {
        String url = "https://ancient-springs-57162.herokuapp.com/";
        int[] projectIds = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };
        driver.get(url);

        String title = driver.getTitle();
        System.out.println("title is " + title);
        assertEquals(title, "Portfolio");
        String text = driver.findElement(By.cssSelector(
                "body:nth-child(2) div.container:nth-child(1) div.row:nth-child(1) div.col-md-6.text-right.text-uppercase:nth-child(2) > h4:nth-child(2)"))
                .getText();
        System.out.println("text is " + text);
        assertEquals("FRONT-END NINJA", text);
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