package com.empmonitor.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.empmonitor.utilities.ReadConfig;

public class LoginPage {
//	ReadConfig read  = new ReadConfig();
//	String email = read.getEmail();
//	String Paassword = read.getPassword();
	
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
	
	
	public void LoginEmail(String email)
	{
		EmailId.sendKeys(email);
	}
	
	public void LoginPassword(String paassword)
	{
		Password.sendKeys(paassword);
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
