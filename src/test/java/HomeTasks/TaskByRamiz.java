package HomeTasks;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class TaskByRamiz {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.get("https://www.loopcamp.io/");
       driver.manage().window().maximize();
        WebElement findIte = driver.findElement(By.xpath(""));

    }

}
