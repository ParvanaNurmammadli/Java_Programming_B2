package com.loop.day1_selenium_intro;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTest {
    public static void main(String[] args) throws InterruptedException {

        // setting up the web driver
        WebDriverManager.chromedriver().setup();

        // create an instance of webdriver
        WebDriver driver = new ChromeDriver();
        //Thread.sleep(5000);
        // navigate to web page
        driver.get("https://www.google.com");
        //driver.navigate().to("https://www.google.com");
        driver.manage().window().maximize();
        //  WebElement searchInput = driver.findElement(By.name("q"));
        // searchInput.sendKeys("loopacademy");
        //  searchInput.sendKeys(Keys.ENTER);
        driver.get("https://www.etsy.com");
        //navigate back
        driver.navigate().back();

        //naviage forward
        driver.navigate().forward();

        //navigate refresh
            driver.navigate().refresh();
                //quit from tab ;  close all
            driver.quit();
            driver.close();


    }
}
