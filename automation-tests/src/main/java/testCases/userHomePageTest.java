package testCases;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class userHomePageTest extends BaseTest {

    @Test
    public void validHomePageTest(){
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.loginToSauceDemo();
        HomePage homePage = new HomePage(getDriver());
        homePage.verifyHomePageUrl();
        homePage.verifyProductList();
    }
}
