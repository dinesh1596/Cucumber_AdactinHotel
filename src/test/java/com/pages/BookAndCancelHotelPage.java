package com.pages;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class BookAndCancelHotelPage extends BaseClass{
	
	public BookAndCancelHotelPage() {
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
	@FindBy(xpath = "//input[@id='radiobutton_0']")
	private WebElement radiobutton;
	@FindBy(xpath = "//input[@id='continue']")
	private WebElement continuebutton;
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
	@FindBy(id = "order_no")
	private WebElement orderno;
	@FindBy(xpath = "//a[text()='Booked Itinerary']")
	private WebElement bookedItinerary;
	@FindBy(id = "order_id_text")
	private WebElement orderid;
	@FindBy(xpath = "//input[@id='search_hotel_id']")
	private WebElement searchhotelid;
	@FindBy(xpath = "//input[contains(@id,'btn_id')]")
	private WebElement cancel;
	@FindBy(xpath = "//label[@id='search_result_error']")
	private WebElement cancelmsg;
	@FindBy(id="my_itinerary")
	private WebElement myItinerary;
	@FindBy(xpath="//input[@id='search_hotel']")
	private WebElement searchHotelBtn;
	@FindBy(xpath="//a[text()='Logout']")
	private WebElement logoutBtn;
	@FindBy(xpath="//input[@name='ids[]']")
	private WebElement checkBox;
	@FindBy(xpath="//input[@name='cancelall']")
	private WebElement cancelBtn;
	@FindBy(xpath="//a[text()='Change Password']")
	private WebElement changePassword;
	
	
	
	public WebElement getFirstname() {
		return firstname;
	}
	public void setFirstname(WebElement firstname) {
		this.firstname = firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public void setLastname(WebElement lastname) {
		this.lastname = lastname;
	}
	public WebElement getAddress() {
		return address;
	}
	public void setAddress(WebElement address) {
		this.address = address;
	}
	public WebElement getCcnum() {
		return ccnum;
	}
	public void setCcnum(WebElement ccnum) {
		this.ccnum = ccnum;
	}
	public WebElement getCreditcard() {
		return creditcard;
	}
	public void setCreditcard(WebElement creditcard) {
		this.creditcard = creditcard;
	}
	public WebElement getExpirydate() {
		return expirydate;
	}
	public void setExpirydate(WebElement expirydate) {
		this.expirydate = expirydate;
	}
	public WebElement getExpiryyear() {
		return expiryyear;
	}
	public void setExpiryyear(WebElement expiryyear) {
		this.expiryyear = expiryyear;
	}
	public WebElement getCccvv() {
		return cccvv;
	}
	public void setCccvv(WebElement cccvv) {
		this.cccvv = cccvv;
	}
	public WebElement getBooknow() {
		return booknow;
	}
	public void setBooknow(WebElement booknow) {
		this.booknow = booknow;
	}
	public WebElement getBookcom() {
		return bookcom;
	}
	public void setBookcom(WebElement bookcom) {
		this.bookcom = bookcom;
	}
	public WebElement getRadiobutton() {
		return radiobutton;
	}
	public WebElement getContinuebutton() {
		return continuebutton;
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
	public WebElement getOrderno() {
		return orderno;
	}
	public WebElement getBookedItinerary() {
		return bookedItinerary;
	}
	public WebElement getOrderid() {
		return orderid;
	}
	public WebElement getSearchhotelid() {
		return searchhotelid;
	}
	public WebElement getCancel() {
		return cancel;
	}
	public WebElement getCancelmsg() {
		return cancelmsg;
	}
	public WebElement getMyItinerary() {
		return myItinerary;
	}
	public WebElement getSearchHotelBtn() {
		return searchHotelBtn;
	}
	public WebElement getLogoutBtn() {
		return logoutBtn;
	}
	public WebElement getCheckBox() {
		return checkBox;
	}
	public WebElement getCancelBtn() {
		return cancelBtn;
	}
	public WebElement getChangePassword() {
		return changePassword;
	}
	
	
	
	public void userEnterTheLoginCredential() throws IOException {
		String userNameValue = readValueFromExcel("BookingDetails", 1, 0);
		WebElement username = getTxtusername();
	    sendKeys(username, userNameValue);
	    boolean userNameValidation = isDisplayed(username);
	    Assert.assertTrue(userNameValidation);
	    String passwordValue = readValueFromExcel("BookingDetails", 1, 1);
	    WebElement password = getTxtpassword();
	    sendKeys(password, passwordValue);
	    boolean passwordValidation = isDisplayed(password);
	    Assert.assertTrue(passwordValidation);
	}
	public void userClickTheLoginButton() {
		click(getBtnLogin());
	}
	
	public void userSearchForAHotelByFillingTheSearchConditions() throws IOException {
       String locationValue = readValueFromExcel("BookingDetails", 1, 2);
       WebElement location = getLocation();
       selectByVisibleText(location, locationValue);
       boolean loacationValidation = isDisplayed(location);
       Assert.assertTrue(loacationValidation);
       String hotelValue = readValueFromExcel("BookingDetails", 1, 3);
       WebElement hotel = getHotels();
       selectByVisibleText(hotel, hotelValue);
       boolean hotelValidation = isDisplayed(hotel);
       Assert.assertTrue(hotelValidation);
       String roomTypeValue = readValueFromExcel("BookingDetails", 1, 4);
       WebElement roomType = getRoomType();
       selectByVisibleText(roomType, roomTypeValue);
       boolean roomTypeValidation = isDisplayed(roomType);
       Assert.assertTrue(roomTypeValidation);
       String noOfRoomValue = readValueFromExcel("BookingDetails", 1, 5);
       WebElement noOfRoom = getRoom_nos();
       selectByVisibleText(noOfRoom, noOfRoomValue);
       boolean noOfRoomValidation = isDisplayed(noOfRoom);
       Assert.assertTrue(noOfRoomValidation);
       clear(getDateIn());
       String checkDateInValue = readValueFromExcel("BookingDetails", 1, 6);
       WebElement checkDateIn = getDateIn();
       sendKeys(checkDateIn, checkDateInValue);
       boolean checkDateInValidation = isDisplayed(checkDateIn);
       Assert.assertTrue(checkDateInValidation);
       clear(getDateOut());
       String checkDateOutValue = readValueFromExcel("BookingDetails", 1, 7);
       WebElement checkDateOut = getDateOut();
       sendKeys(checkDateOut, checkDateOutValue);
       boolean checkDateOutValidation = isDisplayed(checkDateOut);
       Assert.assertTrue(checkDateOutValidation);
       String adultRoomValue = readValueFromExcel("BookingDetails", 1, 8);
       WebElement adultRoom = getAdultRoom();
       selectByVisibleText(adultRoom, adultRoomValue);
       boolean adultRoomValidation = isDisplayed(adultRoom);
       Assert.assertTrue(adultRoomValidation);
       String childRoomValue = readValueFromExcel("BookingDetails", 1, 9);
       WebElement childRoom = getChildRoom();
       selectByVisibleText(childRoom, childRoomValue);
       boolean childRoomValidation = isDisplayed(childRoom);
       Assert.assertTrue(childRoomValidation);
       
	}

	public void userSelectTheHotelClickTheContinueButton() {
       click(getRadiobutton());
       click(getContinuebutton());
	}

	public void userEnterTheBookingDetailsClickTheBookNowButton() throws IOException {
		String firstNameValue = readValueFromExcel("BookingDetails", 1, 10);
		WebElement firstName = getFirstname();
		sendKeys(firstName, firstNameValue);
		boolean firstNameValidation = isDisplayed(firstName);
		Assert.assertTrue(firstNameValidation);
		String lastNameValue = readValueFromExcel("BookingDetails", 1, 11);
		WebElement lastName = getLastname();
		sendKeys(lastName, lastNameValue);
		boolean lastNameValidation = isDisplayed(lastName);
		Assert.assertTrue(lastNameValidation);
		String addressValue = readValueFromExcel("BookingDetails", 1, 12);
		WebElement address = getAddress();
		sendKeys(address, addressValue);
		boolean addressValidation = isDisplayed(address);
		Assert.assertTrue(addressValidation);
		String creditCardNoValue = readValueFromExcel("BookingDetails", 1, 13);
		WebElement creditCardNo = getCcnum();
		sendKeys(creditCardNo, creditCardNoValue);
		boolean creditCardNoValidation = isDisplayed(creditCardNo);
		Assert.assertTrue(creditCardNoValidation);
		String creditCardTypeValue = readValueFromExcel("BookingDetails", 1, 14);
		WebElement creditCardType = getCreditcard();
		selectByVisibleText(creditCardType, creditCardTypeValue);
		boolean creditCardTypeValidation = isDisplayed(creditCardType);
		Assert.assertTrue(creditCardTypeValidation);
		String expiryMonthValue = readValueFromExcel("BookingDetails", 1, 15);
		WebElement expiryMonth = getExpirydate();
		selectByVisibleText(expiryMonth, expiryMonthValue);
		boolean expiryMonthValidation = isDisplayed(expiryMonth);
		Assert.assertTrue(expiryMonthValidation);
		String expiryDateValue = readValueFromExcel("BookingDetails", 1, 16);
		WebElement expiryDate = getExpiryyear();
		selectByVisibleText(expiryDate, expiryDateValue);
		boolean expiryDateValidation = isDisplayed(expiryDate);
		Assert.assertTrue(expiryDateValidation);
		String cvvNoValue = readValueFromExcel("BookingDetails", 1, 17);
		WebElement cvvNo = getCccvv();
		sendKeys(cvvNo, cvvNoValue);
		boolean cvvNoValidation = isDisplayed(cvvNo);
		Assert.assertTrue(cvvNoValidation);
		click(getBooknow());
	}
	public void userClickTheCancelButtonToCancelTheBookedHotel() {
		   click(getCancel());
		   alertAccept();
	}

	
}
