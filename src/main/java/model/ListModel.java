package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ListModel extends BaseModel {
	public ListModel (WebDriver d) {
		super(d);
	}
	public WebElement getList() {
		WebElement l = driver.findElement(By.xpath("(//a[text()='List'])[1]"));
		return l;
	}

}
