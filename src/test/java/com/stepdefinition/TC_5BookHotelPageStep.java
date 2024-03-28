package com.stepdefinition;

import java.util.List;
import java.util.Map;

import com.base.BaseClass;
import com.pageobjectmanager.PageObjectManager;

import io.cucumber.java.en.*;

public class TC_5BookHotelPageStep extends BaseClass{
	
	PageObjectManager pom=new PageObjectManager();
	
	@Then("User enters {string},{string},{string},{string},{string},{string},{string},{string}")
	public void userEnters(String firstName, String lastName, String billingAddress, String creditCardNo, String creditCardType, String expiryMonth, String expiryYear, String cvvNumber) {
	    pom.getBookHotelPage().userEnters(firstName, lastName, billingAddress, creditCardNo, creditCardType, expiryMonth, expiryYear, cvvNumber);
	}
	
	@When("User enter the login credentials")
	public void userEnterTheLoginCredentials(io.cucumber.datatable.DataTable dataTable) {
		List<Map<String, String>> credentials = dataTable.asMaps(String.class, String.class);
		String userName = credentials.get(0).get("userName");
		String password = credentials.get(0).get("password");
		sendKeys(pom.getBookHotelPage().getTxtusername(), userName);
		sendKeys(pom.getBookHotelPage().getTxtpassword(), password);
		}
	@Then("User enter the search hotel details")
	public void userEnterTheSearchHotelDetails(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
		List<Map<String, String>> searchHotelDetails = dataTable.asMaps(String.class, String.class);
		String location = searchHotelDetails.get(0).get("location");
		String hotels = searchHotelDetails.get(0).get("hotels");
		String roomType=searchHotelDetails.get(0).get("roomType");
		String numberOfRooms=searchHotelDetails.get(0).get("numberOfRooms");
		String checkInDate=searchHotelDetails.get(0).get("checkInDate");
		String checkOutDate=searchHotelDetails.get(0).get("checkOutDate");
		String adultperRoom=searchHotelDetails.get(0).get("adultperRoom");
		String childrenPerRoom=searchHotelDetails.get(0).get("childrenPerRoom");
	    selectByVisibleText(pom.getBookHotelPage().getLocation(), location);
		selectByVisibleText(pom.getBookHotelPage().getHotels(), hotels);
		selectByVisibleText(pom.getBookHotelPage().getRoomType(), roomType);
		selectByVisibleText(pom.getBookHotelPage().getRoom_nos(), numberOfRooms);
		clear(pom.getBookHotelPage().getDateIn());
		sendKeys(pom.getBookHotelPage().getDateIn(), checkInDate);
		clear(pom.getBookHotelPage().getDateOut());
		sendKeys(pom.getBookHotelPage().getDateOut(), checkOutDate);
		selectByVisibleText(pom.getBookHotelPage().getAdultRoom(), adultperRoom);
		selectByVisibleText(pom.getBookHotelPage().getChildRoom(), childrenPerRoom);
	}
	@Then("User enters the booking details")
	public void userEntersTheBookingDetails(io.cucumber.datatable.DataTable dataTable) {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // E, List<E>, List<List<E>>, List<Map<K,V>>, Map<K,V> or
	    // Map<K, List<V>>. E,K,V must be a String, Integer, Float,
	    // Double, Byte, Short, Long, BigInteger or BigDecimal.
	    //
	    // For other transformations you can register a DataTableType.
	    List<Map<String, String>> bookDetails = dataTable.asMaps(String.class, String.class);
	    String firstName = bookDetails.get(0).get("firstName");
	    String lastName = bookDetails.get(0).get("lastName");
	    String billingAddress = bookDetails.get(0).get("billingAddress");
	    String creditCardNo = bookDetails.get(0).get("creditCardNo");
	    String creditCardType = bookDetails.get(0).get("creditCardType");
	    String expiryMonth = bookDetails.get(0).get("expiryMonth");
	    String expiryYear = bookDetails.get(0).get("expiryYear");
	    String cvvNumber = bookDetails.get(0).get("cvvNumber");
	    sendKeys(pom.getBookHotelPage().getFirstname(), firstName);
	    sendKeys(pom.getBookHotelPage().getLastname(), lastName);
	    sendKeys(pom.getBookHotelPage().getAddress(), billingAddress);
	    sendKeys(pom.getBookHotelPage().getCcnum(), creditCardNo);
	    selectByVisibleText(pom.getBookHotelPage().getCreditcard(), creditCardType);
	    selectByVisibleText(pom.getBookHotelPage().getExpirydate(), expiryMonth);
	    selectByVisibleText(pom.getBookHotelPage().getExpiryyear(), expiryYear);
	    sendKeys(pom.getBookHotelPage().getCccvv(), cvvNumber);
	}
	@Then("User click the book now button")
	public void userClickTheBookNowButton() {
	    pom.getBookHotelPage().userClickTheBookNowButton();
	}
	@Then("User verfiy the booking confirmation page {string} and order Id is generated")
	public void userVerfiyTheBookingConfirmationPageAndOrderIdIsGenerated(String bookingConform) throws InterruptedException {
	    pom.getBookHotelPage().userVerfiyTheBookingConfirmationPageAndOrderIdIsGenerated(bookingConform);
	}
	@Then("User verfiy the error message is displayed in all the fields {string},{string},{string},{string},{string},{string},{string}")
	public void userVerfiyTheErrorMessageIsDisplayedInAllTheFields(String firtNameError, String lastNameError, String billingAddressError,
			String creditCardNoError, String creditCardTypeError, String expiryDateError, String cvvNumberError) {
		pom.getBookHotelPage().userVerfiyTheErrorMessageIsDisplayedInAllTheFields(firtNameError, lastNameError, billingAddressError, creditCardNoError, creditCardTypeError, expiryDateError, cvvNumberError);
	    
	}
	@Then("User enters {string},{string},{string},{string},{string},{string},{string} and first name field is not filled")
	public void userEntersAndFirstNameFieldIsNotFilled(String lasstName, String billingAddress, String creditCardNo, String creditCardType, String expiryMonth, String expiryYear, String cvvNumber) {
		pom.getBookHotelPage().userEntersAndFirstNameFieldIsNotFilled(lasstName, billingAddress, creditCardNo, creditCardType, expiryMonth, expiryYear, cvvNumber);
	}
	@Then("User verfiy the error message is displayed in first name field {string}")
	public void userVerfiyTheErrorMessageIsDisplayedInFirstNameField(String firtNameError) {
	    pom.getBookHotelPage().userVerfiyTheErrorMessageIsDisplayedInFirstNameField(firtNameError);
	}
	@Then("User enters {string},{string},{string},{string},{string},{string},{string} and last name field is not filled")
	public void userEntersAndLastNameFieldIsNotFilled(String firstName, String billingAddress, String creditCardNo, String creditCardType, String expiryMonth, String expiryYear, String cvvNumber) {
	   pom.getBookHotelPage().userEntersAndLastNameFieldIsNotFilled(firstName, billingAddress, creditCardNo, creditCardType, expiryMonth, expiryYear, cvvNumber);
	}
	@Then("User verfiy the error message is displayed in last name field {string}")
	public void userVerfiyTheErrorMessageIsDisplayedInLastNameField(String lastNameErrorMsg) {
	    pom.getBookHotelPage().userVerfiyTheErrorMessageIsDisplayedInLastNameField(lastNameErrorMsg);
	}
	@Then("User enters {string},{string},{string},{string},{string},{string},{string} and billing address field is not filled")
	public void userEntersAndBillingAddressFieldIsNotFilled(String firstName, String lastName, String creditCardNo, String creditCardType, String expiryMonth, String expiryYear, String cvvNumber) {
	    pom.getBookHotelPage().userEntersAndBillingAddressFieldIsNotFilled(firstName, lastName, creditCardNo, creditCardType, expiryMonth, expiryYear, cvvNumber);
	}
	@Then("User verfiy the error message is displayed in billing address field {string}")
	public void userVerfiyTheErrorMessageIsDisplayedInBillingAddressField(String billingAddressError) {
	    pom.getBookHotelPage().userVerfiyTheErrorMessageIsDisplayedInBillingAddressField(billingAddressError);
	}
	@Then("User enters {string},{string},{string},{string},{string},{string},{string} and credit card no field is not filled")
	public void userEntersAndCreditCardNoFieldIsNotFilled(String firstName, String lastName, String billingAddress, String creditCardType, String expiryMonth, String expiryYear, String cvvNumber) {
	   pom.getBookHotelPage().userEntersAndCreditCardNoFieldIsNotFilled(firstName, lastName, billingAddress, creditCardType, expiryMonth, expiryYear, cvvNumber);
	}
	@Then("User verfiy the error message is displayed in credit card no field {string}")
	public void userVerfiyTheErrorMessageIsDisplayedInCreditCardNoField(String creditCardNoError) {
	   pom.getBookHotelPage().userVerfiyTheErrorMessageIsDisplayedInCreditCardNoField(creditCardNoError);
	}
	@Then("User enters {string},{string},{string},{string},{string},{string},{string} and credit card type field is not filled")
	public void userEntersAndCreditCardTypeFieldIsNotFilled(String firstName, String lastName, String billingAddress, String creditCardNo, String expiryMonth, String expiryYear, String cvvNumber) {
		pom.getBookHotelPage().userEntersAndCreditCardTypeFieldIsNotFilled(firstName, lastName, billingAddress, creditCardNo, expiryMonth, expiryYear, cvvNumber);
	    
	}
	@Then("User verfiy the error message is displayed in credit card type field {string}")
	public void userVerfiyTheErrorMessageIsDisplayedInCreditCardTypeField(String creditCardTypeError) {
	   pom.getBookHotelPage().userVerfiyTheErrorMessageIsDisplayedInCreditCardTypeField(creditCardTypeError);
	}
	@Then("User enters {string},{string},{string},{string},{string},{string},{string} and Expiry month field is not filled")
	public void userEntersAndExpiryMonthFieldIsNotFilled(String firstName, String lastName, String billingAddress, String creditCardNo, String creditCardType, String expiryYear, String cvvNumber) {
	    pom.getBookHotelPage().userEntersAndExpiryMonthFieldIsNotFilled(firstName, lastName, billingAddress, creditCardNo, creditCardType, expiryYear, cvvNumber);
	}
    @Then("User verfiy the error message is displayed in Expiry month field {string}")
	public void userVerfiyTheErrorMessageIsDisplayedInExpiryMonthField(String expiryMonthError) {
	 pom.getBookHotelPage().userVerfiyTheErrorMessageIsDisplayedInExpiryMonthField(expiryMonthError);   
	}
	@Then("User enters {string},{string},{string},{string},{string},{string},{string} and Expiry year field is not filled")
	public void userEntersAndExpiryYearFieldIsNotFilled(String firstName, String lastName, String billingAddress, String creditCardNo, String creditCardType, String expiryMonth, String cvvNumber) {
	   pom.getBookHotelPage().userEntersAndExpiryYearFieldIsNotFilled(firstName, lastName, billingAddress, creditCardNo, creditCardType, expiryMonth, cvvNumber);
	}
	@Then("User verfiy the error message is displayed in Expiry year field {string}")
	public void userVerfiyTheErrorMessageIsDisplayedInExpiryYearField(String expiryYearError) {
	  pom.getBookHotelPage().userVerfiyTheErrorMessageIsDisplayedInExpiryYearField(expiryYearError);   
	}
	@Then("User enters {string},{string},{string},{string},{string},{string} and Expiry Date field is not filled")
	public void userEntersAndExpiryDateFieldIsNotFilled(String firstName, String lastName, String billingAddress, String creditCardNo, String creditCardType, String cvvNumber) {
	  pom.getBookHotelPage().userEntersAndExpiryDateFieldIsNotFilled(firstName, lastName, billingAddress, creditCardNo, creditCardType, cvvNumber);
	}
	@Then("User verfiy the error message is displayed in Expiry Date field {string}")
	public void userVerfiyTheErrorMessageIsDisplayedInExpiryDateField(String expiryDateError) {
	    pom.getBookHotelPage().userVerfiyTheErrorMessageIsDisplayedInExpiryDateField(expiryDateError);
	}
	@Then("User enters {string},{string},{string},{string},{string},{string},{string} and CVV Number field is not filled")
	public void userEntersAndCVVNumberFieldIsNotFilled(String firstName, String lastName, String billingAddress, String creditCardNo, String creditCardType, String expiryMonth,String expiryYear) {
	    pom.getBookHotelPage().userEntersAndCVVNumberFieldIsNotFilled(firstName, lastName, billingAddress, creditCardNo, creditCardType, expiryMonth, expiryYear);
	}
	@Then("User verfiy the error message is displayed in CVV Number field {string}")
	public void userVerfiyTheErrorMessageIsDisplayedInCVVNumberField(String cvvNumberError) {
	    pom.getBookHotelPage().userVerfiyTheErrorMessageIsDisplayedInCVVNumberField(cvvNumberError);
	}
	@Then("User enters {string},{string},{string},{string},{string},{string},{string},{string} and give invalid credit card no")
	public void userEntersAndGiveInvalidCreditCardNo(String firstName, String lastName, String billingAddress, String creditCardNo, String creditCardType, String expiryMonth, String expiryYear, String cvvNumber) {
	    pom.getBookHotelPage().userEntersAndGiveInvalidCreditCardNo(firstName, lastName, billingAddress, creditCardNo, creditCardType, expiryMonth, expiryYear, cvvNumber);
	}
	@Then("User verfiy the select hotel page {string}")
	public void userVerfiyTheSelectHotelPage(String selectHotel) {
	    pom.getBookHotelPage().userVerfiyTheSelectHotelPage(selectHotel);
	}
	@Then("User click the back button")
	public void userClickTheBackButton() {
	   pom.getBookHotelPage().userClickTheBackButton();
	}
}
