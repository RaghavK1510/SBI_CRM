package com.OtherPSeg.testCases;

import java.io.IOException;

import org.testng.annotations.Test;

import com.OtherPSeg.pageObjects.Docs_Collection;
import com.OtherPSeg.pageObjects.HomePage;
import com.OtherPSeg.pageObjects.Interested;
import com.OtherPSeg.pageObjects.LoginPage;
import com.OtherPSeg.pageObjects.NewLead;
import com.OtherPSeg.testBase.TestBase;

public class TC_Docs_Collection_006 extends TestBase {
	@Test
	public void DocsCollection() throws InterruptedException, IOException {

		LoginPage lp = new LoginPage(driver); 
		HomePage hp = new HomePage(driver);
		NewLead nl = new NewLead(driver);
		Interested In = new Interested(driver);
		Docs_Collection dc = new Docs_Collection(driver);
		
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

		dc.InProcess();
		logger.info("Clicked on In Process Milestone");
		
		captureScreen(driver, "In Process Milestone");

		dc.DocsCollection();
		logger.info("Clicked on Docs Collection status");
		
		//****************************************************************
		
		nl.SavenPro();
		logger.info("Successfully click on Save and Proceed");

		nl.DStatus();
		logger.info("Successfully captured Detail Page Status");
		
		captureScreen(driver, "Docs Collection Details Page");
	}

}
