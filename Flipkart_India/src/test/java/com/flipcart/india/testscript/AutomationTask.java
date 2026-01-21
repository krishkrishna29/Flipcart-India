package com.flipcart.india.testscript;

import java.util.Set;

import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.flipcart.india.generic.BaseClass;
import com.flipcart.india.pages.HomePages;
import java.io.File;
import java.io.IOException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import com.google.common.io.Files;

@Listeners(com.flipcart.india.generic.ListenerImplements.class)
public class AutomationTask extends BaseClass {
	
	WebDriverWait wait;
	
	@Test(priority = 1)
	public void Print_Available_offers() throws InterruptedException, IOException {
		
		HomePages flipkart = new HomePages(driver);
		
		flipkart.setSearchBar(); Thread.sleep(2000);
		flipkart.setFiltersAddingBoAt(); Thread.sleep(2000);
		flipkart.setFilterAddingRatting(); Thread.sleep(2000); 
		flipkart.setLow_to_High_Price_Filter(); Thread.sleep(2000); 
		
		String parentWindow = driver.getWindowHandle();
		
		flipkart.setFirstProdect(); Thread.sleep(2000);
		
		// If it opens in new tab, switch
        Set<String> allWindows = driver.getWindowHandles();
        for (String win : allWindows) {
            if (!win.equals(parentWindow)) {
                driver.switchTo().window(win);
                break;	            }
        }
        Reporter.log("Clicked first product successfully",true); 
        
        flipkart.clickViewMoreAndPrintOffers();
        
	}

	@Test(priority = 3)
    public void Product_is_Available_AddToCart() throws InterruptedException, IOException {

        HomePages flipkart = new HomePages(driver);

        // SCENARIO 1: Product is Available
        if (flipkart.isAddToCartEnabled()) {

            flipkart.clickAddToCart();
            Thread.sleep(2000);

            // Screenshot
            TakesScreenshot ts = (TakesScreenshot) driver;
            File src = ts.getScreenshotAs(OutputType.FILE);

            File dest = new File("./screenshot/cart_result.png");
            Files.copy(src, dest);

            System.out.println("Screenshot saved: cart_result.png");
            Reporter.log("Product available - Added to cart successfully", true);

        } else {
            System.out.println("Add to Cart button not present - Product unavailable");
            Reporter.log("Product unavailable - Add to Cart button not present", true);
        }
    }
	
	  @Test(priority = 2)
	    public void Product_is_Not_Available() throws InterruptedException, IOException {

	        HomePages flipkart = new HomePages(driver);
 			
	        boolean addToCartMissing = !flipkart.isAddToCartPresent();
	        boolean addToCartDisabled = flipkart.isAddToCartPresent() && !flipkart.isAddToCartEnabled();
	        boolean outOfStock = flipkart.isOutOfStockDisplayed();

	        if (addToCartMissing || addToCartDisabled || outOfStock) {

	            Reporter.log("Product unavailable — could not be added to cart.", true);

	            // Screenshot of product page
	            TakesScreenshot ts = (TakesScreenshot) driver;
	            File src = ts.getScreenshotAs(OutputType.FILE);

	            File dest = new File("./screenshot/result.png");
	            Files.copy(src, dest);

	            System.out.println("Screenshot saved: result.png");
	        }else {

	            // Product available case
	            Reporter.log("Product is available Add to Cart is present & enabled.",true);

	            // Optional (recommended): Take screenshot for proof
	            TakesScreenshot ts = (TakesScreenshot) driver;
	            File src = ts.getScreenshotAs(OutputType.FILE);
	            File dest = new File("./screenshot/result.png");
	            Files.copy(src, dest);

	            System.out.println("Screenshot saved: " + dest.getAbsolutePath());
	        }
	    }
}
