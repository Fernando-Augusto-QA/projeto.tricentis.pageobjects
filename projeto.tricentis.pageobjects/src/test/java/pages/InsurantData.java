package pages;

import org.openqa.selenium.By;

import metodos.Metodos;

public class InsurantData {

	public void dadosDoSeguro() {

		By firstName = By.id("firstname");
		By lastName = By.id("lastname");
		By dateOf = By.id("birthdate");
		By gender = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[4]/p/label[1]/span");
		By streetAddress = By.id("streetaddress");
		By country = By.xpath("//*[@id=\"country\"]/option[32]");
		By zipCode = By.id("zipcode");
		By city = By.id("city");
		By occupation = By.xpath("//*[@id=\"occupation\"]/option[6]");
		By hobbies = By.xpath("//*[@id=\"insurance-form\"]/div/section[2]/div[10]/p/label[5]/span");
		By website = By.id("website");
		By picture = By.id("open");
		By btnNext = By.id("nextenterproductdata");

		Metodos.escrever(firstName, "Teste");
		Metodos.escrever(lastName, "MaisTeste");
		Metodos.escrever(dateOf, "10/19/2000");
		Metodos.clicar(gender);
		Metodos.escrever(streetAddress, "rua cidade lion");
		Metodos.clicar(country);
		Metodos.escrever(zipCode, "07094190");
		Metodos.escrever(city, "Guarulhos");
		Metodos.clicar(occupation);
		Metodos.clicar(hobbies);
		Metodos.escrever(website, "www.Teste");
		Metodos.clicar(picture);
		Metodos.uploadArquivo();
		Metodos.clicar(btnNext);

	}

}
