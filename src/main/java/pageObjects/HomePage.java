package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import utils.Constants;

public class HomePage extends BasePage{
    public HomePage(WebDriver browser) {
        super(browser);
    }

    @FindBy(xpath = "//button[@ id= 'onetrust-accept-btn-handler']")
    private WebElement acceptCookieButton;

    @FindBy (xpath = "//div[@data-testid='UserAccount']")
    private WebElement firstLoginButton;

    @FindBy(xpath = "//div[@data-testid='RegisterAndLoginButtons']/div[1]/div[2]")
    private WebElement selectLoginButton;

    @FindBy(css = "input[data-testid='EmailField']")
    private WebElement emailField;

    @FindBy(css = "input[data-testid='PasswordField']")
    private WebElement passwordField;

    @FindBy(css ="button[type='submit']")
    private WebElement thirdLoginButton;

    @FindBy(css = "li[data-testid='Header_navigation_list_item_SALE']")
    private WebElement saleButton;

    @FindBy(xpath = "//button[@data-testid='CheckoutButton']")
    private WebElement checkoutButton;

    @FindBy(xpath="//div[@data-testid='Label_Pantofi']")
    private WebElement shoesButton;

    @FindBy(xpath= "//div[@data-testid= 'Basket']")
    private WebElement basketButton;

    public HomePage login(){
        waitUntilVisible(acceptCookieButton);
        click(acceptCookieButton);
        click(firstLoginButton);
        waitUntilVisible(selectLoginButton);
        click(selectLoginButton);
        sendKeys(emailField, Constants.EMAIL);
        sendKeys(passwordField, Constants.PASSWORD);
        click(thirdLoginButton);
        return new HomePage(browser);
    }

    public SalePage goToSalePage(){
        waitFor(3);
        click(saleButton);
        return new SalePage(browser);
    }

    public ShoesPage goToShoesPage(){
        waitFor(3);
        click(shoesButton);
        return new ShoesPage(browser);
    }

    public YourCartPage goToCartPage(){
        click(basketButton);
        return new YourCartPage(browser);
    }

    public void logout() {
        WebElement element = browser.findElement(By.xpath("//div[@data-testid='UserAccount']"));
        hover(element);
        WebElement logoutButton = browser.findElement(By.xpath("//button[@data-testid='LogoutButton']"));
        click(logoutButton);
    }
}






