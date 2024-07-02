package com.stepdefinition;

import com.base.BaseClass;
import com.pageobjectmanager.PageObjectManager;

import io.cucumber.java.en.*;

public class TC_1RegisterPageStep extends BaseClass {
	PageObjectManager pom=new PageObjectManager();
	
	@Given("User is on Home Page")
	public void userIsOnHomePage() {
	  
	}
	@Given("User click new user register here link")
	public void userClickNewUserRegisterHereLink() {
	    pom.getRegisterPage().userClickNewUserRegisterHereLink();
	}
	@Then("User Verifying the text {string} in Register Screen")
	public void userVerifyingTheTextInRegisterScreen(String registerPageTitle) {
		pom.getRegisterPage().userVerifyingTheTextInRegisterScreen(registerPageTitle);
	    
	}
	@When("User enter {string},{string},{string},{string},{string}")
	public void userEnter(String userName, String password, String confirmPassword, String fullName, String emailAddress) {
	    pom.getRegisterPage().userEnter(userName, password, confirmPassword, fullName, emailAddress);
	}
	@When("User select the checkbox in TermsConditions field and click the Register button")
	public void userSelectTheCheckboxInTermsConditionsFieldAndClickTheRegisterButton() {
	    pom.getRegisterPage().userSelectTheCheckboxInTermsConditionsFieldAndClickTheRegisterButton();
	}
	@Then("User verify the error message {string}")
	public void userVerifyTheErrorMessage(String captchaErrorMsg) {
	    pom.getRegisterPage().userVerifyTheErrorMessage(captchaErrorMsg);
	    
	}
	@When("User enter {string},{string},{string},{string}")
	public void userEnter(String password, String confirmPassword, String fullName, String emailAddress) {
		pom.getRegisterPage().userEnter(password, confirmPassword, fullName, emailAddress);
	}
	@Then("User verify the username error message is displayed {string}")
	public void userVerifyTheUsernameErrorMessageIsDisplayed(String usernameErrorMsg) {
	    pom.getRegisterPage().userVerifyTheUsernameErrorMessageIsDisplayed(usernameErrorMsg);     
	}
	
	@When("User enter {string},{string},{string},{string} and password field is not filled")
	public void userEnterAndPasswordFieldIsNotFilled(String userName, String confirmPassword, String fullName, String emailAddress) {
	    pom.getRegisterPage().userEnterAndPasswordFieldIsNotFilled(userName, confirmPassword, fullName, emailAddress);
	}
	@Then("User verify the password error message is displayed {string}, {string}")
	public void userVerifyThePasswordErrorMessageIsDisplayed(String passwordErrorMsg,String passwordMismatchErrorMsg) {
		 pom.getRegisterPage().userVerifyThePasswordErrorMessageIsDisplayed(passwordErrorMsg,passwordMismatchErrorMsg);
	}
	@When("User enter {string},{string},{string},{string} and confirm password filed is not filled")
	public void userEnterAndConfirmPasswordFiledIsNotFilled(String userName, String password, String fullName, String emailAddress) {
	    pom.getRegisterPage().userEnterAndConfirmPasswordFiledIsNotFilled(userName, password, fullName, emailAddress);
	}
	@Then("User verify the confirm password error message is displayed {string}")
	public void userVerifyTheConfirmPasswordErrorMessageIsDisplayed(String confirmPasswordErrorMsg) {
	    pom.getRegisterPage().userVerifyTheConfirmPasswordErrorMessageIsDisplayed(confirmPasswordErrorMsg);
	}
	@When("User enter {string},{string},{string},{string} and fullname is not filled")
	public void userEnterAndFullnameIsNotFilled(String userName, String password, String confirmPassword, String emailAddress) {
	    pom.getRegisterPage().userEnterAndFullnameIsNotFilled(userName, password, confirmPassword, emailAddress);
	}
	@Then("User verify the fullname error message is displayed {string}")
	public void userVerifyTheFullnameErrorMessageIsDisplayed(String fullNameErrorMsg) {
	    pom.getRegisterPage().userVerifyTheFullnameErrorMessageIsDisplayed(fullNameErrorMsg);
	}
	@When("User enter {string},{string},{string},{string} and email address is not filled")
	public void userEnterAndEmailAddressIsNotFilled(String userName, String password, String confirmPassword, String fullName) {
	 pom.getRegisterPage().userEnterAndEmailAddressIsNotFilled(userName, password, confirmPassword, fullName);  
	}
	@Then("User verify the email address error message is displayed {string}")
	public void userVerifyTheEmailAddressErrorMessageIsDisplayed(String emailAddressErrorMsg) {
	    pom.getRegisterPage().userVerifyTheEmailAddressErrorMessageIsDisplayed(emailAddressErrorMsg);
	}
	@When("User click the Register button")
	public void userClickTheRegisterButton() {
	    pom.getRegisterPage().userClickTheRegisterButton();
	}
	@Then("User verify the Terms and Conditions error message is displayed {string}")
	public void userVerifyTheTermsAndConditionsErrorMessageIsDisplayed(String termsAndConditionsErrorMsg) {
	   pom.getRegisterPage().userVerifyTheTermsAndConditionsErrorMessageIsDisplayed(termsAndConditionsErrorMsg);
	}
	@When("User without enter the value for all the fields, click the Register button")
	public void userWithoutEnterTheValueForAllTheFieldsClickTheRegisterButton() {
	    pom.getRegisterPage().userWithoutEnterTheValueForAllTheFieldsClickTheRegisterButton();
	}
	@Then("User verify all the error messages {string},{string},{string},{string},{string},{string},{string}")
	public void userVerifyAllTheErrorMessages(String usernameErrorMsg, String passwordErrorMsg, String confirmPasswordErrorMsg,String fullNameErrorMsg, String emailAddressErrorMsg,String captchaErrorMsg, String termsAndConditionsErrorMsg) {
	   pom.getRegisterPage().userVerifyAllTheErrorMessages(usernameErrorMsg, passwordErrorMsg, confirmPasswordErrorMsg, fullNameErrorMsg, emailAddressErrorMsg, captchaErrorMsg, termsAndConditionsErrorMsg);
	}
	@Then("User verify the error message is displayed in username field {string}")
	public void userVerifyTheErrorMessageIsDisplayedInUsernameField(String usernamerInvalidErrorMsg) {
	   pom.getRegisterPage().userVerifyTheErrorMessageIsDisplayedInUsernameField(usernamerInvalidErrorMsg);
	}
	@Then("User verify the password invalid error message is displayed {string}")
	public void userVerifyThePasswordInvalidErrorMessageIsDisplayed(String passwordInvalidErrorMsg) {
	    pom.getRegisterPage().userVerifyThePasswordInvalidErrorMessageIsDisplayed(passwordInvalidErrorMsg);
	}
	@When("User click the Reset button")
	public void userClickTheResetButton() {
	    pom.getRegisterPage().userClickTheResetButton();
	}
	@Then("User verify the register form is reseted")
	public void userVerifyTheRegisterFormIsReseted() {
	    pom.getRegisterPage().userVerifyTheRegisterFormIsReseted();
	}
	
	
}
