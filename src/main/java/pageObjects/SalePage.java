package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class SalePage extends BasePage{

    public SalePage(WebDriver browser) {
        super(browser);
    }

    @FindBy(xpath = "(//a[@href='/c/femei/sale/geci-32621'])[1]")
    private WebElement jacketButton;

    public JacketPage goToJacket(){
        waitUntilVisible(jacketButton);
        click(jacketButton);
        return new JacketPage(browser);
    }
}
