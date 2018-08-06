package week2day1;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class Excercise1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		/*ChromeOptions op= new ChromeOptions();
		op.setHeadless(true);*/	
		System.setProperty("webdriver.chrome.driver","C:\\films\\TestLeaf\\Softwares-20180619T043143Z-001\\Softwares\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.findElementById("username").sendKeys("DemoSalesManager");
		driver.findElementById("password").sendKeys("crmsfa");
		driver.findElementByClassName("decorativeSubmit").click();
		driver.findElementByLinkText("CRM/SFA").click();
		driver.findElementByLinkText("Create Lead").click();
		driver.findElementById("createLeadForm_companyName").sendKeys("abc");
		driver.findElementById("createLeadForm_lastName").sendKeys("def");
		driver.findElementById("createLeadForm_firstName").sendKeys("K");
		WebElement dropdown = driver.findElementById("createLeadForm_industryEnumId");
		Select ss = new Select(dropdown);
		ss.selectByValue("IND_INSURANCE");
		WebElement mrktcam = driver.findElementById("createLeadForm_marketingCampaignId");
		Select ff = new Select(mrktcam);
		List<WebElement> alloptions = ff.getOptions();
		int ddsize=alloptions.size();
		System.out.println(ddsize);
		ff.selectByIndex(ddsize-2);
		driver.findElementByClassName("smallSubmit").click();
		System.out.println("Lead creation completed");
		List<WebElement> dropDownSize = driver.findElementsByTagName("select");
		int dd = dropDownSize.size();
		System.out.println(dd);
		
	}

}
