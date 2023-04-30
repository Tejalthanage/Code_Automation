package Tejal_Selenium;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class XpathDemo {
public static void main(String[] args) {

	System.setProperty("webdriver.gecko.driver","C:\\Users\\sai\\eclipse-workspace\\inetBankingDemo\\Drivers\\geckodriver.exe" );
	WebDriver diver=new FirefoxDriver();
	diver.get("https://www.facebook.com/");
	diver.findElement(By.xpath("//input[@id='email']")).sendKeys("tejathanage21@gmail.com");
	diver.findElement(By.xpath("//input[@id='pass']")).sendKeys("heytejal");
	diver.findElement(By.xpath("//button[@name='login']")).click();
  	
	diver.close();
}
}
