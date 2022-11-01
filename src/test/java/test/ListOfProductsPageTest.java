package test;

import org.testng.annotations.Test;

public class ListOfProductsPageTest extends BaseTest {

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
	public void listPageTest() throws InterruptedException {
		getListPage();
		listPage.clickOnList();
	}
	@Test(priority=4, dataProvider="dp1" )
	public void listOfProductsPageTest(String refC, String leb, String SaleStatus, String PurchaseStatus, String LotNo, String BarcodeType, String Barcode, String Description, String url, String Warehouse, String StockAlert, String DesiredStock, String Nature, String Weight, String WeightType,String Length, String Width, String Height, String Measure, String Area, String AreaMeasure, String Volume, String VolumeMeasure, String HSCode, String Country, String State, String Note, String Tag, String Price, String Ptype, String MSellingPrice, String TaxRate, String ACCcodeSale, String ACCcodeSaleEx, String ACCcodePurchase, String ACCcodePurchaseIn, String SearchRef) {
		getListOfProductsPage();
		listOfProductsPage.typeRef(SearchRef);
		
		listOfProductsPage.clickOnSearchItem();
	}
	
}
