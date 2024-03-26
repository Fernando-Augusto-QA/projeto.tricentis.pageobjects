package pages;

import org.openqa.selenium.By;

import metodos.Metodos;

public class ProductData {

	public void dadosProduto() {

		By starDate = By.id("startdate");
		By insuranceSum = By.xpath("//*[@id=\"insurancesum\"]/option[2]");
		By meritRating = By.xpath("//*[@id=\"meritrating\"]/option[2]");
		By damageInsurance = By.xpath("//*[@id=\"damageinsurance\"]/option[4]");
		By optionalProducts = By.xpath("//*[@id=\"insurance-form\"]/div/section[3]/div[5]/p/label[2]/span");
		By courtesyCar = By.xpath("//*[@id=\"courtesycar\"]/option[3]");
		By btnNext = By.id("nextselectpriceoption");

		Metodos.escrever(starDate, "05/28/2024");
		Metodos.clicar(insuranceSum);
		Metodos.clicar(meritRating);
		Metodos.clicar(damageInsurance);
		Metodos.clicar(optionalProducts);
		Metodos.clicar(courtesyCar);
		Metodos.clicar(btnNext);

	}

}
