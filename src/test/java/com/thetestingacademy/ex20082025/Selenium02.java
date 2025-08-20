package com.thetestingacademy.ex20082025;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Selenium01 {
    @Test
    public void test_Selenium(){
        FirefoxDriver driver = new FirefoxDriver();
        driver.get("https://www.flipkart.com/");


    }

}
