package SeleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsRefreshPage {
	
static WebDriver driver;
	
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\CodeBase\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().minimize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.navigate().refresh();
//		doRefresh();
//		doRefreshPage();

}
	public static void doRefresh() {
		
		Actions act=new Actions(driver);
		act.keyDown(Keys.CONTROL).sendKeys("r").build().perform();
		System.out.println("refreshed......");
	}
	
public static void doRefreshPage() {
		
		Actions act=new Actions(driver);
		act.keyDown(Keys.CONTROL).sendKeys(Keys.F5).build().perform();
		System.out.println("refreshed......");
	}


}
