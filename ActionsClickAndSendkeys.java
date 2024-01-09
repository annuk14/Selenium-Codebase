package SeleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsClickAndSendkeys {
	
	static WebDriver driver;
	
	
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\CodeBase\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().minimize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		String title=driver.getTitle();
		System.out.println(title);
		
		
		By email=By.id("input-email");
		By password=By.id("input-password");
		By loginBtn=By.xpath("//input[@value='Login']");
		
//		Actions act=new Actions(driver);
//		act.sendKeys(driver.findElement(email),"tim@gmail.com").perform();
//		act.sendKeys(driver.findElement(password),"Prac@future").perform();
//      act.click(driver.findElement(loginBtn)).perform();
        
        doSendKeys(email,"tim@gmail.com");
        doSendKeys(password,"Prac@future");
        doActionsClick(loginBtn);
        

}
	
	public static void doSendKeys(By locator,String value) {
		Actions act=new Actions(driver);
		act.sendKeys(getElement(locator),value).build().perform();;
		
		
	}
	
	public static WebElement getElement(By locator) {
		
		return driver.findElement(locator);
	}
	
	
	public static void doActionsClick(By locator) {
		
		Actions act=new Actions(driver);
		act.click(getElement(locator)).perform();
	
}
}