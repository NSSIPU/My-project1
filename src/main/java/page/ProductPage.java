package page;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import model.ProductModel;

public class ProductPage extends ProductModel {
	public ProductPage (WebDriver d ) {
		super(d);
	}
	
	public void clickProductBtn() {
		WebElement e= getProductBtn();
		e.click();
	}

}
