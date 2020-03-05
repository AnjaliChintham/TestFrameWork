package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Login_page {
	WebDriver driver;
	By MyAccount=By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/a[2]/span[2]");
	By Login=By.xpath("/html/body/div[1]/header/div/div[1]/div[4]/div[3]/div[2]/div/div[1]/div/a/span");

	By Email=By.xpath("/html/body/div[1]/div[1]/div[2]/div/div[2]/div/div[1]/form/div/div/div/div[1]/input[1]");
	By password=By.xpath("//*[@id=\"ap_password\"]");
	By Loginbutton=By.xpath("//*[@id=\"signInSubmit\"]");
	public  Login_page(WebDriver driver)
	{
		this.driver=driver;
	}
	public void Profile_page()
	{
		driver.findElement(MyAccount).click();
	}
	
	public void Login_toApp()
	{
		WebElement a=driver.findElement(Login);
		
		Actions action=new Actions(driver);
		

		action.moveToElement(a).click().build().perform();

		
	}
	public void Login_toEmail(String phone)
	{
		driver.findElement(Email).sendKeys(phone);
	}
	public void Login_toPassword(String pass)
	{
		driver.findElement(password).sendKeys(pass);
	}
	public void Login_button()
	{
		driver.findElement(Loginbutton).click();
	}

}
