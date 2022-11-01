package test;

import org.testng.annotations.Test;

public class ListPageTest extends BaseTest {

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
}
