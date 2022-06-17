package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends BasePage{

    public HomePage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "menu_admin_viewAdminModule")
    private WebElement adminTab;
    @FindBy(id = "menu_admin_UserManagement")
    private WebElement userManagementTab;
    @FindBy(id = "menu_admin_viewSystemUsers")
    private WebElement usersTab;
    @FindBy(xpath = "//div[@class='head']//h1")
    private WebElement dashBoardBar;


    public void hoverOverAdminTab(){
        hoverOverHomePageBar(adminTab,userManagementTab);
    }
    public void hoverOverUserManagementTab(){
        hoverOverHomePageBar(userManagementTab,usersTab);
    }
    public UsersPage clickOnUsersTab(){
        usersTab.click();
        return new UsersPage(driver);
    }

    public boolean isHomePageLoaded(){
        return dashBoardBar.isDisplayed();
    }
}
