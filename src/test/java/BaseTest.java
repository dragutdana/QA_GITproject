import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.*;
import pageObjects.HomePage;

public class BaseTest {

    private WebDriver browser;
    HomePage homePage;

    @BeforeSuite
    public void setUpSuite(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        browser = new ChromeDriver();
        browser.manage().window().maximize();
    }

    @BeforeMethod
    public void setUpTest(){
        browser.get("https://www.aboutyou.ro/");
        homePage = new HomePage(browser);
        homePage.login();
    }

    @AfterMethod
    public void tearDownTest(){
        homePage
                .goToCartPage()
                .deleteProducts()
                .logout();

        browser.manage().deleteAllCookies();
    }

    @AfterSuite
    public void tearDown(){
        browser.close();
    }
}
