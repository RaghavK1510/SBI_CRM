package com.OtherPSeg.testCases;

import org.testng.annotations.Test;

import com.OtherPSeg.pageObjects.Excel;
import com.OtherPSeg.pageObjects.NewLead;

public class ExtractData {
	 Excel obj = new Excel();

	    @Test
	    public void writeExcelTest() throws Exception
	    {
	        obj.writeExcel("LeadID", NewLead.LID , 1, 0 );
	    }

}
