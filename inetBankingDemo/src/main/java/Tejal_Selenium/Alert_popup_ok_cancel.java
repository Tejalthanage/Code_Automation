package Tejal_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alert_popup_ok_cancel {
	
	public static void validating_result(String ActText,String ExcText,String mes) {
		if(ExcText.equals(ActText)==true)
		{
			System.out.println(mes+"button test has been passed");
		}
		else
		{
			System.out.println(mes+" button test has been failed");
		}
		
	}

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sai\\eclipse-workspace\\inetBankingDemo\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://demo.automationtesting.in/Alerts.html");
		driver.manage().window().maximize();
		
		
		
		
		
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/button[1]")).click();
		driver.switchTo().alert().accept();
		String ActText=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/p[1]")).getText();
		String ExcText="You pressed Ok";
		String mes="ok";
		
		//Alert_popup_sendkeys_textbox obj=new Alert_popup_sendkeys_textbox();
		validating_result(ActText, ExcText,mes);
		
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/ul[1]/li[2]/a[1]")).click();
		driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/button[1]")).click();
		driver.switchTo().alert().dismiss();
		
		String ActText1=driver.findElement(By.xpath("/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[2]/div[2]/p[1]")).getText();
		String ExcText1="You Pressed Cancel";
		String mes1="cancel";
		validating_result(ActText1, ExcText1,mes1);
	}

}
