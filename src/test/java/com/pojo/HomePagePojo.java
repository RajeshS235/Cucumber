package com.pojo;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class HomePagePojo extends BaseClass {

	public HomePagePojo() {
	
	PageFactory.initElements(driver, this);
	
	}
	
	@FindBy(id="email")
	private WebElement userName;

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public WebElement getBtnclick() {
		return btnclick;
	}

	@FindBy(id="pass")
	private WebElement passWord;
	
	@FindBy(xpath="//button[@name='login']")
	private WebElement btnclick;
	
	

}
