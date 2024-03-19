package SeleniumScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableInterviewq1 {

	
	static WebDriver driver;
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","D:\\CodeBase\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().minimize();
		driver.get("file:///C:/Users/Dell/Documents/WebTable.html");
//		countCountry("Mexico");
		countCountry("Austria");

		}
	
	/**
	 * Print count of country in a webtable
	 */
	
	public static void countCountry(String countryName) {
		
		List<WebElement>rList=driver.findElements(By.xpath("//table/tbody/tr"));
		System.out.println(rList.size());
		int c=0;
		for(int i=2;i<=rList.size();i++) {
			String country=driver.findElement(By.xpath("//table/tbody/tr["+i+"]/td[3]")).getText();
			if(country.equals(countryName)) {
				c++;
			}
		}
		System.out.println("count of "+countryName+" is:"+c);

		
	}

}
