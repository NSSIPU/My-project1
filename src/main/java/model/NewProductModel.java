package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class NewProductModel extends BaseModel {
	
	public NewProductModel(WebDriver d) {
		super(d);
		
	}
	public WebElement getNewProduct() {
		WebElement p=driver.findElement(By.xpath("//a[text()='New product']"));
		return p;
	}
	

}
