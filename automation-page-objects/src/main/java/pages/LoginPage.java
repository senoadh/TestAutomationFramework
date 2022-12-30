package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

/*
    In this class, PageFactory framework is used. Web Objects are initialized automatically and stored
    into WebElements Objects
 */

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@data-test='username']")
    WebElement usernameField;

    @FindBy(xpath = "//*[@data-test='password']")
    WebElement passwordField;

    @FindBy(xpath = "//*[@data-test='login-button']")
    WebElement loginButton;

    @FindBy(xpath = "//*[@data-test='error']")
    WebElement loginErrorPopup;

    public void verifyEmailField() {
        assert usernameField.isDisplayed();
    }

    public void verifyPasswordField() {
        assert passwordField.isDisplayed();
    }

    public void verifyLoginButton() {
        assert loginButton.isDisplayed();
    }

    public void verifyInvalidUsernameIcon() {
        driver.findElement(By.xpath("//*[@data-test='username']/following-sibling::*[@data-icon='times-circle']"));
    }

    public void verifyInvalidPasswordIcon() {
        driver.findElement(By.xpath("//*[@data-test='password']/following-sibling::*[@data-icon='times-circle']"));
    }

    public void verifyIncorrectPasswordPopup() {
        assert loginErrorPopup.isDisplayed();
        String text = loginErrorPopup.getText();
        assert text.equals("Epic sadface: Username and password do not match any user in this service");
    }

    public void setUsername(String username) {
        usernameField.sendKeys(username);
    }

    public void setPassword(String password) {
        passwordField.sendKeys(password);
    }
    public void loginToSauceDemo(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
        loginButton.click();
    }
}
