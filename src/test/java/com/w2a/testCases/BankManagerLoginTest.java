package com.w2a.testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.w2a.base.TestCase;

public class BankManagerLoginTest extends TestCase{

	
	@Test
	public void bankManagerLoginTest() throws InterruptedException, IOException {
		
		verifyEquals("abc", "xyz");
	
		
		log.debug("Inside Login Test");
		click("bmlBtn_CSS");
		
		Thread.sleep(2000);
		
		Assert.assertTrue(isElementPresent(By.cssSelector(OR.getProperty("addCustBtn_CSS"))),"Login not successful");
		
		log.debug("Login successfully executed");
		
//		Assert.fail("Login not successful");
		
	
	}
}
