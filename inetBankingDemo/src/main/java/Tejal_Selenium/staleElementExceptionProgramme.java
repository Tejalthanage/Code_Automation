package Tejal_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class staleElementExceptionProgramme {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sai\\eclipse-workspace\\inetBankingDemo\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://freecrm.com/");
		driver.manage().window().maximize();
		Thread.sleep(3000);
		
		WebElement link = driver.findElement(By.xpath("//a[text()='Features']"));
		
		link.click();
		
		driver.navigate().back();
		try {
		link.click();
		}
		catch (StaleElementReferenceException e) {
			link = driver.findElement(By.xpath("//a[text()='Features']"));
			link.click();
		}
			
		driver.close();
		
	}
}
