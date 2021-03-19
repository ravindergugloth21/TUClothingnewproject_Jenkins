package com.pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.runner.BaseClass;



public class StoreLocatorPage extends BaseClass {
	public static By STORELOCATORLINK=By.cssSelector("a[href='/store-finder']");
	public static By POSTCODEINPUT=By.cssSelector("input[placeholder='Postcode or town']");
	public static By FINDSTORE=By.cssSelector("button[class='ln-c-button ln-c-button--primary']");
	public void storeLocatorLink()
	{
		action.clickOnElement(STORELOCATORLINK);
	}
	public void enterPostCode(String postcode)
	{
		action.updateElement(POSTCODEINPUT, postcode);
	}
	public void findStores()
	{
		action.clickOnElement(FINDSTORE);
	}
	public void storeLocatorAssertion()
	{
		//String actual=driver.findElement(By.cssSelector("table[id='store_locator'] [id='header1']")).getText();
		String actual=driver.findElement(By.cssSelector("a[onclick='return false;']")).getText();
		System.out.println(actual);
		
		//Assert.assertTrue(driver.getCurrentUrl().contains(actual));
	}

}
