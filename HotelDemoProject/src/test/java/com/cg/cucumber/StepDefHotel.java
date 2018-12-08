package com.cg.cucumber;

import java.util.List;
import java.util.regex.Pattern;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefHotel {
	

	static WebDriver driver = null;
	
	static  HotelPageFactoryLogin hotelFact = null;
	
	@Given("^user is on hotel booking form$")
	public void user_is_on_hotel_booking_form()  {
	    // Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shipkuma\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/shipkuma/Documents/MODULE_3/App/hotelbooking.html");
		hotelFact = new HotelPageFactoryLogin(driver);
		
	}

	@Then("^display the confirm message$")
	public void display_the_confirm_message() throws InterruptedException {
	   if(hotelFact.acHeading.equals("Hotel Booking Form")) {
		   System.out.println("matching");
	   }else {
		   System.out.println("not matching");
	   }
	   Thread.sleep(1000);
	   driver.close();
	    
	}

	@When("^user leaves the first name field blank and click the submit button$")
	public void user_leaves_the_first_name_field_blank_and_click_the_submit_button() throws InterruptedException {
	    hotelFact.setFname("");
	    Thread.sleep(1000);
	    hotelFact.setButton();
	    Thread.sleep(1000);
	   
	}

	@Then("^display the pop up message$")
	public void display_the_pop_up_message() throws InterruptedException  {
	   String altMsg = driver.switchTo().alert().getText();
	   Thread.sleep(1000);
	   driver.switchTo().alert().accept();
	   System.out.println("message"+altMsg);
	   driver.close();
	    
	}

	@When("^user leaves the last name field empty and click the submit$")
	public void user_leaves_the_last_name_field_empty_and_click_the_submit() throws InterruptedException {
		hotelFact.setFname("Shipra");
		Thread.sleep(1000);
	    hotelFact.setLname("");
	    Thread.sleep(1000);
	    hotelFact.setButton();
	}

	@Then("^display message to fill$")
	public void display_message_to_fill() throws InterruptedException  {
		String altMsg = driver.switchTo().alert().getText();
		   Thread.sleep(1000);
		   driver.switchTo().alert().accept();
		   System.out.println("message"+altMsg);
		   driver.close();
	}


	@When("^user skips the mobile field and click the button to submit$")
	public void user_skips_the_mobile_field_and_click_the_button_to_submit() throws InterruptedException {
		hotelFact.setFname("Shipra");
		Thread.sleep(1000);
	    hotelFact.setLname("Kumari");
	    Thread.sleep(1000);
	    hotelFact.setMobile("");
	    Thread.sleep(1000);
	    hotelFact.setButton();
	   
	}

	@Then("^display the message$")
	public void display_the_message() throws InterruptedException  {
		String altMsg = driver.switchTo().alert().getText();
		   Thread.sleep(1000);
		   driver.switchTo().alert().accept();
		   System.out.println("message"+altMsg);
		   driver.close();
	    
	}

	@When("^user does not enter the email and click the submit button$")
	public void user_does_not_enter_the_email_and_click_the_submit_button() throws InterruptedException  {
		hotelFact.setFname("Shipra");
		Thread.sleep(1000);
	    hotelFact.setLname("Kumari");
	    Thread.sleep(1000);
	    hotelFact.setMobile("9939033389");
	    Thread.sleep(1000);
	    hotelFact.setEmail("");
	    Thread.sleep(1000);
	    hotelFact.setButton();
	    
	}

	@Then("^display appropriate message$")
	public void display_appropriate_message() throws InterruptedException {
		String altMsg = driver.switchTo().alert().getText();
		   Thread.sleep(1000);
		   driver.switchTo().alert().accept();
		   System.out.println("message"+altMsg);
		   driver.close();
	    
	}

	@When("^user does not enter address and click submit$")
	public void user_does_not_enter_address_and_click_submit()  {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("^show the message to fill$")
	public void show_the_message_to_fill() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("^user does not select the city$")
	public void user_does_not_select_the_city()  {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("^display the message to select$")
	public void display_the_message_to_select()  {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^user does not select the state$")
	public void user_does_not_select_the_state()  {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^display the pop up to select$")
	public void display_the_pop_up_to_select()  {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("^user forgets to enter card holder name and clicks submit$")
	public void user_forgets_to_enter_card_holder_name_and_clicks_submit()  {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("^message should be shown$")
	public void message_should_be_shown() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("^user forgets to enter Debit card number and clicks submit$")
	public void user_forgets_to_enter_Debit_card_number_and_clicks_submit() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^message should be shown to fill$")
	public void message_should_be_shown_to_fill(){
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("^user does not enter the CVV$")
	public void user_does_not_enter_the_CVV() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("^user will get the message$")
	public void user_will_get_the_message() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^user skips to enter expiration month$")
	public void user_skips_to_enter_expiration_month()  {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("^user gets the message to fill$")
	public void user_gets_the_message_to_fill()  {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("^user does not enter the expiry year$")
	public void user_does_not_enter_the_expiry_year()  {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("^pop up msg is displayed$")
	public void pop_up_msg_is_displayed() {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("^user enters the all valid data$")
	public void user_enters_the_all_valid_data()  {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^display the success message$")
	public void display_the_success_message()  {
	    // Write code here that turns the phrase above into concrete actions
	    
	}
	
// method to validate valid first name

	@When("^user enters invalid first name$")
	public void user_enters_invalid_first_name()  {
	    
	    
	}

	@Then("^display msg to valid first name$")
	public void display_msg_to_valid_first_name() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^user enters invalid last name and cliks submit$")
	public void user_enters_invalid_last_name_and_cliks_submit() {
	    // Write code here that turns the phrase above into concrete actions
	  
	}

	@Then("^display msg to valid last name$")
	public void display_msg_to_valid_last_name()  {
	    // Write code here that turns the phrase above into concrete actions
	  
	}

	@When("^user enters wrong pattern mobile number and click submit$")
	public void user_enters_wrong_pattern_mobile_number_and_click_submit(DataTable arg1) {
	    
	   
	}

	@Then("^show the error message$")
	public void show_the_error_message(){
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("^user enters wrong pattern email id and click submit$")
	public void user_enters_wrong_pattern_email_id_and_click_submit(DataTable arg1) throws InterruptedException{
		hotelFact.setFname("Shipra");
		Thread.sleep(1000);
	    hotelFact.setLname("Kumari");
	    Thread.sleep(1000);
	    List<String> emailList = arg1.asList(String.class);
	    String data = null;
	    for(String eList:emailList ) {
	    	data=eList;
	    	hotelFact.getEmail().clear();
	    	Thread.sleep(100);
	    	hotelFact.setEmail(eList);
	    	Thread.sleep(1000);
	    	hotelFact.setButton();
	    	if(Pattern.matches("[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}", data)) {
	    		 String msg = driver.switchTo().alert().getText();
	    		driver.switchTo().alert().accept();
	    		System.out.println("message"+msg);
	    	}
	    	else {
	    		System.out.println("matched");
	    	}
	    	
	    }
	  
	   
	}

	@Then("^error message is displayed$")
	public void error_message_is_displayed() throws InterruptedException{
		String msg = driver.switchTo().alert().getText();
		Thread.sleep(100);
		driver.switchTo().alert().accept();
		Thread.sleep(100);
		System.out.println("message"+msg);
	}

	@When("^user enters invalid card holder name$")
	public void user_enters_invalid_card_holder_name()  {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^display msg to valid card holder name$")
	public void display_msg_to_valid_card_holder_name()  {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^user enters invalid CVV and submit$")
	public void user_enters_invalid_CVV_and_submit(DataTable arg1)  {
	    // Write code here that turns the phrase above into concrete actions
	    // For automatic transformation, change DataTable to one of
	    // List<YourType>, List<List<E>>, List<Map<K,V>> or Map<K,V>.
	    // E,K,V must be a scalar (String, Integer, Date, enum etc)
	    
	}

	@Then("^display msg to valid CVV$")
	public void display_msg_to_valid_CVV()  {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("^user enters invalid expiration month$")
	public void user_enters_invalid_expiration_month()  {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("^display msg to valid expiration month$")
	public void display_msg_to_valid_expiration_month() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@When("^user enters invalid expiration year$")
	public void user_enters_invalid_expiration_year() {
	    // Write code here that turns the phrase above into concrete actions
	    
	}

	@Then("^display message to valid expiration year$")
	public void display_message_to_valid_expiration_year()  {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@When("^user enters the (\\d+)$")
	public void user_enters_the(int arg1)  {
	    // Write code here that turns the phrase above into concrete actions
	   
	}

	@Then("^allocate the (\\d+) to the user$")
	public void allocate_the_to_the_user(int arg1) {
	    // Write code here that turns the phrase above into concrete actions
	   
	}



}
