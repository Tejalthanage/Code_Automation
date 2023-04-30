	package com.inetBankingDemo.Testcases;
	

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import com.inetBankingDemo.utility.ReadConfig;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.apache.commons.lang3.RandomStringUtils;
import org.apache.logging.log4j.core.Logger;
	
	
	
	
	public class BaseClass  {
	
		ReadConfig readcon=new ReadConfig();
		public String baseurl=readcon.getapplicationurl();
		public String username=readcon.getusername();
		public String password=readcon.getpassword();
		public static WebDriver driver;
	    public 	static Logger logger;
		
		
		
		@Parameters("browser")
		@BeforeClass
		public void setup(String br) 
		
		{
			if(br.equals("edge"))
			{
			
			System.setProperty("webdriver.edge.driver", readcon.getedgedriver());
			driver=new EdgeDriver();
		    driver.manage().window().maximize();
			}
			else if(br.equals("firefox"))
			{
				System.setProperty("webdriver.gecko.driver", readcon.getfirefoxDriver());
				driver=new FirefoxDriver();
			    driver.manage().window().maximize();
			}
			else if(br.equals("chrome"))
			{
				System.setProperty("webdriver.chrome.driver",readcon.getchromedriver());
				driver=new ChromeDriver();
			    driver.manage().window().maximize();
			    driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
			}
			else if(br.equals("IE"))
			{
				System.setProperty("webdriver.ie.driver",readcon.getIEBrowser());
				driver=new InternetExplorerDriver();
				driver.manage().window().maximize();
			}
					
			
			
		}
		
		@AfterClass
		public void Teardown()
		{
			driver.quit();
		}
		
		
		public void captureScreen(WebDriver driver,String tname) throws IOException
		{
			TakesScreenshot ts=(TakesScreenshot) driver;
			
			File source=ts.getScreenshotAs(OutputType.FILE);
			File target=new File(System.getProperty("user.dir")+"/Screenshots" + tname + ".png" );
			//File target=new File("C:\\Users\\sai\\eclipse-workspace\\inetBankingDemo\\Screenshots");
			FileUtils.copyFile(source, target);
			System.out.println("Screenshot taken");
			
			
		}
		
		public String randomString()
		{
			String genratedString =RandomStringUtils.randomAlphabetic(8);
			return genratedString;
		}
		
		public String randomno()
		{
			String randomno=RandomStringUtils.randomNumeric(10);
			return randomno;
		}
	
		}
