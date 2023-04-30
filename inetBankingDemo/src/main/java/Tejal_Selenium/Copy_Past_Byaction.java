package Tejal_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Copy_Past_Byaction {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sai\\eclipse-workspace\\inetBankingDemo\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://text-compare.com/");
		Actions act=new Actions(driver);
		  WebElement input1 = driver.findElement(By.name("text1"));
		  input1.sendKeys("welcome to selenimu");
		  WebElement input2 = driver.findElement(By.name("text2"));
		  
		//pressing cltr A
        act.keyDown(Keys.CONTROL);
        act.sendKeys("a");
        act.keyUp(Keys.CONTROL);
        act.perform();
        
        //copy
      act.keyDown(Keys.CONTROL);
      act.sendKeys("c");
      act.keyUp(Keys.CONTROL);
      act.perform();
      
      //pressing tab key
    act.sendKeys(Keys.TAB);
    act.perform();
    
    //paste
    act.keyDown(Keys.CONTROL);
    act.sendKeys("v");
    act.keyUp(Keys.CONTROL);
    act.perform();
    
    //checking the copy paste operation is done or not
    
    
    if(input1.getAttribute("value").equals(input2.getAttribute("value")))
    {
    	System.out.println("text copied");
    }
    else
    {
    	System.out.println("text not copied");
    }
	}
	


}
