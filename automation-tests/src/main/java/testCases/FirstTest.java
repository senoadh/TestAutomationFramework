package testCases;

import base.BaseTest;
import pages.LoginPage;
import org.testng.annotations.Test;
public class FirstTest extends BaseTest {

    @Test
    public void loginPage() {
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.verifyEmailField();
        loginPage.verifyPasswordField();
//        System.setProperty("webdriver.chrome.driver", "C:\\Users\\Seno\\Downloads\\chromedriver_win32\\chromedriver.exe");
    }
}
