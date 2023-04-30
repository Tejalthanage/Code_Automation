package com.inetBankingDemo.Testcases;



import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBankingDemo.PageObject.EditCustomerPage;
import com.inetBankingDemo.PageObject.LoginPage;
import com.inetBankingDemo.utility.ReadConfig;



public class TC_001_EditCustomer extends BaseClass
{
	static Logger logger=(Logger) LogManager.getLogger(TC_001_EditCustomer.class);
	
	@Test(priority = 1,enabled = true)
	public void EditCustomerTest() throws InterruptedException
	{
		logger.info("url is open");
	    driver.get(baseurl);
	    logger.info("URL is Launched Successfully");
	    
		LoginPage lp=new LoginPage(driver);
		
		
		logger.info("Entering username ");
		lp.setusername(username);
		
		logger.info("Enter Password");
		lp.setpassword(password);
		
		
	
		logger.info("Submit button is clicked");
		lp.clickSubmit();
		
		EditCustomerPage editcust=new EditCustomerPage(driver);
		
		logger.info("Click on Edit Link");
		editcust.clickOn_Edit();
		
		Thread.sleep(5000);
		ReadConfig rc=new ReadConfig();
		logger.info("Entering Customer id to Edit");
		editcust.Customer_id_value(rc.EditCustomer_id());
		
		logger.info("click on Submit");
		
		editcust.click_edit_Submit();
		
		
		
		Thread.sleep(5000);
		//System.out.println(rc.EditCustomer_PageTittle());
		//System.out.println(driver.getTitle());
		
		String expected_edit_tittle=driver.getTitle();
		System.out.println(expected_edit_tittle);
		
		String Actull_editCustomer_tittle=rc.EditCustomer_PageTittle();
		System.out.println(Actull_editCustomer_tittle);
		
		try
		{
			if((expected_edit_tittle).equals(Actull_editCustomer_tittle)==true)
			//if(driver.getTitle().contains(rc.EditCustomer_PageTittle()))
			{
				captureScreen(driver,"EditCustomernew");
			
				Assert.assertTrue(true);
				logger.info("Test case pass");
						
			}
			else
			{
				captureScreen(driver,"EditCustomernew");
				Assert.assertTrue(false);
				logger.info("Test case fail");
				
				logger.info("Screenshot taken");
			
			}
		
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
		
	
	}
	
	@Test(priority = 2)
	public void Reset_EditCustomer_check() throws InterruptedException
	{
		logger.info("url is open");
	    driver.get(baseurl);
	    logger.info("URL is Launched Successfully");
	    
		LoginPage lp=new LoginPage(driver);
		
		
		logger.info("Entering username ");
		lp.setusername(username);
		
		logger.info("Enter Password");
		lp.setpassword(password);
		
		
	
		logger.info("Submit button is clicked");
		lp.clickSubmit();
		
		EditCustomerPage editcust=new EditCustomerPage(driver);
		
		logger.info("Click on Edit Link");
		editcust.clickOn_Edit();
		
		Thread.sleep(5000);
		ReadConfig rc=new ReadConfig();
		logger.info("Entering Customer id to Edit");
		editcust.Customer_id_value(rc.EditCustomer_id());
		
		editcust.click_edit_Reset();
		
		if(editcust.custid_no().equals(null))
		{
			Assert.assertTrue(true);
			
		}
		else
		{
			Assert.assertTrue(false);
		}
		
	
	}
 
}
