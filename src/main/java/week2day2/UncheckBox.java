package week2day2;

import org.openqa.selenium.chrome.ChromeDriver;

public class UncheckBox {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\films\\TestLeaf\\Softwares-20180619T043143Z-001\\Softwares\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://testleaf.herokuapp.com/pages/checkbox.html");
		//for unchecking selenium checkbox
		driver.findElementByXPath("//label[text()='Confirm Selenium is checked']/following-sibling::input").click();
		//for unchecking I am selected checkbox
		driver.findElementByXPath("//label[text()='DeSelect only checked']/following-sibling::input[2]").click();
	}
}
