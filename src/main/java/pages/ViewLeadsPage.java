package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import week4day2.Annotations;

public class ViewLeadsPage extends Annotations{

	public ViewLeadsPage () {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(id ="viewLead_firstName_sp")
	WebElement firstName;

	
	public void  verifyFname(String expResult){
		verifyExactText(firstName,expResult);
	}
}
