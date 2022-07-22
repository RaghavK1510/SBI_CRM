package com.OtherPSeg.testCases;

import java.io.IOException;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import com.OtherPSeg.pageObjects.HomePage;
import com.OtherPSeg.pageObjects.LoginPage;
import com.OtherPSeg.testBase.TestBase;
import com.OtherPSeg.utilities.XLUtils;

public class TC_LoginPage_001 extends TestBase {


	@Test(dataProvider = "LoginData")
	public void loginTest(String user, String pwd) throws InterruptedException, IOException
	{
		LoginPage lp = new LoginPage(driver);
		HomePage hp = new HomePage(driver);
		
		lp.setUserName(user);
		if (user.equals("admin")) {
		logger.info("Username is entered");
		}
		else
		{
			logger.info("Invalid Username is entered - "+user);
		}
		
		
		lp.setPassword(pwd);
		if (pwd.equals("acid_qa")) 
		{
		logger.info("Password is entered");
		}
		
		else
		{
			logger.info("Invalid Password is entered - "+pwd);
		}
		
		
		
		lp.clickLogin();

		Thread.sleep(3000);

		//****************************************************************
		
		hp.profileimg();
		logger.info("Successfully clicked on Profile Image");

		Thread.sleep(2000);
		hp.selectrole();
		logger.info("Branch Head is selected");

		Thread.sleep(2000);
		hp.selectobject();
		logger.info("Lead Object is selected successfully");

		Thread.sleep(1000);
		hp.NewLayout();
		logger.info("New Layout is selected successfully");

		hp.OtherPSegment();
		logger.info("Other P Segment is selected successfully");
	}

	
	@DataProvider(name = "LoginData")
	String[][] getData() throws IOException {
		String path = System.getProperty("user.dir") + "/src/test/java/com/OtherPSeg/testData/OtherPSeg.xlsx";
		int rownum = XLUtils.getRowCount(path, "Login_Page");
		int colcount = XLUtils.getCellCount(path, "Login_Page", 1);

		String logindata[][] = new String[rownum][colcount];

		for (int i = 1; i <= rownum; i++) {
			for (int j = 0; j < colcount; j++) {
				logindata[i - 1][j] = XLUtils.getCellData(path, "Login_Page", i, j);// 1 0
			}

		}
		return logindata;
	}
}
