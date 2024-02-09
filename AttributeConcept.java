package SeleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AttributeConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\CodeBase\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().minimize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		String valueAttr=driver.findElement(By.xpath("//input[@type='submit']")).getAttribute("value");
		System.out.println(valueAttr);
	    String hrefVal=driver.findElement(By.xpath("(//a[text()='Register'])[1]")).getAttribute("href");
	    System.out.println(hrefVal);
	    
	    By emailId=By.id("input-email");
	    
	    System.out.println(doGetElementAttrVal(emailId,"placeholder"));
	    
	}
	
	public static String doGetElementAttrVal(By locator,String attrName) {
		return getElement(locator).getAttribute(attrName);
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
