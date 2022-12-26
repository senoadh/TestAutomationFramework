package testCases;

import base.BaseTest;
import pages.HomePage;
import pages.LoginPage;
import org.testng.annotations.Test;
public class userLoginTest extends BaseTest {

    @Test
    public void loginTest() {
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());
        loginPage.verifyEmailField();
        loginPage.verifyPasswordField();
        loginPage.verifyLoginButton();
        loginPage.loginToSauceDemo();
        homePage.verifyHomePageUrl();

    }
}
