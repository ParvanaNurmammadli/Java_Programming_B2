package day5_hometasks;

import Utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.*;

import java.time.Duration;

public class Task1_dropdown {
    WebDriver driver;
    String actual;
    String expected;


    @BeforeClass
    public void setUp() {
        driver = WebDriverFactory.getDriver("chrome");
        driver.manage().window().maximize();
        driver.get("http://the-internet.herokuapp.com/dropdown");
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    @BeforeMethod
    public void setUpThread() throws InterruptedException {
        Thread.sleep(1000);
    }

    @Test(priority = 1)
    public void testDefault() throws InterruptedException {
        Select dropdown = new Select(driver.findElement(By.id("dropdown")));
        actual = dropdown.getFirstSelectedOption().getText();
        expected = "Please select an option";
        Assert.assertEquals(actual, expected, "Actual text does not matches expected text.");
    }


    @Test(priority = 2)
    public void chooseOption1() throws InterruptedException {
        Select dropdown = new Select(driver.findElement(By.id("dropdown")));
        dropdown.selectByIndex(1);
        Assert.assertEquals(dropdown.getFirstSelectedOption().getText(), "Option 1", "Actual text does not matches expected text.");
        Thread.sleep(1500);


        dropdown.selectByIndex(2);
        Assert.assertEquals(dropdown.getFirstSelectedOption().getText(), "Option 2", "Actual text does not matches expected text.");
        Thread.sleep(1500);
    }

    @Test(priority = 3)
    public void validateDropdownName() {
        WebElement dropdownTitle = driver.findElement(By.xpath("//h3"));
        actual = dropdownTitle.getText();
        expected = "Dropdown List";
        Assert.assertEquals(actual, expected, "Actual dropdown name does not match expected name");
    }

}
