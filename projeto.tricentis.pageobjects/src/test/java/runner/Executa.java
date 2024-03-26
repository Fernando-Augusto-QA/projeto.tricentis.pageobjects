package runner;

import org.openqa.selenium.chrome.ChromeDriver;

import drivers.DriversFactory;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Executa extends DriversFactory {

	public static void abrirNavegador() {

		String site = "https://sampleapp.tricentis.com";
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(site);
		driver.manage().window().maximize();
	}
	
	public static void fecharNavegador() {
		driver.quit();
	}

}
