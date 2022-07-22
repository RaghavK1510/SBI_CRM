package com.OtherPSeg.testCases;

import java.io.IOException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.OtherPSeg.pageObjects.NewLead;
//import com.OtherPSeg.utilities.WriteExcel;
import com.OtherPSeg.utilities.XLUtils;

public class TC_NewLead_002 extends TC_LoginPage_001 {

	@Test(dataProvider = "NewLead")
	public void Initiate(String fname, String lname, String MobNum) throws Exception 
	{

		NewLead nl = new NewLead(driver);

		captureScreen(driver, "Initiate Milestone");

		Thread.sleep(2000);
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

		nl.setFirstName(fname);
		logger.info("Entered First Name");

		nl.setLastName(lname);
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
		
		NewLead.LeadID(); //need to change in future
		logger.info("Successfully captured Lead ID");
		
		nl.DStatus();
		logger.info("Successfully captured Detail Page Status");
		
		XLUtils.setCellData("LeadID", 1, 0, NewLead.LID);
		
		//captureScreen(driver, "New Lead Detail Page");
		
		/*nl.AssignedTo();
		logger.info("Successfully captured Assigned To");

		nl.AssntoLID();
		captureScreen(driver, "Assigned to Login ID");
		logger.info("Successfully captured Assigned To login ID");*/
		
		
	}

	

	@DataProvider(name = "NewLead")
	String[][] getData1() throws IOException {
		String path = System.getProperty("user.dir") + "/src/test/java/com/OtherPSeg/testData/OtherPSeg.xlsx";

		int rownum1 = XLUtils.getRowCount(path, "New_Lead");
		int colcount1 = XLUtils.getCellCount(path, "New_Lead", 1);

		String newlead[][] = new String[rownum1][colcount1];

		for (int i = 1; i <= rownum1; i++) 
		{
			for (int j = 0; j < colcount1; j++) 
			{
				newlead[i - 1][j] = XLUtils.getCellData(path, "New_Lead", i, j);// 1 0 }

			}

		}
		return newlead;

	}
	
	
	
}
