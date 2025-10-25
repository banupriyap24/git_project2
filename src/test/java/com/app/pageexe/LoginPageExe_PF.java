package com.app.pageexe;

import com.app.base.Base;
import com.app.pageobject.LoginPage_Locator_PF;

public class LoginPageExe_PF extends LoginPage_Locator_PF{
	
	public static void username() {
		new Base().type(new LoginPage_Locator_PF().getUsername(), "");
	}

}
