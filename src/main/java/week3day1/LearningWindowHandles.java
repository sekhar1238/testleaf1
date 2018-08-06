package week3day1;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.chrome.ChromeDriver;

public class LearningWindowHandles {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\films\\TestLeaf\\Softwares-20180619T043143Z-001\\Softwares\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		/*driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text()='Try it']").click();
		Alert alertobj = driver.switchTo().alert();
		System.out.println(alertobj.getText());
		alertobj.sendKeys("sekhar and ragesh");
		alertobj.accept();
		driver.switchTo().defaultContent();*/
		driver.findElementById("tryhome").click( );
		System.out.println("window handle of current window is "+driver.getWindowHandle());
		Set<String> windowHandlesSet = driver.getWindowHandles();
		List<String> allWindowHandles = new ArrayList<String>();
		allWindowHandles.addAll(windowHandlesSet);
		//returns no.of opened windows
		System.out.println(allWindowHandles.size());
		driver.switchTo().window(allWindowHandles.get(1));
		System.out.println("Current page url is "+driver.getCurrentUrl());
		System.out.println("Current page title is "+driver.getTitle());
		driver.switchTo().window(allWindowHandles.get(0));
		System.out.println("main page url is "+driver.getCurrentUrl());
		System.out.println("main page title is  "+driver.getTitle());
	}
	}
