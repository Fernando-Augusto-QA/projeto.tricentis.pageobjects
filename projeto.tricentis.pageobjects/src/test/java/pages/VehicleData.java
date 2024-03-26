package pages;

import org.openqa.selenium.By;

import metodos.Metodos;

public class VehicleData {

	public void inserirDadosDoVeiculo() {

		By automovel = By.id("nav_automobile");
		By carro = By.xpath("//select[@id='make']/option[7]");
		By desempenhoMotor = By.id("engineperformance");
		By dataFabricacao = By.id("dateofmanufacture");
		By numeroAssentos = By.xpath("//select[@id='numberofseats']/option[6]");
		By combustivel = By.xpath("//select[@id='fuel']/option[2]");
		By precoTabela = By.id("listprice");
		By numeroMatricula = By.id("licenseplatenumber");
		By quilometragemAnual = By.id("annualmileage");
		By btnNext = By.id("nextenterinsurantdata");

		Metodos.clicar(automovel);
		Metodos.clicar(carro);
		Metodos.escrever(desempenhoMotor, "2000");
		Metodos.escrever(dataFabricacao, "05/28/2023");
		Metodos.clicar(numeroAssentos);
		Metodos.clicar(combustivel);
		Metodos.escrever(precoTabela, "25000");
		Metodos.escrever(numeroMatricula, "123456");
		Metodos.escrever(quilometragemAnual, "10000");
		Metodos.clicar(btnNext);

	}

}
