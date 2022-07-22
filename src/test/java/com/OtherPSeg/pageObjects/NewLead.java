package com.OtherPSeg.pageObjects;


import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import com.OtherPSeg.testBase.TestBase;
//import com.OtherPSeg.utilities.XLUtils;

public class NewLead {

	// First we need to create web driver
	WebDriver ldriver;
	public static String LID;

	// Than we have to define the constructor, it will take driver as parameter
	public NewLead(WebDriver rdriver) {
		// Here we initiate the driver
		// ldriver is local driver and rdriver is remote driver
		ldriver = rdriver;

		PageFactory.initElements(rdriver, this);

	}

	// Need to add the test case for adding preferred branch.

	@FindBy(xpath = "//*[@id=\"newobject\"]/div/div[1]/div/div/div[2]/div[1]/div/div/div/div/div[1]/div[1]/div/div/div/div/a[2]/i")
	WebElement PreBranch;

	@FindBy(xpath = "/html/body/div[3]/div/div/div/div/div/div/div/div/div/div[1]/div/div[1]/div/div[1]/div[1]/div/div/div/div/select")
	WebElement Location;

	@FindBy(xpath = "/html/body/div[3]/div/div/div/div/div/div/div/div/div/div[2]/div[1]/div/div/div[2]/div/div/div[2]/div[1]/div/div[1]/div/div/span/div")
	WebElement Location1;

	@FindBy(xpath = "//*[@id=\"newobject\"]/div/div[1]/div/div/div[2]/div[1]/div/div/div/div/div[1]/div[2]/div/div/div/div/div/select")
	WebElement LeadType;

	@FindBy(xpath = "//*[@id=\"newobject\"]/div/div[1]/div/div/div[2]/div[1]/div/div/div/div/div[2]/div[1]/div/div/div/div/div/select")
	WebElement ProductCategory;

	@FindBy(xpath = "//*[@id=\"newobject\"]/div/div[1]/div/div/div[2]/div[1]/div/div/div/div/div[2]/div[2]/div/div/div/div/div/select")
	WebElement Product;

	@FindBy(xpath = "//*[@id=\"newobject\"]/div/div[1]/div/div/div[2]/div[1]/div/div/div/div/div[3]/div[1]/div/div/div/div/div/select")
	WebElement ExtCust;

	@FindBy(xpath = "//*[@id=\"newobject\"]/div/div[1]/div/div/div[2]/div[1]/div/div/div/div/div[4]/div[1]/div/div/div/div/div/select")
	WebElement LeadSource;

	@FindBy(name = "SALUTATION")
	WebElement Salutation;

	@FindBy(name = "FIRSTNAME")
	WebElement txtFirstName;

	@FindBy(name = "LASTNAME")
	WebElement txtLastName;

	@FindBy(name = "LE_GENDER")
	WebElement Gender;

	@FindBy(id = "LE_DATEOFBIRTH")
	WebElement DOB;

	@FindBy(xpath = "/html/body/div[3]/div/div/div/div/div[3]/div[6]")
	WebElement DOBdate;

	@FindBy(name = "LE_LEADRATING")
	WebElement Leadrating;

	@FindBy(xpath = "//*[@id=\"newobject\"]/div/div[2]/div/div/div/div/div[2]/div/div[1]/div/div[2]/div[11]/div[1]/div/div/div/div/a/i")
	WebElement LoanPurpose;

	@FindBy(xpath = "/html/body/div[3]/div/div/div/div/div/div/div/div/div/div[2]/div[1]/div/div/div[2]/div/div/div[2]/div[7]/div/div/div/div/span/div")
	WebElement Loanselected;

	@FindBy(name = "LE_MOBILE")
	WebElement Mobile;

	@FindBy(xpath = "//*[@id=\"object-action-button\"]/div/a[2]/span[2]")
	WebElement SavenPro;

	@FindBy(xpath = "//*[@id=\"newobject\"]/div[1]/div/div/div/div/div[1]/div[1]/div/div/div[1]/div/div[2]/div[3]")
	static WebElement LeadID;

