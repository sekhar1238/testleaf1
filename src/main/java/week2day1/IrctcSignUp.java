package week2day1;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class IrctcSignUp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver","C:\\films\\TestLeaf\\Softwares-20180619T043143Z-001\\Softwares\\drivers\\chromedriver.exe");
ChromeDriver driver = new ChromeDriver();
driver.manage().window().maximize();
driver.get("https://www.irctc.co.in/eticketing/userSignUp.jsf");
driver.findElementById("userRegistrationForm:userName").sendKeys("abcd");
driver.findElementById("userRegistrationForm:password").sendKeys("123edfkf");
driver.findElementById("userRegistrationForm:confpasword").sendKeys("123edfkf");
WebElement dd1 = driver.findElementById("userRegistrationForm:securityQ");
Select ss1=new Select(dd1);
ss1.selectByIndex(3);
driver.findElementById("userRegistrationForm:securityAnswer").sendKeys("jaffa");
WebElement dd2 = driver.findElementById("userRegistrationForm:prelan");
Select ss2=new Select(dd2);
ss2.selectByIndex(1);
driver.findElementById("userRegistrationForm:firstName").sendKeys("qwerty");
driver.findElementById("userRegistrationForm:middleName").sendKeys("asdfg");
driver.findElementById("userRegistrationForm:lastName").sendKeys("zxcvb");
driver.findElementById("userRegistrationForm:gender:1").click();
driver.findElementById("userRegistrationForm:maritalStatus:1").click();
WebElement dd3 = driver.findElementById("userRegistrationForm:dobDay");
Select ss3=new Select(dd3);
ss3.selectByIndex(1);
WebElement dd4 = driver.findElementById("userRegistrationForm:dobMonth");
Select ss4=new Select(dd4);
ss4.selectByValue("03");
WebElement dd5 = driver.findElementById("userRegistrationForm:dateOfBirth");
Select ss5=new Select(dd5);
ss5.selectByVisibleText("2000");
WebElement dd6 = driver.findElementById("userRegistrationForm:occupation");
Select ss6=new Select(dd6);
ss6.selectByIndex(3);
WebElement dd7 = driver.findElementById("userRegistrationForm:countries");
Select ss7=new Select(dd7);
ss7.selectByIndex(1);
driver.findElementById("userRegistrationForm:email").sendKeys("1234@potato.com");
driver.findElementById("userRegistrationForm:isdCode").sendKeys("+91");
driver.findElementById("userRegistrationForm:mobile").sendKeys("1234567890");
WebElement dd8 = driver.findElementById("userRegistrationForm:nationalityId");
Select ss8=new Select(dd8);
ss8.selectByIndex(1);
driver.findElementById("userRegistrationForm:address").sendKeys("abc st d.no:123");
driver.findElementById("userRegistrationForm:pincode").sendKeys("517644");
driver.findElementById("userRegistrationForm:statesName").sendKeys("tamilnadu");


	}

}
