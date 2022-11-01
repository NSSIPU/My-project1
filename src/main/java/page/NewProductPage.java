package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import model.NewProductModel;

public class NewProductPage extends NewProductModel{
	
	public NewProductPage(WebDriver d) {
		super(d);
	}
	public void clickOnNewProduct() throws InterruptedException {
		WebElement p = getNewProduct();
		p.click();
		
	}

}
