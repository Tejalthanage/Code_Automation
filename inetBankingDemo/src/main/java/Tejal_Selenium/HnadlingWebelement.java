package Tejal_Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class HnadlingWebelement {
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sai\\eclipse-workspace\\inetBankingDemo\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//*[@ng-model='FirstName']")).sendKeys("tejal");
		driver.findElement(By.xpath("//*[@ng-model='LastName']")).sendKeys("shinde");
		driver.findElement(By.xpath("//*[@ng-model='Adress']")).sendKeys("Savedi");
		driver.findElement(By.xpath("//*[@ng-model='EmailAdress']")).sendKeys("tejalthanage21@gmail.com");
		driver.findElement(By.xpath("//*[@ng-model='Phone']")).sendKeys("1234567890");
		if(driver.findElement(By.xpath("//input[@type='radio'and @ value='FeMale']")).isSelected()==false)
		{
			driver.findElement(By.xpath("//input[@type='radio'and @ value='FeMale']")).click();	
		}
		driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
		driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
		WebElement lang= driver.findElement(By.xpath("//*[@id='msdd']"));
		lang.click();
		//Select lobj=new Select(lang);
		List<WebElement> language = driver.findElements(By.xpath("//*[@class='ui-corner-all']"));
		
		for(WebElement i :language)
		{
			if(i.getText().contains("English"))
			{
				i.click();
			}
		}
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text()='Skills']")).click();
		
		WebElement skills = driver.findElement(By.xpath("//*[@id='Skills']"));
		
		Select skillsselect=new Select(skills);
		skillsselect.selectByVisibleText("C");
		WebElement country = driver.findElement(By.xpath("//span[@role='combobox']"));
		country.click();
		
	try
	{
		List<WebElement> countrycount = driver.findElements(By.xpath("//*[@class='select2-results__option']"));
		for(WebElement i :countrycount)
		{
			if(i.getText().contains("India")==true)
			{
				i.click();
			}
			
		}
	}
	catch (Exception e) {
		System.out.println(e.getMessage());
	}
		
		WebElement year = driver.findElement(By.id("yearbox"));
		
		Select yearobj=new Select(year);
		yearobj.selectByVisibleText("1996");
		
		WebElement month = driver.findElement(By.xpath("//*[@ng-model='monthbox']"));
		Select monthobj=new Select(month);
		monthobj.selectByVisibleText("March");
		
		WebElement day = driver.findElement(By.id("daybox"));
		Select dayobj=new Select(day);
		dayobj.selectByVisibleText("11");
		
		 WebElement pass1 = driver.findElement(By.id("firstpassword"));
		 pass1.sendKeys("manoj");
		WebElement pass2 = driver.findElement(By.id("secondpassword"));
		pass2.sendKeys("manoj");
		
		
		
		
		
		driver.findElement(By.id("Button1")).click();
		
		if(pass1.getText()==null && pass2.getText()==null)
		{
			System.out.println("Test is pass");
		}
		else
		{
			System.out.println("Test is fail");
		}
		
		
		
		Thread.sleep(2000);
		//driver.close();
	}

}
