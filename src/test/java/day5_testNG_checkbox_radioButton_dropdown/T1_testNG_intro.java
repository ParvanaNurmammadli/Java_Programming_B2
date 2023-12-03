package day5_testNG_checkbox_radioButton_dropdown;

import org.testng.Assert;
import org.testng.annotations.*;

public class T1_testNG_intro {
    @BeforeClass
    public void setUp(){
        System.out.println("Before class runs just 1");
    }

    @AfterClass
    public void tearDown(){
        System.out.println("After class runs just 1");
    }


    @BeforeMethod
    public void setupMethod(){
        System.out.println("before method is running start and end point");
    }

    @AfterMethod
    public void tearDownMethod(){
        System.out.println("after method is running start and end point");
    }
    @Test
    public void test1() {
        System.out.println("TestNG is running");
        String actual = "Feyruz";
        String expected = "Feyruz";
        Assert.assertEquals(actual, expected, "Message from Assertion it will show if test fails");
        System.out.println("============================================");
    }

        @Test
        public void test2 () {
            System.out.println("test 2 running");
        }


}