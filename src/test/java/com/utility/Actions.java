package com.utility;

import org.openqa.selenium.By;

import com.runner.BaseClass;

public class Actions extends BaseClass{
	public void clickOnElement(By element)
	{
		driver.findElement(element).click();
	}
	public void updateElement(By element,String product)
	{
		driver.findElement(element).sendKeys(product);
	}

}
