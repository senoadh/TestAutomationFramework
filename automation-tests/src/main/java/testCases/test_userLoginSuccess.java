package testCases;

import base.BaseTest;
import pages.HomePage;
import pages.LoginPage;
import org.testng.annotations.Test;
public class test_userLoginSuccess extends BaseTest {

    @Test
    public void test_userLogin_success() {
        LoginPage loginPage = new LoginPage(getDriver());
        HomePage homePage = new HomePage(getDriver());

        String password = "secret_sauce";
        String username = "standard_user";

        loginPage.verifyEmailField();
        loginPage.verifyPasswordField();
        loginPage.verifyLoginButton();
        loginPage.loginToSauceDemo(username, password);

        homePage.verifyHomePageUrl();

    }
}
