package Tejal_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Resizable_action_event {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sai\\eclipse-workspace\\inetBankingDemo\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://jqueryui.com/resizable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		WebElement resizable = driver.findElement(By.xpath("//div[@id='resizable']"));
		Actions act=new Actions(driver);
		act.moveToElement(resizable).dragAndDropBy(resizable, 50, 50).build().perform();
		
		
	}
}
