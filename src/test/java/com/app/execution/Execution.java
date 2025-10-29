package com.app.execution;

import org.openqa.selenium.WebElement;

import com.app.base.BaseClass;
import com.app.locator.Locator;

public class Execution  extends Locator{
	public static void browser() {
		BaseClass.launchBrowser("Chrome");
	}
	public static void url() {
		BaseClass.loadURL("https://www.bobcat.com/in/en");
	}
	public static void alert() {
		BaseClass.clickElement(getalert());
	}
public static void equipment() {
	BaseClass.clickElement(getequipment());
}
public static void loder() {
// WebElement getloders = getloders();
// System.out.println(getloders.getText());
System.out.println(getloders().getText());
}
public static void equipment1() {
	BaseClass.clickElement(getequipment());
}
}
