package com.inetBankingDemo.Testcases;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.testng.annotations.Test;



import junit.framework.Assert;

public class TC_002_CheckURLTest  extends BaseClass
{

	static Logger logger=(Logger) LogManager.getLogger(TC_002_CheckURLTest.class);
	@Test(priority = 1)
	
	public void CheckURLTest()
	{
		logger.info("url is launch of test case2");
		driver.get(baseurl);

		logger.info("browser launch successfully");
		System.out.println("url tittle" + driver.getTitle());
		System.out.println("readconfig tittle"+readcon.homepagegettittle());
		if(driver.getTitle().contentEquals(readcon.homepagegettittle()))
		{
			Assert.assertTrue(true);
			logger.info("Test case pass");
		}
		else
		{
			Assert.assertTrue(false);
			logger.info("Test case fail");
		}

	
	}
}
