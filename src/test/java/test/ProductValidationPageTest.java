package test;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

public class ProductValidationPageTest extends BaseTest {
	
	@Test(priority=1, dataProvider="dp")
	public void loginPageTest(String uID, String pCode) throws InterruptedException {
		//it is required to keep the previous page steps:
		getHomePage();
		homePage.clickOnDemo();
		
		getLoginPage();
		getProductPage();
		getListPage();
		
		loginPage.writeUser(uID);
		loginPage.writePass(pCode);
		loginPage.clickLoginBtn();
		productPage.clickProductBtn();
		listPage.clickOnList();
	}
//	@Test(priority=2)
//	public void productPageTest() {
//		getProductPage();
//		productPage.clickProductBtn();
//	}
//	@Test(priority=3)
//	public void listPageTest() throws InterruptedException {
//		getListPage();
//		listPage.clickOnList();
//	}
	@Test(priority=2, dataProvider="dp1" )
	public void listOfProductsPageTest(String refC, String leb, String SaleStatus, String PurchaseStatus, String LotNo, String BarcodeType, String Barcode, String Description, String url, String Warehouse, String StockAlert, String DesiredStock, String Nature, String Weight, String WeightType,String Length, String Width, String Height, String Measure, String Area, String AreaMeasure, String Volume, String VolumeMeasure, String HSCode, String Country, String State, String Note, String Tag, String Price, String Ptype, String MSellingPrice, String TaxRate, String ACCcodeSale, String ACCcodeSaleEx, String ACCcodePurchase, String ACCcodePurchaseIn, String SearchRef) {
		getListOfProductsPage();
		listOfProductsPage.typeRef(SearchRef);
		
		listOfProductsPage.clickOnSearchItem();
	}
	@Test(priority=3)
	public void refValidationTest() throws IOException {
		getProductValidationPage();
		String actual=productValidationPage.actualRefText();
		String expected=productValidationPage.expectedRefText();
		boolean b = expected.contains(actual);
		Assert.assertFalse(b);
	}
	@Test(priority=4)
	public void labelValidationTest() throws IOException {
		getProductValidationPage();
		String actual = productValidationPage.actualLabelText();
		String expected = productValidationPage.expectedLabelText();
		Assert.assertEquals(expected, actual);
	}
	
