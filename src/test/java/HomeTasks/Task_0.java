package HomeTasks;

import Utility.WebDriverFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Task_0 {
    public static void main(String[] args) {
        WebDriver driver = WebDriverFactory.getDriver("chrome");

        driver.get("https://loopcamp.vercel.app/forgot-password.html");
        driver.manage().window().maximize();
        WebElement forgotPassword = driver.findElement(By.cssSelector("div.example h2"));
        String forgotPasswordText = forgotPassword.getText();
        System.out.println("Text is :  " + forgotPasswordText);

        WebElement email = driver.findElement(By.cssSelector("label[for='email']"));
        String emailText = email.getText();
        System.out.println("Email Label text: " + emailText);

        WebElement inputEmail = driver.findElement(By.cssSelector("input[name='email'"));
        String inputText = inputEmail.getText();
        System.out.println("Input Email is displaying.. " + inputText);


        WebElement retrievePasswordElement = driver.findElement(By.cssSelector("i.icon-2x.icon-signin"));
        String retrievePasswordText = retrievePasswordElement.getAttribute("textContent");
        System.out.println("Retrieve Password text: " + retrievePasswordText);


        WebElement poweredByLoopCamp = driver.findElement(By.cssSelector("div[style='text-align: center;']"));
        String result = poweredByLoopCamp.getText();
        System.out.println("Powered by LOOPCAMP text: " + result);


        if (forgotPassword.getText().equals("Forgot Password")){
            System.out.println("TEST PASSED");
        }
        else {
            System.err.println("TEST FAILED");
        }


        if (email.getText().equals("E-mail")){
            System.out.println("TEST PASSED");
        }
        else {
            System.err.println("TEST FAILED");
        }


        if (retrievePasswordElement.getAttribute("textContent").equals("Retrieve password")){
            System.out.println("TEST PASSED");
        }
        else {
            System.err.println("TEST FAILED");
        }

        if (poweredByLoopCamp.getText().equals("Powered by LOOPCAMP")){
            System.out.println("TEST PASSED");
        }
        else {
            System.err.println("TEST FAILED");
        }


        }


    }

