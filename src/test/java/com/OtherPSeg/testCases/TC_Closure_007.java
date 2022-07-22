package com.OtherPSeg.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.OtherPSeg.pageObjects.HomePage;
import com.OtherPSeg.pageObjects.Interested;
import com.OtherPSeg.pageObjects.LoginPage;
import com.OtherPSeg.pageObjects.NewLead;
import com.OtherPSeg.testBase.TestBase;
import com.OtherPSeg.pageObjects.Closure;

public class TC_Closure_007 extends TestBase {
	
	@Test
	public void Closure() throws InterruptedException, IOException {

		LoginPage lp = new LoginPage(driver);
		HomePage hp = new HomePage(driver);
		NewLead nl = new NewLead(driver);
		Interested In = new Interested(driver);
		Closure cl = new Closure (driver);

		//****************************************************************
		
		driver.get(baseURL);
		logger.info("URL is opened");
		
		lp.setUserName(username);
		logger.info("Entered Username");
		captureScreen(driver, "userid");

		lp.setPassword(password);
		logger.info("Entered Password");
		captureScreen(driver, "password");

		lp.clickLogin();

		Thread.sleep(3000);

		//****************************************************************

		hp.profileimg();
		logger.info("Successfully clicked on Profile Image");

		Thread.sleep(1000);
		hp.selectrole();
		logger.info("Branch Head is selected");

		Thread.sleep(1000);
		hp.selectobject();
		logger.info("Lead Object is selected successfully");

		//****************************************************************
		
		In.SearchIcon();
		logger.info("Advance search is selected");

		Thread.sleep(1000);
		In.EnterLID();
		logger.info("Lead Id is entered");

		Thread.sleep(1000);
		In.Searchbtn();
		logger.info("Clicked on search button");

		Thread.sleep(1000);
		In.Editbtn();
		logger.info("Clicked on edit button");
		
		//****************************************************************
		
		cl.Disqualified();
		logger.info("Clicked on Disqualified Milestone");
		
		captureScreen(driver, "Disqualified Milestone");
		
		cl.Disqualified_Close();
		logger.info("Clicked on Disqualified_Close status");
		
		cl.ClosureReason();
		logger.info("Closure reason is selected");
		
		nl.SavenPro();
		logger.info("Successfully click on Save and Proceed");

		nl.DStatus();
		logger.info("Successfully captured Detail Page Status");
		
		captureScreen(driver, "Disqualified Details Page.");
		
	}

}
