package com.pages;

import java.util.List;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.runner.BaseClass;

public class RegistrationPage extends BaseClass{
	public static By REGISTRATIONLINK=By.cssSelector("a[href='/login']");
	public static By REGISTERBUTTON=By.cssSelector("button[class='ln-c-button ln-c-button--primary regToggle']");
	public static By EMAILID=By.cssSelector("input[id='register_email']");
	public static By FIRSTNAME=By.cssSelector("input[id='register_firstName']");
	public static By SURNAME=By.cssSelector("input[id='register_lastName']");
	public static By PASSWORD=By.cssSelector("input[id='password']");
	public static By CONFIRMPASSWORD=By.cssSelector("input[id='register_checkPwd']");
	public static By TITLE=By.cssSelector("select[id='register_title']");
	public static By TERMSANDCONDITIONS=By.cssSelector("input[data-testid='registrationTandC']");
	public static By COMPLETEREGISTRATION=By.cssSelector("button[class='ln-c-button ln-c-button--primary tuButton']");
	
	
	public void registrationLink()
	{
		action.clickOnElement(REGISTRATIONLINK);
	}
	public void clickRegister()
	{
		action.clickOnElement(REGISTERBUTTON);
	}
	public void regDetails(List<String>loginDetails)
	{
		action.updateElement(EMAILID,loginDetails.get(0));
		//driver.findElement(TITLE);
		Select title=new Select(driver.findElement(TITLE));
		title.selectByIndex(1);		
		action.updateElement(FIRSTNAME, loginDetails.get(2));
		action.updateElement(SURNAME, loginDetails.get(3));
		action.updateElement(PASSWORD, loginDetails.get(4));
		action.updateElement(CONFIRMPASSWORD, loginDetails.get(5));
		action.clickOnElement(COMPLETEREGISTRATION);
		
		
	}
	public void mapDetails(String email,String Title,String FirstName,String SurName,String Password,String ConfirmPassword)
	{
		action.updateElement(EMAILID,email);
		//driver.findElement(TITLE);
		Select title=new Select(driver.findElement(TITLE));
		title.selectByIndex(1);		
		action.updateElement(FIRSTNAME, FirstName);
		action.updateElement(SURNAME, SurName);
		action.updateElement(PASSWORD, Password);
		action.updateElement(CONFIRMPASSWORD, ConfirmPassword);
		action.clickOnElement(COMPLETEREGISTRATION);
	}
	public void assertionRegistration()
	{
		Assert.assertEquals("https://tuclothing.sainsburys.co.uk/login", driver.getCurrentUrl());
	}

}
