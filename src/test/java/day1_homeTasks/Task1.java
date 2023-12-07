package day1_homeTasks;

import Utility.DocuportConstants;
import Utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://beta.docuport.app");
        driver.manage().window().maximize();
        WebElement userNameForClient = driver.findElement(By.id("input-14"));
        userNameForClient.sendKeys(DocuportConstants.USERNAME_ADVISOR);
        WebElement passwordForClient = driver.findElement(By.id("input-15"));
        passwordForClient.sendKeys(DocuportConstants.PASSWORD_ADVISOR);
        WebElement loginButton = driver.findElement(By.className("v-btn__content"));
        loginButton.click();
       // WebElement clickSubmit =driver.findElement(By.cssSelector("button[type='submit']"));
       // Thread.sleep(3000);
      //  clickSubmit.click();
        Thread.sleep(4000);
        WebElement exit = driver.findElement(By.cssSelector("span.body-1.white--text"));
        exit.click();

    }
}
