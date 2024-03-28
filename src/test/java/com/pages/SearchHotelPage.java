package com.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

import io.cucumber.java.en.Then;

public class SearchHotelPage extends BaseClass {
	
	public SearchHotelPage() {
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
	@FindBy(id="Reset")
	private WebElement resetBtn;
	@FindBy(xpath="//a[text()='Booked Itinerary']")
	private WebElement bookedItineraryLink;
	@FindBy(xpath="//a[text()='Change Password']")
	private WebElement changePasswordLink;
	@FindBy(xpath="//a[text()='Search Hotel']")
	private WebElement searchHotelLink;
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logoutLink;
	@FindBy(xpath="//span[text()='Please Select a Location']")
	private WebElement locationErrorMsg;
	@FindBy(xpath="//span[text()='Please Select Total Number of Rooms']")
	private WebElement noOfRoomErrorMsg;
	@FindBy(xpath="//span[text()='Please Select Check-In Date']")
	private WebElement dateInErrorMsg;
	@FindBy(xpath="//span[text()='Please Select Check-Out Date']")
	private WebElement dateOutErrorMsg;
	@FindBy(xpath="//span[text()='Please Select Adults per Room']")
	private WebElement adultsPerRoomErrorMsg;
	@FindBy(xpath="//td[text()='Search Hotel ']")
	private WebElement searchHotelTitle;
	@FindBy(xpath="//td[text()='Booked Itinerary']")
	private WebElement bookedItineraryTitle;
	@FindBy(xpath="//strong[text()='Change Password']")
	private WebElement changePasswordTitle;
	@FindBy(xpath="//td[text()='You have successfully logged out. ']")
	private WebElement logoutMessage;
	@FindBy(xpath="//a[text()='Click here to login again']")
	private WebElement loginLink;
	@FindBy(xpath="//td[text()='Existing User Login - Build 1']")
	private WebElement loginPage;
	@FindBy(xpath="//td[text()='Select Hotel ']")
	private WebElement selectHotelPageTitle;

	
	
	public WebElement getSelectHotelPageTitle() {
		return selectHotelPageTitle;
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
	public WebElement getResetBtn() {
		return resetBtn;
	}
	public WebElement getBookedItineraryLink() {
		return bookedItineraryLink;
	}
	public WebElement getChangePasswordLink() {
		return changePasswordLink;
	}
	public WebElement getSearchHotelLink() {
		return searchHotelLink;
	}
	public WebElement getLogoutLink() {
		return logoutLink;
	}
	public WebElement getLocationErrorMsg() {
		return locationErrorMsg;
	}
	public WebElement getNoOfRoomErrorMsg() {
		return noOfRoomErrorMsg;
	}
	public WebElement getDateInErrorMsg() {
		return dateInErrorMsg;
	}
	public WebElement getDateOutErrorMsg() {
		return dateOutErrorMsg;
	}
	public WebElement getAdultsPerRoomErrorMsg() {
		return adultsPerRoomErrorMsg;
	}
	public WebElement getSearchHotelTitle() {
		return searchHotelTitle;
	}
	public WebElement getBookedItineraryTitle() {
		return bookedItineraryTitle;
	}
	public WebElement getChangePasswordTitle() {
		return changePasswordTitle;
	}
	public WebElement getLogoutMessage() {
		return logoutMessage;
	}
	public WebElement getLoginLink() {
		return loginLink;
	}
	public WebElement getLoginPage() {
		return loginPage;
	}

	public void userVerifyTheSearchHotelPage(String searchHotelPage) {
		 String searchHotelPageText=getText(getSearchHotelTitle()) ;
		 Assert.assertEquals("Verify the search hotel page", searchHotelPage, searchHotelPageText);
	}	

	public void userEnter(String location, String hotels, String roomType, String numberOfRooms, String checkInDate, String checkOutDate,
			String AdultperRoom, String childrenPerRoom) {
		selectByVisibleText(getLocation(), location);
		selectByVisibleText(getHotels(), hotels);
		selectByVisibleText(getRoomType(), roomType);
		selectByVisibleText(getRoom_nos(),numberOfRooms);
		clear(getDateIn());
		sendKeys(getDateIn(), checkInDate);
		clear(getDateOut());
		sendKeys(getDateOut(), checkOutDate);
		selectByVisibleText(getAdultRoom(), AdultperRoom);
		selectByVisibleText(getChildRoom(), childrenPerRoom);

	}
	public void userClickTheSearchButton() {
		   click(getSearchBtn());
	}

	public void userVerifyTheSelectHotelPageAfterSearchTheHotel(String selectHotelPage) {
		String selectHotelPageText=getText(getSelectHotelPageTitle()) ;
		 Assert.assertEquals("Verify the search hotel page", selectHotelPage, selectHotelPageText);
	}

	public void userEnterAndNonMandatoryFieldsAreNotFilled(String location, String numberOfRooms, String checkInDate, String checkOutDate, String adultperRoom) {
		selectByVisibleText(getLocation(), location);
		selectByVisibleText(getRoom_nos(),numberOfRooms);
		clear(getDateIn());
		sendKeys(getDateIn(), checkInDate);
		clear(getDateOut());
		sendKeys(getDateOut(), checkOutDate);
		selectByVisibleText(getAdultRoom(), adultperRoom);
	}
	@Then("User enter {string},{string},{string},{string},{string} and mandatory fields are not filled")
	public void userEnterAndMandatoryFieldsAreNotFilled(String numberOfRooms, String hotels, String roomType, String adultperRoom, String childrenPerRoom) {
	    selectByVisibleText(getRoom_nos(), numberOfRooms);
	    selectByVisibleText(getHotels(), hotels);
	    clear(getDateIn());
	    clear(getDateOut());
	    selectByVisibleText(getRoomType(), roomType);
	    selectByVisibleText(getAdultRoom(), adultperRoom);
	    selectByVisibleText(getChildRoom(), childrenPerRoom);
	}

	public void userVerifyTheErrorMessageInTheMandatoryFields(String locationError, String noOfRoomError, String dateInError,
			String dateOutError, String adultsPerRoomError) {
		 String locationErrorText=getText(getLocationErrorMsg()) ;
		 Assert.assertEquals("Verify Location Error Message", locationError, locationErrorText);
		 String noOfRoomErrorText=getText(getNoOfRoomErrorMsg()) ;
		 Assert.assertEquals("Verify Number of Rooms Error Message", noOfRoomError, noOfRoomErrorText);
		 String dateInErrorText=getText(getDateInErrorMsg()) ;
		 Assert.assertEquals("Verify Date In Error Message", dateInError, dateInErrorText);
		 String dateOutErrorText=getText(getDateOutErrorMsg()) ;
		 Assert.assertEquals("Verify Date Out Error Message", dateOutError, dateOutErrorText);
		 String AdultsPerRoomErrorText=getText(getAdultsPerRoomErrorMsg()) ;
		 Assert.assertEquals("Verify Adults Per Room Error Message", adultsPerRoomError, AdultsPerRoomErrorText); 
	}

	public void userEnter(String hotels, String roomType, String numberOfRooms, String checkInDate, String checkOutDate, String adultperRoom,
			String childrenPerRoom) {
		selectByVisibleText(getHotels(), hotels);
		selectByVisibleText(getRoomType(), roomType);
		selectByVisibleText(getRoom_nos(),numberOfRooms);
		clear(getDateIn());
		sendKeys(getDateIn(), checkInDate);
		clear(getDateOut());
		sendKeys(getDateOut(), checkOutDate);
		selectByVisibleText(getAdultRoom(), adultperRoom);
		selectByVisibleText(getChildRoom(), childrenPerRoom);
	}

	public void userVerifyTheErrorMessageInLocationField(String locationError) {
		String locationErrorText=getText(getLocationErrorMsg()) ;
		 Assert.assertEquals("Verify Location Error Message", locationError, locationErrorText);
	}
	public void userEnterAndNumberOfRoomsFieldIsNotFilled(String location, String hotels, String roomType, String numberOfRooms, String checkInDate, String checkOutDate, String adultperRoom, String childrenPerRoom) {
		selectByVisibleText(getLocation(), location);
		selectByVisibleText(getHotels(), hotels);
		selectByVisibleText(getRoomType(), roomType);
		selectByVisibleText(getRoom_nos(),numberOfRooms);
		clear(getDateIn());
		sendKeys(getDateIn(), checkInDate);
		clear(getDateOut());
		sendKeys(getDateOut(), checkOutDate);
		selectByVisibleText(getAdultRoom(), adultperRoom);
		selectByVisibleText(getChildRoom(), childrenPerRoom);
	}

	public void userVerifyTheErrorMessageInNumberOfRoomsField(String noOfRoomError) {
		 String noOfRoomErrorText=getText(getNoOfRoomErrorMsg()) ;
		 Assert.assertEquals("Verify Number of Rooms Error Message", noOfRoomError, noOfRoomErrorText);
	}
	public void userEnterAndCheckInDateFieldIsNotFilled(String location, String hotels, String roomType, String numberOfRooms, String checkOutDate, String adultperRoom, String childrenPerRoom) {
		selectByVisibleText(getLocation(), location);
		selectByVisibleText(getHotels(), hotels);
		selectByVisibleText(getRoomType(), roomType);
		selectByVisibleText(getRoom_nos(),numberOfRooms);
		clear(getDateIn());
		clear(getDateOut());
		sendKeys(getDateOut(), checkOutDate);
		selectByVisibleText(getAdultRoom(), adultperRoom);
		selectByVisibleText(getChildRoom(), childrenPerRoom);
	}

	public void userVerifyTheErrorMessageInCheckInDateField(String dateInError) {
		 String dateInErrorText=getText(getDateInErrorMsg()) ;
		 Assert.assertEquals("Verify Check In Date Error Message", dateInError, dateInErrorText);
	}
	public void userEnterAndCheckOutDateFieldIsNotFilled(String location, String hotels, String roomType, String numberOfRooms, String checkInDate, String adultperRoom, String childrenPerRoom) {
		selectByVisibleText(getLocation(), location);
		selectByVisibleText(getHotels(), hotels);
		selectByVisibleText(getRoomType(), roomType);
		selectByVisibleText(getRoom_nos(),numberOfRooms);
		clear(getDateIn());
		sendKeys(getDateIn(), checkInDate);
		clear(getDateOut());
		selectByVisibleText(getAdultRoom(), adultperRoom);
		selectByVisibleText(getChildRoom(), childrenPerRoom);
	}
	public void userVerifyTheErrorMessageInCheckOutDateField(String dateOutError) {
		String dateOutErrorText=getText(getDateOutErrorMsg()) ;
		 Assert.assertEquals("Verify Check Out Date Error Message", dateOutError, dateOutErrorText);
	}
	public void userEnterAndAdultsPerRoomFieldIsNotFilled(String location, String hotels, String roomType, String numberOfRooms, String checkInDate, String checkOutDate, String adultperRoom, String childrenPerRoom) {
		selectByVisibleText(getLocation(), location);
		selectByVisibleText(getHotels(), hotels);
		selectByVisibleText(getRoomType(), roomType);
		selectByVisibleText(getRoom_nos(),numberOfRooms);
		clear(getDateIn());
		sendKeys(getDateIn(), checkInDate);
		clear(getDateOut());
		sendKeys(getDateOut(), checkOutDate);
		selectByVisibleText(getAdultRoom(), adultperRoom);
		selectByVisibleText(getChildRoom(), childrenPerRoom);
	}

	public void userVerifyTheErrorMessageInAdultsPerRoomField(String adultPerRoomError) {
		 String adultPerRoomErrorText=getText(getAdultsPerRoomErrorMsg()) ;
		 Assert.assertEquals("Verify Adult per Room Error Message", adultPerRoomError, adultPerRoomErrorText);
	}

	public void userClickTheResetButton() {
        click(getResetBtn());
	}

	public void userVerifyTheSearchConditionsAreClearedAfterClickTheResetButton() {
		 String checkInDateValue=getAttributeValue(getDateIn(),"value") ;
		 Assert.assertTrue( checkInDateValue,true);
		 String checkOutDateValue=getAttributeValue(getDateOut(),"value") ;
		 Assert.assertTrue( checkOutDateValue,true);
		}

	public void userClickTheBookedItineraryLink() {
        click(getBookedItineraryLink());
	}
	public void userVerifyTheBookedItineraryPage(String bookedItinerary) {
		 String bookedItineraryText=getText(getBookedItineraryTitle()) ;
		 Assert.assertEquals("Verify Booked Itinerary Page", bookedItinerary, bookedItineraryText);
	}
	public void userClickTheChangePasswordLink() {
		   click(getChangePasswordLink());
	}
	public void userVerifyTheChangePasswordPage(String changePassword) {
		String changePasswordText=getText(getChangePasswordTitle()) ;
		Assert.assertEquals("Verify Change Password Page", changePassword, changePasswordText);
	}
	public void userClickTheLogoutLink() {
		   click(getLogoutLink());
	}

	public void userVerifyTheLogoutSuccessMessage(String logOutMsg) {
		String logOutText=getText(getLogoutMessage()) ;
		Assert.assertEquals("Verify Logou Success Message", logOutMsg, logOutText);

	}



}
