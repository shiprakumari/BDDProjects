package com.cg.cucumber;

import static org.junit.Assert.assertEquals;

import java.util.List;
import java.util.regex.Pattern;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class StepDefHotel {

	static WebDriver driver = null;

	static HotelPageFactoryLogin hotelFact = null;

	@Given("^user is on hotel booking form$")
	public void user_is_on_hotel_booking_form() {
		// Write code here that turns the phrase above into concrete actions
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\shipkuma\\Desktop\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("file:///C:/Users/shipkuma/Documents/MODULE_3/App/hotelbooking.html");
		hotelFact = new HotelPageFactoryLogin(driver);

	}

	@Then("^display the confirm message$")
	public void display_the_confirm_message() throws InterruptedException {
		
		String hotelTitle = driver.getTitle();
		System.out.println(hotelTitle);
		if(hotelTitle.equals("Hotel Booking")) {
			System.out.println("title matched");
		}
		else {
			System.out.println("title not matched");
			Thread.sleep(2000);
			driver.close();
		}

	}

	@When("^user leaves the first name field blank and click the submit button$")
	public void user_leaves_the_first_name_field_blank_and_click_the_submit_button() throws InterruptedException {
		hotelFact.setFname("");
		Thread.sleep(1000);
		hotelFact.setButton();
		Thread.sleep(1000);

	}

	@Then("^display the pop up message$")
	public void display_the_pop_up_message() throws InterruptedException {
		String altMsg = driver.switchTo().alert().getText();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		System.out.println("message" + altMsg);
		driver.close();

	}

	@When("^user leaves the last name field empty and click the submit$")
	public void user_leaves_the_last_name_field_empty_and_click_the_submit() throws InterruptedException {
		hotelFact.setFname("Shipra");
		Thread.sleep(1000);
		hotelFact.setLname("");
		Thread.sleep(1000);
		hotelFact.setButton();
		Thread.sleep(1000);
	}

	@Then("^display message to fill$")
	public void display_message_to_fill() throws InterruptedException {
		String altMsg1 = driver.switchTo().alert().getText();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		System.out.println("message" + altMsg1);
		driver.close();
	}

	@When("^user does not enter the email and click the submit button$")
	public void user_does_not_enter_the_email_and_click_the_submit_button() throws InterruptedException {
		hotelFact.setFname("Shipra");
		Thread.sleep(1000);
		hotelFact.setLname("Kumari");
		Thread.sleep(1000);
		hotelFact.setEmail("");
		Thread.sleep(1000);
		hotelFact.setButton();

	}

	@Then("^display appropriate message$")
	public void display_appropriate_message() throws InterruptedException {
		String altMsg2 = driver.switchTo().alert().getText();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		System.out.println("message" + altMsg2);
		driver.close();

	}

	@When("^user skips the mobile field and click the button to submit$")
	public void user_skips_the_mobile_field_and_click_the_button_to_submit() throws InterruptedException {
		hotelFact.setFname("Shipra");
		Thread.sleep(1000);
		hotelFact.setLname("Kumari");
		Thread.sleep(1000);
		hotelFact.setEmail("shipra@gmail.com");
		hotelFact.setMobile("");
		Thread.sleep(1000);
		hotelFact.setButton();

	}

	@Then("^display the message$")
	public void display_the_message() throws InterruptedException {
		String altMsg3 = driver.switchTo().alert().getText();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		System.out.println("message" + altMsg3);
		driver.close();

	}

	@When("^user does not enter address and click submit$")
	public void user_does_not_enter_address_and_click_submit() throws InterruptedException {
		hotelFact.setFname("Shipra");
		Thread.sleep(1000);
		hotelFact.setLname("Kumari");
		Thread.sleep(1000);
		hotelFact.setEmail("shipra@gmail.com");
		hotelFact.setMobile("9939033389");
		Thread.sleep(1000);
		hotelFact.setAddress("");
		hotelFact.setButton();

	}

	@Then("^show the message to fill$")
	public void show_the_message_to_fill() throws InterruptedException {
		String altMsg4 = driver.switchTo().alert().getText();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		System.out.println("message" + altMsg4);
		driver.close();

	}

	@When("^user does not select the city$")
	public void user_does_not_select_the_city() throws InterruptedException {
		hotelFact.setFname("Shipra");
		Thread.sleep(1000);
		hotelFact.setLname("Kumari");
		Thread.sleep(1000);
		hotelFact.setEmail("shipra@gmail.com");
		hotelFact.setMobile("9939033389");
		Thread.sleep(1000);
		hotelFact.setAddress("Patna, Bihar");
		Thread.sleep(1000);
		hotelFact.setCity("Select City");
		Thread.sleep(1000);
		hotelFact.setButton();

	}

	@Then("^display the message to select$")
	public void display_the_message_to_select() throws InterruptedException {
		String altMsg5 = driver.switchTo().alert().getText();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		System.out.println("message" + altMsg5);
		driver.close();

	}

	@When("^user does not select the state$")
	public void user_does_not_select_the_state() throws InterruptedException {
		hotelFact.setFname("Shipra");
		Thread.sleep(1000);
		hotelFact.setLname("Kumari");
		Thread.sleep(1000);
		hotelFact.setEmail("shipra@gmail.com");
		hotelFact.setMobile("9939033389");
		Thread.sleep(1000);
		hotelFact.setAddress("Patna, Bihar");
		Thread.sleep(1000);
		hotelFact.setCity("Pune");
		Thread.sleep(1000);
		hotelFact.setState("Select State");
		Thread.sleep(1000);
		hotelFact.setButton();

	}

	@Then("^display the pop up to select$")
	public void display_the_pop_up_to_select() throws InterruptedException {
		String altMsg6 = driver.switchTo().alert().getText();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		System.out.println("message" + altMsg6);
		driver.close();

	}

	@When("^user forgets to enter card holder name and clicks submit$")
	public void user_forgets_to_enter_card_holder_name_and_clicks_submit() throws InterruptedException {
		hotelFact.setFname("Shipra");
		Thread.sleep(1000);
		hotelFact.setLname("Kumari");
		Thread.sleep(1000);
		hotelFact.setEmail("shipra@gmail.com");
		hotelFact.setMobile("9939033389");
		Thread.sleep(1000);
		hotelFact.setAddress("Patna, Bihar");
		Thread.sleep(1000);
		hotelFact.setCity("Pune");
		Thread.sleep(1000);
		hotelFact.setState("Maharashtra");
		Thread.sleep(1000);
		hotelFact.setHolderName("");
		Thread.sleep(1000);
		hotelFact.setButton();

	}

	@Then("^message should be shown$")
	public void message_should_be_shown() throws InterruptedException {
		String altMsg7 = driver.switchTo().alert().getText();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		System.out.println("message" + altMsg7);
		driver.close();

	}

	@When("^user forgets to enter Debit card number and clicks submit$")
	public void user_forgets_to_enter_Debit_card_number_and_clicks_submit() throws InterruptedException {
		hotelFact.setFname("Shipra");
		Thread.sleep(1000);
		hotelFact.setLname("Kumari");
		Thread.sleep(1000);
		hotelFact.setEmail("shipra@gmail.com");
		hotelFact.setMobile("9939033389");
		Thread.sleep(1000);
		hotelFact.setAddress("Patna, Bihar");
		Thread.sleep(1000);
		hotelFact.setCity("Pune");
		Thread.sleep(1000);
		hotelFact.setState("Maharashtra");
		Thread.sleep(1000);
		hotelFact.setHolderName("Shipra Kumari");
		Thread.sleep(1000);
		hotelFact.setDebitCardNo("");
		Thread.sleep(1000);
		hotelFact.setButton();

	}

	@Then("^message should be shown to fill$")
	public void message_should_be_shown_to_fill() throws InterruptedException {
		String altMsg8 = driver.switchTo().alert().getText();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		System.out.println("message" + altMsg8);
		driver.close();

	}

	@When("^user does not enter the CVV$")
	public void user_does_not_enter_the_CVV() throws InterruptedException {
		hotelFact.setFname("Shipra");
		Thread.sleep(1000);
		hotelFact.setLname("Kumari");
		Thread.sleep(1000);
		hotelFact.setEmail("shipra@gmail.com");
		hotelFact.setMobile("9939033389");
		Thread.sleep(1000);
		hotelFact.setAddress("Patna, Bihar");
		Thread.sleep(1000);
		hotelFact.setCity("Pune");
		Thread.sleep(1000);
		hotelFact.setState("Maharashtra");
		Thread.sleep(1000);
		hotelFact.setHolderName("Shipra Kumari");
		Thread.sleep(1000);
		hotelFact.setDebitCardNo("67346237845237");
		Thread.sleep(1000);
		hotelFact.setCVV("");
		Thread.sleep(1000);
		hotelFact.setButton();

	}

	@Then("^user will get the message$")
	public void user_will_get_the_message() throws InterruptedException {
		String altMsg9 = driver.switchTo().alert().getText();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		System.out.println("message" + altMsg9);
		driver.close();

	}

	@When("^user skips to enter expiration month$")
	public void user_skips_to_enter_expiration_month() throws InterruptedException {
		hotelFact.setFname("Shipra");
		Thread.sleep(1000);
		hotelFact.setLname("Kumari");
		Thread.sleep(1000);
		hotelFact.setEmail("shipra@gmail.com");
		hotelFact.setMobile("9939033389");
		Thread.sleep(1000);
		hotelFact.setAddress("Patna, Bihar");
		Thread.sleep(1000);
		hotelFact.setCity("Pune");
		Thread.sleep(1000);
		hotelFact.setState("Maharashtra");
		Thread.sleep(1000);
		hotelFact.setHolderName("Shipra Kumari");
		Thread.sleep(1000);
		hotelFact.setDebitCardNo("67346237845237");
		Thread.sleep(1000);
		hotelFact.setCVV("324");
		Thread.sleep(1000);
		hotelFact.setExpiryMonth("");
		Thread.sleep(1000);
		hotelFact.setButton();

	}

	@Then("^user gets the message to fill$")
	public void user_gets_the_message_to_fill() throws InterruptedException {
		String altMsg10 = driver.switchTo().alert().getText();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		System.out.println("message" + altMsg10);
		driver.close();

	}

	@When("^user does not enter the expiry year$")
	public void user_does_not_enter_the_expiry_year() throws InterruptedException {
		hotelFact.setFname("Shipra");
		Thread.sleep(1000);
		hotelFact.setLname("Kumari");
		Thread.sleep(1000);
		hotelFact.setEmail("shipra@gmail.com");
		hotelFact.setMobile("9939033389");
		Thread.sleep(1000);
		hotelFact.setAddress("Patna, Bihar");
		Thread.sleep(1000);
		hotelFact.setCity("Pune");
		Thread.sleep(1000);
		hotelFact.setState("Maharashtra");
		Thread.sleep(1000);
		hotelFact.setHolderName("Shipra Kumari");
		Thread.sleep(1000);
		hotelFact.setDebitCardNo("67346237845237");
		Thread.sleep(1000);
		hotelFact.setCVV("324");
		Thread.sleep(1000);
		hotelFact.setExpiryMonth("july");
		Thread.sleep(1000);
		hotelFact.setExpiryYear("");
		Thread.sleep(1000);
		hotelFact.setButton();

	}

	@Then("^pop up msg is displayed$")
	public void pop_up_msg_is_displayed() throws InterruptedException {
		String altMsg11 = driver.switchTo().alert().getText();
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
		System.out.println("message" + altMsg11);
		driver.close();
	}

	@When("^user enters the all valid data$")
	public void user_enters_the_all_valid_data() throws InterruptedException {
		hotelFact.setFname("Shipra");
		Thread.sleep(1000);
		hotelFact.setLname("Kumari");
		Thread.sleep(1000);
		hotelFact.setEmail("shipra@gmail.com");
		hotelFact.setMobile("9939033389");
		Thread.sleep(1000);
		hotelFact.setAddress("Patna, Bihar");
		Thread.sleep(1000);
		hotelFact.setCity("Pune");
		Thread.sleep(1000);
		hotelFact.setState("Maharashtra");
		Thread.sleep(1000);
		hotelFact.setHolderName("Shipra Kumari");
		Thread.sleep(1000);
		hotelFact.setDebitCardNo("67346237845237");
		Thread.sleep(1000);
		hotelFact.setCVV("324");
		Thread.sleep(1000);
		hotelFact.setExpiryMonth("july");
		Thread.sleep(1000);
		hotelFact.setExpiryYear("2021");
		Thread.sleep(1000);
		hotelFact.setButton();

	}

	@Then("^display the success message$")
	public void display_the_success_message() throws InterruptedException {

		System.out.println("booking Confirmed");
		Thread.sleep(1000);
		driver.close();
	}

// method to validate valid first name

	@When("^user enters wrong pattern email id and click submit$")
	public void user_enters_wrong_pattern_email_id_and_click_submit(DataTable arg1) throws InterruptedException {
		hotelFact.setFname("Shipra");
		Thread.sleep(1000);
		hotelFact.setLname("Kumari");
		Thread.sleep(1000);
		List<String> emailList = arg1.asList(String.class);
		String data = null;
		for (String eList : emailList) {
			data = eList;
			hotelFact.getEmail().clear();
			Thread.sleep(100);
			hotelFact.setEmail(eList);
			Thread.sleep(1000);
			hotelFact.setButton();
			if (Pattern.matches("[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}", data)) {
				System.out.println("matched");
			} else {
				System.out.println(" not matched");
			}
			String msg = driver.switchTo().alert().getText();
			driver.switchTo().alert().accept();
			System.out.println("message" + msg);

		}

	}

	@Then("^error message is displayed$")
	public void error_message_is_displayed() throws InterruptedException {
		driver.close();
	}

	@When("^user enters wrong pattern mobile number and click submit$")
	public void user_enters_wrong_pattern_mobile_number_and_click_submit(DataTable arg1) throws InterruptedException {

		hotelFact.setFname("Shipra");
		Thread.sleep(1000);
		hotelFact.setLname("Kumari");
		Thread.sleep(1000);
		hotelFact.setEmail("shipra@gmail.com");
		List<String> mobList = arg1.asList(String.class);
		String data = null;
		for (String mob : mobList) {
			data = mob;
			hotelFact.getEmail().clear();
			Thread.sleep(100);
			hotelFact.setMobile(mob);
			Thread.sleep(1000);
			hotelFact.setButton();
			if (Pattern.matches("[7-9]{1}[0-9]{9}", data)) {
				System.out.println("matched");
			} else {
				System.out.println(" not matched");
			}
			String msg = driver.switchTo().alert().getText();
			driver.switchTo().alert().accept();
			System.out.println("message" + msg);

		}

	}

	@Then("^show the error message$")
	public void show_the_error_message() throws InterruptedException {
		driver.close();
	}
	@When("^user enters (\\d+)$")
	public void user_enters(int arg1) throws InterruptedException  {
		hotelFact.setFname("Shipra");
		Thread.sleep(1000);
		hotelFact.setLname("Kumari");
		Thread.sleep(1000);
		hotelFact.setEmail("shipra@gmail.com");
		Thread.sleep(1000);
		hotelFact.setMobile("9939033389");
		Thread.sleep(1000);
		hotelFact.setAddress("Patna, Bihar");
		hotelFact.setCity("Pune");
		Thread.sleep(1000);
		hotelFact.setState("Maharashtra");
		Thread.sleep(1000);
		hotelFact.setNoOfGuest(arg1);
		Thread.sleep(2000);
	   
	}

	@Then("^for (\\d+) allocate (\\d+)$")
	public void for_allocate(int arg1, int arg2) {
		if (arg1 <= 3) {
			System.out.println("no of Rooms:" + arg2);
			assertEquals(1, arg2);
		} else if (arg1 <= 6) {
			System.out.println("no of Rooms:" + arg2);
			assertEquals(2, arg2);
		} else if (arg1 <= 9) {
			System.out.println("no of Rooms:" + arg2);
			assertEquals(3, arg2);
		}
	   
	}
}
