package com.entry6.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.entry6.qa.base.TestBase;
import com.entry6.qa.pages.HomePage;
import com.entry6.qa.pages.LoginPage;

public class HomePageTest extends TestBase{
	
	private LoginPage loginPage;
	private HomePage homePage;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login();
	}
	
	@Test
	public void verifyLoginLabel() {
		String loginlabel = homePage.getUsernameLabel();
		Assert.assertTrue(loginlabel.equalsIgnoreCase(prop.getProperty("username")));
	}
	
	@Test
	public void clickObjects() {
		homePage.clickIcon_Obiekty();
		/*String headerText = 
		Assert.assertTrue(.equalsIgnoreCase(prop.getProperty("username")));*/
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	

}
