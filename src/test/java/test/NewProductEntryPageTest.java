package test;

import org.testng.annotations.Test;

public class NewProductEntryPageTest extends BaseTest {
	
	@Test(priority=1, dataProvider="dp")
	public void loginPageTest(String uID, String pCode) {
		//it is required to keep the previous page steps:
		getHomePage();
		homePage.clickOnDemo();
		
		getLoginPage();
		
		loginPage.writeUser(uID);
		loginPage.writePass(pCode);
		loginPage.clickLoginBtn();
	}
	@Test(priority=2)
	public void productPageTest() {
		getProductPage();
		productPage.clickProductBtn();
	}
	@Test(priority=3)
	public void newProductPageTest() throws InterruptedException {
		getNewProductPage();
		newProductPage.clickOnNewProduct();
	}

	@Test(priority=4,dataProvider="dp1")
	public void NewProductEntryPageTest(
			String refC, String leb, String SaleStatus, String PurchaseStatus, 
			String LotNo, String BarcodeType, String Barcode, String Description, 
			String url, String Warehouse, String StockAlert, String DesiredStock, 
			String Nature, String Weight, String WeightType,String Length, String Width, 
			String Height, String Measure, String Area, String AreaMeasure, String Volume,
			String VolumeMeasure, String HSCode, String Country, String State, String Note,
			String Tag, String Price, String Ptype, String MSellingPrice, String TaxRate,
			String ACCcodeSale, String ACCcodeSaleEx, String ACCcodePurchase,
			String ACCcodePurchaseIn, String ex) throws InterruptedException { 
		getNewProductEntryPage();
		
		newProductEntryPage.typeRef(refC);
		newProductEntryPage.typeLebel(leb);
		newProductEntryPage.typeSellStatus(SaleStatus);
		newProductEntryPage.typePurchaseStatus(PurchaseStatus);
		newProductEntryPage.typeLotNo(LotNo);
		newProductEntryPage.typeBarcodeType(BarcodeType);
		newProductEntryPage.typeBarcode(Barcode);
		newProductEntryPage.typeDescription(Description);
		newProductEntryPage.typePublicURL(url);
		newProductEntryPage.typeDfWarehouse(Warehouse);
		newProductEntryPage.typeStockAlert(StockAlert);
		newProductEntryPage.typeDesiredStock(DesiredStock);
		newProductEntryPage.typeNatureOfProduct(Nature);
		newProductEntryPage.typeWeight(Weight);
		newProductEntryPage.typeWeightType(WeightType);
		newProductEntryPage.typeLength(Length);
		newProductEntryPage.typeWidth(Width);
		newProductEntryPage.typeHeight(Height);
		newProductEntryPage.typeMeasureType(Measure);
		newProductEntryPage.typeArea(Area);
		newProductEntryPage.typeAreaMeasure(AreaMeasure);
		newProductEntryPage.typeVolume(Volume);
		newProductEntryPage.typeVolumeMeasure(VolumeMeasure);
		newProductEntryPage.typeHSCode(HSCode);
		newProductEntryPage.typeCountry(Country);
		newProductEntryPage.typeState(State);
		newProductEntryPage.typeNote(Note);
		newProductEntryPage.typeTegs(Tag);
		newProductEntryPage.typeSellingPrice(Price);
		newProductEntryPage.selectPriceType(Ptype);
		newProductEntryPage.typeMinSellingPrice(MSellingPrice);
		newProductEntryPage.typeTaxRate(TaxRate);
		newProductEntryPage.typeACCCodeSale(ACCcodeSale);
		newProductEntryPage.typeACCCodeSaleEx(ACCcodeSaleEx);
		newProductEntryPage.typeACCCodePurchase(ACCcodePurchase);
		newProductEntryPage.typeACCCodePurchaseIn(ACCcodePurchaseIn);
		
//		newProductEntryPage.clickOnCreateBtn();

	}

}
