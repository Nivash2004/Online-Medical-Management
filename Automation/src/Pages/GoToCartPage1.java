package Pages;

 

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 

public class GoToCartPage1 {

    WebDriver driver;

    By cickOnGoToCart = By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button");
    By clickOnAddItem = By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[3]/div/div[2]/div[2]/div[3]/button");
    By clickOnRemove = By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[3]/div/div[3]/div/div[2]");
    By clickOnCancel = By.xpath("//*[@id=\"container\"]/div/div[1]/div/div[3]/div/div[1]");
    By SearchBox1 = By.name("q");
    By clickOnProduct1 = By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]");

    public GoToCartPage1(WebDriver driver) {
        this.driver = driver;
    }

    // method  To click on go to cart button
    public void cickOnGoToCart() {
        driver.findElement(cickOnGoToCart).click();
    }
    //  method To click on add to button to add the phone insurance
    public void clickOnAddItem() {
        driver.findElement(clickOnAddItem).click();
    }

    // method to click on remove button to remove the cart product
    public void clickOnRemove() {
        driver.findElement(clickOnRemove).click();
    }
    // method click on cancel option to stop the remove
    public void clickOnCancel() {
        driver.findElement(clickOnCancel).click();

 

    }
    // method  enter apple i phone in the search to search the product
    public void Search1(String Keyword) {
        driver.findElement(SearchBox1).sendKeys("APPLE iPhone 14 Pro Max (Deep Purple, 128 GB");
        driver.findElement(SearchBox1).sendKeys(Keys.ENTER);
    }

    //method  click on visible i phone product
    public void clickOnProduct1() {
        driver.findElement(clickOnProduct1).click();
    }

 

    

}