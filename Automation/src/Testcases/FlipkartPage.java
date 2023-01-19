package Testcases;

import java.io.IOException;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import Pages.FilpkartSearchPage;
import Pages.GoToCartPage1;
import Pages.GoToCartPage2;
import org.testng.Assert;
import io.github.bonigarcia.wdm.WebDriverManager;

 


public class FlipkartPage {
    WebDriver driver;
    @BeforeTest
    public void setUp() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.flipkart.com/");
        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
    }
    @DataProvider(name = "test1") public Object[] createData1() throws IOException, InterruptedException { 
        Object data1[] = new Object[0]; 
        ReadExcel read= new ReadExcel(); 
        data1 = read.read(); 
        return data1;
    }
    @Test(dataProvider = "test1")
    public void FlipkartPageTest(String Keyword)throws Exception{
        Actions action=new Actions(driver);
        JavascriptExecutor js = (JavascriptExecutor) driver;

 

        FilpkartSearchPage  search = new FilpkartSearchPage(driver);
        GoToCartPage1 cart1 = new GoToCartPage1(driver);
        GoToCartPage2 cart2 = new GoToCartPage2(driver);

 


        //To close the popup
        search.closePopup();

 

        //To maximize the window
        driver.manage().window().maximize();

 

        //To open the search bar
        search.search(Keyword);
        ;
        //To search the producr realme 9 pro
        search.clickOnProduct();

 


        //navigate to another tab
        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

 

        // Click on Go to cart button
        cart1.cickOnGoToCart();

 


        // To scroll upto cilck on add item
        //js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[3]/div/div[4]")));
        // To click on another product in add to cart page
        //cart1.clickOnAddItem();
        // To scroll upto cilck on remove button
        //js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[3]/div/div[2]/div[1]/div[2]/p")));
        //To click on remove button
        //cart1.clickOnRemove();
        //js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[3]/div/div[2]")));
        //Click on cancel button
        //cart1.clickOnCancel();

 

        Thread.sleep(30000);
        // to search the APPLE iPhone 14 Pro Max (Deep Purple, 128 GB)
        cart1.Search1(Keyword);
        // Click on APPLE iPhone 14 Pro Max (Deep Purple, 128 GB)
        cart1.clickOnProduct1();

 


        //Navigate to the another tab
        ArrayList<String> tabs1 = new ArrayList<String> (driver.getWindowHandles());
        driver.switchTo().window(tabs1.get(2));

 

        // Click on the Go to the cart to add APPLE iPhone 14 Pro Max (Deep Purple, 128 GB)
        cart2.GoToCart1();

 

 


    }

 

    @AfterTest
    public void tearDown() throws Exception {
        driver.quit();
    }
}