package Tejal_Selenium;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multiple_window_handel {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sai\\eclipse-workspace\\inetBankingDemo\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.automationtesting.in/Windows.html");
		
		driver.manage().window().maximize();
		
		WebElement Open_New_Tabbed_Windows = driver.findElement(By.xpath("//*[@data-toggle='tab'][1]"));
		Open_New_Tabbed_Windows.click();
		
		WebElement click = driver.findElement(By.partialLinkText("click"));
		click.click();
		
		
		 Set<String> id = driver.getWindowHandles();
		 
		for( String i :id)
		{
			System.out.println(i);
			String expectedtittle=driver.switchTo().window(i).getTitle();
			System.out.println(expectedtittle);
			if(expectedtittle.contains("Frames & windows"))
			{
				driver.close();
			}
			
			
		}
		
		 
	}
}
