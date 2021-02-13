package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Restaurant {
    public void select_restaurant(WebDriver driver) {
        driver.findElement(By.cssSelector("img[src='assets/1.png']")).click();
    }
}
