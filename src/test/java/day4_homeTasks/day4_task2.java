package day4_homeTasks;

import Utility.DocuportConstants;
import Utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class day4_task2 {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("https://beta.docuport.app");
        WebElement userNameForClient = driver.findElement(By.id("input-14"));
        userNameForClient.sendKeys(DocuportConstants.USERNAME_ADVISOR);
        WebElement passwordForClient = driver.findElement(By.id("input-15"));
        passwordForClient.sendKeys(DocuportConstants.PASSWORD_ADVISOR);
        WebElement loginButton = driver.findElement(By.className("v-btn__content"));
        Thread.sleep(2000);
        loginButton.click();
        Thread.sleep(2000);


        List<WebElement> navigateItems = driver.findElements(By.xpath("//a[contains(@class,'py-x')]"));
        for (WebElement each : navigateItems) {
            System.out.print(each.getAttribute("href") + " ");
            System.out.print(each.getText());
            System.out.println();
        }
        ArrayList<String> list = new ArrayList<>();
        list.add("Home");
        list.add("Received docs");
        list.add("My uploads");
        list.add("Clients");
        list.add("Invitations");
        list.add("Users");
        list.add("Leads");
        list.add("Bookkeeping");
        list.add("1099 form");
        list.add("Reconciliation");

        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(navigateItems.get(i).getText())) {
                System.out.println("TEST PASSED");
            } else {
                System.out.println("TEST FAILED , the expected result did not match the actual result.");
            }


        }
    }}