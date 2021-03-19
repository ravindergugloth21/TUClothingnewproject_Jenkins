package com.runner;

import org.openqa.selenium.WebDriver;

import com.pages.HomePage;
import com.pages.RegistrationPage;
import com.pages.SearchPage;
import com.pages.StoreLocatorPage;
import com.utility.Actions;

public class BaseClass {
	public static WebDriver driver;
	public static HomePage homePage=new HomePage();
	public static Actions action=new Actions();
	public static SearchPage searchPage=new SearchPage();
	public static RegistrationPage registrationPage=new RegistrationPage();
	public static StoreLocatorPage storeLocator=new StoreLocatorPage();
	

}
