package SeleniumScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TotalLinks {

	static WebDriver driver;
	
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\CodeBase\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().minimize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
//	    int linkssize=driver.findElements(By.tagName("a")).size();
//	    System.out.println(linkssize);
//	    List<WebElement>totallinks =driver.findElements(By.xpath("//a"));
//	    System.out.println(totallinks.size());
	    
	    System.out.println(totalLinks().size());
	}
	
	public static List<WebElement> totalLinks() {
		
		List<WebElement>linksList=driver.findElements(By.xpath("//a"));
		return linksList;
	}

}
