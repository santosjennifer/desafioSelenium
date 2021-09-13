package br.com.tricentis.pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

public class FormularioPage extends DriverPage {

	private static final String URL = "http://sampleapp.tricentis.com/101/app.php";

	public FormularioPage() {
		super(null);
		this.browser.get(URL);
	}

	public void selectMake(String make) {
		WebElement selectElement = browser.findElement(By.id("make"));
		Select dropDown = new Select(selectElement);
		dropDown.selectByVisibleText(make);
	}

	public void selectModel(String model) {
		WebElement selectElement = browser.findElement(By.id("model"));
		Select dropDown = new Select(selectElement);
		dropDown.selectByVisibleText(model);
	}

	public void preencherCylinderCapacity(String cylinderCapacity) {
		this.browser.findElement(By.id("cylindercapacity")).sendKeys(cylinderCapacity);
	}

	public void preencherEnginePerformance(String enginePerformance) {
		this.browser.findElement(By.id("engineperformance")).sendKeys(enginePerformance);
	}

	public void preencherDateManufacture(String dateManufacture) {
		this.browser.findElement(By.id("dateofmanufacture")).sendKeys(dateManufacture);
	}

	public void selectNumberSeats(String numberSeats) {
		WebElement selectElement = browser.findElement(By.id("numberofseats"));
		Select dropDown = new Select(selectElement);
		dropDown.selectByVisibleText(numberSeats);
	}

	public void selecionaRightHandDrive(String rightHandDrive) {
		if (rightHandDrive.equals("Yes")) {
			WebElement radio = browser
					.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[1]/div[7]/p/label[1]/span"));
			radio.click();
		} else if (rightHandDrive.equals("No")) {
			WebElement radio = browser
					.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[1]/div[7]/p/label[2]/span"));
			radio.click();
		}
	}

	public void selectNumberSeatsMotorcycle(String numberSeatsMotorcycle) {
		WebElement selectElement = browser.findElement(By.id("numberofseatsmotorcycle"));
		Select dropDown = new Select(selectElement);
		dropDown.selectByVisibleText(numberSeatsMotorcycle);
	}

	public void selectFuel(String fuel) {
		WebElement selectElement = browser.findElement(By.id("fuel"));
		Select dropDown = new Select(selectElement);
		dropDown.selectByVisibleText(fuel);
	}

	public void preencherPayload(String payload) {
		this.browser.findElement(By.id("payload")).sendKeys(payload);
	}

	public void preencherTotalWeight(String totalWeight) {
		this.browser.findElement(By.id("totalweight")).sendKeys(totalWeight);
	}

	public void preencherListPrice(String listPrice) {
		this.browser.findElement(By.id("listprice")).sendKeys(listPrice);
	}

	public void preencherLicensePlateNumber(String licensePlateNumber) {
		this.browser.findElement(By.id("licenseplatenumber")).sendKeys(licensePlateNumber);
	}

	public void preencherAnnualMileage(String annualMileage) {
		this.browser.findElement(By.id("annualmileage")).sendKeys(annualMileage);
	}

	public void clicarNextInsurantData() {
		this.browser.findElement(By.id("nextenterinsurantdata")).click();
	}

	public void preencherFirtsName(String firstName) {
		this.browser.findElement(By.id("firstname")).sendKeys(firstName);
	}

	public void preencherLastName(String lastName) {
		this.browser.findElement(By.id("lastname")).sendKeys(lastName);
	}

	public void preencherBirthdate(String birthdate) {
		this.browser.findElement(By.id("birthdate")).sendKeys(birthdate);
	}

