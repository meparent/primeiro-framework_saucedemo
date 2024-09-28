package runner;

import org.openqa.selenium.chrome.ChromeDriver;
import drivers.Drivers;

        public class Navegadores extends Drivers {
    	 
    	 public static void abreNavegador() {              //metodo
    		 
    		driver = new ChromeDriver ();                   //abrir um novo navegador em branco
    		driver.get("https://www.saucedemo.com/");       // acessa um site
		    driver.manage().window().maximize();            //maximizar site   
    	 }
    	 
    	 public static void fechaNavegador () {
    		 driver.quit();                                  //fecha navegador
     }
    	 public static void fechaAba() {                     //fecha aba
    		driver.close(); 
    		 
    	 }
    	 
    	 
    	 
}