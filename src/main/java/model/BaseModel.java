package model;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BaseModel {

	//instance variable:
	WebDriver driver;

	//constructor:
	public BaseModel(WebDriver d) {
		driver=d;
	}
}
