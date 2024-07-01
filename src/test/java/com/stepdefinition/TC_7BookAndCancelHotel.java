package com.stepdefinition;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.base.BaseClass;
import com.pageobjectmanager.PageObjectManager;

import io.cucumber.java.en.*;
import io.cucumber.java.en.When;

public class TC_7BookAndCancelHotel extends BaseClass{
	
	PageObjectManager pom=new PageObjectManager();
	
	@When("User enter the login credential")
	public void userEnterTheLoginCredential() throws IOException {
		String userNameValue = readValueFromExcel("BookingDetails", 1, 0);
		WebElement username = pom.getLoginPage().getTxtusername();
	    sendKeys(username, userNameValue);
	    boolean userNameValidation = isDisplayed(username);
	    Assert.assertTrue(userNameValidation);
	    String passwordValue = readValueFromExcel("BookingDetails", 1, 1);
	    WebElement password = pom.getLoginPage().getTxtpassword();
	    sendKeys(password, passwordValue);
	    boolean passwordValidation = isDisplayed(password);
	    Assert.assertTrue(passwordValidation);
	}
	@When("User click the login button")
	public void userClickTheLoginButton() {
		click(pom.getLoginPage().getBtnLogin());
	}
	@When("User search for a hotel by filling the search conditions")
	public void userSearchForAHotelByFillingTheSearchConditions() throws IOException {
		   String locationValue = readValueFromExcel("BookingDetails", 1, 2);
	       WebElement location = pom.getSearchHotelPage().getLocation();
	       selectByVisibleText(location, locationValue);
	       boolean loacationValidation = isDisplayed(location);
	       Assert.assertTrue(loacationValidation);
	       String hotelValue = readValueFromExcel("BookingDetails", 1, 3);
	       WebElement hotel = pom.getSearchHotelPage().getHotels();
	       selectByVisibleText(hotel, hotelValue);
	       boolean hotelValidation = isDisplayed(hotel);
	       Assert.assertTrue(hotelValidation);
	       String roomTypeValue = readValueFromExcel("BookingDetails", 1, 4);
	       WebElement roomType = pom.getSearchHotelPage().getRoomType();
	       selectByVisibleText(roomType, roomTypeValue);
	       boolean roomTypeValidation = isDisplayed(roomType);
	       Assert.assertTrue(roomTypeValidation);
	       String noOfRoomValue = readValueFromExcel("BookingDetails", 1, 5);
	       WebElement noOfRoom = pom.getSearchHotelPage().getRoom_nos();
	       selectByVisibleText(noOfRoom, noOfRoomValue);
	       boolean noOfRoomValidation = isDisplayed(noOfRoom);
	       Assert.assertTrue(noOfRoomValidation);
	       clear(pom.getSearchHotelPage().getDateIn());
	       String checkDateInValue = readValueFromExcel("BookingDetails", 1, 6);
	       WebElement checkDateIn = pom.getSearchHotelPage().getDateIn();
	       sendKeys(checkDateIn, checkDateInValue);
	       boolean checkDateInValidation = isDisplayed(checkDateIn);
	       Assert.assertTrue(checkDateInValidation);
	       clear(pom.getSearchHotelPage().getDateOut());
	       String checkDateOutValue = readValueFromExcel("BookingDetails", 1, 7);
	       WebElement checkDateOut = pom.getSearchHotelPage().getDateOut();
	       sendKeys(checkDateOut, checkDateOutValue);
	       boolean checkDateOutValidation = isDisplayed(checkDateOut);
	       Assert.assertTrue(checkDateOutValidation);
	       String adultRoomValue = readValueFromExcel("BookingDetails", 1, 8);
	       WebElement adultRoom = pom.getSearchHotelPage().getAdultRoom();
	       selectByVisibleText(adultRoom, adultRoomValue);
	       boolean adultRoomValidation = isDisplayed(adultRoom);
	       Assert.assertTrue(adultRoomValidation);
	       String childRoomValue = readValueFromExcel("BookingDetails", 1, 9);
	       WebElement childRoom = pom.getSearchHotelPage().getChildRoom();
	       selectByVisibleText(childRoom, childRoomValue);
	       boolean childRoomValidation = isDisplayed(childRoom);
	       Assert.assertTrue(childRoomValidation);

		
	}

	@Then("User select the hotel, click the continue button")
	public void userSelectTheHotelClickTheContinueButton() {
		   click(pom.getSelectHotelPage().getRadiobutton());
	       click(pom.getSelectHotelPage().getContinuebutton());
	}

	@When("User enter the booking details, click the BookNow button")
	public void userEnterTheBookingDetailsClickTheBookNowButton() throws IOException {
		String firstNameValue = readValueFromExcel("BookingDetails", 1, 10);
		WebElement firstName = pom.getBookHotelPage().getFirstname();
		sendKeys(firstName, firstNameValue);
		boolean firstNameValidation = isDisplayed(firstName);
		Assert.assertTrue(firstNameValidation);
		String lastNameValue = readValueFromExcel("BookingDetails", 1, 11);
		WebElement lastName = pom.getBookHotelPage().getLastname();
		sendKeys(lastName, lastNameValue);
		boolean lastNameValidation = isDisplayed(lastName);
		Assert.assertTrue(lastNameValidation);
		String addressValue = readValueFromExcel("BookingDetails", 1, 12);
		WebElement address = pom.getBookHotelPage().getAddress();
		sendKeys(address, addressValue);
		boolean addressValidation = isDisplayed(address);
		Assert.assertTrue(addressValidation);
		String creditCardNoValue = readValueFromExcel("BookingDetails", 1, 13);
		WebElement creditCardNo = pom.getBookHotelPage().getCcnum();
		sendKeys(creditCardNo, creditCardNoValue);
		boolean creditCardNoValidation = isDisplayed(creditCardNo);
		Assert.assertTrue(creditCardNoValidation);
		String creditCardTypeValue = readValueFromExcel("BookingDetails", 1, 14);
		WebElement creditCardType =pom.getBookHotelPage().getCreditcard();
		selectByVisibleText(creditCardType, creditCardTypeValue);
		boolean creditCardTypeValidation = isDisplayed(creditCardType);
		Assert.assertTrue(creditCardTypeValidation);
		String expiryMonthValue = readValueFromExcel("BookingDetails", 1, 15);
		WebElement expiryMonth = pom.getBookHotelPage().getExpirydate();
		selectByVisibleText(expiryMonth, expiryMonthValue);
		boolean expiryMonthValidation = isDisplayed(expiryMonth);
		Assert.assertTrue(expiryMonthValidation);
		String expiryDateValue = readValueFromExcel("BookingDetails", 1, 16);
		WebElement expiryDate = pom.getBookHotelPage().getExpiryyear();
		selectByVisibleText(expiryDate, expiryDateValue);
		boolean expiryDateValidation = isDisplayed(expiryDate);
		Assert.assertTrue(expiryDateValidation);
		String cvvNoValue = readValueFromExcel("BookingDetails", 1, 17);
		WebElement cvvNo = pom.getBookHotelPage().getCccvv();
		sendKeys(cvvNo, cvvNoValue);
		boolean cvvNoValidation = isDisplayed(cvvNo);
		Assert.assertTrue(cvvNoValidation);
		click(pom.getBookHotelPage().getBooknow());
	}

	@Then("User click the cancel button to cancel the booked hotel")
	public void userClickTheCancelButtonToCancelTheBookedHotel() {
		click(pom.getBookedItineraryPage().getCancel());
		alertAccept();
	}

}
