package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SandalsPage extends BasePage {
    public SandalsPage(WebDriver browser) {
        super(browser);
    }

    @FindBy(xpath = "//a[@data-testid ='productTile-9058397']")
    private WebElement redRLShoesButton;

    public RedRLSandalsPage goToRedSandals(){

        //the button we're looking to click doesn't initially exist and is loaded further down the page
        for (int i = 1; i <=5 ; i++) {
            scrollBy(2000);
            waitFor(3);
        }
        click(redRLShoesButton);
        return new RedRLSandalsPage(browser);
    }
}
