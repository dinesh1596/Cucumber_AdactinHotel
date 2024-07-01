package com.stepdefinition;

import com.base.BaseClass;
import com.pageobjectmanager.PageObjectManager;

import io.cucumber.java.en.*;
import org.junit.Assert;

public class TC_8ForgotPasswordPageStep extends BaseClass{
	
	PageObjectManager pom= new PageObjectManager();
	
	@Then("User click the Forgot Password hyperlink")
	public void userClickTheForgotPasswordHyperlink() {
	     click(pom.getLoginPage().getForgotPasswordLink()); 
	}
	@Then("User verifying the text {string} is displayed")
	public void userVerifyingTheTextIsDisplayed(String forgotpasswordpagetite) {
	    String forgotpasswordpagetile = getText(pom.getLoginPage().getForgotPasswordPageMsg());
	    Assert.assertEquals("Verify the Forgot Password page title", forgotpasswordpagetite , forgotpasswordpagetile);
	}
	@Then("User click the Email Password button")
	public void userClickTheEmailPasswordButton() {
	   pom.getForgotPasswordPage().userClickTheEmailPasswordButton();
	}
	@Then("User verify the error message {string} is displayed without entering email id.")
	public void userVerifyTheErrorMessageIsDisplayedWithoutEnteringEmailId(String withoutEmailErrorMsg) {
	  pom.getForgotPasswordPage().userVerifyTheErrorMessageIsDisplayedWithoutEnteringEmailId(withoutEmailErrorMsg);   
	}
	@When("User enter unregistered {string} in email field")
	public void userEnterUnregisteredInEmailField(String emailID) {
	  pom.getForgotPasswordPage().userEnterUnregisteredInEmailField(emailID);
	}
	@Then("User verify the error message {string} is displayed on entering unregistered email id.")
	public void userVerifyTheErrorMessageIsDisplayedOnEnteringUnregisteredEmailId(String unregisteredEmailErrorMsg) {
		pom.getForgotPasswordPage().userVerifyTheErrorMessageIsDisplayedOnEnteringUnregisteredEmailId(unregisteredEmailErrorMsg);
	    
	}
	@When("User enter invalid {string} in email field")
	public void userEnterInvalidInEmailField(String emailID) {
	   pom.getForgotPasswordPage().userEnterInvalidInEmailField(emailID);
	}
	@Then("User verify the error message {string} is displayed on entering invalid email id.")
	public void userVerifyTheErrorMessageIsDisplayedOnEnteringInvalidEmailId(String invalidEmailErrorMsg) {
	    pom.getForgotPasswordPage().userVerifyTheErrorMessageIsDisplayedOnEnteringInvalidEmailId(invalidEmailErrorMsg);
	}
	@When("User enter {string} in email field")
	public void userEnterInEmailField(String emailID) {
	   pom.getForgotPasswordPage().userEnterInEmailField(emailID);
	}
	@Then("User verify the forgot passwor form is reset")
	public void userVerifyTheForgotPassworFormIsReset() {
	   pom.getForgotPasswordPage().userVerifyTheForgotPassworFormIsReset();
	}

}
