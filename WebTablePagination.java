package SeleniumScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTablePagination {
	
	static WebDriver driver;

	public static void main(String args[]) throws InterruptedException {
		
	
	System.setProperty("webdriver.chrome.driver","D:\\CodeBase\\drivers\\chromedriver.exe");
	driver=new ChromeDriver();
//	driver.manage().window().minimize();
	driver.get("https://selectorshub.com/xpath-practice-page/");
	driver.findElement(By.xpath("//img[@title='Close']")).click();
	
//	singleCheckboxSelection("United States");
	multiCheckboxSelection("India");
	

}
	//single selection
	public static void singleCheckboxSelection(String country) throws InterruptedException {
		
		while(true) {
			if(driver.findElements(By.xpath("//td[text()='United States']")).size()>0) {
//			driver.findElement(By.xpath("//td[text()='United States']/preceding-sibling::td/child::input[@type='checkbox']")).click();
				selectCheckBox(country);
			break;
			
			}else {
				
				WebElement next=driver.findElement(By.xpath("//a[text()='Next']"));
				if(next.getAttribute("class").contains("disabled")) {
					
					System.out.println("Pagination is over..country is not found...");
					break;
				}
				next.click();
				Thread.sleep(2000);
			}
		}
	}
	
	public static void selectCheckBox(String country) {
		
		driver.findElement(By.xpath("//td[text()='"+country+"']/preceding-sibling::td/child::input[@type='checkbox']")).click();

	}
	
	public static void multiCheckboxSelection(String country) throws InterruptedException {
		
		while(true) {
			if(driver.findElements(By.xpath("//td[text()='India']")).size()>0) {
//				List<WebElement>checkBoxList=driver.findElements(By.xpath("//td[text()='"+country+"']/preceding-sibling::td/child::input[@type='checkbox']"));
//				for(WebElement e:checkBoxList) {
//					e.click();
//				}
				selectmultiCheckBox(country);
			}
				WebElement next=driver.findElement(By.linkText("Next"));
				if(next.getAttribute("class").contains("disabled")) {
					System.out.println("Pagination is over..country is not found...");
                     break;
				}
				next.click();
				Thread.sleep(2000);
			}
		}
		
		public static void selectmultiCheckBox(String country) {

			List<WebElement>checkBoxList=driver.findElements(By.xpath("//td[text()='"+country+"']/preceding-sibling::td/child::input[@type='checkbox']"));
			for(WebElement e:checkBoxList) {
				e.click();
			}
	}

	
	
	
	
	
	
	
	
	
	
	
}
