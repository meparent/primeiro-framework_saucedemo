package testes;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import elementos.Elementos;
import metodos.Metodos;
import runner.Navegadores;

        public class LoginTeste {
  //nome da class  //ponteiro      //metodo construtor   criando um ponteiro
	     Metodos metodo = new Metodos ();      //criando uma nova instancia da class metodos
	   
	     Elementos el = new Elementos ();
	     
	  @Before   
	  public void antesDoTeste  () {
		  Navegadores.abreNavegador();  
 }
	  @After
	  public void depoisDoTeste  () {
		 Navegadores.fechaNavegador();  
  }
	          
	@Test
	public void loginValido() {
		
		
		metodo.escrever(el.username, "standard_user");     //escrever user name
		metodo.escrever(el.password, "secret_sauce");     // escrever senha
		metodo.clicar(el.btnLogin);                      //  clicar
		metodo.validarUrl("https://www.saucedemo.com/inventory.html");         //  valida url


	}
	   
	
    	
    	@Test
    	public void loginComUsuarioInvalido() {
    		
    		metodo.escrever(el.username, "errado");     //escrever user name
    		metodo.escrever(el.password, "secret_sauce");     // escrever senha
    		metodo.clicar(el.btnLogin);             //  clicar
    		metodo.validarTexto(el.msgError,"Epic sadface: Username and password do not match any user in this service");         //  valida url
    						
    	}
    	
    	@Test
    	public void loginComSenhaIinvalida() {
    	
    		metodo.escrever(el.username, "standard_user");     //escrever user name
    		metodo.escrever(el.password, "errada");     // escrever senha
    		metodo.clicar(el.btnLogin);             //  clicar
            metodo.validarTexto(el.msgError,"Epic sadface: Username and password do not match any user in this service");         //  valida url
    		
    		}
    }
	
	
	                   
        
        
       
        
        
        
        
        
        
        
        
        
        
        
        
        