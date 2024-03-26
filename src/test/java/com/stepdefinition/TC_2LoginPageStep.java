package com.stepdefinition;

import com.base.BaseClass;
import com.pageobjectmanager.PageObjectManager;

import io.cucumber.java.en.*;

public class TC_2LoginPageStep extends BaseClass {
	
	PageObjectManager pom=new PageObjectManager();
	
	@Then("User Verifying the text {string} in Home Page")
	public void userVerifyingTheTextInHomePage(String homePage) {
	   pom.getLoginPage().userVerifyingTheTextInHomePage(homePage);
	}
	@When("User enter {string},{string}")
	public void userEnter(String userName, String password) {
		pom.getLoginPage().userEnter(userName,password);
	   
	}
	@When("User clicks the login button")
	public void userClicksTheLoginButton() {
	    pom.getLoginPage().userClicksTheLoginButton();
	}
	@Then("User should be successfully logged in, verify the text message  {string}")
	public void userShouldBeSuccessfullyLoggedInVerifyTheTextMessage(String loginMsg) {
	   pom.getLoginPage().userShouldBeSuccessfullyLoggedInVerifyTheTextMessage(loginMsg);
	}
	@Then("User verify the invalid login credentials error message  {string}")
	public void userVerifyTheInvalidLoginCredentialsErrorMessage(String invalidLoginText) {
	    pom.getLoginPage().userVerifyTheInvalidLoginCredentialsErrorMessage(invalidLoginText);
	}
	@When("User enter invalid username, valid password {string},{string}")
	public void userEnterInvalidUsernameValidPassword(String userName, String password) {
	   pom.getLoginPage().userEnterInvalidUsernameValidPassword(userName, password);
	}
	@When("User enter {string}")
	public void userEnter(String password) {
		pom.getLoginPage().userEnter(password);
	}
	@Then("User verify the username field error message {string}")
	public void userVerifyTheUsernameFieldErrorMessage(String usernameErrorMsg) {
		pom.getLoginPage().userVerifyTheUsernameFieldErrorMessage(usernameErrorMsg);
	}
	@When("User enter the value in username filed {string}")
	public void userEnterTheValueInUsernameFiled(String userName) {
	    pom.getLoginPage().userEnterTheValueInUsernameFiled(userName);
	}
	@Then("User verify the password field error message {string}")
	public void userVerifyThePasswordFieldErrorMessage(String passwordErrorMsg) {
	    pom.getLoginPage().userVerifyThePasswordFieldErrorMessage(passwordErrorMsg);
	}
	@When("User without enter username and password, clicks the login button")
	public void userWithoutEnterUsernameAndPasswordClicksTheLoginButton() {
	    pom.getLoginPage().userWithoutEnterUsernameAndPasswordClicksTheLoginButton();
	}
	@When("User clicks the Forgot Password link")
	public void userClicksTheForgotPasswordLink() {
	    pom.getLoginPage().userClicksTheForgotPasswordLink();
	}
	@Then("User verify the Forgot password page {string}")
	public void userVerifyTheForgotPasswordPage(String forgotPasswordPage) {
	    pom.getLoginPage().userVerifyTheForgotPasswordPage(forgotPasswordPage);
	}
}
