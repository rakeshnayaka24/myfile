package com.empmonitor.testcases;

import org.testng.annotations.Test;

import com.empmonitor.pageobject.DashBoardPage;
import com.empmonitor.pageobject.LoginPage;

public class LoginTestCase extends BaseClasss {
	
	@Test
	public void verifyTheLogin ()
	{
		LoginPage lg = new LoginPage(driver);
		lg.LoginEmail("sales_team");
		lg.LoginPassword("salesteam");
		lg.ClickOnLogin();
		
		DashBoardPage dash = new DashBoardPage(driver);
		String username = dash.GetUserName();
		System.out.println(username);
		
	}
	
	

}
