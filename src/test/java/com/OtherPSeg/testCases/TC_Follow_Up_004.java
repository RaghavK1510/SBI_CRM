package com.OtherPSeg.testCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.OtherPSeg.pageObjects.FollowUp;
import com.OtherPSeg.pageObjects.HomePage;
import com.OtherPSeg.pageObjects.Interested;
import com.OtherPSeg.pageObjects.LoginPage;
import com.OtherPSeg.pageObjects.NewLead;
import com.OtherPSeg.testBase.TestBase;
import com.OtherPSeg.utilities.XLUtils;

public class TC_Follow_Up_004 extends TestBase {

	@Test(dataProvider = "FollowUp")
	public void InProcess1(String FDate, String FTime) throws IOException, InterruptedException 
	{
		
		LoginPage lp = new LoginPage(driver); 
		HomePage hp = new HomePage(driver);
		FollowUp fu = new FollowUp(driver);
		NewLead nl = new NewLead(driver);
		Interested In = new Interested(driver);
		
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

		Thread.sleep(2000);
		fu.InProcess();
		logger.info("MileStone is selected");
		
		captureScreen(driver, "In Process Milestone");

		Thread.sleep(500);
		fu.FollowUpS();
		logger.info("Status is selected");

		Thread.sleep(1000);
		fu.setFollowDate(FDate);
		logger.info("Follow up date is entered");

		Thread.sleep(1000);
		fu.setFollowTime(FTime);
		logger.info("Follow up time is entered");

		//****************************************************************

		nl.SavenPro();
		logger.info("Successfully click on Save and Proceed");

		nl.DStatus();
		logger.info("Successfully captured Detail Page Status");
		
		captureScreen(driver, "Follow Up Detail Page");

		/*nl.AssignedTo();
		logger.info("Successfully captured Assigned To");

		nl.AssntoLID();
		captureScreen(driver, "Assigned to Login ID");
		logger.info("Successfully captured Assigned To login ID");*/
	}

	@DataProvider(name = "FollowUp")
	String[][] getData2() throws IOException {
		String path = System.getProperty("user.dir") + "/src/test/java/com/OtherPSeg/testData/OtherPSeg.xlsx";

		int rownum2 = XLUtils.getRowCount(path, "Follow_Up");
		int colcount2 = XLUtils.getCellCount(path, "Follow_Up", 1);

		String FollowUp[][] = new String[rownum2][colcount2];

		for (int i = 1; i <= rownum2; i++) {
			for (int j = 0; j < colcount2; j++) {
				FollowUp[i - 1][j] = XLUtils.getCellData(path, "Follow_Up", i, j);// 1 0 }

			}

		}
		return FollowUp;

	}
}
