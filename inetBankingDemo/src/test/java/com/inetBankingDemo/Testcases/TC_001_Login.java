package com.inetBankingDemo.Testcases;
import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.testng.annotations.Test;
import com.inetBankingDemo.PageObject.LoginPage;
import junit.framework.Assert;
 class TC_001_Login extends BaseClass {

		static Logger logger=(Logger) LogManager.getLogger(TC_001_Login.class);
	@SuppressWarnings("static-access")
	@Test(priority = 1)
	public void LoginTest() throws IOException
	
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
		
	
		
		if(driver.getTitle().contentEquals(readcon.gettittle()))
		{
		
			Assert.assertTrue(true);
			logger.info("Test case pass");
					
		}
		else
		{
			captureScreen(driver,"LoginTest");
			Assert.assertTrue(false);
			logger.info("Test case fail");
			
			logger.info("Screenshot taken");
		
		}
	}
}
