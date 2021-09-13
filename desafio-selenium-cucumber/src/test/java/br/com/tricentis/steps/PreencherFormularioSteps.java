package br.com.tricentis.steps;

import org.junit.Assert;

import br.com.tricentis.pageObjects.FormularioPage;
import br.com.tricentis.utils.DataUtils;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PreencherFormularioSteps {

	private FormularioPage formulario;

	@Given("que eu estou no site da Tricentis")
	public void que_eu_estou_no_site_da_tricentis() {
		this.formulario = new FormularioPage();
	}

	@Given("seleciono a Make")
	public void seleciono_a_make() {
		formulario.selectMake("BMW");
	}

	@Given("seleciono o Model")
	public void seleciono_o_model() {
		formulario.selectModel("Motorcycle");
	}

	@Given("informo o Cylinder Capacity")
	public void informo_o_cylinder_capacity() {
		formulario.preencherCylinderCapacity("350");
	}

	@Given("informo o Engine Performance")
	public void informo_o_engine_performance() {
		formulario.preencherEnginePerformance("1000");
	}

	@Given("digito a Date of Manufacture")
	public void digito_a_date_of_manufacture() {
		formulario.preencherDateManufacture("02/01/2012");
	}

	@Given("seleciono o Number of Seats")
	public void seleciono_o_number_of_seats() {
		formulario.selectNumberSeats("2");
	}

	@Given("seleciono o Right Hand Drive")
	public void seleciono_o_right_hand_drive() {
		formulario.selecionaRightHandDrive("No");
	}

	@Given("seleciono o Number of Seats Motorcycle")
	public void seleciono_o_number_of_seats_motorcycle() {
		formulario.selectNumberSeatsMotorcycle("2");
	}

	@Given("seleciono o Fuel Type")
	public void seleciono_o_fuel_type() {
		formulario.selectFuel("Petrol");
	}

	@Given("informo o Payload")
	public void informo_o_Payload() {
		formulario.preencherPayload("50");
	}

	@Given("informo o Total Weight")
	public void informo_o_total_weight() {
		formulario.preencherTotalWeight("3500");
	}

	@Given("informo o List Price")
	public void informo_o_list_price() {
		formulario.preencherListPrice("57999");
	}

	@Given("informo o License Plate Number")
	public void informo_o_license_plate_number() {
		formulario.preencherLicensePlateNumber("SW45F44");
	}

	@Given("informo o Annual Mileage")
	public void informo_o_annual_mileage() {
		formulario.preencherAnnualMileage("25000");
	}

	@Then("clico em Next para Insurance Data")
	public void clico_em_next_para_insurance_data() {
		formulario.clicarNextInsurantData();
	}

	@Given("informo o First Name")
	public void informo_o_First_Name() {
		formulario.preencherFirtsName("Carlos");
	}

	@Given("informo o Last Name")
	public void informo_o_Last_Name_() {
		formulario.preencherLastName("Souza");
	}

	@Given("informo o Date of Birth")
	public void informo_o_date_of_birth() {
		formulario.preencherBirthdate("04/05/1990");
	}

	@Given("seleciono o Gender")
	public void seleciono_o_gender() {
		formulario.selecionaGender("Male");
	}

	@Given("informo o Street Address")
	public void informo_o_street_address() {
		formulario.preencherStreetAddress("Cornelia Street");
	}

	@Given("seleciono o Country")
	public void seleciono_o_country() {
		formulario.selectCountry("United States");
	}

	@Given("informo o Zip Code")
	public void informo_o_zip_code() {
		formulario.preencherZipcode("66577");
	}

	@Given("informo a City")
	public void informo_a_city() {
		formulario.preencherCity("New York");
	}

	@Given("seleciono o Occupation")
	public void seleciono_o_occupation() {
		formulario.selectOccupation("Employee");
	}

	@Given("seleciono Hobbies")
	public void seleciono_hobbies() {
		formulario.selecionaHobbies("Skydiving");
	}

	@Given("informo o Website")
	public void informo_o_website() {
		formulario.preencherWebsite("www.selenium.dev");
	}

	@Then("clico em Next para Product Data")
	public void clico_em_next_para_product_data() {
		formulario.clicarNextProductData();
	}

	@Given("informo a Start Date")
	public void informo_a_start_date() {
		formulario.informarStartData(DataUtils.obterDataFutura(45));
	}

	@Given("seleciono o Insurance Sum")
	public void seleciono_o_insurance_sum() {
		formulario.selectInsuranceSum("25.000.000,00");
	}

	@Given("seleciono Merit Rating")
	public void seleciono_merit_rating() {
		formulario.selectMeritRating("Super Bonus");
	}

	@Given("seleciono Damage Insurance")
	public void seleciono_damage_insurance() {
		formulario.selectDamageInsurance("Full Coverage");
	}

	@Given("selecino o Optional Products")
	public void selecino_o_optional_products() {
		formulario.selecionaOptionalProducts("Euro Protection");
	}

	@Given("seleciono o Courtesy Car")
	public void seleciono_o_courtesy_car() {
		formulario.selectCourtesyCar("No");
	}

	@Then("clico em Next para Select Price Option")
	public void clico_em_next_para_select_price_option() {
		formulario.clicarNextSelectPriceOption();
	}

	@Given("seleciono o Price Opcion")
	public void seleciono_o_price_opcion() {
		formulario.selecionarPriceOption();
	}

	@Given("clico em Next para Send Quote")
	public void clico_em_next_para_send_quote() {
		formulario.clicarNextSendQuote();
	}

	@Given("que informo o Email")
	public void que_informo_o_email() {
		formulario.informarEmail("cstest@mail.com");
	}

	@Given("informo o Phone")
	public void informo_o_phone() {
		formulario.informarPhone("33296678");
	}

	@Given("informo o Username")
	public void informo_o_username() {
		formulario.informarUsername("SouzC");
	}

	@Given("informo o Password")
	public void informo_o_password() {
		formulario.informarPassword("Senha1!");
	}

	@Given("informo o Confirm Password")
	public void informo_o_confirm_password() {
		formulario.informarConfirmPassword("Senha1!");
	}

	@Given("informo o Comments")
	public void informo_o_comments() {
		formulario.informarComments("Validando formulario");
	}

	@When("clico em Send")
	public void clico_em_send() {
		formulario.clicarSendEmail();
	}

	@Then("vejo a mensagem Sending email success")
	public void vejo_a_mensagem_Sending_email_success() throws InterruptedException {
		formulario.espereCarregar();
		Assert.assertEquals("Sending e-mail success!", formulario.obterMensagem());
	}

	@Then("clico no botao OK")
	public void clico_no_botao_ok() {
		formulario.clicarOK();
		formulario.fecharNavegador();
	}

}
