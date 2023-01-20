package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class RedRLSandalsPage extends BasePage{

    @FindBy(xpath="//button[@data-testid='sizeFlyoutOpener']")
    private WebElement shoesSizeButton;

    @FindBy(xpath ="//div[@data-testid='sizeOption_54114422_active']")
    private WebElement size65ShoesButton;

    @FindBy(xpath = "//button[@data-testid='addToBasketButton']")
    private WebElement addToBasketButton;

    public RedRLSandalsPage(WebDriver browser) {
        super(browser);
    }

    public YourCartPage addToYourCart(){
        waitUntilVisible(shoesSizeButton);
        click(shoesSizeButton);
        click(size65ShoesButton);
        click(addToBasketButton);
        waitFor(2);
        WebElement yourCartButton = browser.findElement(By.xpath("(//a[@href='/cos-cumparaturi'])[1]"));
        click(yourCartButton);
        return new YourCartPage(browser);
    }
}
