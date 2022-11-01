package page;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import model.NewProductEntryModel;

public class NewProductEntryPage extends NewProductEntryModel {

	public NewProductEntryPage(WebDriver d) {
		super(d);
	}
	public void typeRef(String RefCode) {
		WebElement r = getRef();
		r.sendKeys(RefCode);
	}
	public void typeLebel(String LebelCode) {
		WebElement l = getLebel();
		l.sendKeys(LebelCode);
	}
	
	public void typeSellStatus(String Status) throws InterruptedException {
		WebElement e = getSellStatus();
		e.click();
		WebElement box  = getInputBoxSell();
		box.sendKeys(Status);//data pass from excel.
		box.sendKeys(Keys.RETURN);//for enter.
	}
	public void typePurchaseStatus(String Status) {
		WebElement p = getPurchaseStatus();
		p.click();
		WebElement box = getInputBoxPurchase();
		box.sendKeys(Status);
		box.sendKeys(Keys.RETURN);
	}
	public void typeLotNo(String LotNo) {
		WebElement l = getUseLotNo();
		l.click();
		WebElement box = getInputBoxLot();
		box.sendKeys(LotNo);
		box.sendKeys(Keys.RETURN);
	}
	public void typeBarcodeType(String BarcodeType) {
		WebElement b = getBarcodeType();
		b.click();
		WebElement box = getInputBoxBarcode();
		box.sendKeys(BarcodeType);
		box.sendKeys(Keys.RETURN);
		}
	public void typeBarcode(String Barcode) {
		WebElement bc = getBarcode();
		bc.sendKeys(Barcode);
	}
	public void typeDescription(String Description) {
		WebElement d = getDescription();
		d.sendKeys(Description);
	}
	public void typePublicURL(String PUrl) {
		WebElement u = getPublicURL();
		u.sendKeys(PUrl);
	}
	public void typeDfWarehouse(String Warehouse) {
		WebElement d = getWarehouse();
		d.click();
		WebElement box = getInputBoxWarehouse();
		box.sendKeys(Warehouse);
		box.sendKeys(Keys.RETURN);
	}
	public void typeStockAlert(String StockAlert) {
		WebElement a = getStockAlert();
		a.sendKeys(StockAlert);
	}
	public void typeDesiredStock(String DesiredStock) {
		WebElement a = getDesiredStock();
		a.sendKeys(DesiredStock);
	}
	public void typeNatureOfProduct(String Nature) {
		WebElement n = getNatureOfProduct();
		n.click();
		WebElement box = getInputBoxNature();
		box.sendKeys(Nature);
		box.sendKeys(Keys.RETURN);
	}
	public void typeWeight(String Weight) {
		WebElement w = getWeight();
		w.sendKeys(Weight);
	}
	public void typeWeightType(String WeightType) {
		WebElement w = getWeightType();
		w.click();
		WebElement box = getInputBoxWeightType();
		box.sendKeys(WeightType);
		box.sendKeys(Keys.RETURN);
	}
	public void typeLength(String Length) {
		WebElement l = getLength();
		l.sendKeys(Length);
	}
	public void typeWidth(String Width) {
		WebElement w = getWidth();
		w.sendKeys(Width);
	}
	public void typeHeight(String Height) {
		WebElement h = getHeight();
		h.sendKeys(Height);
	}
	public void typeMeasureType(String Measure) {
		WebElement m = getMeasureType();
		m.click();
		WebElement box = getInputBoxMeasure();
		box.sendKeys(Measure);
		box.sendKeys(Keys.RETURN);
	}
	public void typeArea(String Area) {
		WebElement a = getArea();
		a.sendKeys(Area);
	}
	public void typeAreaMeasure(String AreaMeasure) {
		WebElement a = getAreaMeasure();
		a.click();
		WebElement box = getInputBoxArea();
		box.sendKeys(AreaMeasure);
		box.sendKeys(Keys.RETURN);
	}
	public void typeVolume(String Volume) {
		WebElement v = getVolume();
		v.sendKeys(Volume);
	}
	public void typeVolumeMeasure(String VolumeMeasure) {
		WebElement a = getVolumeMeasure();
		a.click();
		WebElement box = getInputBoxVolume();
		box.sendKeys(VolumeMeasure);
		box.sendKeys(Keys.RETURN);
	}
	public void typeHSCode(String HSCode) {
		WebElement c = getHSCode();
		c.sendKeys(HSCode);
	}
	public void typeCountry(String Country) {
		WebElement c = getCountry();
		c.click();
		WebElement box = getInputBoxCountry();
		box.sendKeys(Country);
		box.sendKeys(Keys.RETURN);
	}
	public void typeState(String State) {
		WebElement s = getState();
		s.click();
		WebElement box = getInputBoxState();
		box.sendKeys(State);
		box.sendKeys(Keys.RETURN);
	}
	public void typeNote(String Note) {
		WebElement n = getNote();
		n.sendKeys(Note);
	}
	public void typeTegs(String tag) {
		WebElement t = getTags();
		t.click();
		WebElement box = typeTag();
		box.sendKeys(tag);
		box.sendKeys(Keys.RETURN);
		
	}
	public void typeSellingPrice(String Price) {
		WebElement p = getSellingPrice();
		p.sendKeys(Price);
	}
	public void selectPriceType (String Ptype) {
		WebElement pt = getPriceType();
//		//pt.click();
		Select p = new Select(pt);
		p.selectByVisibleText(Ptype);
//		pt.sendKeys(Ptype);
	}
	public void typeMinSellingPrice(String MSellingPrice) {
		WebElement mp = getMinSellingPrice();
		mp.sendKeys(MSellingPrice);
	}
	public void typeTaxRate(String TaxRate) {
		WebElement tr = getTaxRate();
		tr.sendKeys(TaxRate);
	}
	public void typeACCCodeSale(String ACCcodeSale) {
		WebElement ac = getACCCodeSale();
		ac.click();
		WebElement box = getInputBoxACCCodeSale();
		box.sendKeys(ACCcodeSale);
		box.sendKeys(Keys.RETURN);
	}
	public void typeACCCodeSaleEx(String ACCcodeSaleEx) {
		WebElement ace = getACCCodeSaleEx();
		ace.click();
		WebElement box = getInputBoxACCCodeSaleEx();
		box.sendKeys(ACCcodeSaleEx);
		box.sendKeys(Keys.RETURN);
	}
	public void typeACCCodePurchase(String ACCcodePurchase) {
		WebElement ac = getACCCodePurchase();
		ac.click();
		WebElement box = getInputBoxACCCodePurchase();
		box.sendKeys(ACCcodePurchase);
		box.sendKeys(Keys.RETURN);
	}
	public void typeACCCodePurchaseIn(String ACCcodePurchaseIn) {
		WebElement ac = getACCCodePurchaseIn();
		ac.click();
		WebElement box = getInputBoxACCCodePurchaseIn();
		box.sendKeys(ACCcodePurchaseIn);
		box.sendKeys(Keys.RETURN);
	}
	public void clickOnCreateBtn() {
		WebElement cb = getCreateBtn();
		cb.click();
	}
	
	
	
}
