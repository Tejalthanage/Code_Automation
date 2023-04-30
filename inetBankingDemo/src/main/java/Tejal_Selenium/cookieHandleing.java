package Tejal_Selenium;

import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class cookieHandleing {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sai\\eclipse-workspace\\inetBankingDemo\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
		//to get cookie and their count
		Set<Cookie> cookies = driver.manage().getCookies();
		System.out.println("No of cookies are " +cookies.size());
        	for(Cookie cobj:cookies)
        	{
        		System.out.println(cobj.getName()+":"+cobj.getValue());
        	}
        	Cookie cobj1=new Cookie("DemoCookie","1234567676");
        	//to add cookie
        driver.manage().addCookie(cobj1);
        cookies = driver.manage().getCookies();
		System.out.println("No of cookies are " +cookies.size());
        	for(Cookie cobj:cookies)
        	{
        		System.out.println(cobj.getName()+":"+cobj.getValue());
        	}
        	//printing all information of cookie
        System.out.println(driver.manage().getCookieNamed("session-id-time"));
      //to delete a perticular cookie 
        
        driver.manage().deleteCookie(cobj1);
        System.out.println("No of cookies are " +cookies.size());
    	for(Cookie cobj:cookies)
    	{
    		System.out.println(cobj.getName()+":"+cobj.getValue());
    	}
    	
		 
		driver.quit();
		
	}

}
