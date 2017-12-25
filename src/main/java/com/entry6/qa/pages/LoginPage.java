package com.entry6.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.entry6.qa.base.TestBase;

public class LoginPage extends TestBase {
	
	//PageFactory - OR (Object Repository)
	
	@FindBy(id = "loginform_company_login")
	private WebElement loginform_company_login;
	
	@FindBy(id = "loginform_login")
	private WebElement loginform_login;
	
	@FindBy(id = "loginform_password")
	private WebElement loginform_password;
	
	@FindBy(id = "loginform_button1")
	private WebElement loginBTN;
	
	@FindBy(xpath = "/html/body/div[6]/div[1]/div/div[2]/form/div[3]/span")
	private WebElement loginHeader;
	
	
	//init OR
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
	public String getLoginPageTitle() {
		return driver.getTitle();
	}
	
	public String getLoginHeaderText() {
		return loginHeader.getText();
	}
	
	public HomePage login(String company, String un, String pwd) {
		loginform_company_login.sendKeys(company);
		loginform_login.sendKeys(un);
		loginform_password.sendKeys(pwd);
		loginBTN.click();
		return new HomePage();
	}
	
	public HomePage login() {
		loginform_company_login.sendKeys(prop.getProperty("usercompany"));
		loginform_login.sendKeys(prop.getProperty("username"));
		loginform_password.sendKeys(prop.getProperty("userpassword"));
		loginBTN.click();
		return new HomePage();
	}
	
	

}
