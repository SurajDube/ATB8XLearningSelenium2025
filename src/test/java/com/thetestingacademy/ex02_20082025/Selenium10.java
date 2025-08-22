package com.thetestingacademy.ex02_20082025;

import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeOptions;
import org.testng.annotations.Test;
import java.io.File;

public class Selenium10 {
    @Test
    public void testMethod01()    {
        EdgeOptions edgeOptions = new EdgeOptions();
        edgeOptions.addExtensions((new File("src/test/java/com/thetestingacademy/ex20082025Part2/adblock.crx")));

        EdgeDriver edgeDriver = new EdgeDriver(edgeOptions);
        edgeDriver.get("https://www.youtube.com/");
        edgeDriver.manage().window().maximize();
        edgeDriver.quit();
    }
}
