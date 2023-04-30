package com.inetBankingDemo.Testcases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.core.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.inetBankingDemo.PageObject.LoginPage;
import com.inetBankingDemo.utility.UtilityXL;



public class Tc_003_LoginWithdatadriven extends BaseClass   
{
	static Logger logger=(Logger) LogManager.getLogger(Tc_003_LoginWithdatadriven.class);

	@Test(dataProvider = "loginData",priority = 1,enabled = true)
	public void LoginTest(String uname,String pwd,String res)
	{
		logger.info("Url of datadriven is lunch");
		driver.get(baseurl);    //URL get open
		logger.info("URL launched Successfully");

		LoginPage lp=new LoginPage(driver);
		
		logger.info("Username is entering");
		lp.setusername(uname);
		
		logger.info("Password is entering");
		lp.setpassword(pwd);
		
		logger.info("click on submit button");
		lp.clickSubmit();
	   
	    String exp=driver.getTitle();
	    System.out.println(exp);
	    String act="Guru99 Bank Manager HomePage";
	    String popup_tittle="User or Password is not valid";
	    if(res.contentEquals("valid"))
	    {
		    if(exp.contentEquals(act))
		    {
		    	
		    	 Assert.assertTrue(true);
		    	 logger.info("DataDriven Test case is pass"+ " result is ::"+ res);
		    }
		    else
		    {
		    	Assert.assertTrue(false);
		    	logger.info("DataDriven Test case is fail" + " result is ::" + res);
		    }    
	     }
	    else if(res.contentEquals("invalid"))
	    {
	    	if(exp.contentEquals(act) || (exp.equals(null)))
		    {
	    		driver.switchTo().alert().accept();
	    		
		    	 Assert.assertTrue(false);
		    	 logger.info("DataDriven Test case is fail"+  " result is :: "+ res);
	    		
		    }
	    	else
	    	{
	    		try
	    		{
	    		String alerttext=driver.switchTo().alert().getText();
	    		System.out.println(alerttext);
	    		if(alerttext.contentEquals("User or Password is not valid"))
	    		{
	    		driver.switchTo().alert().accept();
	    		}
	    		}
	    		catch (Exception e) {
				
	    			logger.info(e.getMessage());
				}
	    
	    		finally {
					
				
	    		 Assert.assertTrue(true);	
	    		 logger.info("DataDriven Test case is Pass" + "Result is :: "+ res);
	    		}
	    	}
	    }
	}
	@DataProvider(name = "loginData")
	public String[][] GetData() throws IOException
	{
		
		
		String path=".\\Data\\loginTestData.xlsx";
		UtilityXL util=new UtilityXL(path);
		int row=util.getRowCount("sheet1");
		int col=util.getColumnCount("sheet1", 1);
		String logindata[][]=new String[row][col];
		for(int i=1;i<=row;i++)
		{
			for(int j=0;j<col;j++)
			{
				logindata[i-1][j]=util.getData("sheet1", i, j);
				
			}
		}
		
		return logindata;
	}
	
	
}
