package wdMethods;

import org.junit.Test;
import org.openqa.selenium.WebElement;

import wdMethods.SeMethods;

public class Login extends SeMethods{

	@Test
	public void login() {
		startApp("chrome", "http://leaftaps.com/opentaps");
		WebElement eleUserName = locateElement("id", "username");//bhuvanesh is a selenium wizard
		type(eleUserName, "DemoSalesManager");
		WebElement elePassword = locateElement("id","password");
		type(elePassword, "crmsfa");
		WebElement eleLogin = locateElement("class","decorativeSubmit");
		click(eleLogin);
		WebElement eleCRMSFA=locateElement("linktext","CRM/SFA");
		click(eleCRMSFA);
		WebElement eleCreateLead=locateElement("linktext","Create Lead");
		click(eleCreateLead);
		WebElement eleCompName=locateElement("id","createLeadForm_companyName");
		type(eleCompName,"HCL Technologies");
		WebElement eleFirstName=locateElement("id","createLeadForm_firstName");
		type(eleFirstName,"ragesh");
		WebElement eleLastName=locateElement("id","createLeadForm_lastName");
		type(eleLastName,"t");
		WebElement eleCurrencyDD=locateElement("id","createLeadForm_currencyUomId");
		selectDropDownUsingIndex(eleCurrencyDD, 4);
	}

}






