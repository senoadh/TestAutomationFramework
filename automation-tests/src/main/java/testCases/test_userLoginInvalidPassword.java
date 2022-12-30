package testCases;

import base.BaseTest;
import org.testng.annotations.Test;
import pages.LoginPage;

public class test_userLoginInvalidPassword extends BaseTest {

    @Test
    public void test_userLoginInvalidPassword_Fail() {
        LoginPage loginPage = new LoginPage(getDriver());

        String username = "standard_user";
        String password = "INVALID_PASSWORD";

        loginPage.verifyEmailField();
        loginPage.verifyPasswordField();
        loginPage.verifyLoginButton();

        loginPage.loginToSauceDemo(username, password);
        loginPage.verifyIncorrectPasswordPopup();
        loginPage.verifyInvalidUsernameIcon();
        loginPage.verifyInvalidPasswordIcon();
    }
}
