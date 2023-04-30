package Tejal_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Autosuggestions {
public static void main(String[] args) throws InterruptedException
{
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\sai\\eclipse-workspace\\inetBankingDemo\\Drivers\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	
	driver.get("https://www.google.com/");
	Thread.sleep(2000);
	
	WebElement abc=driver.findElement(By.xpath("//*[@name='q']"));
	Actions act=new Actions(driver);
	
	act.click(abc).sendKeys("selenium").build().perform();
	Thread.sleep(2000);
	
	List<WebElement>  searchelements= driver.findElements(By.xpath("//ul[@jsname='bw4e9b']//span[text()='selenium']"));
	

	for(WebElement searchelement:searchelements)
	{
		String abc1=searchelement.getText();
		System.out.println(abc1);
		if(abc1.contains(" ide"))
		{
			searchelement.click();
			break;
		}
		
	}
	
}

}

