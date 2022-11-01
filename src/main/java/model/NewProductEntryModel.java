package model;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class NewProductEntryModel extends BaseModel {
	
	public NewProductEntryModel (WebDriver d) {
		super (d);
	}
	public WebElement getRef() {
		WebElement ref=driver.findElement(By.xpath("//input[@name='ref']"));
		return ref;
	}
	public WebElement getLebel() {
		WebElement le = driver.findElement(By.xpath("//input[@name='label']"));
		return le;
	}
	public WebElement getSellStatus() throws InterruptedException {
		WebElement s = driver.findElement(By.xpath("//td[text()='Status (Sell)']/following-sibling::td/descendant::b"));
		//Thread.sleep(5000);
		return s;
	}
	
	public WebElement getInputBoxSell() {
		WebElement e = driver.findElement(By.xpath("(//input[@tabindex='0'])[2]"));
		return e;
	}
	
	
	public WebElement getPurchaseStatus() {
		WebElement s = driver.findElement(By.xpath("//td[text()='Status (Purchase)']/following-sibling::td/descendant::b"));
		return s;
	}
	public WebElement getInputBoxPurchase() {
		WebElement p = driver.findElement(By.xpath("(//input[@tabindex='0'])[2]"));
		return p;
	}
	
	public WebElement getUseLotNo() {
		WebElement l = driver.findElement(By.xpath("//td[text()='Use lot/serial number']/following-sibling::td/descendant::b"));
		return l;
	}
	public WebElement getInputBoxLot() {
		WebElement l = driver.findElement(By.xpath("(//input[@type='search'])[2]"));
	
		return l;
	}
	public WebElement getBarcodeType() {
		WebElement b = driver.findElement(By.xpath("//td[text()='Barcode type']/following-sibling::td/descendant::b"));
		return b;
	}
	public WebElement getInputBoxBarcode() {
		WebElement b = driver.findElement(By.xpath("(//input[@type='search'])[2]"));
		return b;
	}
	public WebElement getBarcode() {
		WebElement bc = driver.findElement(By.xpath("//input[@name='barcode']"));
		return bc;
	}
	
	public WebElement getDescription() {
		driver.switchTo().frame(0);
		WebElement d = driver.findElement(By.xpath("//body"));
		return d;
	}
	public WebElement getPublicURL() {
		driver.switchTo().defaultContent();
		WebElement u = driver.findElement(By.xpath("//input[@name='url']"));
		
		return u;
	}
	public WebElement getWarehouse() {
		WebElement w = driver.findElement(By.xpath("//td[text()='Default warehouse']/following-sibling::td/descendant::b"));
		return w;
	}
	public WebElement getInputBoxWarehouse() {
		WebElement w = driver.findElement(By.xpath("(//input[@type='search'])[2]"));
		return w;
	}
	public WebElement getStockAlert() {
		WebElement a = driver.findElement(By.xpath("//input[@name='seuil_stock_alerte']"));
		return a;
	}
	public WebElement getDesiredStock() {
		WebElement s = driver.findElement(By.xpath("//input[@name='desiredstock']"));
		return s;
	}
	public WebElement getNatureOfProduct() {
		WebElement n = driver.findElement(By.xpath("//span[text()='Nature of product']/parent::td/following-sibling::td/descendant::b"));
		return n;
	}
	public WebElement getInputBoxNature() {
		WebElement n = driver.findElement(By.xpath("(//input[@role='searchbox'])[2]"));
		return n;
	}
	public WebElement getWeight() {
		WebElement w = driver.findElement(By.xpath("//input[@name='weight']"));
		return w;
	}
	public WebElement getWeightType() {
		WebElement t = driver.findElement(By.xpath("//td[text()='Weight']/following-sibling::td/descendant::b"));
		return t;
	}
	public WebElement getInputBoxWeightType() {
		WebElement t = driver.findElement(By.xpath("(//input[@tabindex='0'])[2]"));
		return t;
	}
	public WebElement getLength() {
		WebElement l = driver.findElement(By.xpath("//input[@name='size']"));
		return l;
	}
	public WebElement getWidth() {
		WebElement w = driver.findElement(By.xpath("//input[@name='sizewidth']"));
		return w;
	}
	public WebElement getHeight() {
		WebElement h = driver.findElement(By.xpath("//input[@name='sizeheight']"));
		return h;
	}
	public WebElement getMeasureType() {
		WebElement m = driver.findElement(By.xpath("//td[text()='Length x Width x Height']/following-sibling::td/descendant::b"));
		return m;
	}
	public WebElement getInputBoxMeasure() {
		WebElement m = driver.findElement(By.xpath("(//input[@tabindex='0'])[2]"));
		return m;
	}
	public WebElement getArea() {
		WebElement a = driver.findElement(By.xpath("//input[@name='surface']"));
		return a;
	}
	public WebElement getAreaMeasure() {
		WebElement a = driver.findElement(By.xpath("//td[text()='Area']/following-sibling::td/descendant::b"));
		return a;
	}
	public WebElement getInputBoxArea() {
		WebElement a = driver.findElement(By.xpath("(//input[@tabindex='0'])[2]"));
		return a;
	}
	public WebElement getVolume() {
		WebElement v = driver.findElement(By.xpath("//input[@name='volume']"));
		return v;
	}
	public WebElement getVolumeMeasure() {
		WebElement v = driver.findElement(By.xpath("//td[text()='Volume']/following-sibling::td/descendant::b"));
		return v;
	}
	public WebElement getInputBoxVolume() {
		WebElement v = driver.findElement(By.xpath("(//input[@tabindex='0'])[2]"));
		return v;
	}
	public WebElement getHSCode() {
		WebElement c = driver.findElement(By.xpath("//input[@name='customcode']"));
		return c;
	}
	public WebElement getCountry() {
		WebElement c = driver.findElement(By.xpath("//td[text()='Country of origin']/following-sibling::td/descendant::b"));
		return c;
	}
	public WebElement getInputBoxCountry() {
		WebElement c = driver.findElement(By.xpath("(//input[@tabindex='0'])[2]"));
		return c;

	}
	public WebElement getState() {
		WebElement s = driver.findElement(By.xpath("//td[text()='State|Province of origin']/following-sibling::td/descendant::b"));
		return s;
	}
	public WebElement getInputBoxState() {
		WebElement s = driver.findElement(By.xpath("(//input[@tabindex='0'])[2]"));
		return s;

	}
	public WebElement getNote() {
		driver.switchTo().frame(1);
		WebElement n = driver.findElement(By.xpath("//body"));
		return n;
	}
	public WebElement getTags() {
		driver.switchTo().defaultContent();
		WebElement t = driver.findElement(By.xpath("//ul[@class='select2-selection__rendered']"));
		return t;
	}
	public WebElement typeTag() {
		WebElement t = driver.findElement(By.xpath("//input[@tabindex='0']"));
		return t;
	}
	public WebElement getSellingPrice() {
		WebElement p = driver.findElement(By.xpath("//input[@name='price']"));
		return p;
	}
	public WebElement getPriceType() {
		WebElement pt = driver.findElement(By.xpath("//select[@id='select_price_base_type']"));
		
		return pt;
	}
	public WebElement getMinSellingPrice() {
		WebElement mp = driver.findElement(By.xpath("//input[@name='price_min']"));
		return mp;
	}
	public WebElement getTaxRate() {
		WebElement tr = driver.findElement(By.xpath("//select[@id='tva_tx']"));
		return tr;
	}
	public WebElement getACCCodeSale() {
		WebElement as = driver.findElement(By.xpath("//td[text()='Accounting code (sale)']/following-sibling::td/descendant::b"));
		return as;
	}
	public WebElement getInputBoxACCCodeSale() {
		WebElement ac = driver.findElement(By.xpath("(//input[@tabindex='0'])[2]"));
		return ac;
	}
	public WebElement getACCCodeSaleEx() {
		WebElement ase = driver.findElement(By.xpath("//td[text()='Accounting code (sale export)']/following-sibling::td/descendant::b"));
		return ase;
	}
	public WebElement getInputBoxACCCodeSaleEx() {
		WebElement ace = driver.findElement(By.xpath("(//input[@tabindex='0'])[2]"));
		return ace;
	}
	public WebElement getACCCodePurchase() {
		WebElement ap = driver.findElement(By.xpath("//td[text()='Accounting code (purchase)']/following-sibling::td/descendant::b"));
		return ap;
	}
	public WebElement getInputBoxACCCodePurchase() {
		WebElement ac = driver.findElement(By.xpath("(//input[@tabindex='0'])[2]"));
		return ac;
	}
	public WebElement getACCCodePurchaseIn() {
		WebElement api = driver.findElement(By.xpath("//td[text()='Accounting code (purchase import)']/following-sibling::td/descendant::b"));
		return api;
	}
	public WebElement getInputBoxACCCodePurchaseIn() {
		WebElement ac = driver.findElement(By.xpath("(//input[@tabindex='0'])[2]"));
		return ac;
	}
	public WebElement getCreateBtn() {
		WebElement createBtn = driver.findElement(By.xpath("//input[@name='add']"));
		return createBtn;
	}
	
	

}
//((//input[@class='select2-search__field'])[2]/parent::span/following-sibling::span/descendant::li)[1]