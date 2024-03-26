package com.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass;

public class SelectHotelPage extends BaseClass {
	
	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "username")
	private WebElement txtusername;
	@FindBy(id = "password")
	private WebElement txtpassword;
	@FindBy(id = "login")
	private WebElement btnLogin;
	@FindBy(xpath = "//input[@id='radiobutton_0']")
	private WebElement radiobutton;
	@FindBy(xpath = "//input[@id='continue']")
	private WebElement continuebutton;
	@FindBy(id = "cancel")
	private WebElement cancelbutton;
	@FindBy(xpath = "//td[text()='Book A Hotel ']")
	private WebElement bookhotel ;
	@FindBy(xpath = "//label[text()='Please Select a Hotel']")
	private WebElement errormsg ;
	@FindBy(xpath="//td[text()='Select Hotel ']")
	private WebElement selectHotel;
	@FindBy(xpath="//a[text()='Search Hotel']")
	private WebElement searchHotelLink;
	@FindBy(xpath="//td[text()='Search Hotel ']")
	private WebElement searchHotelTitle;
	
	
	public WebElement getSearchHotelTitle() {
		return searchHotelTitle;
	}
	public WebElement getSearchHotelLink() {
		return searchHotelLink;
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
	public WebElement getRadiobutton() {
		return radiobutton;
	}
	public WebElement getContinuebutton() {
		return continuebutton;
	}
	public WebElement getCancelbutton() {
		return cancelbutton;
	}
	public WebElement getBookhotel() {
		return bookhotel;
	}
	public WebElement getErrormsg() {
		return errormsg;
	}
	public WebElement getSelectHotel() {
		return selectHotel;
	}
	

	public void userSelecTheHotelClickTheContinueButton() {
        click(getRadiobutton());
        click(getContinuebutton());
	}

	public void userShouldDirectToTheBookingPage(String booktHotel) {   
		String booktHotelPage = getText(getBookhotel());
		Assert.assertEquals("Verify the book hotel page", booktHotel, booktHotelPage);
	}
	public void userClickTheContinueButton() {
		click(getContinuebutton());   
	}
	public void userVerifyTheErrorMessageIsDisplayed(String selectHotelError) {
		String selectHotelErrorMsg = getText(getErrormsg());
		Assert.assertEquals("Verify select hotel error message", selectHotelError, selectHotelErrorMsg);
	}

	public void userClickTheCancelButton() {
        click(getCancelbutton());
	}
	public void userShouldRedirectedToTheSearchHotelPage(String searchtHotel) {
		String searchtHotelPge= getText(getSearchHotelTitle());
		Assert.assertEquals("Verify the search hotel page", searchtHotel, searchtHotelPge);
	}
	public void userClickTheSearchHotelLink() {
		 click(getSearchHotelLink());  
	}

}
