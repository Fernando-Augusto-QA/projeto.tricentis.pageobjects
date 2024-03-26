package pages;

import org.openqa.selenium.By;

import metodos.Metodos;

public class PriceOption {

	public void opcaoPreco() {

		By platinum = By.xpath("//*[@id=\"priceTable\"]/tfoot/tr/th[2]/label[4]/span");
//		By download = By.xpath("//div[@class='col-lg-6 col-md-6 col-xs-12']//a[@id='downloadquote']");
		By btnNext = By.xpath("//button[@id='nextsendquote']");

		Metodos.clicar(platinum);
		Metodos.mouseOver(btnNext);
//		Metodos.clicar(download);
		Metodos.clicar(btnNext);

	}

}
