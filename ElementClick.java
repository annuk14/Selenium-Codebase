package SeleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * Different ways to click an Element
 */
public class ElementClick {

	static WebDriver driver;
	public static void main(String[] args) {

		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//		clickOnElement();
//		clickOnElement2();
//		clickOnElement3();
		clickOnElement4();
		
	}
	
	//1st way:using click()
	public static void clickOnElement() {
		
		driver.findElement(By.xpath("//a[text()='Continue']")).click();
		
	}
	
	//2nd way:using Actions class methods
	public static void clickOnElement2() {
		
		Actions act=new Actions(driver);
//		act.click(driver.findElement(By.xpath("//a[text()='Continue']"))).perform();
		
//		act.moveToElement(driver.findElement(By.xpath("//a[text()='Continue']"))).click().build().perform();
		
//		act.sendKeys(driver.findElement(By.xpath("//a[text()='Continue']")),Keys.TAB).perform();
		
		act.scrollToElement(driver.findElement(By.xpath("//a[text()='Continue']"))).click(driver.findElement(By.xpath("//a[text()='Continue']"))).build().perform();
	}
	
	//3rd way:using JavascriptExecutor
	public static void clickOnElement3() {
		
		
		JavascriptExecutor js=(JavascriptExecutor)driver;	
		js.executeScript("arguments[0].click();", driver.findElement(By.xpath("//a[text()='Continue']")));
		
	}
	
	//4th way:using sendKeys()
	public static void clickOnElement4() {

//		driver.findElement(By.xpath("//a[text()='Continue']")).sendKeys(Keys.ENTER);
		driver.findElement(By.xpath("//a[text()='Continue']")).sendKeys(Keys.RETURN);
		
		
	}

	

}
