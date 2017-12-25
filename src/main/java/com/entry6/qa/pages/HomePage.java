package com.entry6.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.entry6.qa.base.TestBase;

public class HomePage extends TestBase{
	
	public HomePage() {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id = "userLogin")
	private WebElement usernameLabel;
	
	@FindBy(id = "icon_dmsObjects")
	private WebElement icon_dmsObjects;
	
	@FindBy(className = "header")
	private WebElement header;
	
	public String getUsernameLabel() {
		return usernameLabel.getText();
	}
	
	public String getHeaderText() {
		return header.getText();
	}
	
	public void clickIcon_Obiekty() {
		icon_dmsObjects.click();
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	

}
