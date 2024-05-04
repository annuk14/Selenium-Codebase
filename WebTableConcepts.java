package SeleniumScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableConcepts {

	static WebDriver driver;
	public static void main(String[] args) {
		driver=new ChromeDriver();
		driver.manage().window().minimize();
		driver.get("https://selectorshub.com/xpath-practice-page/");
//		getEvenCheckBoxCount();
//		checkEvenCheckBox();
//		getOddCheckBoxCount();
//		checkOddCheckBox();
//		checkAllCheckboxes();
		checkAll();
		
		
	}
	
	public static void getEvenCheckBoxCount() {
		
		List<WebElement>evenCheckBoxList=driver.findElements(By.xpath("(//table[@id='resultTable']/tbody/tr)[position() mod 2=0]"));
		System.out.println("even checkbox count is:"+evenCheckBoxList.size());
		
	}
	public static void checkEvenCheckBox() {
		
		List<WebElement>evenCheckBoxList=driver.findElements(By.xpath("(//table[@id='resultTable']/tbody/tr)[position() mod 2=0]/td/input[@type='checkbox']"));
		for(WebElement e:evenCheckBoxList) {
			e.click();
		}
	}
	
  public static void getOddCheckBoxCount() {
		
		List<WebElement>evenCheckBoxList=driver.findElements(By.xpath("(//table[@id='resultTable']/tbody/tr)[position() mod 2!=0]"));
		System.out.println("odd checkbox count is:"+evenCheckBoxList.size());
		
	}
	public static void checkOddCheckBox() {
		
		List<WebElement>evenCheckBoxList=driver.findElements(By.xpath("(//table[@id='resultTable']/tbody/tr)[position() mod 2!=0]/td/input[@type='checkbox']"));
		for(WebElement e:evenCheckBoxList) {
			e.click();
		}
	}
	
	public static void checkAllCheckboxes() {
		
		List<WebElement>checkBoxList=driver.findElements(By.xpath("//table[@id='resultTable']/tbody/tr/td/child::input[@type='checkbox']"));
		System.out.println("total checkbox counts:"+checkBoxList.size());
		for(WebElement e:checkBoxList) {
			e.click();
			
		}
	}
	
	public static void checkAll() {
		
		List<WebElement>rowList=driver.findElements(By.xpath("//table[@id='resultTable']//tr"));
		List<WebElement>colList=driver.findElements(By.xpath("//table[@id='resultTable']//th"));
		System.out.println("total row count:"+rowList.size());
		System.out.println("totsl col count:"+colList.size());
		for(int i=1;i<=rowList.size();i++) {
			driver.findElement(By.xpath("//table[@id='resultTable']/tbody/tr["+i+"]/td[1]/child::input[@type='checkbox']")).click();
		}

	}



}
