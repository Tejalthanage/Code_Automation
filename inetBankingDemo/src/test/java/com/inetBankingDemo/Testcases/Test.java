package com.inetBankingDemo.Testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeTest;

import com.inetBankingDemo.PageObject.LoginPage;

import junit.framework.Assert;

public class Test extends BaseClass {

	static Logger logger=(Logger) LogManager.getLogger(Test.class);
	
	   @org.testng.annotations.Test
		public void setup1()
		{
		  
			logger.info("browser launch successfully");
			driver.get(baseurl);
			logger.info("url launch successfully");
			driver.manage().window().maximize();
			
			LoginPage lp=new LoginPage(driver);
			
			
			logger.info("Enter username");
			lp.setusername(username);
			
			logger.info("Enter Password");
			lp.setpassword(password);
			
			
		
			logger.info("click button");
			lp.clickSubmit();
			
			

			if(driver.getTitle().contentEquals(readcon.gettittle()))
			{
			
				Assert.assertTrue(true);
				logger.info("Test case pass");
				logger.warn("this is warn msg");
			}
			else
			{
				
				Assert.assertTrue(false);
				logger.info("Test case fail");
				logger.warn("This is warn message2");
			}
			
			
		}
	}

