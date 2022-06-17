package com.tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import pages.LoginPage;

public class Plah {

    @Test
    public void run(){
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/");
        LoginPage loginPage = new LoginPage(driver);
        loginPage.enterCredentials("Admin","admin123");
        var homePage = loginPage.clickOnLoginButton();
        homePage.clickOnUsersTab();

    }
}
