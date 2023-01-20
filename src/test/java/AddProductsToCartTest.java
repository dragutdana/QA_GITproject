import org.testng.Assert;
import org.testng.annotations.Test;

public class AddProductsToCartTest extends BaseTest {

    @Test
    public void addRedJacketToCart(){
        Assert.assertEquals(
                homePage
                        .goToSalePage()
                        .goToJacket()
                        .goToRedJacket()
                        .addToCart()
                        .getPriceAmount()
                , "911,20 lei");
    }

    @Test
    public void addRedSandalsToCart(){
        Assert.assertEquals(
                homePage
                        .goToShoesPage()
                        .goToSandals()
                        .goToRedSandals()
                        .addToYourCart()
                        .getPriceAmount()
                , "839,90 lei");
    }

    @Test
    public void clickBlackNikeJacket(){
        homePage
                .goToSalePage()
                .goToJacket()
                .goToBlackNikeJacket();
    }
}
