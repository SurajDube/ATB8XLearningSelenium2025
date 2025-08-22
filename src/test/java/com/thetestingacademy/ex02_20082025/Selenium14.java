package com.thetestingacademy.ex02_20082025;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium14 {
    @Test
    public void testMethod01() throws Exception {

        EdgeDriver driver = new EdgeDriver();
        //driver.get("flipkart.com/");    // not working

       driver.get("http://www.flipkart.com");
        driver.manage().window().fullscreen();
        driver.navigate().to("https://www.amazon.com/");
        driver.manage().window().maximize();



    }
}
