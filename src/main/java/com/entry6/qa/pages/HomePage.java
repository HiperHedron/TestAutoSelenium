package com.entry6.qa.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.entry6.qa.base.TestBase;
import com.entry6.qa.pages.obiekty.ObiektyPage;
import com.entry6.qa.util.DMSLoaders;
import com.entry6.qa.util.HFindBy;

public class HomePage extends TestBase{
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "userLogin")
	private WebElement nazwaZalogowanegoUzytkownika;
	
	@FindBy(id = "icon_dmsObjects")
	private WebElement ikonaObiekty;
	
	@FindBy(className = "header")
	private WebElement header;
	
	@FindBy(tagName = "html")
	private WebElement htmlTag;
	
	public String getUsernameLabel() {
		return nazwaZalogowanegoUzytkownika.getText();
	}
	
	public String getHeaderText() {
		return header.getText();
	}
	
	public boolean isThisAHomePage() {
		String classname = HFindBy.findByPresence(By.tagName("html")).getAttribute("class");
		boolean bool = classname.equals("homePage")?true:false;
		
		System.out.println(classname);
		return bool;
	}
	
	
	public ObiektyPage przejdzDo_Obiekty() {
		ikonaObiekty.click();
		DMSLoaders.isWindowLoaderInvisible();
		return new ObiektyPage();
	}
	
	

}
