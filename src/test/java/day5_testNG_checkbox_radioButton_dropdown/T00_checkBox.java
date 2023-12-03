package day5_testNG_checkbox_radioButton_dropdown;

import Utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class T00_checkBox {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com/checkboxes");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        WebElement checkBox1 = driver.findElement(By.xpath("//input/following-sibling::text()[contains(.,'checkbox 1')]/preceding-sibling::input"));

        if ((!checkBox1.isSelected())){
            System.out.println("Checkbox is not selected");
        }
        else {
            System.out.println("Checkbox is selected");
        }
        checkBox1.click();
        if (checkBox1.isSelected()){
            System.out.println("Checkbox is selected");
        }
        else {
            System.out.println("Checkbox is not selected");
        }


    }
}
