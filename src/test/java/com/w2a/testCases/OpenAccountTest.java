package com.w2a.testCases;

import java.util.Hashtable;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.w2a.base.TestCase;
import com.w2a.utilities.TestUtil;

public class OpenAccountTest extends TestCase {

	
	@Test(dataProviderClass=TestUtil.class,dataProvider="dp")
	public void openAccountTest(Hashtable<String,String> data) {
		
		if(!TestUtil.isTestRunnable("openAccountTest", excel)) {
			throw new SkipException("Skipping the test " + "openAccountTest".toUpperCase()+" as the Runmode is NO");
		}
		
		click("openaccount_CSS");
		
		select("customer_CSS", data.get("customer"));
		
		select("currency_CSS", data.get("currency"));
		
		click("process_CSS");
		
		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		alert.accept();
		
	}
	
	
}
