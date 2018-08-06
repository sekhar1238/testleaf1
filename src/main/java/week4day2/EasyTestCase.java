package week4day2;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class EasyTestCase {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","./drivers/chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.get("http://leaftaps.com/opentaps/");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
driver.findElementById("username").sendKeys("Demosalesmanager");
driver.findElementById("password").sendKeys("crmsfa");
driver.findElementByClassName("decorativeSubmit").click();
driver.findElementByLinkText("CRM/SFA").click();
driver.findElementByLinkText("Create Contact").click();
WebElement username = driver.findElementById("firstNameField");
username.sendKeys("Ragesh");
driver.findElementById("lastNameField").sendKeys("T");
driver.findElementById("createContactForm_firstNameLocal").sendKeys("RAGS");
driver.findElementById("createContactForm_lastNameLocal").sendKeys("ABCD");
driver.findElementById("createContactForm_personalTitle").sendKeys("Mr.");
driver.findElementById("createContactForm_generalProfTitle").sendKeys("Selenium");
driver.findElementById("createContactForm_departmentName").sendKeys("Comp science");
//selecting value for currency drop down
WebElement ddCurrency = driver.findElementById("createContactForm_preferredCurrencyUomId");
Select objCurrency=new Select(ddCurrency);
objCurrency.selectByVisibleText("USD - American Dollar");
driver.findElementById("createContactForm_description").sendKeys("sample description");
driver.findElementById("createContactForm_importantNote").sendKeys("sample imp note");
driver.findElementById("createContactForm_primaryPhoneAreaCode").sendKeys("0123");
driver.findElementById("createContactForm_primaryPhoneExtension").sendKeys("1234");
driver.findElementById("createContactForm_primaryEmail").sendKeys("123@gmail.com");
driver.findElementById("createContactForm_primaryPhoneNumber").sendKeys("123456789");
driver.findElementById("createContactForm_primaryPhoneAskForName").sendKeys("Sekhar");
String toNameText = driver.findElementById("generalToNameField").getText();
System.out.println("text captured in 'To Name' Field is "+toNameText);
driver.findElementById("createContactForm_generalAddress1").sendKeys("abcd street");
driver.findElementById("createContactForm_generalCity").sendKeys("Chennai");
driver.findElementById("createContactForm_generalPostalCode").sendKeys("19273");
driver.findElementById("createContactForm_generalPostalCodeExt").sendKeys("122");
driver.findElementById("createContactForm_generalAttnName").sendKeys("Person1");
driver.findElementById("createContactForm_generalAddress2").sendKeys("defg road");
WebElement ddCountry = driver.findElementById("createContactForm_generalCountryGeoId");
Select objCountry=new Select(ddCountry);
objCountry.selectByVisibleText("United States");
Thread.sleep(3000);
WebElement ddState = driver.findElementById("createContactForm_generalStateProvinceGeoId");
Select objState=new Select(ddState);
objState.selectByVisibleText("Arkansas");
driver.findElementByXPath("//input[@value='Create Contact']").click();
//to verify the to name field contains first name
if (toNameText.contains(username.getText()))
{
	System.out.println("First name appears  in To Field");
	}
else
{
	System.out.println("First name doesnt appear  in To Field");	
}
driver.findElementByLinkText("Edit").click();
WebElement ddMrktCmpgn = driver.findElementById("addMarketingCampaignForm_marketingCampaignId");
Select objMrktCmpgn=new Select(ddMrktCmpgn);
objMrktCmpgn.selectByVisibleText("Demo Marketing Campaign");
String selOption=objMrktCmpgn.getFirstSelectedOption().getText();
driver.findElementByXPath("(//input[@class='smallSubmit'])[2]").click();
driver.findElementByXPath("//input[@class='smallSubmit']").click();
String selCmpgn=driver.findElementByXPath("//span[@id='viewContact_marketingCampaigns_sp']").getText();
if (selCmpgn.equals(selOption))
{
	System.out.println("selected dropdown value and updated value are same");
	}
else
{
	System.out.println("selected dropdown value and updated value are not same");	
}
	}
	



		












	}
