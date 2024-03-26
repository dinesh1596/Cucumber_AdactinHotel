package com.stepdefinition;

import com.base.BaseClass;
import com.pageobjectmanager.PageObjectManager;

import io.cucumber.java.en.*;

public class TC_4SelectHotelPageStep extends BaseClass {
	
	PageObjectManager pom=new PageObjectManager();
	
	@Then("User selec the hotel, click the continue button")
	public void userSelecTheHotelClickTheContinueButton() {
	    pom.getSelectHotelPage().userSelecTheHotelClickTheContinueButton();
	}
	@Then("User should direct to the booking page {string}")
	public void userShouldDirectToTheBookingPage(String booktHotel) {
	    pom.getSelectHotelPage().userShouldDirectToTheBookingPage(booktHotel);
	}
	@Then("User click the continue button")
	public void userClickTheContinueButton() {
	   pom.getSelectHotelPage().userClickTheContinueButton();
	}
	@Then("User verify the error message is displayed {string}")
	public void userVerifyTheErrorMessageIsDisplayed(String selectHotelError) {
	   pom.getSelectHotelPage().userVerifyTheErrorMessageIsDisplayed(selectHotelError);
	}
	@Then("User click the cancel button")
	public void userClickTheCancelButton() {
	    pom.getSelectHotelPage().userClickTheCancelButton();
	}
	@Then("User should redirected to the search hotel page {string}")
	public void userShouldRedirectedToTheSearchHotelPage(String searchtHotel) {
	   pom.getSelectHotelPage().userShouldRedirectedToTheSearchHotelPage(searchtHotel);
	}
	@Then("User click the search hotel link")
	public void userClickTheSearchHotelLink() {
	   pom.getSelectHotelPage().userClickTheSearchHotelLink();
	}
}
