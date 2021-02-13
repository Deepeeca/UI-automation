package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Login {
    public void set_username(WebDriver driver) {
        driver.findElement(By.cssSelector("input[formControlName='userName']")).sendKeys("test@test.com");
    }

    public void set_password(WebDriver driver) {
        driver.findElement(By.cssSelector("input[formControlName='password']")).sendKeys("test123");
    }

    public void submit_form(WebDriver driver) {
        driver.findElement(By.cssSelector("button[type='Submit']")).click();
    }

}