	public void selecionaGender(String gender) {
		if (gender.equals("Male")) {
			WebElement radio = browser
					.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]/span"));
			radio.click();
		} else if (gender.equals("Female")) {
			WebElement radio = browser
					.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[2]/span"));
			radio.click();
		}
	}

	public void preencherStreetAddress(String streetAddress) {
		this.browser.findElement(By.id("streetaddress")).sendKeys(streetAddress);
	}

	public void selectCountry(String country) {
		WebElement selectElement = browser.findElement(By.id("country"));
		Select dropDown = new Select(selectElement);
		dropDown.selectByVisibleText(country);
	}

	public void preencherZipcode(String zipcode) {
		this.browser.findElement(By.id("zipcode")).sendKeys(zipcode);
	}

	public void preencherCity(String city) {
		this.browser.findElement(By.id("city")).sendKeys(city);
	}

	public void selectOccupation(String occupation) {
		WebElement selectElement = browser.findElement(By.id("occupation"));
		Select dropDown = new Select(selectElement);
		dropDown.selectByVisibleText(occupation);
	}

	public void selecionaHobbies(String hobbies) {
		if (hobbies.equals("Speeding")) {
			WebElement check = browser
					.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[1]"));
			check.click();
		} else if (hobbies.equals("Bungee Jumping")) {
			WebElement check = browser
					.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[2]"));
			check.click();
		} else if (hobbies.equals("Cliff Diving")) {
			WebElement check = browser
					.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[3]"));
			check.click();
		} else if (hobbies.equals("Skydiving")) {
			WebElement check = browser
					.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[4]"));
			check.click();
		} else if (hobbies.equals("Other")) {
			WebElement check = browser
					.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[5]"));
			check.click();
		}
	}

	public void preencherWebsite(String website) {
		this.browser.findElement(By.id("website")).sendKeys(website);
	}

	public void clicarNextProductData() {
		this.browser.findElement(By.id("nextenterproductdata")).click();
	}

	public void informarStartData(String startDate) {
		this.browser.findElement(By.id("startdate")).sendKeys(startDate);
	}

	public void selectInsuranceSum(String insuranceSum) {
		WebElement selectElement = browser.findElement(By.id("insurancesum"));
		Select dropDown = new Select(selectElement);
		dropDown.selectByVisibleText(insuranceSum);
	}

	public void selectMeritRating(String meritRating) {
		WebElement selectElement = browser.findElement(By.id("meritrating"));
		Select dropDown = new Select(selectElement);
		dropDown.selectByVisibleText(meritRating);
	}

	public void selectDamageInsurance(String DamageInsurance) {
		WebElement selectElement = browser.findElement(By.id("damageinsurance"));
		Select dropDown = new Select(selectElement);
		dropDown.selectByVisibleText(DamageInsurance);
	}

	public void selecionaOptionalProducts(String optionalProducts) {
		if (optionalProducts.equals("Euro Protection")) {
			WebElement check = browser
					.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[1]"));
			check.click();
		} else if (optionalProducts.equals("Legal Defense Insurance")) {
			WebElement check = browser
					.findElement(By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[2]"));
			check.click();
		}
	}

	public void selectCourtesyCar(String courtesyCar) {
		WebElement selectElement = browser.findElement(By.id("courtesycar"));
		Select dropDown = new Select(selectElement);
		dropDown.selectByVisibleText(courtesyCar);
	}

	public void clicarNextSelectPriceOption() {
		this.browser.findElement(By.id("nextselectpriceoption")).click();
	}

	public void selecionarPriceOption() {
		this.browser.findElement(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[2]")).click();
	}

	public void clicarNextSendQuote() {
		this.browser.findElement(By.id("nextsendquote")).click();
	}

	public void informarEmail(String email) {
		this.browser.findElement(By.id("email")).sendKeys(email);
	}

	public void informarPhone(String phone) {
		this.browser.findElement(By.id("phone")).sendKeys(phone);
	}

	public void informarUsername(String username) {
		this.browser.findElement(By.id("username")).sendKeys(username);
	}

	public void informarPassword(String password) {
		this.browser.findElement(By.id("password")).sendKeys(password);
	}

	public void informarConfirmPassword(String confirmPassword) {
		this.browser.findElement(By.id("confirmpassword")).sendKeys(confirmPassword);
	}

	public void informarComments(String confirmComments) {
		this.browser.findElement(By.id("Comments")).sendKeys(confirmComments);
	}

	public void clicarSendEmail() {
		this.browser.findElement(By.id("sendemail")).click();
	}

	public String obterMensagem() {
		return this.browser.findElement(By.cssSelector("body>div.sweet-alert.showSweetAlert.visible>h2")).getText();
	}

	public void clicarOK() {
		this.browser
				.findElement(By
						.cssSelector("body>div.sweet-alert.showSweetAlert.visible>div.sa-button-container>div>button"))
				.click();
		;
	}

	public void espereCarregar() {
		this.browser.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
}
