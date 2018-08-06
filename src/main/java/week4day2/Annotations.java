package week4day2;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class Annotations extends SeMethods {
	public String excelFileName,testName,testDesc,category,author,moduleName;
	//@Parameters({"url","uName","pwd"})
	@BeforeSuite
	public void startSuite()
	{
		beginResult();
	}
	@BeforeClass
	public void starttest()
	{
		startTest(testName, testDesc);
	}
	@DataProvider(name="clData")//,indices= {1}//)
	public Object[][] getData() throws IOException {
		ReadCreds creds = new ReadCreds();
		return creds.readCreds(excelFileName);
	}
	
	@BeforeMethod()
	public void login()
	{
		startTestCase(moduleName);
		startApp("chrome","http://leaftaps.com/opentaps");
		WebElement username = locateElement("id","username");
		type(username,"DemoSalesManager");
		WebElement password = locateElement("id","password");
		type(password,"crmsfa");
		WebElement login = locateElement("class","decorativeSubmit");
		click(login);
		WebElement crmsfa = locateElement("linktext","CRM/SFA");
		click(crmsfa);
	}
	@AfterMethod(groups= {"smoke","sanity"})
	public void closerBrowser()
	{
		closeAllBrowsers();
	}
	@AfterSuite
	public void stopSuite() {
		endResult();
	}

}
