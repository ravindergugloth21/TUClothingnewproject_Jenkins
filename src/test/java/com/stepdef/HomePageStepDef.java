package com.stepdef;

import com.runner.BaseClass;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;

public class HomePageStepDef extends BaseClass{
	@Given("^I am on HomePage$")
	public void i_am_on_HomePage() throws Throwable {
		homePage.verifyHomePage();
	}

	@When("^I click on search$")
	public void i_click_on_search() throws Throwable {
		homePage.searchProduct();
	}

	@When("^enter \"([^\"]*)\"$")
	public void enter(String productname) throws Throwable {
	    homePage.product(productname);
	}
}
