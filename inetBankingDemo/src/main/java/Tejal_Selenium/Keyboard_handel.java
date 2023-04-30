package Tejal_Selenium;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Keyboard_handel {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sai\\eclipse-workspace\\inetBankingDemo\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://the-internet.herokuapp.com/key_presses");
       Actions act=new Actions(driver);
       act.sendKeys(Keys.ENTER).perform();
       Thread.sleep(3000);
       act.sendKeys(Keys.TAB).perform();
       Thread.sleep(3000);
       act.sendKeys(Keys.ALT).perform();
       Thread.sleep(3000);
       act.sendKeys(Keys.ARROW_RIGHT).perform();
       Thread.sleep(3000);
       act.sendKeys(Keys.ARROW_LEFT).perform();
       Thread.sleep(3000);
	}
	

}
