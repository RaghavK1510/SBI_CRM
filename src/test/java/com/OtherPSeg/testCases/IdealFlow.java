package com.OtherPSeg.testCases;

import java.io.IOException;
import org.testng.annotations.Test;
import com.OtherPSeg.pageObjects.HomePage;
import com.OtherPSeg.pageObjects.LoginPage;
import com.OtherPSeg.pageObjects.NewLead;
import com.OtherPSeg.testBase.TestBase;


public class IdealFlow extends TestBase

// Extends helps us to extend the base class in cases

{

	@Test

	// *************************** Login Screen ************************************
	public void loginTest() throws InterruptedException, IOException 
	{		
		driver.get(baseURL);
		logger.info("URL is opened");

		LoginPage lp = new LoginPage(driver); // lp is stand for login page

		lp.setUserName(username);
		logger.info("Entered Username");

		lp.setPassword(password);
		logger.info("Entered Password");

		lp.clickLogin();

		Thread.sleep(3000);


		// *************************** Home Page ************************************

		HomePage hp = new HomePage(driver);

		hp.profileimg();
		logger.info("Successfully clicked on Profile Image");

		Thread.sleep(1000);
		hp.selectrole();
		logger.info("Branch Head is selected");

		Thread.sleep(1000);
		hp.selectobject();
		logger.info("Lead Object is selected successfully");

		Thread.sleep(1000);
		hp.NewLayout();
		logger.info("New Layout is selected successfully");

		hp.OtherPSegment();
		logger.info("Other P Segment is selected successfully");

		// *************************** Milestone - Initiate
		// ************************************
		// *************************** Status - New Lead
		// ************************************

		NewLead nl = new NewLead(driver);

		captureScreen(driver, "Milestone Page");

		nl.PreBranch();
		logger.info("Preferred Branch is selected");

		nl.Location1();
		logger.info("Location is selected");

		nl.LeadType();
		logger.info("Lead Type is selected");

		nl.ProductCategory();
		logger.info("Product Category is selected");

		nl.Product();
		logger.info("Product is selected");

		nl.ExtCust();
		logger.info("Existing Customer is selected");

		Thread.sleep(1000);
		nl.LeadSource();
		logger.info("Lead Source is selected");

		nl.setFirstName(firstname);
		logger.info("Entered First Name");

		nl.setLastName(lastname);
		logger.info("Entered Last Name");

		Thread.sleep(2000);
		nl.Salutation();
		logger.info("Salutation is selected");

		nl.Gender();
		logger.info("Gender is selected");

		nl.DOB();
		logger.info("Date of birth is selected");

		Thread.sleep(2000);
		nl.Leadrating();
		logger.info("Lead rating is selected");

		Thread.sleep(1000);
		nl.LoanPurpose();
		logger.info("Loan Purpose is selected");

		Thread.sleep(500);
		nl.Loanselected();
		logger.info("Loan is selected");

		nl.setMobile(Mobile);
		logger.info("Entered mobile number");

		nl.SavenPro();
		logger.info("Successfully click on Save and Proceed");

		NewLead.LeadID(); //need to change in furure
		captureScreen(driver, "Lead Created");
		logger.info("Successfully captured Lead ID");

		nl.DStatus();
		logger.info("Successfully captured Detail Page Status");

		nl.AssignedTo();
		logger.info("Successfully captured Assigned To");

		nl.AssntoLID();
		captureScreen(driver, "Assigned to Login ID");
		logger.info("Successfully captured Assigned To login ID");

	}
}

