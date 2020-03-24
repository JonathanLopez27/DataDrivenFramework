package com.w2a.testCases;

import java.util.Hashtable;

import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.SkipException;
import org.testng.annotations.Test;

import com.w2a.base.TestCase;
import com.w2a.utilities.TestUtil;

public class AddCustomerTest extends TestCase {

	@Test(dataProviderClass = TestUtil.class, dataProvider = "dp")
	public void addCustomerTest(Hashtable<String,String> data) {
		
		if(!data.get("runmode").equalsIgnoreCase("Y")){
			
			throw new SkipException("Skipping the test case as the Run Mode for data set is NO");
		}

		click("addCustBtn_CSS");
		type("firstname_CSS",data.get("firstname"));
		type("lastname_XPATH",data.get("lastname"));
		type("postcode_CSS",data.get("postcode"));
		click("addBtn_CSS");

		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		Assert.assertTrue(alert.getText().contains(data.get("alerttext")));
		alert.accept();

//		Assert.fail("Customer not added successfully");

	}

}
