package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import model.HomeModel;

public class HomePage extends HomeModel {
	
	public HomePage (WebDriver d) {
		super(d);
	}

	//Action by calling the created method in parent class:
		public void clickOnDemo() {
			WebElement d= getDemo();
			d.click();
		}

}
