package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

import io.cucumber.datatable.DataTable;

import java.util.List;

import org.junit.Assert;

public class LoginPage extends BaseClass{
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath="//td[text()='Existing User Login - Build 1']")
	private WebElement homePageText;
	@FindBy(id = "username")
	private WebElement txtusername;
	@FindBy(id = "password")
	private WebElement txtpassword;
	@FindBy(id = "login")
	private WebElement btnLogin;
	@FindBy(xpath = "//span[text()='Enter Username']")
	private WebElement usernameError;
	@FindBy(xpath = "//span[text()='Enter Password']")
	private WebElement passwordError;
	@FindBy(id="username_show")
	private WebElement loginMsg;
	@FindBy(xpath="//b[text()='Invalid Login details or Your Password might have expired. ']")
	private WebElement usernameInvalid;
	@FindBy(xpath="//a[text()='Forgot Password?']")
	private WebElement forgotPasswordLink;
	@FindBy(xpath="//td[text()='Forgot Password Form ']")
	private WebElement forgotPasswordPageMsg;
	
	
	
	public WebElement getHomePageText() {
		return homePageText;
	}
	public WebElement getTxtusername() {
		return txtusername;
	}
	public WebElement getTxtpassword() {
		return txtpassword;
	}
	public WebElement getBtnLogin() {
		return btnLogin;
	}
	public WebElement getUsernameError() {
		return usernameError;
	}
	public WebElement getPasswordError() {
		return passwordError;
	}
	public WebElement getLoginMsg() {
		return loginMsg;
	}
	public WebElement getUsernameInvalid() {
		return usernameInvalid;
	}
	public WebElement getForgotPasswordLink() {
		return forgotPasswordLink;
	}
	public WebElement getForgotPasswordPageMsg() {
		return forgotPasswordPageMsg;
	}
	
	public void userVerifyingTheTextInHomePage(String homePage) {
		  String homePageText = getText(getHomePageText()); 
		  Assert.assertEquals("Verify home page text", homePage, homePageText);
	}

	public void userEnterAnd(String userName, String password) {
          sendKeys(getTxtusername(), userName);
          sendKeys(getTxtpassword(), password);
	}

	public void userClicksTheLoginButton() {
           click(getBtnLogin());
	}
	public void userShouldBeSuccessfullyLoggedInVerifyTheTextMessage(String loginMsg) {
		String loginMsgText = getAttributeValue(getLoginMsg(),"value"); 
	    Assert.assertEquals("Verify successful login text message", loginMsg, loginMsgText);	   
	}

	public void userVerifyTheInvalidLoginCredentialsErrorMessage(String invalidLogin) {
		String invalidLoginText = getText(getUsernameInvalid()); 
	    Assert.assertEquals("Verify invalid login credentials error message", invalidLogin, invalidLoginText);	
	}
	public void userEnterInvalidUsernameValidPassword(String userName, String password) {
		sendKeys(getTxtusername(), userName);
		sendKeys(getTxtpassword(), password);
	}
	public void userEnter(String password) {
		sendKeys(getTxtpassword(), password);
	}

	public void userVerifyTheUsernameFieldErrorMessage(String usernameErrorMsg) {
		String usernameErrorText = getText(getUsernameError()); 
	    Assert.assertEquals("Verify without username error message", usernameErrorMsg, usernameErrorText);
	}

	public void userEnterTheValueInUsernameFiled(String userName) {
		sendKeys(getTxtusername(), userName);
	}

	public void userVerifyThePasswordFieldErrorMessage(String passwordErrorMsg) {
		String passwordErrorText = getText(getPasswordError()); 
	    Assert.assertEquals("Verify without username error message", passwordErrorMsg, passwordErrorText);
	}

	public void userWithoutEnterUsernameAndPasswordClicksTheLoginButton() {
        click(getBtnLogin());
	}

	public void userClicksTheForgotPasswordLink() {
        click(getForgotPasswordLink());
	}

	public void userVerifyTheForgotPasswordPage(String forgotPasswordPage) {
		String forgotPasswordPageText = getText(getForgotPasswordPageMsg()); 
	    Assert.assertEquals("Verify without username error message", forgotPasswordPage, forgotPasswordPageText);
	}
	
}
