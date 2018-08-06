package week4day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class UsingSEMethods extends SeMethods{
@Test
	public void UsingSEMethod1() throws Exception {
		// TODO Auto-generated method stub
		startApp("chrome","http://leaftaps.com/opentaps/");
		WebElement username = locateElement("id","username");
		type(username,"Demosalesmanager");
		WebElement password = locateElement("id","password");
		type(password,"crmsfa");
		WebElement login = locateElement("class","decorativeSubmit");
		click(login);
		WebElement crmsfa = locateElement("linktext","CRM/SFA");
		click(crmsfa);
		WebElement contactCreate = locateElement("linktext","Create Contact");
		click(contactCreate);
		WebElement firstName = locateElement("id","firstNameField");
		type(firstName,"ABCDE");
		String expectedText=firstName.getText();
		WebElement lastName = locateElement("id","lastNameField");
		type(lastName,"DEFGH");
		WebElement localFN = locateElement("id","createContactForm_firstNameLocal");
		type(localFN,"FNSAMPLE");
		WebElement localLN = locateElement("id","createContactForm_lastNameLocal");
		type(localLN,"LNSAMPLE");
		WebElement title = locateElement("id","createContactForm_personalTitle");
		type(title,"Mr.");
		WebElement profTitle = locateElement("id","createContactForm_generalProfTitle");
		type(profTitle,"hjsfj");
		WebElement deptName = locateElement("id","createContactForm_departmentName");
		type(deptName,"Compscience");
		WebElement ddCurrency = locateElement("id","createContactForm_preferredCurrencyUomId");
		selectDropDownUsingText(ddCurrency,"USD");
		WebElement description = locateElement("id","createContactForm_description");
		type(description,"SAMPLE");
		WebElement impnote = locateElement("id","createContactForm_importantNote");
		type(impnote,"SAMPLE2");
		WebElement areaCode = locateElement("id","createContactForm_primaryPhoneAreaCode");
		type(areaCode,"1233");
		WebElement phoneExt = locateElement("id","createContactForm_primaryPhoneExtension");
		type(phoneExt,"123");
		WebElement email = locateElement("id","createContactForm_primaryEmail");
		type(email,"123@gmail.com");
		WebElement phNo = locateElement("id","createContactForm_primaryPhoneNumber");
		type(phNo,"123456789");
		WebElement POC = locateElement("id","createContactForm_primaryPhoneAskForName");
		type(POC,"Sekhar");
		WebElement toName = locateElement("id","createContactForm_primaryPhoneAskForName");
		getText(toName);
		WebElement address1 = locateElement("id","createContactForm_generalAddress1");
		type(address1,"sdfnkf");
		WebElement city = locateElement("id","createContactForm_generalCity");
		type(city,"chennai");
		WebElement postalCode = locateElement("id","createContactForm_generalPostalCode");
		type(postalCode,"32434");
		WebElement postalCodeExt= locateElement("id","createContactForm_generalPostalCodeExt");
		type(postalCodeExt,"232");
		WebElement attnName= locateElement("id","createContactForm_generalAttnName");
		type(attnName,"sekhar");
		WebElement address2= locateElement("id","createContactForm_generalAddress2");
		type(address2,"defg road");
		WebElement ddCountry = locateElement("id","createContactForm_generalCountryGeoId");
		selectDropDownUsingText(ddCountry,"USA");
		Thread.sleep(3000);
		WebElement ddState = locateElement("id","createContactForm_generalStateProvinceGeoId");
		selectDropDownUsingText(ddState,"AR");
		WebElement submitdetails = locateElement("xpath","//input[@value='Create Contact']");
		click(submitdetails);
		verifyPartialText(toName,expectedText);
		WebElement edit = locateElement("linktext","Edit");
		click(edit);
		WebElement ddMrktCmpgn = locateElement("id","addMarketingCampaignForm_marketingCampaignId");
		selectDropDownUsingText(ddMrktCmpgn,"DEMO_MKTG_CAMP");
		Select objMrktCmpgn=new Select(ddMrktCmpgn);
		WebElement firstSelectedOption = objMrktCmpgn.getFirstSelectedOption();
		WebElement add = locateElement("xpath","(//input[@class='smallSubmit'])[2]");
		click(add);
		WebElement update = locateElement("xpath","//input[@class='smallSubmit']");
		click(update);
		WebElement selCmpgn=locateElement("xpath","//span[@id='viewContact_marketingCampaigns_sp']");
		String cmpgnTxt = getText(selCmpgn);
		verifyExactText(firstSelectedOption,cmpgnTxt);
	}

}
