package com.stepdefinition;

import java.io.IOException;

import com.base.BaseClass;
import com.pageobjectmanager.PageObjectManager;

import io.cucumber.java.en.*;
import io.cucumber.java.en.When;

public class TC_7BookAndCancelHotel extends BaseClass{
	
	PageObjectManager pom=new PageObjectManager();
	
	@When("User enter the login credential")
	public void userEnterTheLoginCredential() throws IOException {
	   pom.getBookAndCancelHotelPage().userEnterTheLoginCredential();
	}
	@When("User click the login button")
	public void userClickTheLoginButton() {
	    pom.getBookAndCancelHotelPage().userClickTheLoginButton();
	}
	@When("User search for a hotel by filling the search conditions")
	public void userSearchForAHotelByFillingTheSearchConditions() throws IOException {
		pom.getBookAndCancelHotelPage().userSearchForAHotelByFillingTheSearchConditions();
	}

	@Then("User select the hotel, click the continue button")
	public void userSelectTheHotelClickTheContinueButton() {
		pom.getBookAndCancelHotelPage().userSelectTheHotelClickTheContinueButton();
	}

	@When("User enter the booking details, click the BookNow button")
	public void userEnterTheBookingDetailsClickTheBookNowButton() throws IOException {
		pom.getBookAndCancelHotelPage().userEnterTheBookingDetailsClickTheBookNowButton();
	}

	@Then("User click the cancel button to cancel the booked hotel")
	public void userClickTheCancelButtonToCancelTheBookedHotel() {
	   pom.getBookAndCancelHotelPage().userClickTheCancelButtonToCancelTheBookedHotel();
	}

}
