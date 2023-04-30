package com.inetBankingDemo.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	

	WebDriver ldriver;
	public LoginPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(name="uid")
	@CacheLookup
	WebElement txtusername;
	
	@FindBy(name="password")
	@CacheLookup
	WebElement txtpassword;
	
	@FindBy(name="btnLogin")
	@CacheLookup
	WebElement btnlogin;
	
	@FindBy(xpath = "//a[contains(text(),'Log out')]")
	@CacheLookup
	WebElement btnlogout;
	
	public void setusername(String name)
	{
		txtusername.sendKeys(name);
	}
	
	public void setpassword(String pass)
	{
		txtpassword.sendKeys(pass);
	}
	
	public void clickSubmit()
	{
		btnlogin.click();
	}
	
	public void click_logout()
	{
		btnlogout.click();
	}
	
}
