package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class UsersPage extends BasePage {



    public UsersPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "resultTable")
    private WebElement usersTable;

    public boolean isUsersPageLoaded(){
        return usersTable.isDisplayed();
    }


}
