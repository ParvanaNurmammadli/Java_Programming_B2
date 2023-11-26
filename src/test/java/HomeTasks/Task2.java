package HomeTasks;

import Utility.DocuportConstants;
import Utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task2 {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://beta.docuport.app");
        driver.manage().window().maximize();
        WebElement loginButton = driver.findElement(By.className("v-btn__content"));
        loginButton.click();
        WebElement usernameError = driver.findElement(By.xpath("(//div[@class='v-messages__message'])[1]"));
        if (usernameError.getText().equals(DocuportConstants.ERROR_MESSAGE_FOR_USERNAME)) {
            System.out.println("TEST PASSED");

        } else {
            System.err.println("TEST FAILED");
        }

        WebElement passwordError = driver.findElement(By.xpath("(//div[@class='v-messages__message'])[2]"));
        if (passwordError.getText().equals(DocuportConstants.ERROR_MESSAGE_FOR_PASSWORD)) {
            System.out.println("TEST PASSED");

        } else {
            System.err.println("TEST FAILED");
        }
    }

    }




