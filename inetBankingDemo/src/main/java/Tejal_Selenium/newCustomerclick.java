package Tejal_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class newCustomerclick {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sai\\eclipse-workspace\\inetBankingDemo\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.guru99.com/v4/");
		driver.findElement(By.name("uid")).sendKeys("mngr476840");
		driver.findElement(By.name("password")).sendKeys("bEdymAp");
		driver.findElement(By.name("btnLogin")).click();
		driver.findElement(By.xpath("//a[contains(text(),'New Customer')]")).click();
		Thread.sleep(5000);
	}
	
}
