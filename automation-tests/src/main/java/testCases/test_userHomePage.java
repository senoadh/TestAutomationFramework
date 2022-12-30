package testCases;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class test_userHomePage extends BaseTest {

    @Test
    public void validHomePageTest(){
        LoginPage loginPage = new LoginPage(getDriver());
        String password = "secret_sauce";
        String username = "standard_user";

        loginPage.loginToSauceDemo(username, password);
        HomePage homePage = new HomePage(getDriver());
        homePage.verifyHomePageUrl();
        homePage.verifyProductList();
    }
}
