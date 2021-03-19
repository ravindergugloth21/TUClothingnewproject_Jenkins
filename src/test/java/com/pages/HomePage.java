package com.pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.runner.BaseClass;



public class HomePage extends BaseClass{
	public static By SEARCHTEXTBOX=By.cssSelector("input[id='search']");
	
	public void verifyHomePage()
	{
		Assert.assertEquals("https://tuclothing.sainsburys.co.uk/", driver.getCurrentUrl());
	}
	public void searchProduct()
	{
		action.clickOnElement(SEARCHTEXTBOX);
		
	}
	public void product(String productname)
	{
		action.updateElement(SEARCHTEXTBOX, productname);
	
	}

}
