package metodos;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.By;

import drivers.Drivers;

public class Metodos extends Drivers {

	public void clicar(By elemento) {
		// achar elemento
		driver.findElement(elemento).click();

	}

	public void escrever(By elemento, String texto) {

		driver.findElement(elemento).sendKeys(texto);

	}

	public void validarTexto(By elemento, String textoEsperado) {

		// driver.findElement(elemento).getText(); //captura um texto
		// valida/junit
		String textoCapturado = driver.findElement(elemento).getText();
		System.out.println("Textos capturados: " + textoCapturado);
		assertEquals(textoEsperado, textoCapturado); // pegar um texto desde o começo linha 25
	}

	public void validarUrl(String urlEsperada) {
		// pegar url
		assertEquals(urlEsperada, driver.getCurrentUrl());
	}

}
