package com.tricentis.steps;

import org.junit.Assert;

import com.tricentis.pageObjects.FormPage;
import com.tricentis.utils.DataUtils;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class InsuranceFormSteps {

	private FormPage form;
	
	@Given("go to the website Tricentis")
	public void go_to_the_website_tricentis() {
		this.form = new FormPage();	
	}

	@Given("enter all vehicle data")
	public void enter_all_vehicle_data() {
		form.selectMake("BMW");
		form.selectModel("Motorcycle");
		form.informCylinderCapacity("350");
		form.informEnginePerformance("1000");
		form.informDateManufacture("02/01/2012");
		form.selectNumberSeats("2");
		form.selectRightHandDrive("No");
		form.selectNumberSeatsMotorcycle("2");
		form.selectFuel("Petrol");
		form.informPayload("50");
		form.informTotalWeight("3500");
		form.informListPrice("57999");
		form.informLicensePlateNumber("SW45F44");
		form.informAnnualMileage("25000");		
		form.clickNextInsurantData();
	}

	@Given("enter all insurant data")
	public void enter_all_insurant_data() {
		form.informFirtsName("Jerry");
		form.informLastName("Zen");
		form.informBirthdate("04/05/1990");
		form.selectGender("Male");
		form.informStreetAddress("Cornelia Street");
		form.selectCountry("United States");
		form.informZipcode("66577");
		form.informCity("New York");
		form.selectOccupation("Employee");
		form.selectHobbies("Skydiving");
		form.informWebsite("www.selenium.dev");		
		form.clickNextProductData();
	}

	@Given("enter all product data")
	public void enter_all_product_data() {
		form.informStartData(DataUtils.obterDataFutura(45));
		form.selectInsuranceSum("25.000.000,00");
		form.selectMeritRating("Super Bonus");
		form.selectDamageInsurance("Full Coverage");
		form.selectOptionalProducts("Euro Protection");
		form.selectCourtesyCar("No");		
		form.clickNextSelectPriceOption();
	}

	@Given("select price option")
	public void select_price_option() {
		form.selectPriceOption();
		form.clickNextSendQuote();
	}

	@When("send quote")
	public void send_quote() {
		form.informEmail("cstest@mail.com");
		form.informPhone("33296678");
		form.informUsername("SouzC");
		form.informPassword("Pass1!");
		form.informConfirmPassword("Pass1!");
		form.informComments("Validating the form");
		form.clickSendEmail();
	}

	@Then("valid message email sent successfully")
	public void valid_message_email_sent_successfully() {
		form.waitLoad();
		Assert.assertEquals("Sending e-mail success!", form.getMessage());
		
		form.clickOK();
		form.fecharNavegador();
	}

}
