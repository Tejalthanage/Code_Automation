package Tejal_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GoogleSerach {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sai\\eclipse-workspace\\inetBankingDemo\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("java");
		Thread.sleep(3000);
		
		List<WebElement> count = driver.findElements(By.xpath("//li[@class=\"sbct\"]"));
		System.out.println(count.size());
		
		for(int i=0;i<=count.size();i++)
		{
			String value = count.get(i).getText();
			
			if(value.contains("javascript"))
			{
				count.get(i).click();
				break;
			}
		}
		
		
		
	}
}
