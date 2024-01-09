package SeleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMouseHover {

		static WebDriver driver;
		
		
		public static void main(String[] args) throws InterruptedException {

			System.setProperty("webdriver.chrome.driver","D:\\CodeBase\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.manage().window().minimize();
			driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		   
			By desktops=By.linkText("Desktops");
			
//			Actions act=new Actions(driver);
//		    act.moveToElement(driver.findElement(By.linkText("Desktops"))).build().perform();
//		    driver.findElement(By.linkText("Mac (1)")).click();
		    
		    doMouseHover(desktops);
	}
		
		public static void doMouseHover(By locator) {
		    Actions act=new Actions(driver);
		    act.moveToElement(getElement(locator)).build().perform();
		    driver.findElement(By.linkText("Mac (1)")).click();

			
		}
		
		public static WebElement getElement(By locator) {
			
			return driver.findElement(locator);
		}

}
