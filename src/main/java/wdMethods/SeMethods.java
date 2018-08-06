 package wdMethods;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.Select;

public class SeMethods implements WdMethods{
	RemoteWebDriver driver ;
	int i = 1;
	public void startApp(String browser, String url) {
		if (browser.equalsIgnoreCase("chrome")) {
			System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
			driver = new ChromeDriver();			
		} else if (browser.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "./drivers/geckodriver_32bit.exe");
			driver = new FirefoxDriver();		
		}
		driver.manage().window().maximize();
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println("The Browser "+browser+" is Launched Successfully");
		takeSnap();
	}

	public WebElement locateElement(String locator, String locValue) throws NoSuchElementException
	{
			switch (locator) {
			case "id": 	  return driver.findElementById(locValue);
			case "class": return driver.findElementByClassName(locValue);
			case "xpath": return driver.findElementByXPath(locValue);		
			case "linktext":return driver.findElementByLinkText(locValue);
			}
		return null;
	}

	public WebElement locateElement(String locValue) {
		return driver.findElementById(locValue);
	}

	public void type(WebElement ele, String data)  throws NullPointerException {
		try {
			ele.sendKeys(data);
			System.out.println("The Data "+data+" is Entered Successfully");
		} 
		catch (WebDriverException e) {
		System.err.println("WebDriverException has occured");
		throw new RuntimeException();
		}
		catch (Exception e) {
			System.err.println("Exception has occured");
		}
		finally
		{
			takeSnap();
		}
	}

	public void click(WebElement ele) {
		ele.click();
		System.out.println("The Element "+ele+" is clicked Successfully");
		takeSnap();		
	}

	public String getText(WebElement ele) {
		String text=ele.getText();
		System.out.println("the text is retrived" +text);
		return text;
	}

	public void selectDropDownUsingText(WebElement ele, String value) {
		Select option = new Select(ele);
		option.selectByValue(value);
		System.out.println("Drop down value " +value+ " is selected");
		takeSnap();	
	}

	public void selectDropDownUsingIndex(WebElement ele, int index) {
		// TODO Auto-generated method stub
		Select dropObj=new Select(ele);
		dropObj.selectByIndex(index);
		List<WebElement> ddList = dropObj.getOptions();
		System.out.println("drop down value "+ddList.get(index).getText()+"is selected");
	}

	public boolean verifyTitle(String expectedTitle) {
		String title=	driver.getTitle();
		boolean b;
		if (expectedTitle.equals(title)) {
			b=true;
			System.out.println("The expected title is same as current title");
		}else {
			b=false;
			System.out.println("The expected title is not same as current title");
		}
		return b;
	}

	public void verifyExactText(WebElement ele, String expectedText) {
		String text=ele.getText();
		if (expectedText.equals(text)) {
			System.out.println("The expected text is same as current text");
		}else {
			System.out.println("The expected text is not same as current text");
		}
	}

	public void verifyPartialText(WebElement ele, String expectedText) {
		String partialText=ele.getText();
		if (expectedText.contains(partialText)) {
			System.out.println("The expected text is same as partial text");
		}else {
			System.out.println("The expected text is not same as partial text");
		}
	}
	
	public void verifyExactAttribute(WebElement ele, String attribute, String value) {
		if(ele.getAttribute(attribute).equals(value))
		{
			System.out.println("the given attribute value is matched");
		}else {
			System.out.println("the given attribute value is matched");
		}
	}

	public void verifyPartialAttribute(WebElement ele, String attribute, String value) {
		if(ele.getAttribute(attribute).contains(value))
		{
			System.out.println("the given attribute value is not valid");
		}else {
			System.out.println("the given attribute value is valid");
		}

	}

	public void verifySelected(WebElement ele) {
		// TODO Auto-generated method stub
		if(ele.isSelected() == true) {
			System.out.println("the given element is selected");
		}else {
			System.out.println("the given element is not selected");
		}	
	}

	public void verifyDisplayed(WebElement ele) {
		// TODO Auto-generated method stub
		if(ele.isDisplayed() == true)  {
			System.out.println("the given element is selected");
		}else {
			System.out.println("the given element is not selected");
		}
	}

	public void switchToWindow(int index) {
		Set <String> allWindows = driver.getWindowHandles();
		List <String> listOfWindows =new ArrayList<String>();
		listOfWindows.addAll(allWindows);
		driver.switchTo().window(listOfWindows.get(index));
		System.out.println("Switched to window successfully");
	}

	public void switchToFrame(WebElement ele) {
		driver.switchTo().frame(ele);
		System.out.println("Switched to frame successfully");
	}

	public void acceptAlert() {
		driver.switchTo().alert().accept();
	}

	public void dismissAlert() {
		driver.switchTo().alert().dismiss();
	}

	public String getAlertText() {
		String alertMsg =driver.switchTo().alert().getText();
		System.out.println("Alert msg retreived");
		return alertMsg;
	}

	public void takeSnap() {
		File src = driver.getScreenshotAs(OutputType.FILE);
		File desc = new File("./snaps/img"+i+".png");
		try {
			FileUtils.copyFile(src, desc);
		} catch (IOException e) {
			e.printStackTrace();
		}
		i++;
	}

	public void nosnap(WebElement ele) {
		ele.click();
		System.out.println("The Element "+ele+" is not clicked Successfully");	
	}
	
	public void closeBrowser() {
		driver.close();
		System.out.println("the current browser is closed");
	}

	public void closeAllBrowsers() {
		driver.quit();
		System.out.println("all the  browsers are closed");
	}

	public void timeouts() {
		driver.manage().timeouts().implicitlyWait(2000, TimeUnit.SECONDS);
		System.out.println("all the  timeout are closed");
	}
}