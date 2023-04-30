package Tejal_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick_demo {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sai\\eclipse-workspace\\inetBankingDemo\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		WebElement doublicclick = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[4]/div[1]/div[1]/a[1]"));
		Actions act=new Actions(driver);
		act.doubleClick(doublicclick).build().perform();
		
		
	}
}
