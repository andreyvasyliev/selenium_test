package ru.deliveryClub;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageobjects.HomePage;
import pageobjects.LoginPage;

public class FirstTest extends WebDriverSettings{


    @Test
    public void firstTest() {

        HomePage homePage = new HomePage(driver);

        homePage.open();

        String title = driver.getTitle();

        Assert.assertTrue(title.equals("Джин - анонімний пошук роботи для розробників \\m/"));

    }

    @Test
    public void login() throws InterruptedException{

        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);

        homePage.open()
                .clickLoginButton();

        loginPage.inputEmail("bob@yopmail.com");

        Thread.sleep(2500);

    }


}
