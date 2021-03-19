package com.stepdef;

import java.util.List;
import java.util.Map;

import com.runner.BaseClass;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class RegistrationStepDef extends BaseClass{
	@When("^I click on registration link$")
	public void i_click_on_registration_link() throws Throwable {
	    registrationPage.registrationLink();
	}

	@When("^I click on register$")
	public void i_click_on_register() throws Throwable {
	    registrationPage.clickRegister();
	}

	@When("^I enter values$")
	public void i_enter_values(DataTable userDetails) throws Throwable {
	   List<String>loginDetails=userDetails.asList(String.class); 
	   registrationPage.regDetails(loginDetails);
	}

	@When("^I click terms and conditions$")
	public void i_click_terms_and_conditions() throws Throwable {
	    
	}

	@Then("^I should be able to register$")
	public void i_should_be_able_to_register() throws Throwable {
	    registrationPage.assertionRegistration();
	}
	@When("^I enter values using Map$")
	public void i_enter_values_using_Map(DataTable mapUserDetails) throws Throwable {
		Map<String,String>mapLoginDetails=mapUserDetails.asMap(String.class, String.class);
		
		registrationPage.mapDetails(
				mapLoginDetails.get("email"),
				mapLoginDetails.get("Title"),
				mapLoginDetails.get("FirstName"),
				mapLoginDetails.get("SurName"),
				mapLoginDetails.get("Password"),
				mapLoginDetails.get("ConfirmPassword"));
	    
	}

}