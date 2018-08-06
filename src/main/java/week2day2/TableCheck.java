package week2day2;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableCheck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\films\\TestLeaf\\Softwares-20180619T043143Z-001\\Softwares\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leafground.com/pages/table.html");
		//to find no. of rows and columns of table
		int rowsize = driver.findElementsByXPath("//table//tr").size();
		System.out.println("No. of rows="+rowsize);
		int columnsize = driver.findElementsByXPath("//table//tr[2]/td").size();
		System.out.println("No. of columns="+columnsize);
		//printing progress value for "Learn to interact with elements"
		WebElement row2Col2 = driver.findElementByXPath("//tr[@class='even']//td[2]");
		System.out.println(row2Col2.getText());
		//checkbox for least completed progress
		driver.findElementByXPath("//tbody/tr[4]/td[3]").click();
		
	}
		
}
