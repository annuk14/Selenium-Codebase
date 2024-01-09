package SeleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsValUppercase {

static WebDriver driver;
	
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\CodeBase\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().minimize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
	    
		Actions act=new Actions(driver);
		act.keyDown(driver.findElement(By.name("search")),Keys.SHIFT).sendKeys("hi").build().perform();
	
	}

}
