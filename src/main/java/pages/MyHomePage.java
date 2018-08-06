package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import week4day2.Annotations;

public class MyHomePage extends Annotations{

	public MyHomePage () {
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath ="//a[text()='Leads']")
	WebElement eleLeads;
	
	
	public MyLeads clickLeads() {
		click(eleLeads);
		return new MyLeads();
	}
}
