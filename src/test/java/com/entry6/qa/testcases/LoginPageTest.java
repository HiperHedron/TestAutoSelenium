package com.entry6.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.entry6.qa.base.TestBase;
import com.entry6.qa.pages.HomePage;
import com.entry6.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	
	LoginPage loginPage;
	HomePage homePage;
	
	public LoginPageTest() {
		//ponieważ potrzeba wywolac konstruktor klasy TestBase aby oczytac config.properties
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
	}
	
	@Test(priority = 1)
	public void loginPageTitleTest() {
		String pageTitle = loginPage.getLoginPageTitle();
		Assert.assertEquals(pageTitle, "Arka Gdynia S.S.A.");
	}
	
	@Test(priority = 2)
	public void headerTest() {
		String headerText = loginPage.getLoginHeaderText();
		Assert.assertEquals(headerText, "Logowanie");
	}
	
	@Test(priority = 3)
	public void loginTest() {
		homePage = loginPage.login(prop.getProperty("usercompany"), prop.getProperty("username"), prop.getProperty("userpassword"));
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
