package SeleniumScripts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsMethodsChaining {

	static WebDriver driver;
	public static void main(String[] args) {

		driver=new ChromeDriver();
//		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/register");
//		Actions act=new Actions(driver);
//		act.sendKeys(driver.findElement(By.name("firstname")),"peter")
//		.sendKeys(Keys.TAB)
//		.pause(2000)
//		.sendKeys("cruise")
//		.sendKeys(Keys.TAB)
//		.pause(2000)
//		.sendKeys("peter@gmail.com")
//		.sendKeys(Keys.TAB)
//		.pause(2000)
//		.sendKeys("902992887")
//		.sendKeys(Keys.TAB)
//		.pause(2000)
//		.sendKeys("pc@12")
//		.sendKeys(Keys.TAB)
//		.pause(2000)
//		.sendKeys("pc@12")
//		.sendKeys(Keys.TAB)
//		.pause(2000)
//		.sendKeys(Keys.TAB)
//		.sendKeys(Keys.TAB)
//		.sendKeys(Keys.SPACE)
//		.sendKeys(Keys.TAB)
//		.sendKeys(Keys.ENTER)
//		.build().perform();
		
		
		driver.get("https://www.amazon.in/");
		Actions act=new Actions(driver);
        act.sendKeys(Keys.TAB)
		.sendKeys(Keys.TAB)
		.sendKeys(Keys.TAB)
		.sendKeys(Keys.TAB)
		.sendKeys(Keys.TAB)
		.sendKeys("iphone")
		.build().perform();
		
	}

}
