package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Productdetails_page {
WebDriver driver;
	
	By Addbag=By.xpath("/html/body/div[2]/div/div[1]/main/div[3]/div[2]/div/div[2]/section/ul/li[1]/div[3]/span[1]");
	By Years=By.xpath("/html/body/div[2]/div/div[1]/main/div[3]/div[2]/div/div[2]/section/ul/li[1]/div[4]/div[2]/button[3]]");
	By details=By.xpath("/html/body/div[1]/div/div/header/div[2]/div[2]/a[2]/span[1]");
	
	public  Productdetails_page(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void Productdetails_addc()
	{
		driver.findElement(Addbag).click();
	}
	public void  Productdetails_years()
	{
    WebElement c=driver.findElement(Years);
		
		Actions action=new Actions(driver);
		

		action.moveToElement(c).click().build().perform();
	}
	public void Productdetails_details()
	{
		driver.findElement(details).click();
	}
}
