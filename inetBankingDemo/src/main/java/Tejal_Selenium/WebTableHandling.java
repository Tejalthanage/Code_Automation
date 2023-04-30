package Tejal_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebTableHandling {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sai\\eclipse-workspace\\inetBankingDemo\\Drivers\\geckodriver.exe");
	    
	    WebDriver driver=new FirefoxDriver();
	    driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	    driver.manage().window().maximize();
	    
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@name='username']")).sendKeys("Admin");
	    driver.findElement(By.xpath("//*[@name='password']")).sendKeys("admin123");
	    driver.findElement(By.xpath("//*[@type='submit']")).click();
	    
	    Thread.sleep(3000);
	    driver.findElement(By.xpath("//*[@class='oxd-main-menu-item-wrapper'][1]")).click();
	    
	    Thread.sleep(3000);
	    
	    int r=driver.findElements(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div")).size();
	    int c=driver.findElements(By.xpath("//body/div[@id='app']/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div[1]/div[1]/div")).size();
	    System.out.println(r);
	    for(int i=1;i<=r;i++)
	    {
	    	 String rtext=driver.findElement(By.xpath( "/html[1]/body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/div[2]/div["+i+"]/div[1]")).getText();
	   	  
	    	 if(rtext.contains("Enabled"))
	    	 {
	    		 System.out.print(rtext);
	    	 }
	    }
	    System.out.println();
	   
	    }
	  
	   
	   // driver.close();		
	}

