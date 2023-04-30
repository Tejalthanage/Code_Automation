package Tejal_Selenium;

import java.awt.Desktop.Action;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class DragandDrop {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\sai\\eclipse-workspace\\inetBankingDemo\\Drivers\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.get("https://jqueryui.com/droppable/");
	driver.manage().window().maximize();
	driver.switchTo().frame(0);
	 WebElement draggble = driver.findElement(By.id("draggable"));
	WebElement droppeble = driver.findElement(By.id("droppable"));
	Actions act=new Actions(driver);
	act.clickAndHold(draggble).moveToElement(droppeble).release().build().perform();
	Thread.sleep(3000);
	driver.close();
	 
	
}

}
