package com.inetBankingDemo.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class EditCustomerPage {

	WebDriver ldriver;
	public EditCustomerPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "//a[contains(text(),'Edit Customer')]")
	@CacheLookup
	WebElement clickOnedit_Customer;
	
	@FindBy(xpath = "//tbody/tr[6]/td[2]/input[1]")
	@CacheLookup
	WebElement Customer_id;
	
	
	@FindBy(xpath = "//tbody/tr[11]/td[2]/input[1]")
	@CacheLookup
	WebElement click_submit;
	
	@FindBy(xpath = "//tbody/tr[11]/td[2]/input[2]")
	@CacheLookup
	WebElement click_reset;
	
	public void clickOn_Edit()
	{
		clickOnedit_Customer.click();
	}
	
	public void Customer_id_value(String no)
	{
		Customer_id.sendKeys(no);
	}
	
	public void click_edit_Submit()
	{
		click_submit.click();
		
	}
	
	public void click_edit_Reset()
	{
		click_reset.click();
	}
	public WebElement custid_no()
	{
		return Customer_id;
	}
	
}
