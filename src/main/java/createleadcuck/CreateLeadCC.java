package createleadcuck;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class CreateLeadCC {
	ChromeDriver driver = new ChromeDriver();
	@Given("open the browser")
	public void openBrowser()
	{
		System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	}
	@And("Maximize the window")
	public void maximizeWindow()
	{
		driver.manage().window().maximize();
	}
	@And("Load the url")
	public void loadURL()
	{
		driver.get("http://leaftaps.com/opentaps/");
	}
	@And("Set the timeout")
	public void setTimeOut()
	{
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}
	@And("Enter the username as (.*)")
	public void givUname(String username)
	{
		driver.findElementById("username").sendKeys(username);
	}
	@And("Enter the password as (.*)")
	public void givePassword(String password)
	{
		driver.findElementById("password").sendKeys(password);
	}
	@And("click Login")
	public void clickLogin()
	{
		driver.findElementByClassName("decorativeSubmit").click();
	}
	@And("click CRMSFA")
	public void clickCRMSFA()
	{
		driver.findElementByLinkText("CRM/SFA").click();
	}
	@And("click Create Lead")
	public void clickCreateLead()
	{
		driver.findElementByLinkText("Create Lead").click();
	}
	@And("Enter Company name as (.*)")
	public void enterCompName(String compName)
	{
		driver.findElementById("createLeadForm_companyName").sendKeys(compName);
	}
	@And("Enter First Name as (.*)")
	public void enterFirstName(String FName)
	{
		driver.findElementById("createLeadForm_firstName").sendKeys(FName);
	}
	@And("Enter Last name as (.*)")
	public void enterLastName(String LName)
	{
		driver.findElementById("createLeadForm_lastName").sendKeys(LName);
	}
	@When("Submit Lead Details")
	public void submitLeadDetails()
	{
		driver.findElementByClassName("smallSubmit").click();
	}
	@Then("Verify first name is same as (.*)")
	public void verifyFirstName(String fname1)
	{
		String fname2 = driver.findElementById("viewLead_firstName_sp").getText();
		if (fname1.equals(fname2))
		{
			System.out.println("First name is verified for created lead");
		}
		else 
		{
			System.out.println("First name is not same");
		}
	}
}
