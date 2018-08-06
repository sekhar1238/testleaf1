package week4day2;
import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class CreateLead extends Annotations {
	//@BeforeTest
/*Object[][] details= new Object[2][4];
details[0][0]="abc";
details[0][1]="Sekhar";
details[0][2]="k";
details[0][3]=12345678;

details[1][0]="def";
details[1][1]="rakesh";
details[1][2]="t";
details[1][3]=87654321;
return details;*/
@Test(dataProvider="clData")
	public void createLeads(String cName, String fName, String lName,String phno)
{
	WebElement leads = locateElement("linktext","Create Lead1");
	click(leads);
	WebElement companyName = locateElement("createLeadForm_companyName");
	type(companyName,cName);
	WebElement firstName = locateElement("createLeadForm_firstName");
	type(firstName,fName);
	WebElement lastName = locateElement("createLeadForm_lastName");
	type(lastName,lName);
	WebElement phone = locateElement("createLeadForm_primaryPhoneNumber");
	type(phone,phno);
	/*
	WebElement firstNameLocal = locateElement("createLeadForm_firstNameLocal");
	type(firstNameLocal,"Nandhu");
	WebElement lastNameLocal = locateElement("createLeadForm_lastNameLocal");
	type(lastNameLocal,"c");WebElement salutation = locateElement("createLeadForm_personalTitle");
	type(salutation,"Greetings");
	WebElement title = locateElement("createLeadForm_generalProfTitle");
	type(title,"Mrs");
	WebElement revenue = locateElement("createLeadForm_annualRevenue");
	type(revenue,"400000");
	WebElement industry = locateElement("createLeadForm_industryEnumId");
	selectDropDownUsingText(industry,"IND_SOFTWARE");
	WebElement ownership = locateElement("createLeadForm_ownershipEnumId");
	selectDropDownUsingText(ownership,"OWN_PARTNERSHIP");
	WebElement siccode = locateElement("createLeadForm_sicCode");
	type(siccode,"1234");
	WebElement countrycode = locateElement("createLeadForm_primaryPhoneCountryCode");
	countrycode.clear();
	type(countrycode,"+91");
	WebElement areacode = locateElement("createLeadForm_primaryPhoneAreaCode");
	type(areacode,"0452");
	WebElement extension = locateElement("createLeadForm_primaryPhoneExtension");
	type(extension,"22552");
	WebElement department = locateElement("createLeadForm_departmentName");
	type(department,"software");
	WebElement currency = locateElement("createLeadForm_currencyUomId");
	selectDropDownUsingIndex(currency,11);
	WebElement noOfEmployees = locateElement("createLeadForm_numberEmployees");
	type(noOfEmployees,"150");
	WebElement tickerSymbol = locateElement("createLeadForm_tickerSymbol");
	type(tickerSymbol,"`````");
	WebElement askName = locateElement("createLeadForm_primaryPhoneAskForName");
	type(askName,"Nandhini");
	WebElement webURL = locateElement("createLeadForm_primaryWebUrl");
	type(webURL,"www.google.com");
	WebElement toName = locateElement("createLeadForm_generalToName");
	type(toName,"Nandhini");
	WebElement address = locateElement("createLeadForm_generalAddress1");
	type(address,"Pallikaranai");
	WebElement city = locateElement("createLeadForm_generalCity");
	type(city,"Chennai");
	WebElement state = locateElement("createLeadForm_generalStateProvinceGeoId");
	selectDropDownUsingIndex(state,4);
	WebElement country = locateElement("createLeadForm_generalCountryGeoId");
	selectDropDownUsingIndex(country,2);
	WebElement postalCode = locateElement("createLeadForm_generalPostalCode");
	type(postalCode,"600100");
	WebElement campaign = locateElement("createLeadForm_marketingCampaignId");
	selectDropDownUsingIndex(campaign,3);
	WebElement email = locateElement("createLeadForm_primaryEmail");
	type(email,"cnandhini1994@gmail.com");*/
	WebElement createLeadButton = locateElement("class","smallSubmit");
	click(createLeadButton);
	//WebElement viewLeadFirstName = locateElement("viewLead_firstName_sp");//
	//verifyExactText(viewLeadFirstName,"Nandhini");//
}
}

