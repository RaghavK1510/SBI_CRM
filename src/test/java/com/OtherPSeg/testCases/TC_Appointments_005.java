package com.OtherPSeg.testCases;

import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.OtherPSeg.pageObjects.Appointment;
import com.OtherPSeg.pageObjects.HomePage;
import com.OtherPSeg.pageObjects.Interested;
import com.OtherPSeg.pageObjects.LoginPage;
import com.OtherPSeg.pageObjects.NewLead;
import com.OtherPSeg.testBase.TestBase;
import com.OtherPSeg.utilities.XLUtils;

public class TC_Appointments_005 extends TestBase {

	@Test(dataProvider = "Appointment")
	public void InProcess2(String ADate, String ATime) throws IOException, InterruptedException {

		LoginPage lp = new LoginPage(driver); 
		HomePage hp = new HomePage(driver);
		NewLead nl = new NewLead(driver);
		Appointment ap = new Appointment (driver);
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
		ap.InProcess();
		logger.info("MileStone is selected");
		
		captureScreen(driver, "In Process Milestone");

		Thread.sleep(500);
		ap.AppointmentS();
		logger.info("Status is selected");

		Thread.sleep(1000);
		ap.setAppointmentDate(ADate);
		logger.info("Appointment date is entered");

		Thread.sleep(1000);
		ap.setAppointmentTime(ATime);
		logger.info("Appointment time is entered");

		//****************************************************************

		nl.SavenPro();
		logger.info("Successfully click on Save and Proceed");

		nl.DStatus();
		logger.info("Successfully captured Detail Page Status");
		
		captureScreen(driver, "Appointments Detail Page");
	}
	
	@DataProvider(name = "Appointment")
	String[][] getData2() throws IOException {
		String path = System.getProperty("user.dir") + "/src/test/java/com/OtherPSeg/testData/OtherPSeg.xlsx";

		int rownum2 = XLUtils.getRowCount(path, "Appointment");
		int colcount2 = XLUtils.getCellCount(path, "Appointment", 1);

		String Appointment[][] = new String[rownum2][colcount2];

		for (int i = 1; i <= rownum2; i++) {
			for (int j = 0; j < colcount2; j++) {
				Appointment[i - 1][j] = XLUtils.getCellData(path, "Appointment", i, j);// 1 0 }

			}

		}
		return Appointment;

	}

}
