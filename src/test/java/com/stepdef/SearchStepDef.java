package com.stepdef;

import com.runner.BaseClass;

import cucumber.api.java.en.Then;

public class SearchStepDef extends BaseClass{
	@Then("^I should see related \"([^\"]*)\"$")
	public void i_should_see_dress_related_products(String result) throws Throwable {
	    searchPage.searchResult(result);
	}
	@Then("^I should see dress related products$")
	public void i_should_see_dress_related_products() throws Throwable {
		searchPage.searchResult(); 
	}

}
