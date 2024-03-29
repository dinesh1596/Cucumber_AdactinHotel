package com.pageobjectmanager;

import com.pages.BookHotelPage;
import com.pages.BookedItineraryPage;
import com.pages.LoginPage;
import com.pages.RegisterPage;
import com.pages.SearchHotelPage;
import com.pages.SelectHotelPage;

public class PageObjectManager {

	private RegisterPage registerPage;
	private LoginPage loginPage;
	private SearchHotelPage searchHotelPage;
	private SelectHotelPage selectHotelPage;
	private BookHotelPage bookHotelPage;
	private BookedItineraryPage bookedItineraryPage;
	

	public RegisterPage getRegisterPage() {
		return (registerPage==null)?registerPage=new RegisterPage():registerPage;
	}
	public LoginPage getLoginPage() {
		return (loginPage==null)?loginPage=new LoginPage():loginPage;
	}
	public SearchHotelPage getSearchHotelPage() {
		return (searchHotelPage==null)?searchHotelPage=new SearchHotelPage():searchHotelPage;
	}
	public SelectHotelPage getSelectHotelPage() {
		return (selectHotelPage==null)?selectHotelPage=new SelectHotelPage():selectHotelPage;
	}
	public BookHotelPage getBookHotelPage() {
		return (bookHotelPage==null)?bookHotelPage=new BookHotelPage():bookHotelPage;
	}
	public BookedItineraryPage getBookedItineraryPage() {
		return (bookedItineraryPage==null)?bookedItineraryPage=new BookedItineraryPage():bookedItineraryPage;
	}
	
	
	
	
	
}
