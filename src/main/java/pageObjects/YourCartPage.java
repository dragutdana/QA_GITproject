package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class YourCartPage extends BasePage {
    public YourCartPage(WebDriver browser) {
        super(browser);
    }

    @FindBy(xpath = "//span[@data-testid='finalPrice']")
    private WebElement priceAmount;

    @FindBy(xpath = "(//span[@data-testid='numberBadge'])[2]")
    private WebElement numberOfProducts;

    @FindBy(xpath = "//button[@data-testid='removeProduct']")
    private List<WebElement> orderedProducts;

    public String getPriceAmount(){
        waitUntilVisible(priceAmount);
        return getText(priceAmount);
    }

    public HomePage deleteProducts(){
        for (WebElement element:orderedProducts){
            click(element);
            waitFor(4); //deletion from the cart actually happens a few seconds after clicking the Delete button
        }
        return new HomePage(browser);
    }
}
