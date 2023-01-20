import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pageObjects.HomePage;

public class BaseTest {

    private WebDriver browser;
    HomePage homePage;

    @BeforeMethod
    public void setUp(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        browser= new ChromeDriver();
        browser.manage().window().maximize();
        browser.get("https://www.aboutyou.ro/");
        homePage = new HomePage(browser);
        homePage.login();
    }

    @AfterMethod
    public void tearDown(){
        homePage
            .goToCartPage()
            .deleteProducts()
            .logout();

        browser.close();
    }
}
