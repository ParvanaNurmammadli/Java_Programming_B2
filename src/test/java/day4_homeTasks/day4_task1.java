package day4_homeTasks;

import Utility.DocuportConstants;
import Utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class day4_task1 {
    public static <displayList> void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://beta.docuport.app");
        WebElement userNameForClient = driver.findElement(By.id("input-14"));
        userNameForClient.sendKeys(DocuportConstants.USERNAME_CLIENT);
        WebElement passwordForClient = driver.findElement(By.id("input-15"));
        passwordForClient.sendKeys(DocuportConstants.PASSWORD_CLIENT);
        WebElement loginButton = driver.findElement(By.className("v-btn__content"));
        Thread.sleep(2000);
        loginButton.click();
        Thread.sleep(2000);
        WebElement clickSubmit = driver.findElement(By.cssSelector("button[type='submit']"));
        Thread.sleep(2000);
        clickSubmit.click();
        Thread.sleep(2000);

        WebElement home = driver.findElement(By.xpath("//span[contains(text(), 'Home')]"));
        WebElement receivedDocs = driver.findElement(By.xpath("//span[contains(text(), 'Received docs')]"));
        WebElement myUploads = driver.findElement(By.xpath("//span[contains(text(), 'My uploads')]"));
        WebElement invitation = driver.findElement(By.xpath("//span[contains(text(), 'Invitations')]"));

        if (home.isDisplayed()) {
            System.out.println("Home button is displayed");
        } else {
            System.out.println("TEST FAILED");
        }

        if (receivedDocs.isDisplayed()) {
            System.out.println("Received Documents button is displayed");
        } else {
            System.out.println("TEST FAILED");
        }
        if (myUploads.isDisplayed()) {
            System.out.println("My Uploads button is displayed");
        } else {
            System.out.println("TEST FAILED");
        }
        if (invitation.isDisplayed()) {
            System.out.println("Invitation button is displayed");
        } else {
            System.out.println("TEST FAILED");
        }

        Thread.sleep(2000);

        WebElement threeLines = driver.findElement
                (By.xpath("//i[@class='v-icon notranslate mdi mdi-menu theme--light']"));
        threeLines.click();
        Thread.sleep(2000);

        System.out.println();
        if (!home.isDisplayed()) {
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST FAILED");
        }
        if (!receivedDocs.isDisplayed()) {
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST FAILED");
        }
        if (!myUploads.isDisplayed()) {
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST FAILED");
        }
        if (!invitation.isDisplayed()) {
            System.out.println("TEST PASSED");
        } else {
            System.out.println("TEST FAILED");
        }

    }
}
