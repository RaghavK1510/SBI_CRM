package com.OtherPSeg.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OtherPSeg.testBase.TestBase;

public class LoginPage {

	// First we need to create web driver
	WebDriver ldriver;

	// Than we have to define the constructor, it will take driver as parameter
	public LoginPage(WebDriver rdriver) {
		// Here we initiate the driver
		// ldriver is local driver and rdriver is remote driver
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);

	}
	// Cachelookup instructs Selenium to keep a cache of the WebElement instead of
	// searching for the WebElement every time from the WebPage.

	@FindBy(name = "UserName")
	WebElement txtUserName;

	@FindBy(id = "TxtPassword")
	WebElement txtPassword;

	@FindBy(name = "command")
	WebElement LoginButton;
	
	@FindBy(xpath = "//*[@id=\"registration\"]/div[1]/span")
	WebElement ErrMsg;

	@FindBy(xpath = "//*[@id=\"reactheader\"]/div/div[3]/div[5]/a/img")
	WebElement profileimg;

	@FindBy(xpath = "//*[@id=\"reactheader\"]/div/div[3]/div[5]/div/div[4]/div/div")
	WebElement Logout;

	// Action Methods for above 3 elements
	public void setUserName(String uname) 
	{
		TestBase.highlightelement(txtUserName);
		txtUserName.sendKeys(uname);
	}

	public void setPassword(String pwd) 
	{
		TestBase.highlightelement(txtPassword);
		txtPassword.sendKeys(pwd);
	}
	
	public void ErrMsg()
	{
		String ErrMSg1 = ErrMsg.getText();
		System.out.println(ErrMSg1);
	}

	public void clickLogin() 
	{
		TestBase.highlightelement(LoginButton);
		LoginButton.click();
	}

	public void Profileimg() {
		profileimg.click();
	}

	public void Logout() {
		Logout.click();
	}

}
