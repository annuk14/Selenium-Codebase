package SeleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableCheckBox {

		static WebDriver driver;
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","D:\\CodeBase\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
//			driver.manage().window().minimize();
			driver.manage().window().maximize();
			driver.get("https://selectorshub.com/xpath-practice-page/");
			driver.findElement(By.xpath("//img[@title='Close']")).click();
//			driver.findElement(By.xpath("//a[text()='Joe.Root']/parent::td/preceding-sibling::td")).click();
			
			selectUser("Joe.Root");
	}
		
		public static void selectUser(String userName) {
			
			driver.findElement(By.xpath("//a[text()='"+userName+"']/parent::td/preceding-sibling::td")).click();

		}

}
