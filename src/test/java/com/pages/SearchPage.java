package com.pages;

import org.junit.Assert;
import org.openqa.selenium.By;

import com.runner.BaseClass;


public class SearchPage extends BaseClass {
	
	public static By SEARCH=By.cssSelector("button[class='button searchButton']");
	
	public void searchResult()
	{
		action.clickOnElement(SEARCH);
		Assert.assertEquals("Search results for: Dress | Tu clothing", driver.getTitle());
	}
	public void searchResult(String result)
	{
		action.clickOnElement(SEARCH);
		//String actual="https://tuclothing.sainsburys.co.uk/search?text="+keyword+"'";
		
//		String actual = driver.findElement(By.cssSelector("span[class='ln-c-breadcrumbs__item ln-u-font-size-h5 ln-c-breadcrumbs__item--last']")).getText();
//		System.out.println(actual); 
//		Assert.assertEquals(result, actual);
		String actual=driver.getTitle();
		Assert.assertTrue(actual.contains(result));
		
	}

}
