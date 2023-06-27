package com.empmonitor.utilities;

import java.util.Set;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class MethodsUtilities {
	
	// Drop Down
	public void DropDown(WebElement element , String text )
	{
		Select s = new Select(element);
		s.selectByVisibleText(text);
	}
	
	// MouseHover
	
	public void Mousehover(WebDriver driver,WebElement element)
	{
		Actions a = new Actions(driver);
		a.moveToElement(element).perform();
	}
	 
	//doubleclick
	public void DoubleClick(WebDriver driver,WebElement element)
	{
		Actions a = new Actions(driver);
		a.doubleClick(element).perform();
	}
	
	//RightClick
	public void RightClick(WebDriver driver,WebElement element)
	{
		Actions a = new Actions(driver);
		a.contextClick(element).perform();
	}
	
	//DragandDrop
	
	public void DragandDrop(WebDriver driver,WebElement source,WebElement target )
	{
		Actions a = new Actions(driver);
		a.dragAndDrop(source, target);
	}
	
	//SwitchFrame
	
	public void SwithFrame(WebDriver driver)
	{
		driver.switchTo().frame(0);
	}
	
	//SwitchBackToFrame
	public void SwitchBackToFrame(WebDriver driver)
	{
		driver.switchTo().defaultContent();
	
	}
	
	//AlertPopup
	public void AlertPopup(WebDriver driver)
	{
		driver.switchTo().alert();
		
	}
	
	//SwitchingFrames
	public void SwitchingFrames(WebDriver driver)
	{
		Set<String> value = driver.getWindowHandles();
		
		for(String a:value)
		{
			driver.switchTo().window(a);
		}
	}
	
	//ScrollBar
	public  void ScrollBar(WebDriver driver, int x , int y)
	{
		JavascriptExecutor js = (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy("+x+""+y+")");
		
	}
	
}
