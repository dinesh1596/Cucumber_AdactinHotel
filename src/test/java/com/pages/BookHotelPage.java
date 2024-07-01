package com.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

import io.cucumber.java.en.Then;

public class BookHotelPage extends BaseClass {
	
	public BookHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "username")
	private WebElement txtusername;
	@FindBy(id = "password")
	private WebElement txtpassword;
	@FindBy(id = "login")
	private WebElement btnLogin;
	@FindBy(id="location")
	private WebElement location;
	@FindBy(id="hotels")
	private WebElement hotels;
	@FindBy(id="room_type")
	private WebElement roomType;
	@FindBy(id="room_nos")
	private WebElement room_nos;
	@FindBy(id="datepick_in")
	private WebElement dateIn;
	@FindBy(id="datepick_out")
	private WebElement dateOut;
	@FindBy(id="adult_room")
	private WebElement adultRoom;
	@FindBy(id="child_room")
	private WebElement childRoom;
	@FindBy(id="Submit")
	private WebElement searchBtn;
	@FindBy(id="radiobutton_0")
	private WebElement hotelSelection;
	@FindBy(xpath = "//input[@id='first_name']")
	private WebElement firstname;
	@FindBy(xpath = "//input[@id='last_name']")
	private WebElement lastname;
	@FindBy(xpath = "//textarea[@id='address']")
	private WebElement address;
	@FindBy(xpath = "//input[@id='cc_num']")
	private WebElement ccnum;
	@FindBy(xpath = "//select[@id='cc_type']")
	private WebElement creditcard;
	@FindBy(xpath = "//select[@id='cc_exp_month']")
	private WebElement expirydate;
	@FindBy(xpath = "//select[@id='cc_exp_year']")
	private WebElement expiryyear;
	@FindBy(xpath = "//input[@id='cc_cvv']")
	private WebElement cccvv;
	@FindBy(xpath = "//input[@id='book_now']")
	private WebElement booknow;
	@FindBy(xpath = "//td[text()='Booking Confirmation ']")
	private WebElement bookcom;
	@FindBy(xpath = "//label[text()='Please Enter your First Name']")
	private WebElement firtNameErrorMsg;
	@FindBy(xpath = "//label[text()='Please Enter you Last Name']")
	private WebElement lastNameErrorMsg;
	@FindBy(xpath = "//label[text()='Please Enter your Address']")
	private WebElement billingAddressErrorMsg;
	@FindBy(xpath = "//label[text()='Please Enter your 16 Digit Credit Card Number']")
	private WebElement creditCardNoErrorMsg;
	@FindBy(xpath = "//label[text()='Please Select your Credit Card Type']")
	private WebElement creditCardTypeErrorMsg;
	@FindBy(xpath = "//label[text()='Please Select your Credit Card Expiry Month']")
	private WebElement expiryMonthErrorMsg;
	@FindBy(xpath = "//label[text()='Please Select your Credit Card Expiry Year']")
	private WebElement expiryYearErrorMsg;
	@FindBy(xpath = "//label[text()='Please Enter your Credit Card CVV Number']")
	private WebElement cvvNumberErrorMsg;
	@FindBy(id = "cancel")
	private WebElement cancel;
	@FindBy(xpath="//a[text()='Back']")
	private WebElement backBtn;
	@FindBy(xpath="//td[text()='Book A Hotel ']")
	private WebElement bookHotelTitle;
	@FindBy(id = "order_no")
	private WebElement orderno;
	@FindBy(xpath = "//td[text()='Select Hotel ']")
	private WebElement selecthotel;
	
	
	
	
	public WebElement getLocation() {
		return location;
	}
	public WebElement getHotels() {
		return hotels;
	}
	public WebElement getRoomType() {
		return roomType;
	}
	public WebElement getRoom_nos() {
		return room_nos;
	}
	public WebElement getDateIn() {
		return dateIn;
	}
	public WebElement getDateOut() {
		return dateOut;
	}
	public WebElement getAdultRoom() {
		return adultRoom;
	}
	public WebElement getChildRoom() {
		return childRoom;
	}
	public WebElement getSearchBtn() {
		return searchBtn;
	}
	public WebElement getHotelSelection() {
		return hotelSelection;
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
	public WebElement getSelecthotel() {
		return selecthotel;
	}
	public WebElement getOrderno() {
		return orderno;
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getAddress() {
		return address;
	}
	public WebElement getCcnum() {
		return ccnum;
	}
	public WebElement getCreditcard() {
		return creditcard;
	}
	public WebElement getExpirydate() {
		return expirydate;
	}
	public WebElement getExpiryyear() {
		return expiryyear;
	}
	public WebElement getCccvv() {
		return cccvv;
	}
	public WebElement getBooknow() {
		return booknow;
	}
	public WebElement getBookcom() {
		return bookcom;
	}
	public WebElement getFirtNameErrorMsg() {
		return firtNameErrorMsg;
	}
	public WebElement getLastNameErrorMsg() {
		return lastNameErrorMsg;
	}
	public WebElement getBillingAddressErrorMsg() {
		return billingAddressErrorMsg;
	}
	public WebElement getCreditCardNoErrorMsg() {
		return creditCardNoErrorMsg;
	}
	public WebElement getCreditCardTypeErrorMsg() {
		return creditCardTypeErrorMsg;
	}
	public WebElement getExpiryMonthErrorMsg() {
		return expiryMonthErrorMsg;
	}
	public WebElement getExpiryYearErrorMsg() {
		return expiryYearErrorMsg;
	}
	public WebElement getCvvNumberErrorMsg() {
		return cvvNumberErrorMsg;
	}
	public WebElement getCancel() {
		return cancel;
	}
	public WebElement getBackBtn() {
		return backBtn;
	}
	public WebElement getBookHotelTitle() {
		return bookHotelTitle;
	}
	
	public void userEnters(String firstName, String lastName, String billingAddress, String creditCardNo, String creditCardType, String expiryMonth, String expiryYear, String cvvNumber) {
		sendKeys(getFirstname(), firstName);
		sendKeys(getLastname(), lastName);
		sendKeys(getAddress(), billingAddress);
		sendKeys(getCcnum(), creditCardNo);
		selectByVisibleText(getCreditcard(), creditCardType);
		selectByVisibleText(getExpirydate(), expiryMonth);
		selectByVisibleText(getExpiryyear(), expiryYear);
		sendKeys(getCccvv(), cvvNumber);
	}
	
	public void userClickTheBookNowButton() {
        click(getBooknow());
	}

	public void userVerfiyTheBookingConfirmationPageAndOrderIdIsGenerated(String bookingConform) throws InterruptedException {
		Thread.sleep(5000);
		String bookingConformPage = getText(getBookcom());
		Assert.assertEquals("Verify booking confirmation Page", bookingConform, bookingConformPage);
		String orderIdValue = getAttributeValue(getOrderno(), "Value");
		System.out.println("Order ID: "+orderIdValue);
	}

	public void userVerfiyTheErrorMessageIsDisplayedInAllTheFields(String firtNameError, String lastNameError, String billingAddressError,
			String creditCardNoError, String creditCardTypeError, String expiryDateError, String cvvNumberError) {
		String firtNameErrorMsg = getText(getFirtNameErrorMsg());
		Assert.assertEquals("Verify first name error message", firtNameError, firtNameErrorMsg);
		String lastNameErrorMsg = getText(getLastNameErrorMsg());
		Assert.assertEquals("Verify last name error message", lastNameError, lastNameErrorMsg);
		String billingAddressErrorMsg = getText(getBillingAddressErrorMsg());
		Assert.assertEquals("Verify billing address error message", billingAddressError, billingAddressErrorMsg);
		String creditCardNoErrorMsg = getText(getCreditCardNoErrorMsg());
		Assert.assertEquals("Verify credit card no error message", creditCardNoError, creditCardNoErrorMsg);
		String creditCardTypeErrorMsg = getText(getCreditCardTypeErrorMsg());
		Assert.assertEquals("Verify credit card type error message", creditCardTypeError, creditCardTypeErrorMsg);
		String expiryDateErrorMsg = getText(getExpiryMonthErrorMsg());
		Assert.assertEquals("Verify expiry date error message", expiryDateError, expiryDateErrorMsg);
		String cvvNumberErrorMsg = getText(getCvvNumberErrorMsg());
		Assert.assertEquals("Verify cvv number error message", cvvNumberError, cvvNumberErrorMsg);

	}
	public void userEntersAndFirstNameFieldIsNotFilled(String lastName, String billingAddress, String creditCardNo, String creditCardType, String expiryMonth, String expiryYear, String cvvNumber) {
			sendKeys(getLastname(), lastName);
			sendKeys(getAddress(), billingAddress);
			sendKeys(getCcnum(), creditCardNo);
			selectByVisibleText(getCreditcard(), creditCardType);
			selectByVisibleText(getExpirydate(), expiryMonth);
			selectByVisibleText(getExpiryyear(), expiryYear);
			sendKeys(getCccvv(), cvvNumber);
	}

	public void userVerfiyTheErrorMessageIsDisplayedInFirstNameField(String firtNameError) {
		String firtNameErrorMsg = getText(getFirtNameErrorMsg());
		Assert.assertEquals("Verify first name error message", firtNameError, firtNameErrorMsg);
	}
	
	public void userEntersAndLastNameFieldIsNotFilled(String firstName, String billingAddress, String creditCardNo, String creditCardType, String expiryMonth, String expiryYear, String cvvNumber) {
		sendKeys(getFirstname(), firstName);
		sendKeys(getAddress(), billingAddress);
		sendKeys(getCcnum(), creditCardNo);
		selectByVisibleText(getCreditcard(), creditCardType);
		selectByVisibleText(getExpirydate(), expiryMonth);
		selectByVisibleText(getExpiryyear(), expiryYear);
		sendKeys(getCccvv(), cvvNumber);
	}

	public void userVerfiyTheErrorMessageIsDisplayedInLastNameField(String lastNameError) {
		String lastNameErrorMsg = getText(getLastNameErrorMsg());
		Assert.assertEquals("Verify last name error message", lastNameError, lastNameErrorMsg);
	}
	public void userEntersAndBillingAddressFieldIsNotFilled(String firstName, String lastName, String creditCardNo, String creditCardType, String expiryMonth, String expiryYear, String cvvNumber) {
		sendKeys(getFirstname(), firstName);
		sendKeys(getLastname(), lastName);
		sendKeys(getCcnum(), creditCardNo);
		selectByVisibleText(getCreditcard(), creditCardType);
		selectByVisibleText(getExpirydate(), expiryMonth);
		selectByVisibleText(getExpiryyear(), expiryYear);
		sendKeys(getCccvv(), cvvNumber);
	}
	public void userVerfiyTheErrorMessageIsDisplayedInBillingAddressField(String billingAddressError) {
		String billingAddressErrorMsg = getText(getBillingAddressErrorMsg());
		Assert.assertEquals("Verify billing address error message", billingAddressError, billingAddressErrorMsg);
	}
	public void userEntersAndCreditCardNoFieldIsNotFilled(String firstName, String lastName, String billingAddress, String creditCardType, String expiryMonth, String expiryYear, String cvvNumber) {
		sendKeys(getFirstname(), firstName);
		sendKeys(getLastname(), lastName);
		sendKeys(getAddress(), billingAddress);
		selectByVisibleText(getCreditcard(), creditCardType);
		selectByVisibleText(getExpirydate(), expiryMonth);
		selectByVisibleText(getExpiryyear(), expiryYear);
		sendKeys(getCccvv(), cvvNumber);
	}
	public void userVerfiyTheErrorMessageIsDisplayedInCreditCardNoField(String creditCardNoError) {
		String creditCardNoErrorMsg = getText(getCreditCardNoErrorMsg());
		Assert.assertEquals("Verify credit card no error message", creditCardNoError, creditCardNoErrorMsg);
	}

	public void userEntersAndCreditCardTypeFieldIsNotFilled(String firstName, String lastName, String billingAddress, String creditCardNo, String expiryMonth, String expiryYear, String cvvNumber) {
		sendKeys(getFirstname(), firstName);
		sendKeys(getLastname(), lastName);
		sendKeys(getAddress(), billingAddress);
		sendKeys(getCcnum(), creditCardNo);
		selectByVisibleText(getExpirydate(), expiryMonth);
		selectByVisibleText(getExpiryyear(), expiryYear);
		sendKeys(getCccvv(), cvvNumber);

	}
	
	public void userVerfiyTheErrorMessageIsDisplayedInCreditCardTypeField(String creditCardTypeError) {
		String creditCardTypeErrorMsg = getText(getCreditCardTypeErrorMsg());
		Assert.assertEquals("Verify credit card type error message", creditCardTypeError, creditCardTypeErrorMsg);  
	}

	public void userEntersAndExpiryMonthFieldIsNotFilled(String firstName, String lastName, String billingAddress, String creditCardNo, String creditCardType, String expiryYear, String cvvNumber) {
		sendKeys(getFirstname(), firstName);
		sendKeys(getLastname(), lastName);
		sendKeys(getAddress(), billingAddress);
		sendKeys(getCcnum(), creditCardNo);
		selectByVisibleText(getCreditcard(), creditCardType);
		selectByVisibleText(getExpiryyear(), expiryYear);
		sendKeys(getCccvv(), cvvNumber);

	}
	public void userVerfiyTheErrorMessageIsDisplayedInExpiryMonthField(String expiryMonthError) {
		String expirymonthErrorMsg = getText(getExpiryMonthErrorMsg());
		Assert.assertEquals("Verify expiry month error message", expiryMonthError, expirymonthErrorMsg);
	}
	public void userEntersAndExpiryYearFieldIsNotFilled(String firstName, String lastName, String billingAddress, String creditCardNo, String creditCardType, String expiryMonth, String cvvNumber) {
		sendKeys(getFirstname(), firstName);
		sendKeys(getLastname(), lastName);
		sendKeys(getAddress(), billingAddress);
		sendKeys(getCcnum(), creditCardNo);
		selectByVisibleText(getCreditcard(), creditCardType);
		selectByVisibleText(getExpirydate(), expiryMonth);
		sendKeys(getCccvv(), cvvNumber);
	}

	public void userVerfiyTheErrorMessageIsDisplayedInExpiryYearField(String expiryYearError) {
		String expiryYearErrorMsg = getText(getExpiryYearErrorMsg());
		Assert.assertEquals("Verify expiry year error message", expiryYearError, expiryYearErrorMsg);
	}
	public void userEntersAndExpiryDateFieldIsNotFilled(String firstName, String lastName, String billingAddress, String creditCardNo, String creditCardType, String cvvNumber) {
			sendKeys(getFirstname(), firstName);
			sendKeys(getLastname(), lastName);
			sendKeys(getAddress(), billingAddress);
			sendKeys(getCcnum(), creditCardNo);
			selectByVisibleText(getCreditcard(), creditCardType);
			sendKeys(getCccvv(), cvvNumber);
	}

	public void userVerfiyTheErrorMessageIsDisplayedInExpiryDateField(String expiryDateError) {
		String expiryDateErrorMsg = getText(getExpiryMonthErrorMsg());
		Assert.assertEquals("Verify expiry month error message", expiryDateError, expiryDateErrorMsg);
	}
    public void userEntersAndCVVNumberFieldIsNotFilled(String firstName, String lastName, String billingAddress, String creditCardNo, String creditCardType, String expiryMonth,String expiryYear) {
			sendKeys(getFirstname(), firstName);
			sendKeys(getLastname(), lastName);
			sendKeys(getAddress(), billingAddress);
			sendKeys(getCcnum(), creditCardNo);
			selectByVisibleText(getCreditcard(), creditCardType);
			selectByVisibleText(getExpirydate(), expiryMonth);
			selectByVisibleText(getExpiryyear(), expiryYear);
	}

	public void userVerfiyTheErrorMessageIsDisplayedInCVVNumberField(String cvvNumberError) {
		String cvvNumberErrorMsg = getText(getCvvNumberErrorMsg());
		Assert.assertEquals("Verify cvv number error message", cvvNumberError, cvvNumberErrorMsg);
	}

	public void userEntersAndGiveInvalidCreditCardNo(String firstName, String lastName, String billingAddress, String creditCardNo, String creditCardType, String expiryMonth, String expiryYear, String cvvNumber) {
		sendKeys(getFirstname(), firstName);
		sendKeys(getLastname(), lastName);
		sendKeys(getAddress(), billingAddress);
		sendKeys(getCcnum(), creditCardNo);
		selectByVisibleText(getCreditcard(), creditCardType);
		selectByVisibleText(getExpirydate(), expiryMonth);
		selectByVisibleText(getExpiryyear(), expiryYear);
		sendKeys(getCccvv(), cvvNumber);  
	}

	public void userVerfiyTheSelectHotelPage(String selectHotel) {
		String  selectHotelPage = getText(getSelecthotel());
		Assert.assertEquals("Verify select hotel page", selectHotel, selectHotelPage);
	}
	public void userClickTheBackButton() {
		   click(getBackBtn());
    }

}
