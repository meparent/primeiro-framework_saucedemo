package elementos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import drivers.Drivers;

public class Elementos extends Drivers {

	public By username = By.xpath("//*[@id='user-name']"); // * qdo tiver id ou name
	public By password = By.xpath("//*[@id='password']");
	public By btnLogin = By.xpath("//*[@id='login-button']");

	// private By -somente a class pode ter acesso- encapsulamento

}
