package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RedTommyJacketPage extends BasePage {
    public RedTommyJacketPage(WebDriver browser) {
        super(browser);
    }

    @FindBy(css = "button[data-testid='sizeFlyoutOpener']")
    private WebElement sizeButton;

    @FindBy(xpath = "(//button[@data-testid='addToBasketButton'])[1]")
    private WebElement addToBasketButton;

    @FindBy(xpath = "//a[@href='/cos-cumparaturi']")
    private WebElement cartButton;

    @FindBy(xpath= "//div[@data-testid='sizeOption_41860810_active']")
    private WebElement sizeXSButton;

    public YourCartPage addToCart(){
        waitUntilVisible(sizeButton);
        click(sizeButton);
        waitUntilVisible(sizeXSButton);
        click(sizeXSButton);
        click(addToBasketButton);
        waitUntilVisible(cartButton);
        click(cartButton);
        return new YourCartPage(browser);
    }
}
