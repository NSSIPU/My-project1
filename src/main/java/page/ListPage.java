package page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import model.ListModel;

public class ListPage extends ListModel {

	public ListPage (WebDriver d) {
		super(d);
	}
	public void clickOnList() throws InterruptedException {
		//Thread.sleep(5000);
		WebElement l = getList();
		l.click();
	}

}
