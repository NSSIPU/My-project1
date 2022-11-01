package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomeModel extends BaseModel{
	
	public HomeModel(WebDriver d) {
		super(d);
	}
	
	//variable
	public WebElement getDemo() {
		WebElement demo=driver.findElement(By.xpath("//*[@alt='Demo DemoCompanyManufacturing']"));
		
		return demo;
	}
}
