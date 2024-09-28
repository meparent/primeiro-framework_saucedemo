package elementos;

import org.openqa.selenium.By;

public class Elementos  {
              
	public By username = By.xpath("//*[@id='user-name']");      //* qdo tiver id ou name
	public By password = By.xpath("//*[@id='password']");
	public By btnLogin = By.xpath("//*[@id='login-button']");
	public By msgError = By.xpath("//h3[@data-test='error']");    //private By -somente a class pode ter acesso- encapsulamento
	
}
