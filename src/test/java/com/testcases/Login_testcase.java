package com.testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.baseclass.WrapperEX;
import com.pages.Login_page;

public class Login_testcase extends WrapperEX {
	@BeforeClass
	public void startup()
	{
		launchApplication("chrome","https://www.amazon.in/");
		
	}
	@Test
	public void login()
	{
		Login_page lpage = new Login_page(driver); // object creation
		lpage.Profile_page(); //clicking profile button
		lpage.Login_toApp();  // login to app
		lpage.Login_toEmail("anjali123@gmail.com"); //entering mobile no
		lpage.Login_toPassword("anjali12"); //entering password
		lpage.Login_button(); //clicking login button
	}
	@AfterClass
	public void logout()
	{
		quit();
	}
}
