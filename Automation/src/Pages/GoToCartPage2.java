package Pages;

 

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

 

public class GoToCartPage2 {
    WebDriver driver;
    By GoToCart1 = By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button");

 


    public GoToCartPage2(WebDriver driver) {
        this.driver = driver;
    }

    // Method to click on go to cart option
    public void  GoToCart1() {
        driver.findElement(GoToCart1).click();
    }

 

 

}