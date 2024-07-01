package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

import org.junit.Assert;

public class ForgotPasswordPage extends BaseClass{
	
	public ForgotPasswordPage() {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(id="emailadd_recovery")
	private WebElement emailIDTextBox;
	@FindBy(id="Submit")
	private WebElement emailPasswordBtn;
	@FindBy(id="Reset")
	private WebElement resetBtn;
	@FindBy(xpath="//label[text()='Email Address is Empty']")
	private WebElement withoutEmailErrorMsg;
	@FindBy(xpath="//label[text()='Invalid email, Please enter correct email.']")
	private WebElement invalidEmailErrorMsg;
	@FindBy(xpath="//span[text()='Email Address does not exsit in database']")
	private WebElement unregisteredEmailErrorMsg;
	
	
	public WebElement getEmailIDTextBox() {
		return emailIDTextBox;
	}
	public WebElement getEmailPasswordBtn() {
		return emailPasswordBtn;
	}
	public WebElement getResetBtn() {
		return resetBtn;
	}
	public WebElement getWithoutEmailErrorMsg() {
		return withoutEmailErrorMsg;
	}
	public WebElement getInvalidEmailErrorMsg() {
		return invalidEmailErrorMsg;
	}
	public WebElement getUnregisteredEmailErrorMsg() {
		return unregisteredEmailErrorMsg;
	}
	
	
	public void userClickTheEmailPasswordButton() {
	   click(getEmailPasswordBtn());	   
	}

	public void userVerifyTheErrorMessageIsDisplayedWithoutEnteringEmailId(String withoutEmailErrorMsg) {
       String errorMsg1=getText(getWithoutEmailErrorMsg());
       Assert.assertEquals("Verify error message is displayed without email id", withoutEmailErrorMsg, errorMsg1);
	}
	public void userEnterUnregisteredInEmailField(String emailID) {
		sendKeys(getEmailIDTextBox(), emailID);
		click(getEmailPasswordBtn());
	}

	public void userVerifyTheErrorMessageIsDisplayedOnEnteringUnregisteredEmailId(String unregisteredEmailErrorMsg) {
		String errorMsg2=getText(getUnregisteredEmailErrorMsg());
	    Assert.assertEquals("Verify error message is displayed on entering unregistered email id", unregisteredEmailErrorMsg, errorMsg2);   
	}
	
	public void userEnterInvalidInEmailField(String emailID) {
		sendKeys(getEmailIDTextBox(), emailID);	
		click(getEmailPasswordBtn());
	}

	public void userVerifyTheErrorMessageIsDisplayedOnEnteringInvalidEmailId(String invalidEmailErrorMsg) {
		String errorMsg3=getText(getInvalidEmailErrorMsg());
	    Assert.assertEquals("Verify error message is displayed on entering invalid email id", invalidEmailErrorMsg, errorMsg3);
	}

	public void userEnterInEmailField(String emailID) {
		sendKeys(getEmailIDTextBox(), emailID);	
		click(getEmailPasswordBtn());
	}
	public void userVerifyTheForgotPassworFormIsReset() {
		boolean emailIDTestBox = getEmailIDTextBox().isEnabled();
	    System.out.println("Email ID TesxtBox is empty:"+emailIDTestBox);
	}
	
	
	
	
	

}
