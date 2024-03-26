package com.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class BookedItineraryPage extends BaseClass{
	public BookedItineraryPage() {
		PageFactory.initElements(driver, this);
	}
	
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
	
	
	public WebElement getChangePassword() {
		return changePassword;
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
	
	public void userClickTheMyItineraryButtonSearchTheBookedHotelOrderId() throws InterruptedException {
           String orderIdValue=getAttributeValue(getOrderno(),"Value");
           click(getMyItinerary());
           Thread.sleep(5000);
           sendKeys(getOrderid(), orderIdValue);
           click(getSearchhotelid());
	}

	public void userClickTheCancelButtonInCancelColumn() {
          click(getCancel());
          alertAccept();
	}
	public void userVerifyTheCancelMessage(String cancelMsg) throws InterruptedException {
	     String cancelMsgText=getText(getCancelmsg());
	     Assert.assertEquals("Verfiy cancel message", cancelMsg, cancelMsgText);
	    
	}
	public void userClickTheMyItineraryButton() {
	    click(getMyItinerary());	  
	}

	public void userClickTheSearchHotelButton() {
		click(getSearchHotelBtn());
	}

	
	
	

}
