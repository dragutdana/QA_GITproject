package pageObjects;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {

    WebDriver browser;
    WebDriverWait wait;
    Actions actions;

    public BasePage(WebDriver browser) {
        this.browser = browser;
        wait = new WebDriverWait(browser, Duration.ofSeconds(5L));
        PageFactory.initElements(browser, this);
        actions = new Actions(browser);
    }

    public void click(WebElement element){
        element.click();
    }

    public void sendKeys( WebElement element, String text){
        element.sendKeys(text);
    }

    public String getText(WebElement element){
        return element.getText();
    }

    public void clear(WebElement element){
        element.clear();
    }

    public void scrollIntoView(WebElement element){
        (( JavascriptExecutor)browser). executeScript("argument[0].scrollIntoView()", element);
    }

    public void scrollBy(int pixels) {
        ((JavascriptExecutor)browser).executeScript("window.scrollBy(0,"+pixels+")");
    }

    public void waitFor(int seconds) {
        try {
            Thread.sleep(seconds* 1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public void hover(WebElement element) {
        actions.moveToElement(element).perform();
    }

    public void waitUntilVisible(WebElement element) {
        wait.until(ExpectedConditions.visibilityOf(element));
    }
}
