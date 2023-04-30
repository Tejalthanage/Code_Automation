package Tejal_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionPractice {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\sai\\eclipse-workspace\\inetBankingDemo\\Drivers\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://testmatick.com/best-demo-websites-to-perform-software-test-automation/#:~:text=Best%20Demo%20Websites%20to%20Perform%20Software%20Test%20Automation,http%3A%2F%2Fsaucedemo.com%2F%20...%206%20Banking%20Site%20GlobalsQA%20https%3A%2F%2Fwww.globalsqa.com%2FangularJs-protractor%2FBankingProject%20");
   WebElement home = driver.findElement(By.xpath("/html[1]/body[1]/div[1]/header[1]/div[2]/div[1]/div[1]/div[4]/div[1]/ul[1]/li[1]/a[1]/span[1]"));
   WebElement about=driver.findElement(By.id("menu-item-26483"));
   WebElement assurance=driver.findElement(By.id("menu-item-26663"));
   Actions act=new Actions(driver);
   act.moveToElement(home).moveToElement(about).moveToElement(assurance).click().build().perform();
   Thread.sleep(3000);
   
	driver.close();
}
}