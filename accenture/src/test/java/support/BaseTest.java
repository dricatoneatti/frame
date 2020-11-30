package support;

import static org.openqa.selenium.support.ui.ExpectedConditions.visibilityOf;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BaseTest {
	protected static WebDriver webDriver;
	private static WebDriverWait wait;

	public void getChrome(String url) {
		System.setProperty("webdriver.chrome.driver", "chromeDriver\\chromedriver.exe");
		webDriver = new ChromeDriver();
		webDriver.manage().window().maximize();
		webDriver.get(url);
	}

	public void tearDown() {
		webDriver.quit();
	}

	public static WebDriver getWebDriver() {
		return webDriver;
	}

	// Robot - facilitadores
	/**
	 * Aguarda o elemento ficar visível na tela
	 */
	public static void waitToBeVisible(WebElement element) {
		wait.until(visibilityOf(element));

	}
	
	public static void waitvisibilityOf(WebElement element, long timeOutInSeconds) {
		wait = new WebDriverWait(getWebDriver(), timeOutInSeconds);
		wait.until(visibilityOf(element));

	}

	/**
	 * Seleciona alguma opção da lista
	 */
	public void chooseOption(WebElement elemento, String valor) {
		Select select = new Select(elemento);
		select.selectByVisibleText(valor);
	}
}
