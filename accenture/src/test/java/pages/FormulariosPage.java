package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import support.BaseTest;

public class FormulariosPage extends BaseTest {

	public FormulariosPage() {
		PageFactory.initElements(webDriver, this);

	}

	/**
	 * Mapping Objects
	 */

	@FindBy(id = "entervehicledata")
	private WebElement formRedirecionado;

	@FindBy(id = "make")
	private WebElement selectMakeForm1;

	@FindBy(id = "engineperformance")
	private WebElement performanceForm1;

	@FindBy(id = "dateofmanufacture")
	private WebElement dateForm1;

	@FindBy(xpath = "//select[@name='Number of Seats']")
	private WebElement seatsForm1;

	@FindBy(id = "fuel")
	private WebElement furlForm1;

	@FindBy(id = "listprice")
	private WebElement listpriceForm1;

	@FindBy(id = "licenseplatenumber")
	private WebElement licenseplatenumber;

	@FindBy(id = "annualmileage")
	private WebElement annualmileage;

	@FindBy(id = "engineperformance")
	private WebElement performance;

	@FindBy(id = "nextenterinsurantdata")
	private WebElement nextenterinsurantdata;

	@FindBy(id = "firstname")
	private WebElement firstname;

	@FindBy(id = "lastname")
	private WebElement lastname;

	@FindBy(id = "birthdate")
	private WebElement birthdate;

	@FindBy(xpath = "//label[text()='Female']/span[@class='ideal-radio']")
	private WebElement genderfemale;

	@FindBy(xpath = "//label[text()='Male']/span[@class='ideal-radio']")
	private WebElement gendermale;

	@FindBy(id = "streetaddress")
	private WebElement streetaddress;

	@FindBy(id = "country")
	private WebElement country;

	@FindBy(id = "zipcode")
	private WebElement zipcode;

	@FindBy(id = "city")
	private WebElement city;

	@FindBy(id = "occupation")
	private WebElement occupation;

	@FindBy(id = "bungeejumping")
	private WebElement hobbieOption;

	@FindBy(id = "startdate")
	private WebElement startdate;

	@FindBy(id = "insurancesum")
	private WebElement insurancesum;

	@FindBy(id = "meritrating")
	private WebElement meritrating;

	@FindBy(id = "damageinsurance")
	private WebElement damageinsurance;

	@FindBy(id = "EuroProtection")
	private WebElement euroOption;

	@FindBy(id = "courtesycar")
	private WebElement courtesycar;

	@FindBy(id = "nextselectpriceoption")
	private WebElement nextselectpriceoption;

	@FindBy(id = "nextenterproductdata")
	private WebElement nextenterproductdata;

	@FindBy(xpath = "//input[@id='selectgold']/..//span[@class='ideal-radio']")
	private WebElement selectgold;

	@FindBy(id = "email")
	private WebElement email;

	@FindBy(id = "phone")
	private WebElement phone;

	@FindBy(id = "username")
	private WebElement username;

	@FindBy(id = "password")
	private WebElement password;

	@FindBy(id = "confirmpassword")
	private WebElement confirmpassword;

	@FindBy(id = "sendemail")
	private WebElement sendemail;

	@FindBy(xpath = "//div[@id='xLoaderPrice']/p[text()='Please, complete the first three steps to see the price table.']")
	private WebElement avisoCamposIncompletos;

	@FindBy(id = "cylindercapacity")
	private WebElement cylindercapacity;

	@FindBy(id = "model")
	private WebElement model;

	@FindBy(id = "payload")
	private WebElement payload;

	@FindBy(id = "totalweight")
	private WebElement totalweight;

	@FindBy(id = "numberofseatsmotorcycle")
	private WebElement numberofseatsmotorcycle;

	@FindBy(id = "nextsendquote")
	private WebElement nextsendquote;
	
	@FindBy(xpath = "//div[@class='sweet-alert showSweetAlert visible']")
	private WebElement msgEnvioEmail;

	/**
	 * Getters
	 */

	public WebElement getFormRedirecionado() {
		return formRedirecionado;
	}

	public WebElement getSelectMakeForm1() {
		return selectMakeForm1;
	}

	public WebElement getPerformanceForm1() {
		return performanceForm1;
	}

	public WebElement getDateForm1() {
		return dateForm1;
	}

	public WebElement getSeatsForm1() {
		return seatsForm1;
	}

	public WebElement getFurlForm1() {
		return furlForm1;
	}

	public WebElement getListpriceForm1() {
		return listpriceForm1;
	}

	public WebElement getLicenseplatenumber() {
		return licenseplatenumber;
	}

	public WebElement getAnnualmileage() {
		return annualmileage;
	}

	public WebElement getPerformance() {
		return performance;
	}

	public WebElement getNextenterinsurantdata() {
		return nextenterinsurantdata;
	}

	public WebElement getFirstname() {
		return firstname;
	}

	public WebElement getLastname() {
		return lastname;
	}

	public WebElement getBirthdate() {
		return birthdate;
	}

	public WebElement getGenderfemale() {
		return genderfemale;
	}

	public WebElement getGendermale() {
		return gendermale;
	}

	public WebElement getStreetaddress() {
		return streetaddress;
	}

	public WebElement getCountry() {
		return country;
	}

	public WebElement getZipcode() {
		return zipcode;
	}

	public WebElement getCity() {
		return city;
	}

	public WebElement getHobbieOption() {
		return hobbieOption;
	}

	public WebElement getStartdate() {
		return startdate;
	}

	public WebElement getInsurancesum() {
		return insurancesum;
	}

	public WebElement getMeritrating() {
		return meritrating;
	}

	public WebElement getDamageinsurance() {
		return damageinsurance;
	}

	public WebElement getEuroOption() {
		return euroOption;
	}

	public WebElement getCourtesycar() {
		return courtesycar;
	}

	public WebElement getNextselectpriceoption() {
		return nextselectpriceoption;
	}

	public WebElement getNextenterproductdata() {
		return nextenterproductdata;
	}

	public WebElement getSelectgold() {
		return selectgold;
	}

	public WebElement getEmail() {
		return email;
	}

	public WebElement getPhone() {
		return phone;
	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getConfirmpassword() {
		return confirmpassword;
	}

	public WebElement getSendemail() {
		return sendemail;
	}

	public WebElement getOccupation() {
		return occupation;
	}

	public WebElement getAvisoCamposIncompletos() {
		return avisoCamposIncompletos;
	}

	public WebElement getCylindercapacity() {
		return cylindercapacity;
	}

	public WebElement getModel() {
		return model;
	}

	public WebElement getPayload() {
		return payload;
	}

	public WebElement getTotalweight() {
		return totalweight;
	}

	public WebElement getNumberofseatsmotorcycle() {
		return numberofseatsmotorcycle;
	}

	public WebElement getNextsendquote() {
		return nextsendquote;
	}

	public WebElement getMsgEnvioEmail() {
		return msgEnvioEmail;
	}

}
