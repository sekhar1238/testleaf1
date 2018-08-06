 package testcases;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pages.MyHomePage;
import week4day2.Annotations;

public class TC003_DeleteLead extends Annotations{

	@BeforeTest
	public void setValues()
	{
		excelFileName="details";
		testName= "Create Lead";
		testDesc = "Create a new Lead";
		category = "smoke";
		author="rakesh";
		moduleName="Leads";
	}

	@Test(dataProvider="clData")
	public void createLead(String cName, String fName, String Lname,  String phone)
	{
		new MyHomePage()
		.clickLeads()
		.clickCreateLead()
		.typeCname(cName)
		.typeFname(fName)
		.typeLname(Lname)
		.clickCreateLead()
		.verifyFname(fName);
	}
}
