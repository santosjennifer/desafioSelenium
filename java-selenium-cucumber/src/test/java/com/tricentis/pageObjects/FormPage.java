package com.tricentis.pageObjects;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.WebElement;

public class FormPage extends DriverPage {

	private static final String URL = "http://sampleapp.tricentis.com/101/app.php";

	public FormPage() {
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

	public void informCylinderCapacity(String cylinderCapacity) {
		this.browser.findElement(By.id("cylindercapacity")).sendKeys(cylinderCapacity);
	}

	public void informEnginePerformance(String enginePerformance) {
		this.browser.findElement(By.id("engineperformance")).sendKeys(enginePerformance);
	}

	public void informDateManufacture(String dateManufacture) {
		this.browser.findElement(By.id("dateofmanufacture")).sendKeys(dateManufacture);
	}

	public void selectNumberSeats(String numberSeats) {
		WebElement selectElement = browser.findElement(By.id("numberofseats"));
		Select dropDown = new Select(selectElement);
		dropDown.selectByVisibleText(numberSeats);
	}

	public void selectRightHandDrive(String rightHandDrive) {
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

	public void informPayload(String payload) {
		this.browser.findElement(By.id("payload")).sendKeys(payload);
	}

	public void informTotalWeight(String totalWeight) {
		this.browser.findElement(By.id("totalweight")).sendKeys(totalWeight);
	}

	public void informListPrice(String listPrice) {
		this.browser.findElement(By.id("listprice")).sendKeys(listPrice);
	}

	public void informLicensePlateNumber(String licensePlateNumber) {
		this.browser.findElement(By.id("licenseplatenumber")).sendKeys(licensePlateNumber);
	}

	public void informAnnualMileage(String annualMileage) {
		this.browser.findElement(By.id("annualmileage")).sendKeys(annualMileage);
	}

	public void clickNextInsurantData() {
		this.browser.findElement(By.id("nextenterinsurantdata")).click();
	}

	public void informFirtsName(String firstName) {
		this.browser.findElement(By.id("firstname")).sendKeys(firstName);
	}

	public void informLastName(String lastName) {
		this.browser.findElement(By.id("lastname")).sendKeys(lastName);
	}

	public void informBirthdate(String birthdate) {
		this.browser.findElement(By.id("birthdate")).sendKeys(birthdate);
	}

	public void selectGender(String gender) {
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

	public void informStreetAddress(String streetAddress) {
		this.browser.findElement(By.id("streetaddress")).sendKeys(streetAddress);
	}

	public void selectCountry(String country) {
		WebElement selectElement = browser.findElement(By.id("country"));
		Select dropDown = new Select(selectElement);
		dropDown.selectByVisibleText(country);
	}

	public void informZipcode(String zipcode) {
		this.browser.findElement(By.id("zipcode")).sendKeys(zipcode);
	}

	public void informCity(String city) {
		this.browser.findElement(By.id("city")).sendKeys(city);
	}

	public void selectOccupation(String occupation) {
		WebElement selectElement = browser.findElement(By.id("occupation"));
		Select dropDown = new Select(selectElement);
		dropDown.selectByVisibleText(occupation);
	}

	public void selectHobbies(String hobbies) {
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

	public void informWebsite(String website) {
		this.browser.findElement(By.id("website")).sendKeys(website);
	}

	public void clickNextProductData() {
		this.browser.findElement(By.id("nextenterproductdata")).click();
	}

	public void informStartData(String startDate) {
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

	public void selectOptionalProducts(String optionalProducts) {
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

	public void clickNextSelectPriceOption() {
		this.browser.findElement(By.id("nextselectpriceoption")).click();
	}

	public void selectPriceOption() {
		this.browser.findElement(By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[2]")).click();
	}

	public void clickNextSendQuote() {
		this.browser.findElement(By.id("nextsendquote")).click();
	}

	public void informEmail(String email) {
		this.browser.findElement(By.id("email")).sendKeys(email);
	}

	public void informPhone(String phone) {
		this.browser.findElement(By.id("phone")).sendKeys(phone);
	}

	public void informUsername(String username) {
		this.browser.findElement(By.id("username")).sendKeys(username);
	}

	public void informPassword(String password) {
		this.browser.findElement(By.id("password")).sendKeys(password);
	}

	public void informConfirmPassword(String confirmPassword) {
		this.browser.findElement(By.id("confirmpassword")).sendKeys(confirmPassword);
	}

	public void informComments(String confirmComments) {
		this.browser.findElement(By.id("Comments")).sendKeys(confirmComments);
	}

	public void clickSendEmail() {
		this.browser.findElement(By.id("sendemail")).click();
	}

	public String getMessage() {
		return this.browser.findElement(By.cssSelector("body>div.sweet-alert.showSweetAlert.visible>h2")).getText();
	}

	public void clickOK() {
		this.browser
				.findElement(By
						.cssSelector("body>div.sweet-alert.showSweetAlert.visible>div.sa-button-container>div>button"))
				.click();
		;
	}

	public void waitLoad() {
		this.browser.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
}
