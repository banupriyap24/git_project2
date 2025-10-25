package com.app.pageexe;

import com.app.base.Base;
import com.app.pageobject.BookAHotel_Locators;
import com.app.pageobject.LoginPage_Locator;

public class LoginPageExe extends BookAHotel_Locators {
	
	public static void username() {
		new Base().type(LoginPage_Locator.getUsername(), "");
	}

}
