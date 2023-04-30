package com.inetBankingDemo.PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class NewCustomerpage {

	WebDriver ldriver;
	public NewCustomerpage(WebDriver rdriver)
	{
		ldriver=rdriver;
		PageFactory.initElements(rdriver, this);
		
	}
	
	
	
	@FindBy(xpath ="//tbody/tr[4]/td[2]/input[1]")
	@CacheLookup
	WebElement txtcustomername;
	
	@FindBy(xpath ="//tbody/tr[5]/td[2]/input[1]")
	@CacheLookup
	WebElement radiomale;
	
	@FindBy(xpath = "//tbody/tr[5]/td[2]/input[2]")
	@CacheLookup
	WebElement radiofemale;
	
	@FindBy(xpath="//input[@id='dob']")
	@CacheLookup
	WebElement calender_click;
	
	@FindBy(xpath ="//tbody/tr[7]/td[2]/textarea[1]")
	@CacheLookup
	WebElement txtaddress;
	
	@FindBy(name="city")
	@CacheLookup
	WebElement txtcity;
	
	@FindBy(name="state")
	@CacheLookup
	WebElement txtstate;
	
	@FindBy(name="pinno")
	@CacheLookup
	WebElement txtpinno;
	
	@FindBy(name="telephoneno")
	@CacheLookup
	WebElement txtphoneNo;
	
	@FindBy(name="emailid")
	@CacheLookup
	WebElement txtemailid;
	
	@FindBy(name ="password")
	@CacheLookup
	WebElement txtpassword;
	
	@FindBy(name="sub")
	@CacheLookup
	WebElement btnsubmit;
	
	@FindBy(name="res")
	@CacheLookup
	WebElement btnreset;
	
	@FindBy(xpath="//p[contains(text(),'Add New Customer')]")
	@CacheLookup
	WebElement lbl_addnewCustomer;
	
	@FindBy(xpath="//tbody/tr[4]/td[1]")
	@CacheLookup
	WebElement lbl_customername;
	
	@FindBy(xpath = "//tbody/tr[5]/td[1]")
	@CacheLookup
	WebElement lbl_gneder;
	
	@FindBy(xpath="//tbody/tr[6]/td[1]")
	@CacheLookup
	WebElement lbl_dateofbirth;
	
	@FindBy(xpath = "//tbody/tr[7]/td[1]")
	@CacheLookup
	WebElement lbl_address;
	
	@FindBy(xpath="//tbody/tr[8]/td[1]")
	@CacheLookup
	WebElement lbl_city;
	
	@FindBy(xpath = "//tbody/tr[9]/td[1]")
	@CacheLookup
	WebElement lbl_state;
	
	@FindBy(xpath = "//tbody/tr[10]/td[1]")
	@CacheLookup
	WebElement lbl_pin;
	
	@FindBy(xpath = "//tbody/tr[11]/td[1]")
	@CacheLookup
	WebElement lbl_mobileno;
	
	@FindBy(xpath = "//tbody/tr[12]/td[1]v")
	@CacheLookup
	WebElement lbl_email;
	
	@FindBy(xpath = "//tbody/tr[13]/td[1]")
	@CacheLookup
	WebElement lbl_password;
	
	
	@FindBy(xpath="//label[@id='message']")
	@CacheLookup
	WebElement cust_message;
	
	@FindBy(xpath="//label[@id='message3']")
	@CacheLookup
	WebElement address_msg;
	
	@FindBy(xpath="//label[@id='message4']")
	@CacheLookup
	WebElement city_msg;
	
	@FindBy(xpath = "//label[@id='message5']")
	@CacheLookup
	WebElement state_msg;
	
	@FindBy(xpath = "//label[@id='message6']")
	@CacheLookup
	WebElement pin_msg;
	
	@FindBy(xpath = "//label[@id='message7']")
	@CacheLookup
	WebElement mobile_msg;
	
	@FindBy(xpath = "//label[@id='message9']")
	@CacheLookup
	WebElement email_msg;
	
	@FindBy(xpath = "//label[@id='message18']")
	@CacheLookup
	WebElement password_msg;
	
	
	@FindBy(xpath ="//a[contains(text(),'New Customer')]")
	@CacheLookup
	WebElement newcustomer;
	

	public void setcustomerName(String custname)
	{
		txtcustomername.sendKeys(custname);
	}
	
	public void setAddress(String address)
	{
		txtaddress.sendKeys(address);
	}
	
	public void setcity(String city)
	{
		txtcity.sendKeys(city);
	}
	
	public void setstate(String state)
	{
		txtstate.sendKeys(state);
	}
	
	public void setpin(String pin)
	{
		txtpinno.sendKeys(pin);
	}
	
	public void setmobileNo(String mobno)
	{
		txtphoneNo.sendKeys(mobno);
	}
	
	public void setemail(String email)
	{
		txtemailid.sendKeys(email);
	}
	
	public void setpassword(String pass)
	{
		txtpassword.sendKeys(pass);
	}
	
	public void Click_submit() {
		btnsubmit.click();
		
	}
	public void click_Reset() {
		btnreset.click();
		
	}
	
	public boolean getlbl_customername()
	{
		return lbl_addnewCustomer.isEnabled();
	}
	
	public void click_newcustomer()
	{
		newcustomer.click();
	}
	public void custdob(String mm,String dd,String yy)
	{
		calender_click.sendKeys(mm);
		calender_click.sendKeys(dd);
		calender_click.sendKeys(yy);
	}
	
	public void click_gebder()
	{
		radiomale.click();
	}
}
