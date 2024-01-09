package SeleniumScripts;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsScrolling {

static WebDriver driver;
	
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\CodeBase\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().minimize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		scrollupDown();
	}
	
	public static void scrollupDown() throws InterruptedException {
		Actions act=new Actions(driver);
		act.keyDown(Keys.CONTROL).sendKeys(Keys.END).keyUp(Keys.CONTROL).build().perform();
		Thread.sleep(5000);
		act.keyDown(Keys.CONTROL).sendKeys(Keys.HOME).keyUp(Keys.CONTROL).build().perform();
	}

}
