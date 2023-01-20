package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ShoesPage extends BasePage {
    public ShoesPage(WebDriver browser) {
        super(browser);
    }

    @FindBy(xpath = "(//a[.='Sandale'])[1]")
    private WebElement sandalsButton;

    public SandalsPage goToSandals(){
        waitUntilVisible(sandalsButton);
        click(sandalsButton);
        return new SandalsPage(browser);
    }
}
