package SeleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsTabKeys {

	static WebDriver driver;
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\CodeBase\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().minimize();
		driver.get("https://www.amazon.com/ap/register?showRememberMe=true&openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.com%2Fs%2Fref%3Dnav_signin%3Furl%3Dsearch-alias%253Daps%26field-keywords%3Dhghg%26crid%3D23UQBBG6ZRLH5%26sprefix%3Dhghg%252Caps%252C898&prevRID=CPKAHV7QEZ3J16KRX2AK&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=usflex&openid.mode=checkid_setup&prepopulatedLoginId=&failedSignInCount=0&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2."
				+ "0%2Fidentifier_select&pageId=usflex&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0");
		
		Actions act=new Actions(driver);
		act.sendKeys(driver.findElement(By.id("ap_customer_name")),"tom")
		.sendKeys(Keys.TAB)
		.pause(2000)
		.sendKeys("tom@gmail.com")
		.sendKeys(Keys.TAB)
		.pause(2000)
		.sendKeys("shop@19")
		.sendKeys(Keys.TAB)
		.pause(2000)
		.sendKeys("shop@19")
		.sendKeys(Keys.TAB)
		.pause(2000)
		.click(driver.findElement(By.xpath("//span[text()='Verify email']")))
		.build().perform();
	}

}
