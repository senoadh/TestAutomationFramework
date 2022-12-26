package testCases;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;

public class userHomePageTest extends BaseTest {

    @Test
    public void validHomePageTest(){
            HomePage homePage = new HomePage(getDriver());
            homePage.verifyHomePageUrl();
            homePage.verifyProductList();
    }
}
