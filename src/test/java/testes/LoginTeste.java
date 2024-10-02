package testes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import pages.HomePage;
import runner.Navegadores;

public class LoginTeste {
	// nome da class //ponteiro //metodo construtor criando um ponteiro
	HomePage homeP = new HomePage(); // criando uma nova instancia da class metodos

	@Before
	public void antesDoTeste() {
		Navegadores.abreNavegador();
	}

	@After
	public void depoisDoTeste() {
		Navegadores.fechaNavegador();
	}

	@Test
	public void loginValido() {
		homeP.login("standard_user", "secret_sauce");

	}

	@Test
	public void loginComUsuarioInvalido() {
		homeP.loginError("errado", "secret_sauce",
				"Epic sadface: Username and password do not match any user in this service");

	}

	@Test
	public void loginComSenhaInvalida() {
		homeP.loginError("standard_user", "errada",
				"Epic sadface: Username and password do not match any user in this service");

	}

	@Test
	public void loginEmBranco() {
		homeP.loginError("", "", "Epic sadface: Username is required");

	}

	@Test
	public void loginComUsuarioEmBranco() {
		homeP.loginError("", "secret_sauce", "Epic sadface: Username is required");

	}

	@Test
	public void loginComSenhaEmBranco() {
		homeP.loginError("standard_user", "", "Epic sadface: Password is required");

	}
}
