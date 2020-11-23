package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class SearchPagePojo extends BaseClass {

	
	public SearchPagePojo() {
		
		PageFactory.initElements(driver, this);
		
	}	
	public WebElement getSearchBar() {
		return searchBar;
	}
	@FindBy(name="q")
	private WebElement searchBar;

	public WebElement getLoginPage() {
		return loginPage;
	}
	@FindBy(xpath="//a[contains(text(),'Login')]")
	private WebElement loginPage;
	

	@FindBy(className="_2AkmmA _29YdH8")
	private WebElement userLogin;

	public WebElement getUserLogin() {
		return userLogin;
	}
	
	
	
}
