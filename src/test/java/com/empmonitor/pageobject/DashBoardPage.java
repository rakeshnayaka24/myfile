package com.empmonitor.pageobject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DashBoardPage {
	
	WebDriver driver;
	
	public DashBoardPage (WebDriver rdriver)
	{
		driver = rdriver ;
		PageFactory.initElements(rdriver, this);
	}

	@FindBy(xpath = "//a[@class='right-sidebar-toggle']")
	WebElement DashboardUserName;
	
	
	public String GetUserName()
	{
		String user = DashboardUserName.getText();
		return user;
	}
	
}
