package org.example;

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;



/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "/Users/deeps/Downloads/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://foodtourdoor.herokuapp.com/\n");
        Login lg = new Login();
        driver.findElement(By.linkText("Login")).click();
        lg.set_username(driver);
        lg.set_password(driver);
        lg.submit_form(driver);
        Thread.sleep(5000);
        driver.findElement(By.cssSelector("img[src='assets/1.png']")).click();
        Thread.sleep(5000);
        driver.findElement(By.xpath("//button[contains(text(),'+')]")).click();
        driver.switchTo().alert().accept();
        driver.findElement(By.id("navbarDropdown")).click();
        driver.findElement((By.cssSelector("a[href='/cart']"))).click();
        Thread.sleep(2000);
        driver.findElement(By.xpath("//a[contains(text(),'Checkout')]")).click();
        Thread.sleep(2000);
        assertTrue(driver.findElement(By.cssSelector("img[alt='order placed']")).isDisplayed());
        System.out.println(driver.findElement(By.tagName("h2")).getText());
    }
}
