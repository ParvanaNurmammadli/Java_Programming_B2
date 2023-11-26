package HomeTasks;

import Utility.DocuportConstants;
import Utility.WebDriverFactory;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.sql.Driver;

public class Task1 {
    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.get("https://beta.docuport.app");
        driver.manage().window().maximize();
        WebElement userNameForClient = driver.findElement(By.id("input-14"));
        userNameForClient.sendKeys(DocuportConstants.USERNAME_CLIENT);
        WebElement passwordForClient = driver.findElement(By.id("input-15"));
        passwordForClient.sendKeys(DocuportConstants.PASSWORD_CLIENT);
        WebElement loginButton = driver.findElement(By.className("v-btn__content"));
        loginButton.click();
        WebElement clickSubmit =driver.findElement(By.cssSelector("button[type='submit']"));
        Thread.sleep(3000);
        clickSubmit.click();

    }
}
