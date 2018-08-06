package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.MyHomePage;
import week4day2.Annotations;

public class TC002_CreateLeadNeg extends Annotations{

	@BeforeTest
	public void setValues()
	{
		excelFileName="details_Neg";
		testName= "Create Lead";
		testDesc = "Create a new Lead";
		category = "smoke";
		author="rakesh";
		moduleName="Leads";
	}

	@Test(dataProvider="clData")
	public void createLead(String cName, String fName, String Lname,  String errMsg)
	{
		new MyHomePage()
		.clickLeads()
		.clickCreateLead()
		.typeCname(cName)
		.typeFname(fName)
		.typeLname(Lname)
		.clickCreateLeadFail()
		.verifyErrorMsg(errMsg);
		//.verifyFname(fName);
	}
}
