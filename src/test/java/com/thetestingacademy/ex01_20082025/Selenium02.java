package com.thetestingacademy.ex01_20082025;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Selenium02 {
    @Test
    public void test_Selenium() {

        ChromeDriver driver1 = new ChromeDriver();//object creation
        driver1.get("https://app.vwo.com/#/login");
        driver1.manage().window().maximize();
        driver1.quit();

        EdgeDriver driver2 = new EdgeDriver();//object creation
        driver2.get("https://www.flipkart.com/");
        driver2.manage().window().maximize();
        driver2.quit();

        FirefoxDriver driver3 = new FirefoxDriver();//object creation
        driver3.get("https://www.flipkart.com/");
        driver3.manage().window().maximize();
        driver3.quit();
    }
}
