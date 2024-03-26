package com.stepdefinition;

import com.base.BaseClass;
import com.pageobjectmanager.PageObjectManager;

import io.cucumber.java.en.*;

public class TC_3SearchHotelPageStep extends BaseClass{
	PageObjectManager pom=new PageObjectManager();
	
	@Then("User verify the search hotel Page {string}")
	public void userVerifyTheSearchHotelPage(String searchHotelPage) {
	   pom.getSearchHotelPage().userVerifyTheSearchHotelPage(searchHotelPage);
	}
	@Then("User enter {string},{string},{string},{string},{string},{string},{string},{string}")
	public void userEnter(String location, String hotels, String roomType, String numberOfRooms, String checkInDate, String checkOutDate,
			String adultperRoom, String childrenPerRoom) {
		pom.getSearchHotelPage().userEnter(location, hotels, roomType, numberOfRooms, checkInDate, checkOutDate, adultperRoom, childrenPerRoom);
	    
	}
	@Then("User click the search button")
	public void userClickTheSearchButton() {
	   pom.getSearchHotelPage().userClickTheSearchButton();
	}

	@Then("User verify the select hotel page after search the hotel {string}")
	public void userVerifyTheSelectHotelPageAfterSearchTheHotel(String selectHotelPageText) {
	    pom.getSearchHotelPage().userVerifyTheSelectHotelPageAfterSearchTheHotel(selectHotelPageText);
	}
	@Then("User enter {string},{string},{string},{string},{string} and  non mandatory fields are not filled")
	public void userEnterAndNonMandatoryFieldsAreNotFilled(String location, String numberOfRooms, String checkInDate, String checkOutDate, String adultperRoom) {
	    pom.getSearchHotelPage().userEnterAndNonMandatoryFieldsAreNotFilled(location, numberOfRooms, checkInDate, checkOutDate, adultperRoom);
	}
	@Then("User enter {string},{string},{string},{string},{string} and mandatory fields are not filled")
	public void userEnterAndMandatoryFieldsAreNotFilled(String numberOfRooms, String hotels, String roomType, String adultperRoom, String childrenPerRoom) {
	    pom.getSearchHotelPage().userEnterAndMandatoryFieldsAreNotFilled(numberOfRooms, hotels, roomType, adultperRoom, childrenPerRoom);
	}
	
