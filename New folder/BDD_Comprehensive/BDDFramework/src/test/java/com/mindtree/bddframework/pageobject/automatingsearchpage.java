package com.mindtree.bddframework.pageobject;

import java.lang.System.Logger;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import com.mindtree.bddframework.reusablecomponents.ReusableMethods;
import com.mindtree.bddframework.uistore.automatingsearchpageui;

public class automatingsearchpage {
	

	
	public static void search(WebDriver driver, String from, String to) throws InterruptedException {
		// TODO Auto-generated method stub
		ReusableMethods.sendKeys(automatingsearchpageui.from, from, driver);
		Thread.sleep(1000);
		ReusableMethods.sendKeysArrowDown(automatingsearchpageui.from, driver);
		Thread.sleep(1000);
		ReusableMethods.sendKeysEnter(automatingsearchpageui.from, driver);
		Thread.sleep(1000);
		ReusableMethods.sendKeys(automatingsearchpageui.to, to, driver);
		//Thread.sleep(1000);
		//ReusableMethods.sendKeysArrowDown(automatingsearchpageui.to, driver);	
		Thread.sleep(1000);
		ReusableMethods.sendKeysEnter(automatingsearchpageui.to, driver);
		}
	public static void datepicker(WebDriver driver) throws InterruptedException
	{
		/*ReusableMethods.getElement(automatingsearchpageui.departure, driver);
		Thread.sleep(1000);
		while(!(ReusableMethods.getElementcompare(automatingsearchpageui.departuremonth, driver, month)))
		{
			ReusableMethods.click(automatingsearchpageui.departureclick, driver);
		}
		//List <WebElement> dates = ReusableMethods.getElements(automatingsearchpageui.departuredategroup, driver);*/
		ReusableMethods.click(automatingsearchpageui.departure, driver);
		Thread.sleep(1000);
		ReusableMethods.click(automatingsearchpageui.d, driver);
		Thread.sleep(1000);
	}
	public static void datepickerarrival (WebDriver driver) throws InterruptedException
	{
		ReusableMethods.click(automatingsearchpageui.arrival, driver);
		Thread.sleep(1000);
		ReusableMethods.click(automatingsearchpageui.c, driver);
		Thread.sleep(1000);
	}
	public static void search (WebDriver driver) throws InterruptedException
	{
		ReusableMethods.click(automatingsearchpageui.search, driver);
		
	}
}

	
	

	
	

