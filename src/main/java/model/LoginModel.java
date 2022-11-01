package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginModel extends BaseModel {
	
	//create a constructor because parent class has constructor:
	public LoginModel(WebDriver d) {
		super (d);
	}
	
	//variable:
	
	public WebElement getUser() {
		WebDriverWait wait = new WebDriverWait(driver,20);
		By locator= By.xpath("//*[@id='username']");
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		WebElement userID =driver.findElement(locator);
		return userID;
	}
	public WebElement getPass() {
		WebElement passWord=driver.findElement(By.xpath("//*[@id='password']"));
		return passWord;
	}
	
	public WebElement getLogin() {
		WebElement login=driver.findElement(By.xpath("//*[@class='button']"));
		return login;
	}

}
