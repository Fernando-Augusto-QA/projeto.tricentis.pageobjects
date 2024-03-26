package pages;

import org.openqa.selenium.By;

import metodos.Metodos;

public class SendQuote {
	
	public void enviarCotacao() {
		
		By email = By.id("email");
		By phone = By.id("phone");
		By username = By.id("username");
		By password = By.id("password");
		By confirmPassword = By.id("confirmpassword");
//		By comments = By.id("Comments");
		By btnSend = By.id("sendemail");
		By validaTexto = By.xpath("/html/body/div[4]/h2");
		
		Metodos.escrever(email, "teste2024@teste.com");
		Metodos.escrever(phone, "11980342896");
		Metodos.escrever(username, "Teste");
		Metodos.escrever(password, "12345Teste?");
		Metodos.escrever(confirmPassword, "12345Teste?");
//		Metodos.escrever(comments, "");
		Metodos.clicar(btnSend);
		Metodos.esperarelementoSerClicavel(validaTexto, 12);
		Metodos.validarTexto(validaTexto, "Sending e-mail success!");
		
		
		
		
		
		
		
		
		
		
		
	}

}
