package Tejal_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
 


public class ScrollingPage {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sai\\eclipse-workspace\\inetBankingDemo\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.redbus.in/");
		driver.manage().window().maximize();
		//scrolling page by pixel
		JavascriptExecutor js= (JavascriptExecutor)driver;
		//js.executeScript("window.scrollBy(0,1200)", "");
		//scrolling page till we find the element 
		//WebElement flag = driver.findElement(By.xpath("//body/section[@id='rh_main']/div[@id='mBWrapper']/main[1]/div[3]/div[9]/div[1]/ul[1]/li[2]/span[1]/span[1]"));
	    //js.executeScript("arguments[0].scrollIntoView();", flag);	
	    //Scrolling page till the end of the page
	    js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
	}

}