	@Then("User verify the error message in the mandatory fields {string},{string},{string},{string},{string}")
	public void userVerifyTheErrorMessageInTheMandatoryFields(String locationError, String noOfRoomError, String dateInError,
			String dateOutError, String adultsPerRoomError) {
	    pom.getSearchHotelPage().userVerifyTheErrorMessageInTheMandatoryFields(locationError, noOfRoomError, dateInError, dateOutError, adultsPerRoomError);
	}
	@Then("User enter {string},{string},{string},{string},{string},{string},{string}")
	public void userEnter(String hotels, String roomType, String numberOfRooms, String checkInDate, String checkOutDate, String adultperRoom,
			String childrenPerRoom)  {
		pom.getSearchHotelPage().userEnter(hotels, roomType, numberOfRooms, checkInDate, checkOutDate, adultperRoom, childrenPerRoom);
	    
	}
	@Then("User verify the error message in location field {string}")
	public void userVerifyTheErrorMessageInLocationField(String locationError) {
	    pom.getSearchHotelPage().userVerifyTheErrorMessageInLocationField(locationError);
	}
	@Then("User enter {string},{string},{string},{string},{string},{string},{string},{string} and Number of Rooms field is not filled")
	public void userEnterAndNumberOfRoomsFieldIsNotFilled(String location, String hotels, String roomType, String numberOfRooms, String checkInDate, String checkOutDate, String adultperRoom, String childrenPerRoom) {
	   pom.getSearchHotelPage().userEnterAndNumberOfRoomsFieldIsNotFilled(location, hotels, roomType,numberOfRooms, checkInDate, checkOutDate, adultperRoom, childrenPerRoom);
	}
	@Then("User verify the error message in number of rooms field {string}")
	public void userVerifyTheErrorMessageInNumberOfRoomsField(String noOfRoomError) {
		pom.getSearchHotelPage().userVerifyTheErrorMessageInNumberOfRoomsField(noOfRoomError);   
	}
	@Then("User enter {string},{string},{string},{string},{string},{string},{string} and Check In Date field is not filled")
	public void userEnterAndCheckInDateFieldIsNotFilled(String location, String hotels, String roomType, String numberOfRooms, String checkOutDate, String adultperRoom, String childrenPerRoom) {
	   pom.getSearchHotelPage().userEnterAndCheckInDateFieldIsNotFilled(location, hotels, roomType, numberOfRooms, checkOutDate, adultperRoom, childrenPerRoom);
	}
	@Then("User verify the error message in check in date field {string}")
	public void userVerifyTheErrorMessageInCheckInDateField(String dateInError) {
		pom.getSearchHotelPage().userVerifyTheErrorMessageInCheckInDateField(dateInError);   
	}
	@Then("User enter {string},{string},{string},{string},{string},{string},{string} and Check Out Date field is not filled")
	public void userEnterAndCheckOutDateFieldIsNotFilled(String location, String hotels, String roomType, String numberOfRooms, String checkInDate, String adultperRoom, String childrenPerRoom) {
		pom.getSearchHotelPage().userEnterAndCheckOutDateFieldIsNotFilled(location, hotels, roomType, numberOfRooms, checkInDate, adultperRoom, childrenPerRoom);
	}
	@Then("User verify the error message in check out date field {string}")
	public void userVerifyTheErrorMessageInCheckOutDateField(String dateOutError)  {
		pom.getSearchHotelPage().userVerifyTheErrorMessageInCheckOutDateField(dateOutError);   
	}
	@Then("User enter {string},{string},{string},{string},{string},{string},{string},{string} and Adults per Room field is not filled")
	public void userEnterAndAdultsPerRoomFieldIsNotFilled(String location, String hotels, String roomType, String numberOfRooms, String checkInDate, String checkOutDate, String adultperRoom, String childrenPerRoom) {
	   pom.getSearchHotelPage().userEnterAndAdultsPerRoomFieldIsNotFilled(location, hotels, roomType, numberOfRooms, checkInDate, checkOutDate, adultperRoom, childrenPerRoom);
	}
	@Then("User verify the error message in adults per room field {string}")
	public void userVerifyTheErrorMessageInAdultsPerRoomField(String adultPerRoomError) {
	    pom.getSearchHotelPage().userVerifyTheErrorMessageInAdultsPerRoomField(adultPerRoomError);
	}
	@Then("User click the reset button")
	public void userClickTheResetButton() {
	    pom.getSearchHotelPage().userClickTheResetButton();
	}
	@Then("User verify the search conditions are cleared after click the reset button")
	public void userVerifyTheSearchConditionsAreClearedAfterClickTheResetButton() {
	    pom.getSearchHotelPage().userVerifyTheSearchConditionsAreClearedAfterClickTheResetButton();
	}
	@Then("User click the Booked Itinerary link")
	public void userClickTheBookedItineraryLink() {
	    pom.getSearchHotelPage().userClickTheBookedItineraryLink();
	}
	@Then("User verify the Booked Itinerary page {string}")
	public void userVerifyTheBookedItineraryPage(String bookedItinerary) {
	  pom.getSearchHotelPage().userVerifyTheBookedItineraryPage(bookedItinerary);
	}
	@Then("User click the Change Password link")
	public void userClickTheChangePasswordLink() {
	   pom.getSearchHotelPage().userClickTheChangePasswordLink();
	}
	@Then("User verify the Change Password page {string}")
	public void userVerifyTheChangePasswordPage(String changePassword) {
		pom.getSearchHotelPage().userVerifyTheChangePasswordPage(changePassword);
	}
	@Then("User click the logout link")
	public void userClickTheLogoutLink() {
	   pom.getSearchHotelPage().userClickTheLogoutLink();
	}
	@Then("User verify the logout success message   {string}")
	public void userVerifyTheLogoutSuccessMessage(String logOutMsg) {
	    pom.getSearchHotelPage().userVerifyTheLogoutSuccessMessage(logOutMsg);
	}
}
