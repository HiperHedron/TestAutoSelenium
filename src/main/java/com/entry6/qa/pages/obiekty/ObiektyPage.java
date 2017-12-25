package com.entry6.qa.pages.obiekty;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.entry6.qa.base.TestBase;
import com.entry6.qa.pages.HomePage;
import com.entry6.qa.util.DMSLoaders;
import com.entry6.qa.util.HFindBy;
import com.entry6.qa.util.JSWaiter;

public class ObiektyPage extends TestBase {
	
	//PageFactory - OR (Object Repository)
	
	//FILTRY
	@FindBy(id = "editform_object_name")
	private WebElement filtr_NazwaObiektu;
	
	@FindBy(id = "editform_object_key")
	private WebElement filtr_KluczObiektu;
	
	@FindBy(id = "editform_active_only")
	private WebElement filtr_box_TylkoAktywne;
	
	@FindBy(id = "editform_button_submit")
	private WebElement filtr_btn_Filtruj;
	
	@FindBy(id = "editform_clear_button")
	private WebElement filtr_btn_Wyczysc;
	
	//PAGE Navigator
	@FindBy(xpath = "//div[@class='Pages']/input[@class='CurrentPageInput']")
	private WebElement filtr_numerStrony;
	
	@FindBy(xpath = "//[contains(@class,'PreviousPage')]")
	private WebElement btn_PoprzedniaStrona;
	
	@FindBy(xpath = "//[contains(@class,'NextPage')]")
	private WebElement btn_NastepnaStrona;
	
	//EXTICON
	@FindBy(xpath = "//div[@class='ExtIcon']//a[@title='Dodaj obiekt']")
	private WebElement btn_DodajObiekt;
	
	@FindBy(xpath = "//div[@class='ExtIcon']//a[@title='Menu główne']")
	private WebElement btn_MenuGlowne;
	
	//init OR
	public ObiektyPage() {
		PageFactory.initElements(driver, this);
	}
	
	public HomePage powrocDoMenuGlownegoHFB() {
		HFindBy.findByVisibility(By.xpath("//div[@class='ExtIcon']//a[@title='Menu główne']")).sendKeys(Keys.ENTER);
		return new HomePage();
	}
	
	public HomePage powrocDoMenuGlownegoPF() {
		btn_MenuGlowne.sendKeys(Keys.ENTER);
		return new HomePage();
	}
	
	public ObiektyPage dodajObiekt() {
		btn_DodajObiekt.sendKeys(Keys.ENTER);
		DMSLoaders.isWindowLoaderInvisible();
		return this;
	}
	
	
	
	

}
