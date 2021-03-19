package com.stepdef;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import com.runner.BaseClass;

import cucumber.api.java.Before;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Hooks extends BaseClass{
	public static String URL="https://tuclothing.sainsburys.co.uk/";
	public static By COOKIES=By.cssSelector("button[class='ln-c-button ln-c-button--primary ln-u-push-sides']");
	
	@Before
	public void start()
	{
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(URL);
		driver.manage().timeouts().implicitlyWait(40,TimeUnit.SECONDS);
		action.clickOnElement(COOKIES);
	}
	public void tearDown()
	{
		//driver.close();
	}

}
