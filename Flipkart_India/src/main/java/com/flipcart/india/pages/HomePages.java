package com.flipcart.india.pages;



import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.flipcart.india.generic.FileLib;

public class HomePages {
	
	@FindBy(name = "q")
	private WebElement SearchBar;
	
	@FindBy(xpath ="//div[text()='Brand']")
	private WebElement BrandDropdown;
	
	@FindBy(xpath ="//div[text()='boAt']")
	private WebElement boAtFilterOpn;
	
	@FindBy(xpath ="//div[text()='4★ & above']")
	private WebElement RatingsFilterOpn;
	
	@FindBy(xpath ="(//div[@data-id]//a)[1]")
	private WebElement firstProduct;
	
	@FindBy(xpath = "//div[contains(text(),'Available offers')]")
	private WebElement availableOffersHeading;

	@FindBy(xpath = "//div[contains(text(),'Available offers')]/ancestor::div[1]/following-sibling::div//li")
	private List<WebElement> offerslist;
	
	@FindBy(xpath = "//span[contains(text(),'View') and contains(text(),'more offers')]")
	private WebElement viewMoreBtn;

	@FindBy(xpath = "//button[contains(text(),'Add to cart')]")
	private WebElement addToCartBtn;

	@FindBy(xpath = "//*[contains(text(),'Out of Stock') or contains(text(),'OUT OF STOCK')]") 
	private WebElement outOfStockText;
	
	@FindBy(xpath = "//div[@class='FrhiFV']")
	private WebElement MinPriceDropdown;
	
	@FindBy(xpath = "//div[@class='FrhiFV']//option[2]")
	private WebElement setMinPrice;

	@FindBy(xpath = "//div[@class='WoGl7t']")
	private WebElement MaxPriceDropdown;
	
	@FindBy(xpath = "//div[@class='WoGl7t']//option[@value='Max']") 
	private WebElement setMaxPrice;


	
public HomePages(WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}

//Automation Task

public void setSearchBar() throws IOException {
	SearchBar.click();
	FileLib cls = new FileLib();
	String ProdectName = cls.readPropertyData("ProdectName"); // Retrieving data from properties file
	SearchBar.sendKeys(ProdectName);
	SearchBar.submit();
}

public void setFiltersAddingBoAt() {
	BrandDropdown.click();
	boAtFilterOpn.click();
}

public void setFilterAddingRatting() {
	RatingsFilterOpn.click();
}

public void setLow_to_High_Price_Filter() throws InterruptedException {
	MinPriceDropdown.click(); Thread.sleep(1000);
	setMinPrice.click(); Thread.sleep(1000);
	MaxPriceDropdown.click(); Thread.sleep(1000);
	setMaxPrice.click(); Thread.sleep(1000);
}

public void setFirstProdect() {
	firstProduct.click();
}

public void clickViewMoreAndPrintOffers() throws InterruptedException {

    try {
        if (availableOffersHeading.isDisplayed()) {

            // Click View more offers if visible
            try {
                if (viewMoreBtn.isDisplayed()) {
                    viewMoreBtn.click();
                    Thread.sleep(2000);
                }
            }
            catch (Exception e) {
                // If view more not present, ignore and continue
            }

            int count = offerslist.size();
            System.out.println("Available offers count is: " + count);

            for (WebElement offer : offerslist) {
                System.out.println(offer.getText());
            }
        }
    }
    catch (Exception e) {
        System.out.println("Available offers section not found");
    }
}

// SCENARIO 1: Product is Available

public void clickAddToCart() {
    addToCartBtn.click();
}

//SCENARIO 2: Product is NOT Available

public boolean isAddToCartPresent() {
    try {
        return addToCartBtn.isDisplayed();
    } catch (Exception e) {
        return false;
    }
}

public boolean isAddToCartEnabled() {
    try {
        return addToCartBtn.isEnabled();
    } catch (Exception e) {
        return false;
    }
}

public boolean isOutOfStockDisplayed() {
    try {
        return outOfStockText.isDisplayed();
    } catch (Exception e) {
        return false;
    }
}

}
