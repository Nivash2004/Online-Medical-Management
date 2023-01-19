package Pages;

 

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

 

public class FilpkartSearchPage {

    WebDriver driver;


    By SearchBox = By.name("q");
    By closePopup = By.xpath("/html/body/div[2]/div/div/button");
    By clickOnProduct = By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]");



    public FilpkartSearchPage(WebDriver driver) {
        this.driver = driver;
    }

    // to Enter realme 9 pro in the search bar
    public void search(String Keyword) {
        driver.findElement(SearchBox).sendKeys("realme 9 Pro 5G (Sunrise Blue, 128 GB)");
        driver.findElement(SearchBox).sendKeys(Keys.ENTER);


    }

    //Close the popup
    public void closePopup( ) {
        driver.findElement(closePopup).click();
    }

    //Click on the realme 9 pro
    public void clickOnProduct() {
        driver.findElement(clickOnProduct).click();
    }

}