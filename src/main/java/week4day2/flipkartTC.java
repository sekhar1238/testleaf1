package week4day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class flipkartTC extends SeMethods{
	@Test
	public void flipkartTC1() throws InterruptedException
	{
		startApp("chrome","https://www.flipkart.com/");
		WebElement popupClose = locateElement("xpath","//button[text()='✕']");
		click(popupClose);
		WebElement tvAppl = locateElement("xpath","//span[text()='TVs & Appliances']");
		WebElement samsung=locateElement("xpath","(//span[text()='Samsung'])[2]");
		Actions builder=new Actions(driver);
		builder.moveToElement(tvAppl).pause(3000).click(samsung).perform();
		WebElement ddMin = locateElement("xpath","//select[@class='fPjUPw']");
		selectDropDownUsingText(ddMin,"25000");
		WebElement ddMax = locateElement("xpath","(//select[@class='fPjUPw'])[2]");
		selectDropDownUsingText(ddMax,"60000");
		WebElement screenSize = locateElement("xpath","//div[@class='_1YuAuf']/section[5]/div/div");
		click(screenSize);
		WebElement inch = locateElement("xpath","//div[text()='48 - 55']");
		click(inch);
		WebElement tvClick1 = locateElement("xpath","//div[@class='_3wU53n']");
		String tv1=getText(tvClick1);
		click(tvClick1);
		switchToWindow(1);
		WebElement compare = locateElement("xpath","//span[text()='Compare']");
		if(compare.isSelected()==true)  {
			System.out.println("checkbox is already selected");
		}
		else  {
			click(compare);
			Thread.sleep(3000);
		}
		closeBrowser();
		switchToWindow(0);
		WebElement tvClick2 = locateElement ("xpath","(//div[@class='_3wU53n'])[2]");
		String tv2=getText(tvClick2);
		click(tvClick2);
		switchToWindow(1);
		WebElement compare2 = locateElement("xpath","//span[text()='Compare']");
		if(compare2.isSelected()==true)  {
			System.out.println("checkbox is already selected");
		}
		else  {
			click(compare2);
		}
		WebElement compareBoth = locateElement("xpath","//span[text()='COMPARE']");
		click(compareBoth);
		WebElement price1 = locateElement("xpath","//div[@class='_1vC4OE']");
		String priceTv1 = getText(price1);
		WebElement price2 = locateElement("xpath","(//div[@class='_1vC4OE'])[2]");
		String priceTv2 = getText(price2);
		String replacedValue1 = priceTv1.replaceAll("₹54,999", "54999");
		int finalValue1= Integer.parseInt(replacedValue1);
		System.out.println(finalValue1);
		String replacedValue2 = priceTv2.replaceAll("₹44,999", "44999");
		int finalValue2= Integer.parseInt(replacedValue2);
		System.out.println(finalValue2);
		if (finalValue1> finalValue2)
		{
			WebElement buyTv2 = locateElement("xpath","(//button[text()='BUY NOW'])[2]");
			click(buyTv2);
			System.out.println("the product \""+tv2+"\"is ordered successfully");
		}
		else
		{
			{
				WebElement buyTv1 = locateElement("xpath","//button[text()='BUY NOW']");
				click(buyTv1);
				System.out.println("the product \""+tv1+"\"  is ordered successfully");
			}
		}	
	}
}
