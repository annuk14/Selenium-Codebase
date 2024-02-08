package SeleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsScroll {

	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\CodeBase\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().minimize();
		driver.get("https://naveenautomationlabs.com/opencart/");
		
		By privacypolicy=By.linkText("Privacy Policy");
		
		Actions act=new Actions(driver);
//		act.scrollToElement(driver.findElement(By.linkText("Privacy Policy")))
//		.click(driver.findElement(By.linkText("Privacy Policy"))).build().perform();
		
//		scrollToEle(privacypolicy);
		
		actionsscroll();
	}
	
	//Sel 4.x
	public static void scrollToEle(By locator) {
		
		Actions act=new Actions(driver);
		act.scrollToElement(getElement(locator)).click(getElement(locator)).build().perform();
	}
	
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
	
	
	public static void actionsscroll() {
		
		Actions act =new Actions(driver);
		act.sendKeys(Keys.PAGE_DOWN).perform();
		act.pause(2000);
		act.sendKeys(Keys.PAGE_UP).perform();;
		
	}

}
