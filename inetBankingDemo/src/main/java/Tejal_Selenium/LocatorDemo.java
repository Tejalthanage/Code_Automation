package Tejal_Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocatorDemo {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\sai\\eclipse-workspace\\inetBankingDemo\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		String actTitle=driver.getTitle();
		String exeTitle="Faceboo – log in or sign up";
		if(actTitle.equals(exeTitle))
		{
			System.out.println("Test case passed");
		}
		else
		{
			System.out.println("test has been Failed");
		}
		
		driver.close();
	}

}
