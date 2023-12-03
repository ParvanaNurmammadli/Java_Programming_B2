package day1_homeTasks;

import Utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task3 {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://google.com");
        WebElement clickGmail = driver.findElement(By.cssSelector("a[aria-label='Gmail (opens a new tab)']"));
        clickGmail.click();
        if (driver.getTitle().contains("Gmail")
        ) {
            System.out.println("Test PASSED");
        }
        else {
            System.err.println("Test FAILED");
        }


        driver.navigate().back();

        if (driver.getTitle().contains("Google")){
            System.out.println("Test PASSED");

        }
        else {
            System.err.println("Test FAILED");
        }
    }
}
