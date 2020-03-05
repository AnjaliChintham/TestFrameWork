package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Search_page {
WebDriver driver;
	
	By Search=By.xpath("/html/body/div[1]/div/div/header/div[2]/div[3]/input");
	By Searchclick=By.xpath("/html/body/div[1]/div/div/header/div[2]/div[3]/div/ul/li[3]");
	
	
	
	public  Search_page(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void AppSearch(String searchp)
	{
		driver.findElement(Search).sendKeys(searchp);
	}
	public void Appclick()
	{
WebElement b=driver.findElement(Searchclick);
		
		Actions action=new Actions(driver);
		

		action.moveToElement(b).click().build().perform();
		
	}
}
