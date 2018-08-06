package week3day1;

import org.openqa.selenium.Alert;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearningAlerts {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\films\\TestLeaf\\Softwares-20180619T043143Z-001\\Softwares\\drivers\\chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/jsref/tryit.asp?filename=tryjsref_prompt");
		driver.switchTo().frame("iframeResult");
		driver.findElementByXPath("//button[text()='Try it']").click();
		
		Alert alertobj = driver.switchTo().alert();
		System.out.println(alertobj.getText());
		alertobj.sendKeys("sekhar and ragesh");
		alertobj.accept();
		driver.switchTo().defaultContent();
		driver.findElementById("tryhome").click();
		driver.close();
		
	}
	}
