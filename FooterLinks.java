package SeleniumScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/**
 * Print footer links 
 */


public class FooterLinks {

	static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		List<WebElement>footerLinks=driver.findElements(By.xpath("//h5[text()='Information']/parent::div/ul/li"));
        System.out.println("size of footerlinks are:"+footerLinks.size());
        for(WebElement e:footerLinks) {
        	System.out.println(e.getText());
        }
		
	}

}
