package ru.deliveryClub;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FirstTest extends WebDriverSettings{


    @Test
    public void firstTest() {

        String title = driver.getTitle();

        Assert.assertTrue(title.equals("Джин - анонімний пошук роботи для розробників \\m/"));

    }

    @Test
    public void login() throws InterruptedException{

        WebElement navbar = driver.findElementByClassName("navbar");

        navbar.findElement(By.cssSelector("[href=\"/login\"]")).click();

        WebDriverWait wait = new WebDriverWait(driver, 10);

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("[type=\"email\"]")));

        WebElement email = driver.findElementByCssSelector("[type=\"email\"]");

        email.sendKeys("bob@yopmail.com");

        Thread.sleep(2500);

    }

}
