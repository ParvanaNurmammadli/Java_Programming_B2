package day5_hometasks;

import Utility.DocuportConstants;
import Utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Task1 {
    WebDriver driver;
    @Test
    public void homeTask() throws InterruptedException {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://beta.docuport.app");
        WebElement userNameForClient = driver.findElement(By.id("input-14"));
        userNameForClient.sendKeys(DocuportConstants.USERNAME_ADVISOR);
        WebElement passwordForClient = driver.findElement(By.id("input-15"));
        passwordForClient.sendKeys(DocuportConstants.PASSWORD_ADVISOR);
        WebElement loginButton = driver.findElement(By.className("v-btn__content"));
        Thread.sleep(2000);
        loginButton.click();

    }
}
