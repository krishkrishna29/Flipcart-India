package com.flipcart.india.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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
	
	
public HomePages(WebDriver driver){
		
		PageFactory.initElements(driver, this);
	}

public void setSearchBar() {
	SearchBar.click();
	SearchBar.sendKeys("Bluetooth Speakers");
	SearchBar.submit();
}

public void setFiltersAdding() {
	BrandDropdown.click();
	boAtFilterOpn.click();
	RatingsFilterOpn.click();
}

public void setFirstProdect() {
	firstProduct.click();
	
}




}
