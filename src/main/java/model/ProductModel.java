package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductModel extends BaseModel {
	public ProductModel (WebDriver d) {
		super(d);
	}
	public WebElement getProductBtn() {
		WebElement e = driver.findElement(By.xpath("//a[@id='mainmenua_products']"));
		return e;
	}

}
