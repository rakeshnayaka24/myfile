package com.empmonitor.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.empmonitor.utilities.ReadConfig;

public class LoginPage {
	ReadConfig read  = new ReadConfig();

	
	WebDriver driver;
	
	public LoginPage(WebDriver rdiver)
	{
		driver=rdiver;
		PageFactory.initElements(rdiver, this);
	}

	
	@FindBy(id="amember-login")
	WebElement EmailId ;
	
	@FindBy(id="amember-pass")
	WebElement Password;
	
	@FindBy(xpath = "//input[@value='Login']")
	WebElement loginButton;
	
	@FindBy(linkText = "Login")
	WebElement NonAdminLogin;
	
	
	public void LoginEmail()
	{
		EmailId.sendKeys(read.getEmail());
	}
	
	public void LoginPassword()
	{
		Password.sendKeys(read.getPassword());
	}
	
	public void ClickOnLogin()
	{
		loginButton.click();
	
	}
	public void ClickOnNonAdminLogin()
	{
		NonAdminLogin.click();
	}
	
	
	
}
