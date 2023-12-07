package day5_hometasks;

import Utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import java.time.Duration;

public class Task2_etsy {
    WebDriver driver;
String actual;
String expected;


    @AfterClass
    public void tearDown() {
        driver.quit();
    }
    @Test
    public void setUp() throws InterruptedException {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://etsy.com");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement search = driver.findElement(By.xpath("//input[@id='global-enhancements-search-query']"));
        search.sendKeys("rings");
        search.submit();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        actual= driver.findElement(By.xpath("//div[@class='wt-panel__trigger-container']/button")).getText();
        expected="Estimated Arrival Any time";
        Assert.assertEquals(actual,expected,"Text doesn't matches as expected");
        Thread.sleep(1500);
        WebElement dropdownElement = driver.findElement(By.xpath("//div[@class='wt-panel__trigger-container']/button"));
        dropdownElement.click();
        Thread.sleep(1500);

        Select dropdown = new Select(driver.findElement(By.xpath("//select[@id='edd_select_tf']")));
        Thread.sleep(1500);
        dropdown.selectByVisibleText("By Dec 30");
        Thread.sleep(1500);
        actual=driver.findElement(By.xpath("//div[@class='wt-panel__trigger-container']/button/span/span/span")).getText();
        expected="By Dec 30";
        Assert.assertEquals(actual,expected,"Text doesn't matches");



    }
}
