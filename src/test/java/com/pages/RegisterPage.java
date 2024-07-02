package com.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class RegisterPage extends BaseClass {

	public RegisterPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//a[text()='New User Register Here']")
	private WebElement registerationLink;
	@FindBy(id = "username")
	private WebElement userName;
	@FindBy(id = "password")
	private WebElement passWord;
	@FindBy(id = "re_password")
	private WebElement confirmPassword;
	@FindBy(id = "full_name")
	private WebElement fullName;
	@FindBy(id = "email_add")
	private WebElement emailAddress;
	@FindBy(id = "tnc_box")
	private WebElement termsConditionsCheckbox;
	@FindBy(id = "Submit")
	private WebElement registerButton;
	@FindBy(id = "Reset")
	private WebElement resetButton;
	@FindBy(xpath = "//a[text()='Terms & Conditions']")
	private WebElement termsConditionsLink;
	@FindBy(xpath = "//a[text()='Go back to Login page']")
	private WebElement loginPageLink;
	@FindBy(xpath = "//label[text()='Captcha is Empty']")
	private WebElement captachaErrorMsg;
	@FindBy(xpath = "//label[text()='Username is Empty']")
	private WebElement usernameErrorMsg;
	@FindBy(xpath = "//label[text()='Password is Empty']")
	private WebElement passwordErrorMsg;
	@FindBy(xpath = "//label[text()='Confirm Password is Empty']")
	private WebElement confirmPasswordErrorMsg;
	@FindBy(xpath = "//label[text()='Full Name is Empty']")
	private WebElement fullNameErrorMsg;
	@FindBy(xpath = "//label[text()='Email Address is Empty']")
	private WebElement emailAddressErrorMsg;
	@FindBy(xpath = "//label[text()= 'You must agree to Terms and Conditions']")
	private WebElement termsConditionsCheckboxErrorMsg;
	@FindBy(xpath = "//label[text()= 'Username must contain minimum 8 characters']")
	private WebElement usernamerInvalidErrorMsg;
	@FindBy(xpath = "//label[text()= 'Password must contain minimum 6 characters']")
	private WebElement passwordInvalidErrorMsg;
	@FindBy(xpath = "//label[text()= 'Passwords Do Not Match']")
	private WebElement confirmPasswordInvalidErrorMsg;
	@FindBy(xpath = "//label[text()= 'Invalid email, Please enter correct email.']")
	private WebElement emailInvalidErrorMsg;
	@FindBy(xpath = "//td[text()='New User Registration Form ']")
	private WebElement registerPageTitle;
	@FindBy(id = "captcha")
	private WebElement captcha;
	
	
	
	public WebElement getCaptcha() {
		return captcha;
	}
	public WebElement getRegisterPageTitle() {
		return registerPageTitle;
	}

	public WebElement getRegisterationLink() {
		return registerationLink;
	}

	public WebElement getUserName() {
		return userName;
	}

	public WebElement getPassWord() {
		return passWord;
	}

	public WebElement getConfirmPassword() {
		return confirmPassword;
	}

	public WebElement getFullName() {
		return fullName;
	}

	public WebElement getEmailAddress() {
		return emailAddress;
	}

	public WebElement getTermsConditionsCheckbox() {
		return termsConditionsCheckbox;
	}

	public WebElement getRegisterButton() {
		return registerButton;
	}

	public WebElement getResetButton() {
		return resetButton;
	}

	public WebElement getTermsConditionsLink() {
		return termsConditionsLink;
	}

	public WebElement getLoginPageLink() {
		return loginPageLink;
	}

	public WebElement getCaptachaErrorMsg() {
		return captachaErrorMsg;
	}

	public WebElement getUsernameErrorMsg() {
		return usernameErrorMsg;
	}

	public WebElement getPasswordErrorMsg() {
		return passwordErrorMsg;
	}

	public WebElement getConfirmPasswordErrorMsg() {
		return confirmPasswordErrorMsg;
	}

	public WebElement getFullNameErrorMsg() {
		return fullNameErrorMsg;
	}

	public WebElement getEmailAddressErrorMsg() {
		return emailAddressErrorMsg;
	}

	public WebElement getTermsConditionsCheckboxErrorMsg() {
		return termsConditionsCheckboxErrorMsg;
	}

	public WebElement getUsernamerInvalidErrorMsg() {
		return usernamerInvalidErrorMsg;
	}

	public WebElement getPasswordInvalidErrorMsg() {
		return passwordInvalidErrorMsg;
	}

	public WebElement getConfirmPasswordInvalidErrorMsg() {
		return confirmPasswordInvalidErrorMsg;
	}

	public WebElement getEmailInvalidErrorMsg() {
		return emailInvalidErrorMsg;
	}

	public void userClickNewUserRegisterHereLink() {
		click(getRegisterationLink());
	}

	public void userVerifyingTheTextInRegisterScreen(String registerPageTitle) {
		String registerPageTitleText = getText(getRegisterPageTitle());
		Assert.assertEquals("Verify Register Page Title", registerPageTitle, registerPageTitleText);
	}

	public void userEnter(String userName, String password, String confirmPassword, String fullName,
			String emailAddress) {
		sendKeys(getUserName(), userName);
		sendKeys(getPassWord(), password);
		sendKeys(getConfirmPassword(), confirmPassword);
		sendKeys(getFullName(), fullName);
		sendKeys(getEmailAddress(), emailAddress);
	}

	public void userSelectTheCheckboxInTermsConditionsFieldAndClickTheRegisterButton() {
		click(getTermsConditionsCheckbox());
		click(getRegisterButton());
	}

	public void userVerifyTheErrorMessage(String captchaErrorMsg) {
		String captachaErrorMsgText = getText(getCaptachaErrorMsg());
		Assert.assertEquals("Verify Captcha Error Message", captchaErrorMsg, captachaErrorMsgText);
	}

	public void userEnter(String password, String confirmPassword, String fullName, String emailAddress) {
		sendKeys(getPassWord(), password);
		sendKeys(getConfirmPassword(), confirmPassword);
		sendKeys(getFullName(), fullName);
		sendKeys(getEmailAddress(), emailAddress);
	}

	public void userVerifyTheUsernameErrorMessageIsDisplayed(String usernameErrorMsg) {
		String usernameErrorMsgText = getText(getUsernameErrorMsg());
		Assert.assertEquals("Verify Username Error Message", usernameErrorMsg, usernameErrorMsgText);
	}

	public void userEnterAndPasswordFieldIsNotFilled(String userName, String confirmPassword, String fullName, String emailAddress) {
		sendKeys(getUserName(),userName);
		sendKeys(getConfirmPassword(), confirmPassword);
		sendKeys(getFullName(), fullName);
		sendKeys(getEmailAddress(), emailAddress);
	}
	public void userVerifyThePasswordErrorMessageIsDisplayed(String passwordErrorMsg, String passwordMismatchErrorMsg) {
		String passwordErrorMsgText = getText(getPasswordErrorMsg());
		Assert.assertEquals("Verify password Error Message", passwordErrorMsg, passwordErrorMsgText);
		String passwordMismatchErrorMsgText = getText(getConfirmPasswordInvalidErrorMsg());
		Assert.assertEquals("Verify password Error Message", passwordMismatchErrorMsg, passwordMismatchErrorMsgText);
	}

	public void userEnterAndConfirmPasswordFiledIsNotFilled(String userName, String password, String fullName,String emailAddress) {
		sendKeys(getUserName(),userName);
		sendKeys(getPassWord(), password);
		sendKeys(getFullName(), fullName);
		sendKeys(getEmailAddress(), emailAddress);
	}

	public void userVerifyTheConfirmPasswordErrorMessageIsDisplayed(String confirmPasswordErrorMsg) {
		String confirmPasswordErrorMsgText = getText(getConfirmPasswordErrorMsg());
		Assert.assertEquals("Verify confirm password Error Message", confirmPasswordErrorMsg, confirmPasswordErrorMsgText);
	}

	public void userEnterAndFullnameIsNotFilled(String userName, String password, String confirmPassword, String emailAddress) {
		sendKeys(getUserName(),userName);
		sendKeys(getPassWord(), password);
		sendKeys(getConfirmPassword(), confirmPassword);
		sendKeys(getEmailAddress(), emailAddress);
	}

	public void userVerifyTheFullnameErrorMessageIsDisplayed(String fullNameErrorMsg) {
		String fullNameErrorMsgText = getText(getFullNameErrorMsg());
		Assert.assertEquals("Verify fullName Error Message", fullNameErrorMsg, fullNameErrorMsgText);
	}
	public void userEnterAndEmailAddressIsNotFilled(String userName, String password, String confirmPassword, String fullName) {
		sendKeys(getUserName(),userName);
		sendKeys(getPassWord(), password);
		sendKeys(getConfirmPassword(), confirmPassword);
		sendKeys(getFullName(),fullName);
	}
	public void userVerifyTheEmailAddressErrorMessageIsDisplayed(String emailAddressErrorMsg) {
		String emailAddressErrorMsgText = getText(getEmailAddressErrorMsg());
		Assert.assertEquals("Verify emailAddress Error Message", emailAddressErrorMsg, emailAddressErrorMsgText);
	}

	public void userClickTheRegisterButton() {
        click(getRegisterButton());
	}
	public void userVerifyTheTermsAndConditionsErrorMessageIsDisplayed(String termsAndConditionsErrorMsg) {
		String termsAndConditionsErrorMsgText = getText(getTermsConditionsCheckboxErrorMsg());
		Assert.assertEquals("Verify TermsAndConditions Error Message", termsAndConditionsErrorMsg, termsAndConditionsErrorMsgText);
	}

	public void userWithoutEnterTheValueForAllTheFieldsClickTheRegisterButton() {
		click(getRegisterButton());
	}

	public void userVerifyAllTheErrorMessages(String usernameErrorMsg, String passwordErrorMsg, String confirmPasswordErrorMsg,String fullNameErrorMsg, String emailAddressErrorMsg,String captchaErrorMsg, String termsAndConditionsErrorMsg) {
		String usernameErrorMsgText = getText(getUsernameErrorMsg());
		Assert.assertEquals("Verify Username Error Message", usernameErrorMsg, usernameErrorMsgText);
		String passwordErrorMsgText = getText(getPasswordErrorMsg());
		Assert.assertEquals("Verify password Error Message", passwordErrorMsg, passwordErrorMsgText);
		String confirmPasswordErrorMsgText = getText(getConfirmPasswordErrorMsg());
		Assert.assertEquals("Verify confirm password Error Message", confirmPasswordErrorMsg,confirmPasswordErrorMsgText);
		String fullNameErrorMsgText = getText(getFullNameErrorMsg());
		Assert.assertEquals("Verify fullName Error Message", fullNameErrorMsg, fullNameErrorMsgText);
		String emailAddressErrorMsgText = getText(getEmailAddressErrorMsg());
		Assert.assertEquals("Verify emailAddress Error Message", emailAddressErrorMsg, emailAddressErrorMsgText);
		String captachaErrorMsgText = getText(getCaptachaErrorMsg());
		Assert.assertEquals("Verify Captcha Error Message", captchaErrorMsg, captachaErrorMsgText);
		String termsAndConditionsErrorMsgText = getText(getTermsConditionsCheckboxErrorMsg());
		Assert.assertEquals("Verify TermsAndConditions Error Message", termsAndConditionsErrorMsg,termsAndConditionsErrorMsgText);
	}
	public void userVerifyTheErrorMessageIsDisplayedInUsernameField(String usernamerInvalidErrorMsg) {
		String usernamerInvalidErrorMsgText = getText(getUsernamerInvalidErrorMsg());
		Assert.assertEquals("Verify Username Error Message", usernamerInvalidErrorMsg, usernamerInvalidErrorMsgText);
	}

	public void userVerifyThePasswordInvalidErrorMessageIsDisplayed(String passwordInvalidErrorMsg) {
		String passwordInvalidErrorMsgText = getText(getPasswordInvalidErrorMsg());
		Assert.assertEquals("Verify Username Error Message", passwordInvalidErrorMsg, passwordInvalidErrorMsgText);
	}
	
	public void userClickTheResetButton() {
       click(getResetButton());
	}
	
	public void userVerifyTheRegisterFormIsReseted() {
       boolean userName = getUserName().isEnabled();
       System.out.println("Username is empty:"+userName);
       boolean passWord = getPassWord().isEnabled();
       System.out.println("PassWord is empty:"+passWord);  
       boolean confirmPassword = getConfirmPassword().isEnabled();
       System.out.println("ConfirmPassword is empty:"+confirmPassword); 
       boolean fullName= getFullName().isEnabled();
       System.out.println("FullName is empty:"+fullName); 
       boolean emailAddress= getEmailAddress().isEnabled();
       System.out.println("EmailAddress is empty:"+emailAddress);
       boolean captcha= getCaptcha().isEnabled();
       System.out.println("Captcha is empty:"+captcha);
       boolean termsAndConditions= getTermsConditionsCheckbox().isEnabled();
       System.out.println("TermsAndConditions is empty:"+termsAndConditions); 
       
	}
	
	
}
