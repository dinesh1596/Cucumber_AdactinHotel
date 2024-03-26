package com.stepdefinition;

import com.base.BaseClass;
import com.pageobjectmanager.PageObjectManager;

import io.cucumber.java.en.*;

public class TC_6BookedItineraryPageStep extends BaseClass{
	PageObjectManager pom=new PageObjectManager();

	@Then("User click the My Itinerary button, search the booked hotel order id")
	public void userClickTheMyItineraryButtonSearchTheBookedHotelOrderId() throws InterruptedException {
	    pom.getBookedItineraryPage().userClickTheMyItineraryButtonSearchTheBookedHotelOrderId();
	}
	@Then("User click the cancel button in cancel column")
	public void userClickTheCancelButtonInCancelColumn() {
	    pom.getBookedItineraryPage().userClickTheCancelButtonInCancelColumn();
	}
	@Then("user verify the cancel message {string}")
	public void userVerifyTheCancelMessage(String cancelMsg) throws InterruptedException {
	   pom.getBookedItineraryPage().userVerifyTheCancelMessage(cancelMsg);
	}
	@Then("User click the My Itinerary button")
	public void userClickTheMyItineraryButton() {
	  pom.getBookedItineraryPage().userClickTheMyItineraryButton();
	}
	@Then("User click the search hotel button")
	public void userClickTheSearchHotelButton() {
	    pom.getBookedItineraryPage().userClickTheSearchHotelButton();
	}
}
