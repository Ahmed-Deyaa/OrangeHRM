package com.definitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import pages.HomePage;
import pages.LoginPage;
import pages.UsersPage;

public class UsersManagementStepDefinition  {

    private LoginPage loginPage;
    private HomePage homePage;
    private UsersPage usersPage;

    private  WebDriver driver;

    @Before
    public void setUpDriver(){
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

    }

    @After
    public void tearDownDriver(){
        driver.quit();
    }
    @Given("user navigates to orange website {string}")
    public void user_navigates_to_orange_website(String url)  {
        driver.get(url);
        loginPage = new LoginPage(driver);
        
    }
    @When("user enters valid {string} and {string}")
    public void user_enters_valid_and(String username, String password)  {
        loginPage.enterCredentials(username,password);
        
    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button() {
        homePage = loginPage.clickOnLoginButton();
        
    }
    @Then("user navigates to home page successfully")
    public void user_navigates_to_home_page_successfully() {
        Assert.assertTrue(homePage.isHomePageLoaded());
        
    }
    @When("user hover over admin Tab")
    public void user_hover_over_admin_tab() {
        homePage.hoverOverAdminTab();
        
    }
    @When("user hover over userManagement Tab")
    public void user_hover_over_user_management_tab() {
        homePage.hoverOverUserManagementTab();
        
    }
    @When("user click on users tab")
    public void user_click_on_users_tab() {
        usersPage = homePage.clickOnUsersTab();
        
    }
    @Then("user navigates to users page successfully")
    public void user_navigates_to_users_page_successfully() {
        Assert.assertTrue(usersPage.isUsersPageLoaded());
        
    }





}
