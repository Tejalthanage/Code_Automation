package Tejal_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseOver_event {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sai\\eclipse-workspace\\inetBankingDemo\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.kesari.in/");
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		WebElement Speciality = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/header[1]/div[1]/div[2]/nav[1]/ul[1]/li[2]/a[1]"));
		WebElement Honeymoon = driver.findElement(By.xpath("/html[1]/body[1]/div[2]/header[1]/div[1]/div[2]/nav[1]/ul[1]/li[2]/ul[1]/li[4]/a[1]"));
		
		Actions act=new Actions(driver);
		act.moveToElement(Speciality).moveToElement(Honeymoon).click().build().perform();
		
		
		
		
	
		
	}
}
