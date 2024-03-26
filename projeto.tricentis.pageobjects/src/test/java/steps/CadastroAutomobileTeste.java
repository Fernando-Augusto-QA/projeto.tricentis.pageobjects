package steps;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import pages.InsurantData;
import pages.PriceOption;
import pages.ProductData;
import pages.SendQuote;
import pages.VehicleData;
import runner.Executa;

public class CadastroAutomobileTeste {

	VehicleData veiculo = new VehicleData();
	InsurantData seguro = new InsurantData();
	ProductData produto = new ProductData();
	PriceOption preco = new PriceOption();
	SendQuote cotacao = new SendQuote();
	
	@Before
	public void iniciarTeste() {
		Executa.abrirNavegador();
	}

	@After
	public void finalizarTeste() {
		Executa.fecharNavegador();
	}

	@Test
	public void solicitacaoDeSeguroVeicular() {
		veiculo.inserirDadosDoVeiculo();
		seguro.dadosDoSeguro();
		produto.dadosProduto();
		preco.opcaoPreco();
		cotacao.enviarCotacao();
	}

}
