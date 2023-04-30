package Tejal_Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class First_assignment {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sai\\eclipse-workspace\\inetBankingDemo\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");
		driver.manage().window().maximize();
		WebElement draggable1 = driver.findElement(By.id("box4"));
		WebElement droppable1 = driver.findElement(By.id("box106"));
		WebElement draggable2 = driver.findElement(By.id("box6"));
		WebElement droppable2 = driver.findElement(By.id("box107"));
		WebElement draggable3 = driver.findElement(By.id("box1"));
		WebElement droppable3 = driver.findElement(By.id("box101"));
		
		
		Actions act=new Actions(driver);
		act.clickAndHold(draggable1).moveToElement(droppable1).release().build().perform();
		act.clickAndHold(draggable2).moveToElement(droppable2).release().build().perform();
		act.dragAndDrop(draggable3, droppable3).release().build().perform();
		
		
		
	}
}
