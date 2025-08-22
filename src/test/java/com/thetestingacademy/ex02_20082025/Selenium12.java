package com.thetestingacademy.ex02_20082025;

import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class Selenium12 {
    @Test
    public void testMethod01() throws Exception {

        EdgeDriver driver = new EdgeDriver();
        driver.get("https://www.flipkart.com/");
        //driver.manage().window().fullscreen();
        driver.manage().window().maximize();
        // quit vs close
        Thread.sleep(5000);
        driver.quit(); // all tabs closed

        // driver.close(); // only one browser closed.
    }
}
