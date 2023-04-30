package com.inetBankingDemo.utility;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Utilitty_Screenshot {

	public static  String takescreenshot(WebDriver driver,String screenshotname) throws IOException
	{
		try
		{
		String datename=new SimpleDateFormat("yyyyMMddhhmmss").format(new Date());
		System.out.println("date is" + datename);
		TakesScreenshot ts=(TakesScreenshot)driver;
		
		File source=ts.getScreenshotAs(OutputType.FILE);
		
		//failed screenshot
		
		String destination=System.getProperty("C:\\Users\\sai\\eclipse-workspace\\inetBankingDemo\\Screenshots"+screenshotname+datename+".png");
		File finaldestination=new File(destination);
		FileUtils.copyFile(source, finaldestination);
		return destination;
		
		}
		catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		return screenshotname;
		
	}
}
