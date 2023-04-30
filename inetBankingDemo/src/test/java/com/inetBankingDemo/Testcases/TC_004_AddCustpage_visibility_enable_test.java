package com.inetBankingDemo.Testcases;

import java.io.IOException;

import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetBankingDemo.PageObject.LoginPage;
import com.inetBankingDemo.PageObject.NewCustomerpage;

public class TC_004_AddCustpage_visibility_enable_test extends BaseClass {

	static Logger logger=(Logger) LogManager.getLogger(TC_004_AddCustpage_visibility_enable_test.class);
	@Test(priority = 1,enabled = true)
	public void visbilty_of_Elements()
	{

		logger.info("url is open");
		
		driver.get(baseurl);
		LoginPage lp=new LoginPage(driver);
		
		logger.info("Enter username");
		lp.setusername(username);
		
		logger.info("Enter Password");
		lp.setpassword(password);
		
		logger.info("click button");
		lp.clickSubmit();
		
		
		
		NewCustomerpage acust=new NewCustomerpage(driver);
		
		acust.click_newcustomer();
		System.out.print(acust.getlbl_customername());
		
		
		
		
		
	}
	
	@Test(priority = 2,enabled = true)
	public void Fuctional_addNewCustomer() throws InterruptedException, IOException
	{
		logger.info("url is open in Fuctional_addNewCustomer");
		
		driver.get(baseurl);
		LoginPage lp=new LoginPage(driver);
		
		logger.info("Enter username in Fuctional_addNewCustomer");
		lp.setusername(username);
		
		logger.info("Enter Password in Fuctional_addNewCustomer");
		lp.setpassword(password);
		
		logger.info("click button of Fuctional_addNewCustomer");
		lp.clickSubmit();
		Thread.sleep(3000);
		
		
		
		NewCustomerpage acust=new NewCustomerpage(driver);
		acust.click_newcustomer();
		logger.info("Providing customer Details.....");
		
		try
		{
		Thread.sleep(6000);
	
		acust.setcustomerName("Manoj");
		acust.click_gebder();
		acust.custdob("12", "10", "2023");
		Thread.sleep(3000);
		
		acust.setAddress("Ahmednagar");
		acust.setcity("Maliwada");
		acust.setstate("Maharashtra");
		acust.setpin("414001");
		acust.setmobileNo("9028267026");
		
		String email=randomString()+"@gmail.com";
		
		acust.setemail(email);
		acust.setpassword("manoj@123");
		
		
		acust.Click_submit();
		
		Thread.sleep(3000);
		
		boolean res=driver.getPageSource().contains("Customer Registered Successfully!!!");
		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("Test case is pass");
		}
		else
		{
			captureScreen(driver,"Fuctional_addNewCustomer" );
			Assert.assertTrue(false);
			logger.info("Test case is fail");
		}
		
		
		
		}
		catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}
	
	@Test(enabled = false)
	
	public void TC_click_newCustomer() throws InterruptedException
	{

		logger.info("url is open in Fuctional_addNewCustomer");
		
		driver.get(baseurl);
		LoginPage lp=new LoginPage(driver);
		
		logger.info("Enter username in Fuctional_addNewCustomer");
		lp.setusername(username);
		
		logger.info("Enter Password in Fuctional_addNewCustomer");
		lp.setpassword(password);
		
		logger.info("click button of Fuctional_addNewCustomer");
		lp.clickSubmit();
		NewCustomerpage acustomer=new NewCustomerpage(driver);
		acustomer.click_newcustomer();
		
		Thread.sleep(5000);
		
		
	}
	
	
}
