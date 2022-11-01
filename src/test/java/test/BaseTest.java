package test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;

import library.ExcelReader;
import page.HomePage;
import page.ListOfProductsPage;
import page.ListPage;
import page.LoginPage;
import page.NewProductEntryPage;
import page.NewProductPage;
import page.ProductPage;
import page.ProductValidationPage;


public class BaseTest {

	static WebDriver driver;
	static HomePage homePage;
	static LoginPage loginPage;
	static ProductPage productPage;
	static NewProductPage newProductPage;
	static NewProductEntryPage newProductEntryPage;
	static ListPage listPage;
	static ListOfProductsPage listOfProductsPage;
	static ProductValidationPage productValidationPage;
	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","/Users/sipusaha/downloads/chromedriver");
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver =new ChromeDriver(options);
		driver.get("https://demo.dolibarr.org/public/demo/index.php");
	
	}
	
	//create a method of HomePagetest so we can call the method in test:
	public HomePage getHomePage() {
		homePage= new HomePage(driver);
		return homePage;
	}
	
	public LoginPage getLoginPage() {
		loginPage= new LoginPage(driver);
		return loginPage;
	}
	
	public ProductPage getProductPage() {
		productPage = new ProductPage(driver);
		return productPage;
	}
	public NewProductPage getNewProductPage() {
		newProductPage= new NewProductPage(driver);
		return newProductPage;
	}
	public NewProductEntryPage getNewProductEntryPage() {
		newProductEntryPage = new NewProductEntryPage(driver);
		return newProductEntryPage;
	}
	public ListPage getListPage() {
		listPage = new ListPage(driver);
		return listPage;
	}
	public ListOfProductsPage getListOfProductsPage() {
		listOfProductsPage = new ListOfProductsPage(driver);
		return listOfProductsPage;
	}
	public ProductValidationPage getProductValidationPage() throws IOException {
		productValidationPage = new ProductValidationPage(driver);
		return productValidationPage;
	}
	
	
	
	
	@DataProvider(name="dp")
	public Object[][]dataloader() throws IOException{
//		Object[][] table={
//			
//			//hard coded data:
//			{"Hasnat","hasnat1"},
//			{"Sipu","sipu1"},
//			{"Sana","sana1"},
//
//		};
		//Excel to Array data conversion:
		String filename="data/Demo.xlsx";
		String sheetname="Sheet1";
		
		ExcelReader er= new ExcelReader (filename,sheetname);
		
		//call the method created excel reader class:
		Object [][] table=er.excelToArray();// now it  dynamic, i can update or change data in excel
		
		return table ;
	}
	@DataProvider(name="dp1")
	public Object[][] dataloader1() throws IOException{
		String filename= "data/Demo.xlsx";
		String sheetname= "Sheet2";
		
		ExcelReader er = new ExcelReader(filename,sheetname);
		Object [][] table = er.excelToArray();
		return table;
	}

}
