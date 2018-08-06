package week3day1;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class PrintBrowsers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\films\\TestLeaf\\Softwares-20180619T043143Z-001\\Softwares\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
		driver.findElementByXPath("//a[text()='Contact Us']").click();
	//	Set<String> irctcWindowHandles = driver.getWindowHandles();
		/*List<String> listIrctcHandles = new ArrayList<String>();
		listIrctcHandles.addAll(irctcWindowHandles);
		driver.switchTo().window(listIrctcHandles.get(1));*/
		for (String handle1 : driver.getWindowHandles()) 
		{
        	System.out.println(handle1);
        	driver.switchTo().window(handle1);
        	System.out.println("Current page url is "+driver.getCurrentUrl());
    		System.out.println("Current page title is "+driver.getTitle());
        	}
		/*System.out.println("Current page url is "+driver.getCurrentUrl());
		System.out.println("Current page title is "+driver.getTitle());*/
		
	}
}
