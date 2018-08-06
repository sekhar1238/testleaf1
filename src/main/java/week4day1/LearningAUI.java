package week4day1;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LearningAUI {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "./drivers/chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://jqueryui.com/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	//to verify the drag and drop action
	/*WebElement droppable = driver.findElementByLinkText("Droppable");
	droppable.click();
	WebElement frame1 = driver.findElementByClassName("demo-frame");
	driver.switchTo().frame(frame1);
	WebElement eleDrag = driver.findElementById("draggable");
	WebElement eleDrop = driver.findElementById("droppable");
	Actions builder = new Actions(driver);
	builder.dragAndDrop(eleDrag, eleDrop).perform();
	System.out.println("element is dragged and dropped successfully");*/
	//to verify the click and hold action
	WebElement eleSortable = driver.findElementByLinkText("Sortable");
	eleSortable.click();
	WebElement frame1 = driver.findElementByClassName("demo-frame");
	driver.switchTo().frame(frame1);
	WebElement eleItem1 = driver.findElementByXPath("//ul[@id='sortable']/li[1]");
	WebElement eleItem5 = driver.findElementByXPath("//ul[@id='sortable']/li[5]");
	Point ele5Loc = eleItem5.getLocation();
	int x = ele5Loc.getX();
	int y = ele5Loc.getY();
	Actions builder = new Actions(driver);
	builder.dragAndDropBy(eleItem1, x, y).perform();
	System.out.println("element moved to "+x+" and "+y+" successfully");
	}
}
