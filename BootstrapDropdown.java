package SeleniumScripts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootstrapDropdown {

	static WebDriver driver;
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\CodeBase\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		selectDropDownVal();

	}
	
	public static void selectDropDownVal() {
		List<WebElement>dropDownList=driver.findElements(By.xpath("//select/option"));
		System.out.println(dropDownList.size());
		for(WebElement e:dropDownList) {
			System.out.println(e.getText());
			if(e.getText().contains("Andorra")) {
				e.click();
				break;
			}
		}
		
	}

}
