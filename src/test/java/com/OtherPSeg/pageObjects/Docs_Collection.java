package com.OtherPSeg.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.OtherPSeg.testBase.TestBase;

public class Docs_Collection {
		
		WebDriver ldriver;
		
		public Docs_Collection (WebDriver rdriver) {
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
		
		@FindBy(xpath = "//*[@id=\"3\"]/span")
		WebElement InProcess;
		
		@FindBy(xpath = "//*[@id=\"state_2\"]/span")
		WebElement DocsCollection;
		
		@FindBy(xpath = "//*[@id=\"object-action-button\"]/div/a[2]/span[2]")
		WebElement SavenPro1;
		
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
		
		public void InProcess()
		{
			TestBase.highlightelement(InProcess);
			InProcess.click();
			InProcess.getText();
			System.out.println(InProcess.getText());
			
		}
		
		public void DocsCollection()
		{
			TestBase.highlightelement(DocsCollection);
			DocsCollection.click();
			DocsCollection.getText();
			System.out.println(DocsCollection.getText());
			
		}

}
