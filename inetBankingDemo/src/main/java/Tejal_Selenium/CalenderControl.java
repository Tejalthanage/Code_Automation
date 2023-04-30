package Tejal_Selenium;

import java.util.Scanner;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CalenderControl {
	public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "C:\\Users\\sai\\eclipse-workspace\\inetBankingDemo\\Drivers\\geckodriver.exe");
	     WebDriver driver=new FirefoxDriver();
	     driver.get("https://www.redbus.in/");
	     driver.findElement(By.xpath("//body/section[@id='rh_main']/div[@id='mBWrapper']/main[1]/section[1]/div[1]/div[2]/section[1]/div[1]/div[3]/span[1]")).click();
	    
	     Thread.sleep(3000); 
	     
	     System.out.println("Please enter the month");
	     Scanner sc=new Scanner(System.in);
	     String a=sc.nextLine();
	     System.out.println("Please enter the date");
	     Scanner sc1=new Scanner(System.in);
	     String b=sc1.nextLine();
	     
	    
	   for(int i=11;i>=0;i--)
	    {
	    	driver.findElement(By.xpath("/html[1]/body[1]/div[4]/table[1]/tbody[1]/tr[1]/td[3]/button[1]")).click();
	    	if(driver.findElement(By.xpath("/html[1]/body[1]/div[4]/table[1]/tbody[1]/tr[1]/td[2]")).getText().contains(a))
	    	{
	    		driver.findElement(By.xpath("//td[contains(text(),"+b+")]")).click();
	    		break;
	    	}
	    	
	    }
	      
	     
	    	
	    }
	    	
	     
	     
	}


