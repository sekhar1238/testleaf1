package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import week4day2.Annotations;

public class CreateLeadsPage extends Annotations{

	public CreateLeadsPage () {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id ="createLeadForm_companyName")
	WebElement eleCname;

	@FindBy(id ="createLeadForm_firstName")
	WebElement eleFname;
	
	@FindBy(id ="createLeadForm_lastName")
	WebElement eleLname;
	
	@FindBy(className ="smallSubmit")
	WebElement eleSubmit;
	
	@FindBy(className="errList")
	WebElement errMsg;
	

	public CreateLeadsPage typeCname(String companyName) {
	type(eleCname,companyName);
	return this;
	}
	
	public CreateLeadsPage typeFname(String firstName) {
	type(eleFname,firstName);
	return this;
	}
	 public CreateLeadsPage typeLname(String lastName) {
	type(eleLname,lastName);
	return this;
	 }
	 
	 public ViewLeadsPage clickCreateLead() {
		 click(eleSubmit);
		 return new ViewLeadsPage();
	 }
	
	public  CreateLeadsPage clickCreateLeadFail() {
	 click(eleSubmit);
	 return this;
	}

	public void verifyErrorMsg(String expectedText)
	{
	verifyPartialText(errMsg, expectedText);
	System.out.println(errMsg);
	}
}
