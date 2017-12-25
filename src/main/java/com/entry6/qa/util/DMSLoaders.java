package com.entry6.qa.util;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.entry6.qa.base.TestBase;

public class DMSLoaders extends TestBase{
	
	public static boolean isWindowLoaderInvisible() {
		List<WebElement> loaders = driver.findElements(By.className("dswindow-loader"));
		List<WebElement> loadersNotVisible = new ArrayList<WebElement>();
		int sleepLimit = (int) (TestUtil.IMPLICIT_WAIT*1000);
		int sleepStep = 50;
		System.out.println("VisibleLoaders > " + loaders.size());
		
		if(loaders.size()>0) {
			do {
				loadersNotVisible.clear();
				for(WebElement loader : loaders) {
					if(!loader.isDisplayed()) {
						loadersNotVisible.add(loader);
						System.out.println("++");
					}
					
				}
				
				System.out.println("InVisibleLoaders > " + loadersNotVisible.size());
				
				if(loadersNotVisible.size() != loaders.size() && sleepLimit>=sleepStep) {
					JSWaiter.sleep(sleepStep);
					System.out.println("z");
					sleepLimit= sleepLimit-sleepStep;
				}else if(loadersNotVisible.size() != loaders.size() && sleepLimit<sleepStep){
					Assert.fail("dswindow-loader timeout", new TimeoutException());
				}
				
			}while(loadersNotVisible.size() != loaders.size());
			JSWaiter.sleep(150);
			System.out.println("Koniec czekania na znikniecie loaderow");
			
		}
		
		return true;
	}

}
