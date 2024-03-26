package metodos;

import static org.junit.Assert.assertTrue;

import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import drivers.DriversFactory;

public class Metodos extends DriversFactory {

	public static void escrever(By elemento, String texto) {
		try {
			driver.findElement(elemento).sendKeys(texto);
		} catch (Exception e) {
			System.out.println("***** CAUSA DO ERRO *****" + e.getCause());
			System.out.println("***** MENSAGEM DO ERRO *****" + e.getMessage());
		}
	}

	public static void clicar(By elemento) {
		try {
			driver.findElement(elemento).click();
		} catch (Exception e) {
			System.out.println("***** CAUSA DO ERRO *****" + e.getCause());
			System.out.println("***** MENSAGEM DO ERRO *****" + e.getMessage());
		}
	}
	
	public static void esperarelementoSerClicavel(By elemento, int tempo) {
		try {
			WebDriverWait wait = new WebDriverWait(driver, tempo);
			WebElement element = wait.until(ExpectedConditions.elementToBeClickable(elemento));
		} catch (Exception e) {
			System.out.println("***** CAUSA DO ERRO *****" + e.getCause());
			System.out.println("***** MENSAGEM DO ERRO *****" + e.getMessage());
		}
	}
	
	public static void mouseOver(By elemento) {
		try {
			WebElement element = driver.findElement(elemento);
			Actions actions = new Actions(driver);
			actions.moveToElement(element).perform();
		} catch (Exception e) {
			System.out.println("***** CAUSA DO ERRO *****" + e.getCause());
			System.out.println("***** MENSAGEM DO ERRO *****" + e.getMessage());
		}
	}
	
	public static void scrool(int n1, int n2) {
		try {
			JavascriptExecutor js =(JavascriptExecutor)driver;
			js.executeScript("window.scrollBy("+n1+","+n2+")");
		} catch (Exception e) {
			System.out.println("***** CAUSA DO ERRO *****" + e.getCause());
			System.out.println("***** MENSAGEM DO ERRO *****" + e.getMessage());
		}
	}
	

	public static void validarTexto(By elemento, String textoDesejado) {
		try {
			String textoCapturado = driver.findElement(elemento).getText();
			assertTrue(textoCapturado.contains(textoDesejado));
		} catch (Exception e) {
			System.out.println("***** CAUSA DO ERRO *****" + e.getCause());
			System.out.println("***** MENSAGEM DO ERRO *****" + e.getMessage());
		}
	}

	public static void uploadArquivo() {
		try {
			Robot robot = new Robot();
			robot.delay(1000);
			StringSelection ss = new StringSelection("C:\\Users\\Fernando Augusto\\Pictures\\fotoTeste\\imagem.jpg");
			Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.delay(1000);
			robot.keyRelease(KeyEvent.VK_V);
			robot.delay(1000);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
		} catch (Exception e) {
			System.out.println("***** CAUSA DO ERRO *****" + e.getCause());
			System.out.println("***** MENSAGEM DO ERRO *****" + e.getMessage());
		}
	}

}
