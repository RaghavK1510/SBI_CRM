package com.OtherPSeg.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.OtherPSeg.testBase.TestBase;

public class Closure {
	WebDriver ldriver;
	
	public Closure (WebDriver rdriver) {
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	/*@FindBy(xpath = "//*[@id=\"reactheader\"]/div/div[3]/div[5]/a/img")
	WebElement profileimg;

	@FindBy(xpath = "//*[@id=\"reactheader\"]/div/div[3]/div[5]/div/div[1]/div[2]/div[3]/div/div/div/div/div/select")
	WebElement staticDropdown;
	

	@FindBy(xpath = "//*[@id=\"js-vnav\"]/li[5]/div/div[1]/a[1]")
	WebElement selectobject;
	
	@FindBy(xpath = "//*[@id=\"reactheader\"]/div/div[2]/div[4]/a")
	WebElement SearchIcon;
	
	@FindBy(xpath = "//*[@id=\"objectWrapper\"]/div/div[2]/div/div/div/div/div[2]/div/div/div/div[2]/div[1]/div[1]/div/div/div/input")
	WebElement EnterLID;
	
	@FindBy(xpath = "//*[@id=\"object-action-button\"]/div/a[1]/span[2]")
	WebElement Searchbtn;
	
	@FindBy(xpath = "//*[@id=\"object-action-button\"]/a[1]/span[1]/i")
	WebElement Editbtn;*/
	
	@FindBy(xpath = "//*[@id=\"5\"]/span")
	WebElement Disqualified;
	
	@FindBy(xpath = "//*[@id=\"state_0\"]/span")
	WebElement Disqualified_Close;
	
	@FindBy(xpath = "//*[@id=\"newobject\"]/div/div[1]/div/div/div[2]/div[1]/div/div/div/div/div[5]/div[1]/div/div/div/div/div/select")
	WebElement ClosureReason;
	
	/*public void profileimg() {
		profileimg.click();
	}


	public void selectrole() {
		staticDropdown.click();
		Select dropdown = new Select(staticDropdown);
		dropdown.selectByValue("u3jjn9huwtg8v");
	}
	
	public void selectobject()
	{
		selectobject.click();
	}
	
	public void SearchIcon()
	{
		SearchIcon.click();
	}
	
	public void EnterLID()
	{
			String LID1 = NewLead.LeadID.getText();
			EnterLID.sendKeys(LID1);
	}
	
	public void Searchbtn()
	{
		Searchbtn.click();
	}
	
	public void Editbtn()
	{
		Editbtn.click();
	}*/
	
	public void Disqualified()
	{
		TestBase.highlightelement(Disqualified);
		Disqualified.click();
		Disqualified.getText();
		System.out.println(Disqualified.getText());
	}
	
	public void Disqualified_Close()
	{
		TestBase.highlightelement(Disqualified_Close);
		Disqualified_Close.click();
		Disqualified_Close.getText();
		System.out.println(Disqualified_Close.getText());
	}
	
	public void ClosureReason()
	{
		TestBase.highlightelement(ClosureReason);
		ClosureReason.click();
		ClosureReason.click();
		Select dropdown = new Select (ClosureReason);
		dropdown.selectByValue("Customer not responding");
	}

}
