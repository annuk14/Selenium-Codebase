package SeleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClassiccrmWebtable {

	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\CodeBase\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get("https://classic.crmpro.com/login.cfm");
		driver.findElement(By.name("username")).sendKeys("apiautomation");
		driver.findElement(By.name("password")).sendKeys("Selenium@12345");
		driver.findElement(By.xpath("//input[@value='Login']")).click();
		driver.switchTo().frame("mainpanel");
		driver.findElement(By.xpath("//a[text()='Contacts']")).click();
		
//		driver.findElement(By.xpath("//a[text()='Robby Sing']/parent::td/preceding-sibling::td/child::input[@type='checkbox']")).click();
//		String compName=driver.findElement(By.xpath("(//a[text()='Robby Sing']/parent::td/following-sibling::td/a)[1]")).getText();
//		String usercompName=driver.findElement(By.xpath("//a[text()='Robby Sing']/parent::td/following-sibling::td/a[@context='company']")).getText();
//		System.out.println(compName);
//		System.out.println(usercompName);
		
		selectUser("Robby Sing");
		String userCompName=getUserCompName("Robby Sing");
		System.out.println(userCompName);
	}
	
	public static void selectUser(String userName) {
		driver.findElement(By.xpath("//a[text()='"+userName+"']/parent::td/preceding-sibling::td/child::input[@type='checkbox']")).click();	
	}
	
	public static String getUserCompName(String UserName) {
		return driver.findElement(By.xpath("//a[text()='"+UserName+"']/parent::td/following-sibling::td/a[@context='company']")).getText();

		
	}

	}
//