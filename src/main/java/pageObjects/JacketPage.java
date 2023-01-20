package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class JacketPage extends BasePage{
    public JacketPage(WebDriver browser) {
        super(browser);
    }

    @FindBy(xpath= "//a[@data-testid ='productTile-5145263']")
    private WebElement redTommyJacketButton;

    @FindBy(xpath="//a[@data-testid='productTile-8998496']")
    private WebElement blackNikeJacketButton;

    public RedTommyJacketPage goToRedJacket(){
        waitUntilVisible(redTommyJacketButton);
        click(redTommyJacketButton);
        return new RedTommyJacketPage(browser);
    }

    public BlackNikeJacketPage goToBlackNikeJacket(){
        waitUntilVisible(blackNikeJacketButton);
        click(blackNikeJacketButton);
        return new BlackNikeJacketPage(browser);
    }
}
