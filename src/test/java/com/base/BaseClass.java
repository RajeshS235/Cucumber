package com.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {

	public static WebDriver driver;
	
	public static void browserLaunch() {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	public static void urlLaunch(String url) {
		driver.get(url);
	}
	public static void close() {
		driver.close();

	}
	public static void skipwindow() throws AWTException {
		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ESCAPE);
		r.keyRelease(KeyEvent.VK_ESCAPE);
	}
	
	
	public static void productSearch(WebElement e, String s) {
		e.sendKeys(s);
	}
	public static void fill(WebElement e, int s) {
		e.sendKeys();
	}
	public static void click(WebElement e) {
		e.click();
		
	}
	public static void scriptClick(WebElement a) {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		
	    js.executeScript("argument[0].scrollIntoView(true)", a);
	}
public static void jscriptClick(WebElement a, int b) {
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("argument[0].setAttribute('value', b)", a);
	}
public static void actionClick(WebElement e) {
	Actions a = new Actions(driver);
	a.doubleClick(e);

}

public static void attibutValue(WebElement a, String e) {
	String attribute = a.getAttribute(e);
	System.out.println(attribute);
}


	
	public static void nextWindow() {
		
	String parent = driver.getWindowHandle();
	Set<String> all = driver.getWindowHandles();
	for(String x: all) {
	if(!(parent==x)) {
		driver.switchTo().window(x);
	}
	}
	}
	
	
}
