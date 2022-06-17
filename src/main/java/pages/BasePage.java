package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    protected WebDriver driver;
    protected WebDriverWait wait;
    protected Actions actions;


    protected void hoverOverHomePageBar(WebElement showedTab,WebElement hiddenTab){
        actions = new Actions(driver);
        wait = new WebDriverWait(driver,10);
        actions.moveToElement(showedTab).perform();
        wait.until(ExpectedConditions.visibilityOf(hiddenTab));

    }
}
