package Testcases;
	 
	import java.io.File;
	import java.io.IOException;
	import java.util.ArrayList;
	import java.util.concurrent.TimeUnit;

	 

	import org.apache.commons.io.FileUtils;
	import org.openqa.selenium.By;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.Keys;
	import org.openqa.selenium.OutputType;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.interactions.Actions;
	import org.testng.Assert;
	import org.testng.annotations.AfterTest;
	import org.testng.annotations.BeforeTest;
	import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

	 

	public class TestNG {
	    private ChromeDriver driver;

	 

	    @BeforeTest
	    public void setUp() {
	        // Set the path of the ChromeDriver executable
	        WebDriverManager.chromedriver().setup();

	 

	        //Create the new instance of chromedriver
	        driver=new ChromeDriver();
	        driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);

	 

	    }
	    @Test
	    public void testAddToCart() throws InterruptedException, IOException {
	        Actions action=new Actions(driver);
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        // Navigate to the Flipkart homepage
	        driver.get("https://www.flipkart.com/");

	 

	        //Screenshots included
	        //include asserts
	        String currentUrl = driver.getCurrentUrl();
	        //System.out.println(currentUrl);
	        Assert.assertEquals("https://www.flipkart.com/", currentUrl);

	 

	        // Get the screenShot
	        File  sourceFile1 = driver.getScreenshotAs(OutputType.FILE);
	        File destFile1 = new File("./Screenshots/imj1.jpg");
	        FileUtils.copyFile(sourceFile1, destFile1);

	 

	        //assert
	        String title=driver.getTitle();
	        //System.out.println(title);
	        Assert.assertEquals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!", title);
	        driver.manage().window().maximize();

	 

	        // To remove the popup message
	        driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();

	 


	        // to enter the text in search bar
	        WebElement search =  driver.findElement(By.name("q"));
	        search.click();

	 


	        //Searching  for the product realme 9 pro
	        action.moveToElement(search).sendKeys("realme 9 Pro 5G (Sunrise Blue, 128 gB)").sendKeys(Keys.ENTER).build().perform();

	 

	        String title1=driver.getTitle();
	        //System.out.println(title1);
	        Assert.assertEquals("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!", title1);

	 


	        //Click on the visible product
	        WebElement clickOnProduct=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]"));
	        action.moveToElement(clickOnProduct).click().perform();
	        String currentUrl1 = driver.getCurrentUrl();
	        //System.out.println(currentUrl1);

	 

	        // Screenshot
	        File  sourceFile2 = driver.getScreenshotAs(OutputType.FILE);
	        File destFile2 = new File("./Screenshots./imj2.jpg");
	        FileUtils.copyFile(sourceFile2, destFile2);

	 

	        // To switch the tabs
	        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	        ArrayList<String> tabs = new ArrayList<String> (driver.getWindowHandles());
	        driver.switchTo().window(tabs.get(1));

	 


	        // Click on the Go to the cart button to add the product to cart
	        WebElement GoToCart=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button"));
	        js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")));
	        action.moveToElement(GoToCart).click().perform();

	 

	        // click on the add item to add another product
	        //WebElement addItem=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div/div[1]/div/div[3]/div/div[2]/div[2]/div[3]/button"));
	        //js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[2]/div/div[1]/div[1]/div/div[3]/div/div[3]/div[1]/div[2]/p")));
	        //action.moveToElement(addItem).click().perform();

	 


	        // To enter the text in search bar at the cart page
	        WebElement search1=driver.findElement(By.name("q"));
	        search1.click();
	        Thread.sleep(3000);
	        // Searching the product APPLE iPhone 14 Pro Max (Deep Purple, 128 GB
	        action.moveToElement(search1).sendKeys("APPLE iPhone 14 Pro Max (Deep Purple, 128 GB)").sendKeys(Keys.ENTER).build().perform();
	        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	 

	        String CurrentUrl2 = driver.getCurrentUrl();

	 

	        Assert.assertEquals("https://www.flipkart.com/search?q=APPLE%20iPhone%2014%20Pro%20Max%20%28Deep%20Purple%2C%20128%20GB%29&otracker=search&otracker1=search&marketplace=FLIPKART&as-show=on&as=off",CurrentUrl2 );

	 


	        //Click on the visible product
	        WebElement name1=driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[2]/div[2]/div/div/div/a/div[2]/div[1]/div[1]"));
	        action.moveToElement(name1).click().perform();

	 

	 

	        //To switch to newly opened tab
	        ArrayList<String> tabs1 = new ArrayList<String> (driver.getWindowHandles());
	        driver.switchTo().window(tabs1.get(2));

	 

	        // screenshot 
	        File  sourceFile3 = driver.getScreenshotAs(OutputType.FILE);
	        File destFile3 = new File("./Screenshots/imj3.jpg");
	        FileUtils.copyFile(sourceFile3, destFile3);

	 

	        //To scroll and press on Go to cart button to add the product to cart
	        WebElement GoToCart1 = driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button"));
	        js.executeScript("arguments[0].scrollIntoView();",driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div[1]/div[1]/div[2]/div/ul/li[1]/button")));
	        action.moveToElement(GoToCart1).click().perform();

	 

	        File  sourceFile4 = driver.getScreenshotAs(OutputType.FILE);
	        File destFile4 = new File("./Screenshots./imj4.jpg");
	        FileUtils.copyFile(sourceFile4, destFile4);
	    }

	 


	    @AfterTest
	    public void tearDown() {
	        // Close the browser
	        driver.quit();
	    }
	}

