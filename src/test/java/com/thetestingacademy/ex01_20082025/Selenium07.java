package com.thetestingacademy.ex01_20082025;

import org.openqa.selenium.edge.EdgeDriver;

public class Selenium07 {
    public static void main(String[] args) {
        EdgeDriver driver = new EdgeDriver();
        driver.get("https://www.youtube.com/");
        driver.quit();
    }


}
