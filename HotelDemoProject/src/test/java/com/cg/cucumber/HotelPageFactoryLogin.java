package com.cg.cucumber;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class HotelPageFactoryLogin {

	WebDriver driver;

	public HotelPageFactoryLogin(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public HotelPageFactoryLogin() {

	}

	/*@FindBy(xpath = "/html/body/div/h2")
	@CacheLookup
	WebElement acHeading;*/

	@FindBy(id = "txtFirstName")
	@CacheLookup
	WebElement fname;

	@FindBy(id = "txtLastName")
	@CacheLookup
	WebElement lname;

	@FindBy(id = "txtPhone")
	@CacheLookup
	WebElement mobile;

	@FindBy(id = "txtEmail")
	@CacheLookup
	WebElement email;

	@FindBy(xpath = "/html/body/div/div/form/table/tbody/tr[6]/td[2]/textarea")
	@CacheLookup
	WebElement address;

	@FindBy(xpath = "/html/body/div/div/form/table/tbody/tr[7]/td[2]/select")
	@CacheLookup
	WebElement city;

	@FindBy(xpath = "//select[@name='state']")
	@CacheLookup
	WebElement state;

	@FindBy(xpath = "/html/body/div/div/form/table/tbody/tr[10]/td[2]/select")
	@CacheLookup
	int noOfGuest;

	@FindBy(id = "rooms")
	@CacheLookup
	WebElement bookedRooms;

	@FindBy(id = "txtCardholderName")
	@CacheLookup
	WebElement holderName;

	@FindBy(id = "txtDebit")
	@CacheLookup
	WebElement debitCardNo;

	@FindBy(id = "txtCvv")
	@CacheLookup
	WebElement CVV;

	@FindBy(id = "txtMonth")
	@CacheLookup
	WebElement expiryMonth;

	@FindBy(id = "txtYear")
	@CacheLookup
	WebElement expiryYear;

	@FindBy(id = "btnPayment")
	@CacheLookup
	WebElement button;

	// setters

	/*public void setAcHeading(WebElement acHeading) {
		this.acHeading = acHeading;
	}*/

	public void setFname(String name) {
		fname.sendKeys(name);
	}

	public void setLname(String lastname) {
		lname.sendKeys(lastname);
	}

	public void setMobile(String mob) {
		mobile.sendKeys(mob);
	}

	public void setEmail(String emailId) {
		email.sendKeys(emailId);
	}

	public void setAddress(String addrr) {
		address.sendKeys(addrr);
		;
	}

	public void setCity(String cit) {
		Select  cityData = new Select(city);
		cityData.selectByValue(cit);
	}

	public void setState(String sta) {
		Select  stateData = new Select(state);
		stateData.selectByValue(sta);
	}

	public void setNoOfGuest(int guest) {
		noOfGuest = guest;
	}

	public void setHolderName(String holder) {
		holderName.sendKeys(holder);
	}

	public void setDebitCardNo(String debitno) {
		debitCardNo.sendKeys(debitno);
	}

	public void setCVV(String cvv) {
		CVV.sendKeys(cvv);
	}

	public void setExpiryMonth(String expirymonth) {
		expiryMonth.sendKeys(expirymonth);
	}

	public void setExpiryYear(String expiryyear) {
		expiryYear.sendKeys(expiryyear);
	}

	public void setButton() {
		button.click();
	}

	// getters

	/*public WebElement getAcHeading() {
		return acHeading;
	}*/

	public WebElement getFname() {
		return fname;
	}

	public WebElement getLname() {
		return lname;
	}

	public WebElement getMobile() {
		return mobile;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getAddress() {
		return address;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getState() {
		return state;
	}

	public int getNoOfGuest() {
		return noOfGuest;
	}

	public WebElement getBookedRooms() {
		return bookedRooms;
	}

	public WebElement getHolderName() {
		return holderName;
	}

	public WebElement getDebitCardNo() {
		return debitCardNo;
	}

	public WebElement getCVV() {
		return CVV;
	}

	public WebElement getExpiryMonth() {
		return expiryMonth;
	}

	public WebElement getExpiryYear() {
		return expiryYear;
	}

	public WebElement getButton() {
		return button;
	}
}
