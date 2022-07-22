package com.OtherPSeg.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OtherPSeg.testBase.TestBase;

public class FollowUp {
	
	WebDriver ldriver;
	
	public FollowUp (WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"3\"]/span")
	WebElement InProcess;
	
	@FindBy (xpath = "//*[@id=\"state_0\"]/span")
	WebElement FollowUpS;

	@FindBy(xpath = "//*[@id=\"newobject\"]/div/div[1]/div/div/div[2]/div[1]/div/div/div/div/div[1]/div[1]/div/div/div/div[1]/div/div/input")
	WebElement FollowDate;
	
	@FindBy(xpath = "//*[@id=\"newobject\"]/div/div[1]/div/div/div[2]/div[1]/div/div/div/div/div[1]/div[1]/div/div/div/div[2]/div/div/input")
	WebElement FollowTime;
	
	public void InProcess()
	{
		TestBase.highlightelement(InProcess);
		InProcess.click();
		InProcess.getText();
		System.out.println(InProcess.getText());
	}
	
	public void FollowUpS()
	{
		TestBase.highlightelement(FollowUpS);
		FollowUpS.click();
		FollowUpS.getText();
		System.out.println(FollowUpS.getText());
	}
	
	public void setFollowDate (String FDate) 
	{
		TestBase.highlightelement(FollowDate);
		FollowDate.sendKeys(FDate);
	}
	
	public void setFollowTime (String FTime) 
	{
		TestBase.highlightelement(FollowTime);
		FollowTime.sendKeys(FTime);
	}
	
}
