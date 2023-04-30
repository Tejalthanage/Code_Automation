package Tejal_Selenium;



import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpathpotion {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sai\\eclipse-workspace\\inetBankingDemo\\Drivers\\geckodiver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.redbus.in/");
	

		
		
		driver.close();
	}

}
