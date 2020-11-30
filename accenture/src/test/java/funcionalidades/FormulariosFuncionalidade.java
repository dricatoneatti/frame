package funcionalidades;

import static org.junit.Assert.assertTrue;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import pages.FormulariosPage;
import support.BaseTest;
import support.PropertiesManager;

public class FormulariosFuncionalidade extends BaseTest {
	private FormulariosPage formPage;
	private PropertiesManager prop;
	private Logger logger;

	public FormulariosFuncionalidade() {
		this.formPage = new FormulariosPage();
		this.prop = new PropertiesManager();
		this.logger = Logger.getLogger(getClass());
	}

	public void validarFormularioRedirecionado() {
		assertTrue(formPage.getFormRedirecionado().isDisplayed());
	}

	public void preencherDadosVeiculo() {
		chooseOption(formPage.getSelectMakeForm1(), prop.getPropWeb("make"));
		formPage.getModel().sendKeys(prop.getPropWeb("model"));
		formPage.getCylindercapacity().sendKeys(prop.getPropWeb("cylinder"));
		formPage.getPerformanceForm1().sendKeys(prop.getPropWeb("kw"));
		formPage.getDateForm1().sendKeys(prop.getPropWeb("date"));
		chooseOption(formPage.getSeatsForm1(), prop.getPropWeb("seats"));
		formPage.getNumberofseatsmotorcycle().sendKeys(prop.getPropWeb("motorCycle"));
		formPage.getTotalweight().sendKeys(prop.getPropWeb("weight"));
		formPage.getPayload().sendKeys(prop.getPropWeb("payload"));
		chooseOption(formPage.getFurlForm1(), prop.getPropWeb("fuel"));
		formPage.getListpriceForm1().sendKeys(prop.getPropWeb("price"));

		waitvisibilityOf(formPage.getAnnualmileage(), 20);
		formPage.getAnnualmileage().sendKeys(prop.getPropWeb("mileage"));
		formPage.getNextenterinsurantdata().click();
	}

	public void preencherInsuranceData() {
		formPage.getFirstname().sendKeys(prop.getPropWeb("name"));
		formPage.getLastname().sendKeys(prop.getPropWeb("lastName"));
		formPage.getBirthdate().sendKeys(prop.getPropWeb("birth"));

		if (prop.getPropWeb("gender").contains("Male")) {
			formPage.getGendermale().click();
		} else {
			formPage.getGenderfemale().click();
		}
		waitvisibilityOf(formPage.getCountry(), 20);
		chooseOption(formPage.getCountry(), prop.getPropWeb("country"));
		formPage.getZipcode().sendKeys(prop.getPropWeb("zipCode"));
		formPage.getCity().sendKeys(prop.getPropWeb("city"));
		chooseOption(formPage.getOccupation(), prop.getPropWeb("ocuppation"));

		WebElement hobby = webDriver.findElement(By.xpath("//label[text()=' " + prop.getPropWeb("hobbies") + "']"));
		hobby.click();
		formPage.getNextenterproductdata().click();

	}

	public void preencherProductData() {
		formPage.getStartdate().sendKeys(prop.getPropWeb("startDate"));
		chooseOption(formPage.getInsurancesum(), prop.getPropWeb("insurance"));
		chooseOption(formPage.getMeritrating(), prop.getPropWeb("merit"));
		chooseOption(formPage.getDamageinsurance(), prop.getPropWeb("damage"));
		WebElement productsOpt = webDriver
				.findElement(By.xpath("//label[text()='" + prop.getPropWeb("optionalProducts") + "']"));
		productsOpt.click();
		chooseOption(formPage.getCourtesycar(), prop.getPropWeb("coutesy"));
		formPage.getNextselectpriceoption().click();
	}

	public void selecionarPriceOption() {
		if (formPage.getAvisoCamposIncompletos().isDisplayed()) {
			logger.info("Não foi preenchido todos os campos obrigatórios");
		} else {
			formPage.getSelectgold().click();
			waitToBeVisible(formPage.getNextsendquote());
			formPage.getNextsendquote().click();
		}

	}

	public void enviarProposta() {
		formPage.getEmail().sendKeys(prop.getPropWeb("email"));
		formPage.getPhone().sendKeys(prop.getPropWeb("phone"));
		formPage.getUsername().sendKeys(prop.getPropWeb("username"));
		formPage.getPassword().sendKeys(prop.getPropWeb("password"));
		formPage.getConfirmpassword().sendKeys(prop.getPropWeb("password"));
		formPage.getSendemail().click();
	}

	public void validoPopUpEnvioEmail(String text) throws InterruptedException {
		waitToBeVisible(formPage.getMsgEnvioEmail());
		WebElement msg = webDriver
				.findElement(By.xpath("//div[@class='sweet-alert showSweetAlert visible']/h2[text()='" + text + "']"));
		assertTrue(msg.isDisplayed());

	}
}
