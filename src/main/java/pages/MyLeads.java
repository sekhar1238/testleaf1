package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import week4day2.Annotations;

public class MyLeads extends Annotations{

	public MyLeads () {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(linkText ="Create Lead")
	WebElement eleCreateLead;

	
	public CreateLeadsPage clickCreateLead() {
		click(eleCreateLead);
		return new CreateLeadsPage();
	}
}
