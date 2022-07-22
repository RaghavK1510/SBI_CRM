package com.OtherPSeg.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import com.OtherPSeg.testBase.TestBase;



public class Interested {
	
	WebDriver ldriver;
	
	public Interested (WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	
	@FindBy(xpath = "//*[@id=\"reactheader\"]/div/div[2]/div[2]/div/div/div/a")
	WebElement SearchIcon;
	
	@FindBy(xpath = "//input[@data-autoid='LE_NUMBER_ctrl']")
	WebElement EnterLID;
	
	@FindBy(xpath = "//*[@id=\"object-action-button\"]/div/a[1]/span[2]")
	WebElement Searchbtn;
	
	@FindBy(xpath = "//*[@id=\"object-action-button\"]/a[1]/span[1]/i")
	WebElement Editbtn;
	
	@FindBy(xpath = "//*[@id=\"2\"]")
	WebElement Qualify;
	
	@FindBy(xpath = "//*[@id=\"state_0\"]/span")
	WebElement Interested;
	
	public void SearchIcon()
	{
		TestBase.highlightelement(SearchIcon);
		SearchIcon.click();
		System.out.println("**********************");
	}
	
	public void EnterLID()
	{
		TestBase.highlightelement(EnterLID);
		//NewLead lead = new NewLead(ldriver);
		EnterLID.sendKeys(NewLead.LID);
		System.out.println(NewLead.LID);
		System.out.println("**********************");
		
	}
	
	public void Searchbtn()
	{
		TestBase.highlightelement(Searchbtn);
		Searchbtn.click();
	}
	
	public void Editbtn()
	{
		TestBase.highlightelement(Editbtn);
		Editbtn.click();
	}
	
	public void Qualify()
	{
		TestBase.highlightelement(Qualify);
		Qualify.click();
		Qualify.getText();
		System.out.println(Qualify.getText());
		
	}
	
	public void Interested1()
	{
		TestBase.highlightelement(Interested);
		Interested.click();
		Interested.getText();
		System.out.println(Interested.getText());
		
	}
	
}
