package SeleniumScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicProgram {

	static WebDriver driver;
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\CodeBase\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().minimize();
		driver.get("https://www.google.com/");
		String title=driver.getTitle();
		System.out.println(title);

		List<WebElement>linksList=driver.findElements(By.xpath("//a"));
		System.out.println(linksList.size());
	}

}
