package Tejal_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ConditionalCommand {
	static WebDriver driver=new FirefoxDriver();
    public static void checkdisplayed_firstname()
    {
    	System.out.println("First name is displayed" +driver.findElement(By.xpath("//input[@placeholder='First Name']")).isDisplayed());
		if(driver.findElement(By.xpath("//input[@placeholder='First Name']")).isEnabled())
		{
			driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Manoj");
		}
    }
    public static void checkdisplayed_lastname()
    {
       
        
        System.out.println("last name is displayed"+driver.findElement(By.xpath("//input[@placeholder='Last Name']")).isDisplayed());
    	if( driver.findElement(By.xpath("//input[@placeholder='Last Name']")).isEnabled())
    	{
    		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Shinde");	
    	}
    	
    }
    public static void CheckAddress()
    {
    	System.out.println("Adress is displayed"+driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).isDisplayed());
    	if( driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).isEnabled())
    	{
    		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Savedi");	
    	}
    	
    }
    public static void EmailAddress()
    {
    	System.out.println("Email Adress is displayed"+driver.findElement(By.xpath("//*[@ng-model='EmailAdress']")).isDisplayed());
    	if( driver.findElement(By.xpath("//*[@ng-model='EmailAdress']")).isEnabled())
    	{
    		driver.findElement(By.xpath("//*[@ng-model='EmailAdress']")).sendKeys("tejalthanage21@gmail.com");	
    	}
    	
    }
    public static void Phone()
    {
    	System.out.println("Phone  is displayed"+driver.findElement(By.xpath("//*[@ng-model='Phone']")).isDisplayed());
    	if( driver.findElement(By.xpath("//*[@ng-model='Phone']")).isEnabled())
    	{
    		driver.findElement(By.xpath("//*[@ng-model='Phone']")).sendKeys("9822393332");	
    	}
    	
    }
    public static void CheckRadioMale()
    {
    	System.out.println("Male Radio  is displayed"+driver.findElement(By.xpath("//*[@value='Male']")).isDisplayed());
    	System.out.println("Male is enable"+ driver.findElement(By.xpath("//*[@value='Male']")).isEnabled());
    	
    	
    }
    public static void CheckRadioFemale()
    {
    	System.out.println("Female Radio  is displayed"+driver.findElement(By.xpath("//*[@value='FeMale']")).isDisplayed());
    	System.out.println("Female is enable"+ driver.findElement(By.xpath("//*[@value='FeMale']")).isEnabled());
    	 driver.findElement(By.xpath("//*[@value='FeMale']")).click();
    	
    } public static void Check_CheckBox()
    {
    	 if( driver.findElement(By.id("checkbox1")).isDisplayed()&&driver.findElement(By.id("checkbox1")).isEnabled())
    	 {
    	     driver.findElement(By.id("checkbox1")).click();
    	 }
    	 if( driver.findElement(By.id("checkbox2")).isDisplayed()&&driver.findElement(By.id("checkbox2")).isEnabled())    	 {
    	     driver.findElement(By.id("checkbox2")).click();
    	 }
    	 if( driver.findElement(By.id("checkbox3")).isDisplayed()&&driver.findElement(By.id("checkbox3")).isEnabled())
    	 {
    	     driver.findElement(By.id("checkbox3")).click();
    	 }
    	 }
    
	
	
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sai\\eclipse-workspace\\inetBankingDemo\\Drivers\\geckodriver.exe");
	
		driver.get("https://demo.automationtesting.in/Register.html");
		checkdisplayed_firstname();
		checkdisplayed_lastname();
		CheckAddress();
		EmailAddress();
		Phone();
		CheckRadioMale();
		CheckRadioFemale();
		Check_CheckBox();
		Thread.sleep(5000);
		driver.close();
	}
}


