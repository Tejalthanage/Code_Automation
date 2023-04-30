package Tejal_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTable_handling {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sai\\eclipse-workspace\\inetBankingDemo\\Drivers\\geckodriver.exe");
	    
	    WebDriver driver=new FirefoxDriver();
	    driver.get("C:\\Users\\sai\\Desktop\\table.html");
	    int r=driver.findElements(By.xpath("/html/body/table/tbody/tr")).size();
	    int c=driver.findElements(By.xpath("/html/body/table/tbody/tr[2]/td")).size();
	    for(int i=2;i<=r;i++)
	    {
	    	for(int j=1;j<=c;j++)
	    	{
	    		System.out.print(driver.findElement(By.xpath("/html/body/table/tbody/tr["+i+"]/td["+j+"]")).getText());
	    	}
	    	System.out.println();
	    }
	}
}
