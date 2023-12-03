package day1_homeTasks;

import Utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task4 {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://www.etsy.com");
        WebElement search = driver.findElement(By.cssSelector("input[id='global-enhancements-search-query']"));
        search.sendKeys("wooden spoon");
        search.submit();

        if (driver.getTitle().equals("Wooden spoon | Etsy")){
            System.out.println("Test PASSED");

        }
        else {
            System.err.println("Test FAILED");
        }

    }

}
