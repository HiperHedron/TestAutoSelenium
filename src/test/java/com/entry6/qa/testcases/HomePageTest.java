package com.entry6.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.entry6.qa.base.TestBase;
import com.entry6.qa.pages.HomePage;
import com.entry6.qa.pages.LoginPage;
import com.entry6.qa.pages.obiekty.ObiektyPage;

public class HomePageTest extends TestBase{
	
	private LoginPage loginPage;
	private HomePage homePage;
	private ObiektyPage obiektyPage;
	
	public HomePageTest() {
		super();
	}
	
	@BeforeMethod
	public void setUp() {
		initialization();
		loginPage = new LoginPage();
		homePage = loginPage.login();
	}
	
	@Test(enabled = false)
	public void czyNazwaUzytkownikaPoLogowaniuSieZgadza() {
		String loginlabel = homePage.getUsernameLabel();
		Assert.assertTrue(loginlabel.equalsIgnoreCase(prop.getProperty("username")));
	}
	
	@Test(priority = 2)
	public void czyToJestHomePage() {
		Assert.assertTrue(homePage.isThisAHomePage(),"Strona nie jest HomePage");
	}
	
	@Test(priority = 3, enabled = true)
	public void przejdzDoObiektowIWrocHFB() {
		homePage.przejdzDo_Obiekty().dodajObiekt();//.powrocDoMenuGlownegoPF();
		//Assert.assertTrue(homePage.isThisAHomePage(),"Strona nie jest HomePage");
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

	

}
