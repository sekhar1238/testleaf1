package week4day2;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class EditLead extends Annotations {
	@Test
	public void editLeads()
	{
		WebElement leads = locateElement("linktext","Leads");
		click(leads);
		WebElement findLead = locateElement("linktext","Find Leads");
		click(findLead);
		WebElement findLeadsFirstName = locateElement("xpath","(//div[@class='x-form-item x-tab-item'])[2]//div//input");
		type(findLeadsFirstName,"Nandhini");
		WebElement findLeadsButton = locateElement("xpath","//button[contains(text(),'Find Leads')]");
		click(findLeadsButton);
		WebElement result1 = locateElement("linktext","11524");
		click(result1);
		String title=driver.getTitle();
		String expectedText="View Lead | opentaps CRM";
		if (expectedText.equals(title)){
			System.out.println(" the text is matching exactly");
		}
		else {
			System.out.println(" the text is not matching exactly");
		}
		WebElement editButton = locateElement("linktext","Edit");
		click(editButton);
		WebElement updateCompanyName = locateElement("updateLeadForm_companyName");
		updateCompanyName.clear();
		type(updateCompanyName,"IBM");
		WebElement updateButton = locateElement("class","smallSubmit");
		click(updateButton);
		WebElement viewLeadCompanyName = locateElement("viewLead_companyName_sp");
		//String text=viewLeadCompanyName.getText();
		verifyPartialText(viewLeadCompanyName,"IBM");
}
}
