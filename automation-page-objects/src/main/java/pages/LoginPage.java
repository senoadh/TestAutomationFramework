package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }

    private String usernameField = "//*[@data-test='username']";
    private String passwordField = "//*[@data-test='password']";
    private String loginButton = "//*[@data-test='login-button']";

    public void verifyEmailField() {
        driver.findElement(By.xpath(usernameField));
    }

    public void verifyPasswordField() {
        driver.findElement(By.xpath(passwordField));
    }

    public void verifyLoginButton() {
        driver.findElement(By.xpath(loginButton));
    }

    public void setUsername() {
        String username = "standard_user";
        driver.findElement(By.xpath(usernameField)).sendKeys(username);
    }

    public void setPassword() {
        String password = "secret_sauce";
        driver.findElement(By.xpath(passwordField)).sendKeys(password);
    }
    public void loginToSauceDemo() {
        this.setUsername();
        this.setPassword();
        driver.findElement(By.xpath(loginButton)).click();
    }
}
