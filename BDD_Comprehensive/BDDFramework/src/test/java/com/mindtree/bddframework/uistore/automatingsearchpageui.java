package com.mindtree.bddframework.uistore;

import org.openqa.selenium.By;

public class automatingsearchpageui {
	public static By from =By.id("gosuggest_inputSrc");
	public static By to=By.id("gosuggest_inputDest");
	public static By departure=By.id("departureCalendar");
	public static By departuremonth=By.cssSelector(".DayPicker-Caption");
	public static By departureclick=By.cssSelector(".DayPicker-NavButton.DayPicker-NavButton--next");
	public static By d=By.id("fare_20210906");
	public static By departuredategroup=By.className(".DayPicker-Day");
	public static By departuredate=By.cssSelector(".DayPicker-Day");
	public static By arrival=By.id("returnCalendar");
	public static By arrivalmonth=By.cssSelector(".DayPicker-Caption");
	public static By arrivalclick=By.cssSelector(".DayPicker-NavButton.DayPicker-NavButton--next");
	public static By arrivaldate=By.cssSelector(".DayPicker-Day");
	public static By c=By.id("fare_20210910");
	public static By search=By.id("gi_search_btn");
	
}
