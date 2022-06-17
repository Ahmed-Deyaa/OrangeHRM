package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }

    @FindBy(id = "txtUsername")
    private WebElement usernameField;

    @FindBy(id = "txtPassword")
    private WebElement passwordField;

    @FindBy(id = "btnLogin")
    private WebElement loginButton;


    private void enterUsername(String username){
        usernameField.sendKeys(username);
    }

    private void enterPassword(String password){
        passwordField.sendKeys(password);
    }

    public void enterCredentials(String username,String password){
        enterUsername(username);
        enterPassword(password);
    }

    public HomePage clickOnLoginButton(){
        loginButton.click();
        return new HomePage(driver);
    }
}
