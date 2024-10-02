package pages;

import org.openqa.selenium.By;

import elementos.Elementos;
import metodos.Metodos;

public class HomePage {
	Metodos metodo = new Metodos();
	Elementos el = new Elementos();

	private By errorMessage = By.xpath("//h3[@data-test='error']");

	public void login(String username, String password) {

		metodo.escrever(el.username, username);// ESCREVER USERNAME
		metodo.escrever(el.password, password);// ESCREVER SENHA
		metodo.clicar(el.btnLogin);// CLICAR
		metodo.validarUrl("https://www.saucedemo.com/inventory.html");// VALIDAR URL

	}

	public void loginError(String username, String password, String msgError) {
		// Preenche os campos de usuário e senha
		metodo.escrever(el.username, username);
		metodo.escrever(el.password, password);

		// Clica no botão de loginm
		metodo.clicar(el.btnLogin);

		// Valida se a mensagem de erro está contida nas esperadas
		metodo.validarTexto(errorMessage, msgError);

	}
}
