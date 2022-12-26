package pages;

import base.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class HomePage extends BasePage {

    public HomePage(WebDriver driver) {
        super(driver);
    }

    public void verifyHomePageUrl() {
        String expectedUrl = "https://www.saucedemo.com/inventory.html";
        String actualUrl = driver.getCurrentUrl();

        Assert.assertEquals(expectedUrl, actualUrl);
    }

    private String getProductNameDynamic(int index) {
        return "//*[@id='item_" + index + "_title_link']//div[@class='inventory_item_name']";
    }

    private String getProductImgDynamic(int index) {
        return "//*[@id='item_" + index + "_img_link']/img[contains(@src, 'jpg')]";
    }

    private String getProductDescDynamic(int index) {
        return "//*[@id='item_"+ index + "_title_link']/following-sibling::div[@class='inventory_item_desc']";
    }

    private String getProductPriceDynamic(int index) {
        return "//*[@id='item_" + index + "_title_link']/parent::div/following-sibling::*//div[@class='inventory_item_price']";
    }

    private String getProductAddToCartButtonDynamic(int index) {
        return "//*[@id='item_" + index + "_title_link']/parent::div/following-sibling::*//button[contains(text(),'Add to cart')]";
    }

    public void verifyProductNameDynamic(int index) {
        driver.findElement(By.xpath(getProductNameDynamic(index)));
    }

    public void verifyProductImageDynamic(int index) {
        driver.findElement(By.xpath(getProductImgDynamic(index)));
    }

    public void verifyProductDescriptionDynamic(int index) {
        driver.findElement(By.xpath(getProductDescDynamic(index)));
    }

    public void verifyProductPriceDynamic(int index) {
        driver.findElement((By.xpath(getProductPriceDynamic(index))));
    }

    public void verifyProductAddToCartButton(int index) {
        driver.findElement(By.xpath(getProductAddToCartButtonDynamic(index)));
    }

    public void verifyProductList() {
        int PRODUCT_LIST_SIZE = 6;
        for (int i = 0; i < PRODUCT_LIST_SIZE; i++) {
            this.verifyProductNameDynamic(i);
            this.verifyProductImageDynamic(i);
            this.verifyProductDescriptionDynamic(i);
            this.verifyProductPriceDynamic(i);
            this.verifyProductAddToCartButton(i);
        }
    }
}
