package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import model.LoginModel;

public class LoginPage extends LoginModel{
	//constructor:
	public LoginPage (WebDriver d) {
		super (d);
	}
	//Action by calling the created method from parent class:

	public void writeUser(String user) {
		WebElement u=getUser();
		u.clear();
		u.sendKeys(user);
	}
	
	public void writePass(String pass) {
		WebElement p=getPass();
		p.clear();
		p.sendKeys(pass);
	}
	
	public void clickLoginBtn() {
		WebElement l=getLogin();
		
		l.click();
	}
}
