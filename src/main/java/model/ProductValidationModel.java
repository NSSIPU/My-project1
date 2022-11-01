package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ProductValidationModel extends BaseModel {
	
	public ProductValidationModel (WebDriver d) {
		super (d);
	}
	public WebElement getRefValidation() {
		WebElement v = driver.findElement(By.xpath("//a[@id='card']/ancestor::div[@class='tabs']/following-sibling::div/descendant::div[text()='AC1234']"));
		return v;

	}
	public WebElement getLabelValidation() {
		WebElement v = driver.findElement(By.xpath("//div[text()='NYCQueens']"));
		return v;
	}

	public WebElement getBarcodeTypeValidation() {
		WebElement v = driver.findElement(By.xpath("(//td[@class='nowrap'])[1]/following-sibling::td"));
		return v;
	}
	public WebElement getBarcodeValueValidation() {
		WebElement v = driver.findElement(By.xpath("(//td[text()='Barcode value']/ancestor::td/following-sibling::td/descendant::span)[2]"));
		return v;
	}
	public WebElement getUseLotNoValidation() {
		WebElement v = driver.findElement(By.xpath("//td[text()='Use lot/serial number']/following-sibling::td"));
		return v;
	}
	public WebElement getAccountingCodeSaleValidation() {
		WebElement v =	driver.findElement(By.xpath("//td[text()='Accounting code (sale)']/following-sibling::td"));
		return v;
	}
	public WebElement getAccountingCodeSaleExportValidation() {
		WebElement v = driver.findElement(By.xpath("//td[text()='Accounting code (sale export)']/following-sibling::td"));
		return v;
	}
	public WebElement getAccountingCodePurchaseValidation() {
		WebElement v = driver.findElement(By.xpath("//td[text()='Accounting code (purchase)']/following-sibling::td"));
		return v;
	}
	public WebElement getAccountingCodePurchaseInportValidation() {
		WebElement v = driver.findElement(By.xpath("//td[text()='Accounting code (purchase import)']/following-sibling::td"));
		return v;
	}
	public WebElement getDescripdtionValidation() {
		WebElement v =  driver.findElement(By.xpath("//td[text()='Description']/following-sibling::td"));
		return v;
	}
	public WebElement getPublicURLValidation() {
		WebElement v = driver.findElement(By.xpath("//td[text()='Public URL']/following-sibling::td"));
		return v;
	}
	public WebElement getDefaultWarehouseValidation() {
		WebElement v = driver.findElement(By.xpath("//td[text()='Default warehouse']/following-sibling::td"));
		return v;
	}
	public WebElement getWeightValidation() {
		WebElement v = driver.findElement(By.xpath("//td[text()='Weight']/following-sibling::td"));
		return v;
	}
	public WebElement getLengthWidthHeigthValidation() {
		WebElement v = driver.findElement(By.xpath("//td[text()='Length x Width x Height']/following-sibling::td"));
		return v;
	}
	public WebElement getAreaValidation() {
		WebElement v = driver.findElement(By.xpath("//td[text()='Area']/following-sibling::td"));
		return v;
	}
	public WebElement getVolumeValidation() {
		WebElement v = driver.findElement(By.xpath("//td[text()='Volume']/following-sibling::td"));
		return v;
	}
	public WebElement getCustomHSCodeValidation() {
		WebElement v = driver.findElement(By.xpath("//td[text()='Customs|Commodity|HS code']/following-sibling::td"));
		return v;
	}
	public WebElement getOriginValidation() {
		WebElement v = driver.findElement(By.xpath("//td[text()='Origin']/following-sibling::td"));
		return v;
	}
	public WebElement getTagsValidation() {
		WebElement v = driver.findElement(By.xpath("//td[text()='Tags/categories']/following-sibling::td"));
		return v;
	}
	public WebElement getNotes() {
		WebElement n = driver.findElement(By.xpath("//a[@id='note']"));
		return n;
	}
	public WebElement getNotesPrivateValidation() {
		WebElement v = driver.findElement(By.xpath("(//td[text()='Note (private)']/ancestor::div)[7]/following-sibling::div"));
		return v;
	}
	
}
