package com.stepdef;

import com.runner.BaseClass;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StoreLocatorStepDef extends BaseClass {
	@When("^I click on store locator$")
	public void i_click_on_store_locator() throws Throwable {
	    storeLocator.storeLocatorLink();
	}

	@When("^I enter \"([^\"]*)\"$")
	public void i_enter(String postcode) throws Throwable {
	    storeLocator.enterPostCode(postcode);
	}

	@When("^click on find store$")
	public void click_on_find_store() throws Throwable {
	    storeLocator.findStores();
	}

	@Then("^I need to see stores related to my postcode$")
	public void i_need_to_see_stores_related_to_my_postcode() throws Throwable {
	 storeLocator.storeLocatorAssertion();

}
}
