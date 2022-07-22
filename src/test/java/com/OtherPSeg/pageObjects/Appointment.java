package com.OtherPSeg.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OtherPSeg.testBase.TestBase;

public class Appointment {
WebDriver ldriver;
	
	public Appointment (WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"3\"]/span")
	WebElement InProcess;
	
	@FindBy (xpath = "//*[@id=\"state_1\"]/span")
	WebElement AppointmentS;
	
	@FindBy(xpath = "//*[@id=\"newobject\"]/div/div[1]/div/div/div[2]/div[1]/div/div/div/div/div[1]/div[1]/div/div/div/div[1]/div/div/input")
	WebElement AppointmentDate;
	
	@FindBy(xpath = "//*[@id=\"newobject\"]/div/div[1]/div/div/div[2]/div[1]/div/div/div/div/div[1]/div[1]/div/div/div/div[2]/div/div/input")
	WebElement AppointmentTime;
	
	public void InProcess()
	{
		TestBase.highlightelement(InProcess);
		InProcess.click();
		InProcess.getText();
		System.out.println(InProcess.getText());
	}
	
	public void AppointmentS()
	{
		TestBase.highlightelement(AppointmentS);
		AppointmentS.click();
		AppointmentS.getText();
		System.out.println(AppointmentS.getText());
	}
	
	public void setAppointmentDate (String ADate) 
	{
		TestBase.highlightelement(AppointmentDate);
		AppointmentDate.sendKeys(ADate);
	}
	
	public void setAppointmentTime (String ATime) 
	{
		TestBase.highlightelement(AppointmentTime);
		AppointmentTime.sendKeys(ATime);
	}

}