	@Test(priority=5)
	public void barcodeTypeValidationTest() throws IOException {
		getProductValidationPage();
		String expected = productValidationPage.expectedBarcodeTypeText();
		String actual = productValidationPage.actualBarcodeTypeText();
		
		Assert.assertEquals(expected, actual);
	}
	@Test(priority=6)
	public void barcodeValueValidationTest() throws IOException {
		getProductValidationPage();
		String expected = productValidationPage.expectedBarcodeValueText();
		String actual = productValidationPage.actualBarcodeValueText();
		Assert.assertEquals(expected, actual);
	}
	@Test(priority=7)
	public void useLotNoValidationTest() throws IOException {
		getProductValidationPage();
	String expected =	productValidationPage.expectedUseLotNoText();
	String actual = productValidationPage.actualUseLotNoText();
	Assert.assertEquals(expected, actual);
		
	}
	@Test(priority=8)
	public void accountingCodeSaleValidationTest() throws IOException {
		getProductValidationPage();
		String expected = productValidationPage.expectedAccountingCodeSaleText();
		String actual = productValidationPage.actualAccountingCodeSaleText();
		Assert.assertEquals(expected, actual);
	}
	@Test(priority=9)
	public void accountingCodeSaleExportValidationTest() throws IOException {
		getProductValidationPage();
		String expected = productValidationPage.expectedAccountingCodeSaleExportText();
		String actual = productValidationPage.actualAccountingCodeSaleExportText();
		Assert.assertEquals(expected, actual);
	}
	@Test(priority=10)
	public void accountingCodePurchaseValidationTest() throws IOException {
		getProductValidationPage();
		String expected = productValidationPage.expectedAccountingCodePurchaseText();
		String actual = productValidationPage.actualAccountingCodePurchaseText();
		Assert.assertEquals(expected, actual);
	}
	@Test(priority=11)
	public void accountingCodePurchaseInportValidationTest() throws IOException {
		getProductValidationPage();
		String expected = productValidationPage.expectedAccountingCodePurchaseInportText();
		String actual = productValidationPage.actualAccountingCodePurchaseInportText();
		Assert.assertEquals(expected, actual);
	}
	@Test(priority=12)
	public void descriptionValidationTest() throws IOException {
		getProductValidationPage();
		String expected = productValidationPage.expectedDescripdtionText();
		String actual = productValidationPage.actualDescripdtionText();
		Assert.assertEquals(expected, actual);
	}
	
	
	@Test(priority=13)
	public void publicURLValidationTest() throws IOException {
		getProductValidationPage();
		String expected = productValidationPage.expectedPublicURLText();
		String actual = productValidationPage.actualPublicURLText();
		//Assert.assertEquals(expected, actual);
		boolean b = expected.contains(actual);
		Assert.assertFalse(b);
	}
	@Test(priority=14)
	public void defaultWarehouseValidationTest() throws IOException {
		getProductValidationPage();
		String expected = productValidationPage.expectedDefaultWarehouseText();
		String actual = productValidationPage.actualDefaultWarehouseText();
		Assert.assertEquals(expected, actual);
		
	}
	@Test(priority=15)
	public void weightValidationTest() throws IOException {
		getProductValidationPage();
		String expected = productValidationPage.expectedWeightDimentionalText();
		String actual = productValidationPage.actualWeightText();

		Assert.assertEquals(actual, expected);
	}
	@Test(priority=16)
	public void lengthWidthHeigthValidationTest() throws IOException {
		getProductValidationPage();
		String expected = productValidationPage.expectedDimentionaltext();
		String actual = productValidationPage.actualLengthWidthHeigthText();
		Assert.assertEquals(actual, expected);
		
	}
	@Test(priority=17)
	public void areaValidationTest() throws IOException {
		getProductValidationPage();
		String expected = productValidationPage.expectedAreaDimentionalText();
		String actual = productValidationPage.actualAreaText();
//		boolean b = actual.contains(expected);
//		Assert.assertTrue(b); or
		Assert.assertEquals(actual, expected);
	}
	@Test(priority=18)
	public void valumeValidationTest() throws IOException {
		getProductValidationPage();
		String expected = productValidationPage.expectedValumeDimentionalText();
		String actual = productValidationPage.actualValumeText();
		
		Assert.assertEquals(actual, expected);;
	}
	@Test(priority=19)
	public void customHSCodeValidationTest() throws IOException {
		getProductValidationPage();
		String expected = productValidationPage.expectedCustomHSCodeText();
		String actual = productValidationPage.actualCustomHSCodeText();
		Assert.assertEquals(expected, actual);
	}
	@Test(priority=20)
	public void originValidationTest() throws IOException {
		getProductValidationPage();
		String expected = productValidationPage.expectedOriginDimentionalText();
		String actual = productValidationPage.actualOriginText();
		
		Assert.assertEquals(actual, expected);;
	}
	@Test(priority=21)
	public void tagsValidationTest() throws IOException {
		getProductValidationPage();
		String expected = productValidationPage.expectedTagsText();
		String actual = productValidationPage.actualTagsText();
		Assert.assertEquals(expected, actual);
	}
	@Test(priority=22)
	public void notesTest() throws IOException {
		getProductValidationPage();
		productValidationPage.clickOnNotes();
		}
	@Test(priority=23)
	public void notesPrivateValidationTest() throws IOException {
		getProductValidationPage();
		String expected = productValidationPage.expectedNotesPrivateText();
		String actual = productValidationPage.actualNotesPrivateText();
		Assert.assertEquals(expected, actual);
	}
	
	
	}
