package com.OtherPSeg.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
//import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.Select;

import com.OtherPSeg.testBase.TestBase;

public class HomePage {

	// Create the constructor

	WebDriver ldriver;

	public HomePage(WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}

	@FindBy(xpath = "//*[@id=\"reactheader\"]/div/div[3]/div[5]/a/img")
	WebElement profileimg;

	@FindBy(xpath = "//*[@id=\"reactheader\"]/div/div[3]/div[5]/div/div[1]/div[2]/div[3]/div/div/div/div/div/select")
	WebElement staticDropdown;
	

	@FindBy(xpath = "//*[@id=\"js-vnav\"]/li[5]/div/div[1]/a[1]")
	WebElement selectobject;
	
	@FindBy(xpath="//*[@id=\"home-page\"]/div[1]/div/div[2]/div")
	WebElement NewLayout;
	
	@FindBy(xpath="//*[@id=\"home-page\"]/div[1]/div/div[2]/div/div/div/div[2]/div[2]/div[1]/div/div/div[3]/a")
	WebElement OtherPSegment;

	public void profileimg() 
	{
		TestBase.highlightelement(profileimg);
		profileimg.click();
	}


	public void selectrole() 
	{
		TestBase.highlightelement(staticDropdown);
		staticDropdown.click();
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByValue("u3jjn9huwtg8v");
	}
	
	public void selectobject()
	{
		TestBase.highlightelement(selectobject);
		selectobject.click();
	}
	
	public void NewLayout()
	{
		TestBase.highlightelement(NewLayout);
		NewLayout.click();
	}
	
	public void OtherPSegment()
	{
		TestBase.highlightelement(OtherPSegment);
		OtherPSegment.click();
	}

}
