package Tejal_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LocateElement {
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.diver", "C:\\Users\\sai\\eclipse-workspace\\inetBankingDemo\\Drivers\\geckodiver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://www.orangehrm.com/");
		//find number of link in given webpage
		int links=driver.findElements(By.tagName("a")).size();
		System.out.println("number of link persent in the weboage are " + links);

		//find number of slider from webpage
		int sliders=driver.findElements(By.className("owl-item")).size();
		System.out.println("number of slider persent in the webpage are " +sliders );
		//

		driver.close();
	}

}
