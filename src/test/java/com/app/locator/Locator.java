package com.app.locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import com.app.base.BaseClass;

public class Locator  extends BaseClass{
	
	public static void launchbrowser() {
BaseClass.launchBrowser("Chrome");
	}
public static void  loadurl() {
	BaseClass.loadURL("https://www.bobcat.com/in/en");
}
public static WebElement getequipment() {
	return driver.findElement(By.xpath("(//div[contains(text(),'Equipment')])[4]"));
}
public static WebElement getloders() {

	return driver.findElement(By.xpath("//ul[@aria-label='Loaders']"));
}
public static WebElement getalert() {
	return driver.findElement(By.xpath("//button[@aria-label='Close'][1]"));
	
}
}
