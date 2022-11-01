package page;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import library.ExcelReader;
import model.ProductValidationModel;

public class ProductValidationPage extends ProductValidationModel {
	
	String filename;
	String sheetname;
	ExcelReader er;
	public ProductValidationPage (WebDriver d) throws IOException {
		super (d);
		filename="data/Demo.xlsx";
		sheetname="Sheet2";
		er= new ExcelReader (filename, sheetname);
	}
	public String actualRefText() {
		WebElement we = getRefValidation();
		String actual = we.getText();
		return actual;
	}
	public String expectedRefText() {
		String expected = er.getCellValue(1, 0);
		return expected;
	}
	public String actualLabelText() {
		WebElement we = getLabelValidation();
		String actual = we.getText();
		return actual;
	}
	public String expectedLabelText() {
		String expected = er.getCellValue(1, 1);
		return expected;
	}
	
	public String actualBarcodeTypeText() {
		WebElement we = getBarcodeTypeValidation();
		String actual = we.getText();
		return actual;
	}

	public String expectedBarcodeTypeText() {
		String expected = er.getCellValue(1, 5);
		return expected;
	}
	public String actualBarcodeValueText() {
		WebElement we = getBarcodeValueValidation();
		String actual = we.getText();
		return actual;
	}
	public String expectedBarcodeValueText() {
		String expected = er.getCellValue(1, 6);
		return expected;
	}
	public String actualUseLotNoText() {
	WebElement we	= getUseLotNoValidation();
	String actual = we.getText();
	return actual;
	}
	public String expectedUseLotNoText() {
	String expected	= er.getCellValue(1, 4);
	return expected;
	}
	
	public String actualAccountingCodeSaleText() {
		WebElement we = getAccountingCodeSaleValidation();
		String actual = we.getText();
		return actual;
	}
	
	public String expectedAccountingCodeSaleText() {
		String expected = er.getCellValue(1, 32);
		return expected;
	}
	public String actualAccountingCodeSaleExportText() {
		WebElement we = getAccountingCodeSaleExportValidation();
		String actual = we.getText();
		return actual;
	}
	public String expectedAccountingCodeSaleExportText() {
		String expected = er.getCellValue(1, 33);
		return expected;
	}
	public String actualAccountingCodePurchaseText() {
		WebElement we = getAccountingCodePurchaseValidation();
		String actual = we.getText();
		return actual;
	}
	public String expectedAccountingCodePurchaseText() {
		String  expected = er.getCellValue(1, 34);
		return expected;
	}
	public String actualAccountingCodePurchaseInportText() {
		WebElement we = getAccountingCodePurchaseInportValidation();
		String actual = we.getText();
		return actual;
	}
	public String expectedAccountingCodePurchaseInportText() {
		String expected = er.getCellValue(1, 35);
		return expected;
	}
	public String actualDescripdtionText() {
		WebElement we = getDescripdtionValidation();
		String actual = we.getText();
		return actual;
	}
	public String expectedDescripdtionText() {
		String expected = er.getCellValue(1, 7);
		return expected;
	}
	public String actualPublicURLText() {
		WebElement we = getPublicURLValidation();
		String actual = we.getText();
		return actual;
	}
	public String expectedPublicURLText() {
		String expected = er.getCellValue(1, 8);
		return expected;
	}
	public String actualDefaultWarehouseText() {
		WebElement we = getDefaultWarehouseValidation();
		String actual = we.getText();
		return actual;
		
	}
	public String expectedDefaultWarehouseText() {
		String expected = er.getCellValue(1, 9);
		return expected;
	}
	public String actualWeightText() {
		WebElement we = getWeightValidation();
		String actual = we.getText();
		return actual;
	}
	public String expectedWeightDimentionalText() {
		String expected1 = er.getCellValue(1, 13);
		String expected2 = er.getCellValue(1, 14);
		String expected = expected1 + " " + expected2;

//		500 kilogram
		return expected;
	}
	public String actualLengthWidthHeigthText() {
		WebElement we = getLengthWidthHeigthValidation();
		String actual = we.getText();
		return actual;
	}
	public String expectedDimentionaltext() {
		String expected1 = er.getCellValue(1, 15);
		String expected2 = er.getCellValue(1, 16);
		String expected3 = er.getCellValue(1, 17);
		String expected4 = er.getCellValue(1, 18);
		String expected= expected1+" x "+ expected2+" x "+ expected3+ " "+ expected4;
//		5 x 3 x 4 cm
		return expected;
	}
	public String actualAreaText() {
		WebElement we = getAreaValidation();
		String actual = we.getText();
		return actual;
	}
	public String expectedAreaDimentionalText() {
		String expected1 = er.getCellValue(1, 19);
		String expected2 = er.getCellValue(1, 20);
		String expected = expected1 + " " + expected2;


		return expected;
	}
	public String actualValumeText() {
		WebElement we = getVolumeValidation();
		String actual = we.getText();
		return actual;
	}
	public String expectedValumeDimentionalText() {
		String expected1 = er.getCellValue(1, 21);
		String expected2 = er.getCellValue(1, 22);
		String expected = expected1 + " " + expected2;
		return expected;
	}
	public String actualCustomHSCodeText() {
		WebElement we = getCustomHSCodeValidation();
		String actual = we.getText();
		return actual;
	}
	public String expectedCustomHSCodeText() {
		String expected = er.getCellValue(1, 23);
		return expected;
	}
	public String actualOriginText() {
		WebElement we = getOriginValidation();
		String actual = we.getText();
		return actual;
	}
	public String expectedOriginDimentionalText() {
		String expected1 = er.getCellValue(1, 24);
		String expected2 = er.getCellValue(1, 25);
		String expected = expected1 + " - " + expected2;
//		Canada - Nova Scotia
		return expected;
	}
	public String actualTagsText() {
		WebElement we = getTagsValidation();
		String actual = we.getText();
		return actual;
	}
	public String expectedTagsText() {
		String expected = er.getCellValue(1, 27);
		return expected;
	}
	public void clickOnNotes() {
		WebElement n = getNotes();
		n.click();
	}
	public String actualNotesPrivateText() {
		WebElement we = getNotesPrivateValidation();
		String actual = we.getText();
		return actual;
	}
	public String expectedNotesPrivateText() {
		String expected = er.getCellValue(1, 26);
		return expected;
	}
	
	
	
	
}
