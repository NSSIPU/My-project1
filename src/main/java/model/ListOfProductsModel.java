package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ListOfProductsModel extends BaseModel {
	
	public ListOfProductsModel (WebDriver d) {
		super(d);
	}
	public WebElement getSearchRef() {
		WebElement s = driver.findElement(By.xpath("//input[@name='search_ref']"));
		return s;
		
	}
	public WebElement getSearchItem() {
		WebElement i = driver.findElement(By.xpath("//a[text()='AC1234']"));
		return i;
	}

}
