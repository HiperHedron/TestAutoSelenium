package com.entry6.qa.util;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.entry6.qa.base.TestBase;

public class HFindBy extends TestBase {
	
	public static WebElement findByPresence(By by) {
		DMSLoaders.isWindowLoaderInvisible();
		JSWaiter.waitTriplet();
		return wait.until(ExpectedConditions.presenceOfElementLocated(by));
	}
	
	public static WebElement findByVisibility(By by) {
		DMSLoaders.isWindowLoaderInvisible();
		JSWaiter.waitTriplet();
		return wait.until(ExpectedConditions.visibilityOfElementLocated(by));
	}
	
	/*public static WebElement findBy(By by) {
		DMSLoaders.isWindowLoaderInvisible();
		JSWaiter.waitTriplet();
		return driver.findElement(by);
	}*/

}
