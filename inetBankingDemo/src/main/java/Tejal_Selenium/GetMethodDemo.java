package Tejal_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GetMethodDemo {
	boolean CheckTitle(String excTitle,String actTitle)
	{
		if(excTitle.equals(actTitle))
			return true;
		else 
			return false;
		
	}
	void printCurrentUrl(String Url)
	{
		System.out.println("Current url of page is" +Url);
	}
	void GetPageSource(String PageSource) {
		System.out.println(PageSource);
	}
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sai\\eclipse-workspace\\inetBankingDemo\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		String excTitle="Register";
		String actTitle=driver.getTitle();
		GetMethodDemo obj=new  GetMethodDemo();
		boolean ans= obj.CheckTitle(excTitle, actTitle);
		obj.printCurrentUrl(driver.getCurrentUrl());
		if(ans==true)
			System.out.println("Test Case Has been passed");
		else
			System.out.println("Test Case Has been failed");
		 String txt=driver.findElement(By.xpath("//label[@class='col-md-3 col-xs-3 col-sm-3 control-label'][1]")).getText();
		 System.out.println("Text captured is "+txt);
		 obj.GetPageSource(driver.getPageSource());
		driver.close();
	}

}
