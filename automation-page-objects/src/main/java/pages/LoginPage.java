package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private String emailField = "//*[@type='text' and @name='email']";
    private String passwordField = "//*[@type='password' and @name='pass']";

    public void verifyEmailField() {
        driver.findElement(By.xpath(emailField));
    }

    public void verifyPasswordField() {
        driver.findElement(By.xpath(passwordField));
    }
}
