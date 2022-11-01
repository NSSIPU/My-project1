package page;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import model.ListOfProductsModel;

public class ListOfProductsPage extends ListOfProductsModel{
	
	public ListOfProductsPage (WebDriver d) {
		super(d);
	}
	public void typeRef(String Ref) {
		WebElement r = getSearchRef();
		r.sendKeys(Ref);
		r.sendKeys(Keys.RETURN);
	}
	public void clickOnSearchItem() {
		WebElement i = getSearchItem();
		i.click();
	}

}
