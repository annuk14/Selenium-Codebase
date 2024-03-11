package SeleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SvgElement {

	static WebDriver driver;
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\CodeBase\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
//		driver.manage().window().minimize();
		driver.get("https://selectorshub.com/iframe-in-shadow-dom/");
		driver.findElement(By.xpath("(//*[name()='svg']//*[local-name()='path'])[3]")).click();
	}

}
