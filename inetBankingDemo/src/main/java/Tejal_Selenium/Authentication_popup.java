package Tejal_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Authentication_popup {
public static void main(String[] args) {
    System.setProperty("webdriver.gecko.driver", "C:\\Users\\sai\\eclipse-workspace\\inetBankingDemo\\Drivers\\geckodriver.exe");
    
    WebDriver driver=new FirefoxDriver();
    driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
   String text =driver.findElement(By.cssSelector("p")).getText();
     if(text.contains("Congratulations! You must have the proper credentials.")==true)
     {
    	 System.out.println("test has been passed");
     }
    
    
    
}
}
