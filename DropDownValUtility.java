package SeleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownValUtility {

	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\CodeBase\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().minimize();
		driver.get("https://demoqa.com/select-menu");
		By color=By.id("oldSelectMenu");
		// ** selecting value using index **/
//		selectDropdownValue(color,"index","2");
		// ** selecting value using visibletext **/
		selectDropdownValue(color,"visibletext","Purple");
	}
	
	public static void selectDropdownValue(By locator,String type,String value) {
		
		Select select= new Select(driver.findElement(locator));
		switch(type) {
		
		case "index":
		{
			select.selectByIndex(Integer.parseInt(value));
			break;
		}
		case "value":
		{
			select.selectByValue(value);
			break;
		}
		case "visibletext":
		{
			select.selectByVisibleText(value);
			break;
		}
		default:
			System.out.println("please pass correct selection criteria");
			break;
			
			
		}
		
		}
	}


