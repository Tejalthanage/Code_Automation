package com.inetBankingDemo.utility;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;

public class ReadConfig {

	Properties pro;
	public ReadConfig()
	{
		File src=new File("./Confugration/config.properties");
		try
		{
			FileInputStream fis=new FileInputStream(src);
		pro=new Properties();
		pro.load(fis);
		}
		catch(Exception e)
		{
		
			System.out.println("Exception is " + e.getMessage());
		}
	}
	
	
	public String getapplicationurl()
	{
		String url=pro.getProperty("baseurl_config");
		return url;
	}
	
	public String getusername()
	{
		String username1=pro.getProperty("username_config");
		return username1;
	}
	
	public String getpassword()
	{
		String password1=pro.getProperty("password_config");
		return password1;
	}
	public String gettittle()
	{
		String titt=pro.getProperty("tittle");
		return titt;
	}
	public String homepagegettittle()
	{
		String titt1=pro.getProperty("tittleHomepage");
		return titt1;
	}

	/*public String getfirstid()
	{
		String id_1=pro.getProperty("id1");
		return id_1;
	}*/
	
/*	public String getsecondid()
	{
		String id_2=pro.getProperty("id2");
		return id_2;
	}*/
	public String getedgedriver()
	{
		String browser=pro.getProperty("edgepath");
		return browser;
	}
	public String getchromedriver()
	{
		String browser=pro.getProperty("chromepath");
		return browser;
	}
	
	public String getfirefoxDriver()
	{
		String browser=pro.getProperty("firefoxpath");
		return browser;
	}
	
	public String getIEBrowser() {
		String browser=pro.getProperty("iepath");
		return browser;
		
	}
	
	public String EditCustomer_id() {
		String EditcustomerID=pro.getProperty("EditCustomer_id");
		return EditcustomerID;
		
	}
	
	public String EditCustomer_PageTittle() {
		String editCustomer_PageTiitle=pro.getProperty("EditCustomer_Tittle");
		return editCustomer_PageTiitle;
		
	}
	
	

}