	@FindBy(xpath = "//*[@id=\"objectWrapper\"]/div/div[3]/div[5]/div/div/div/span")
	WebElement DStatus;

	@FindBy(xpath = "//*[@id=\"objectWrapper\"]/div/div/div/div/div/div/div[2]/div/div/div/div/div[10]/div/div/div/div/a")
	WebElement AssignedTo;

	@FindBy(xpath = "//*[@id=\"newobject\"]/div[1]/div/div/div/div/div[2]/div/div[1]/div/div[2]/div[3]/div[1]/div/div/div/span")
	WebElement AssntoLID;

	public void PreBranch() {
		TestBase.highlightelement(PreBranch);
		PreBranch.click();
		Location.click();
		Select dropdown = new Select(Location);
		dropdown.selectByValue("-1");
	}

	public void Location1() {
		Location1.click();
	}

	public void LeadType() {
		TestBase.highlightelement(LeadType);
		LeadType.click();
		Select dropdown = new Select(LeadType);
		dropdown.selectByValue("HNI");
	}

	public void ProductCategory() {
		TestBase.highlightelement(ProductCategory);
		ProductCategory.click();
		Select dropdown = new Select(ProductCategory);
		dropdown.selectByValue("20");
	}

	public void Product() {
		TestBase.highlightelement(Product);
		Product.click();
		Select dropdown = new Select(Product);
		dropdown.selectByValue("127");
	}

	public void ExtCust() {
		TestBase.highlightelement(ExtCust);
		ExtCust.click();
		Select dropdown = new Select(ExtCust);
		dropdown.selectByValue("2");
	}

	public void LeadSource() {
		TestBase.highlightelement(LeadSource);
		LeadSource.click();
		Select dropdown = new Select(LeadSource);
		dropdown.selectByValue("44");
	}

	public void Salutation() {
		TestBase.highlightelement(Salutation);
		Salutation.click();
		Select dropdown = new Select(Salutation);
		dropdown.selectByValue("13");
	}

	public void setFirstName(String fname) {
		TestBase.highlightelement(txtFirstName);
		txtFirstName.sendKeys(fname);
	}

	public void setLastName(String lname) {
		TestBase.highlightelement(txtLastName);
		txtLastName.sendKeys(lname);
	}

	public void Gender() {
		TestBase.highlightelement(Gender);
		Gender.click();
		Select dropdown = new Select(Gender);
		dropdown.selectByValue("1");
	}

	public void DOB() {
		TestBase.highlightelement(DOB);
		DOB.click();
		DOBdate.click();

	}

	public void Leadrating() {
		TestBase.highlightelement(Leadrating);
		Leadrating.click();
		Select dropdown = new Select(Leadrating);
		dropdown.selectByValue("2");
	}

	public void LoanPurpose() 
	{
		TestBase.highlightelement(LoanPurpose);
		LoanPurpose.click();
	}

	public void Loanselected() {
		TestBase.highlightelement(Loanselected);
		Loanselected.click();
	}

	public void setMobile(String MobileNo) {
		TestBase.highlightelement(Mobile);
		Mobile.sendKeys(MobileNo);
	}

	public void SavenPro() {
		TestBase.highlightelement(SavenPro);
		SavenPro.click();
	}

	public static String LeadID()
	{
		TestBase.highlightelement(LeadID);
		LID = LeadID.getText();
		System.out.println(LID);
		return LID;		
	}

	public void DStatus() {
		TestBase.highlightelement(DStatus);
		DStatus.getText();
		System.out.println(DStatus.getText());
	}

	public void AssignedTo() {
		AssignedTo.getText();
		System.out.println(AssignedTo.getText());
		AssignedTo.click();
		Set<String> handle = ldriver.getWindowHandles();
		Iterator<String> it = handle.iterator();
		// String parentwindowid = it.next();

		String childwindowid = it.next();

		// Below code is use to switch to Child window
		ldriver.switchTo().window(childwindowid);
	}

	public void AssntoLID() {
		TestBase.highlightelement(AssntoLID);
		String LoginID = AssntoLID.getText();
		System.out.println(LoginID);
	}
	
	

}
