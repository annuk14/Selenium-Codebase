package SeleniumScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxHandling {

	static WebDriver driver;

	public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","D:\\CodeBase\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
//			driver.manage().window().minimize();
			driver.manage().window().maximize();
			driver.get("https://total-qa.com/checkbox-example/#google_vignette");
			
//			selectAllCheckbox();
//			selectEvenNumCheckbox();
//			selectOddNumCheckbox();
//			selectLastCheckbox();
//			selectLastCheckboxes();
			selectSecLastCheckbox();
			
	}

/**
 * Check/Select all checkbox
 */

	
	public static void selectAllCheckbox() {
		
		List<WebElement>checkboxList=driver.findElements(By.xpath("//p//input"));
		System.out.println(checkboxList.size());
		for(int i=0;i<checkboxList.size();i++) {
			checkboxList.get(i).click();
			
		}
		}
		

	/**
	 * Check/Select even number checkbox
	 */
	public static void selectEvenNumCheckbox() {
		
		List<WebElement>checkboxList=driver.findElements(By.xpath("//p//input"));
		System.out.println(checkboxList.size());
		for(int i=0;i<checkboxList.size();i++) {
			if(i%2!=0) {
			checkboxList.get(i).click();
			
		}
		}
	}
	
	/**
	 * Check/Select odd number checkbox
	 */
		public static void selectOddNumCheckbox() {
			
			List<WebElement>checkboxList=driver.findElements(By.xpath("//p//input"));
			System.out.println(checkboxList.size());
			for(int i=0;i<checkboxList.size();i++) {
				if(i%2!=0) {
				checkboxList.get(i).click();
				
			}
			}

	}
		
		/**
		 * Check/Select last checkbox
		 */
		//using xpath last()function
		
		public static void selectLastCheckbox() {
			
			driver.findElement(By.xpath("(//p//input)[last()]")).click();
			}
		
			
		/**
		 * Check/Select last checkbox
		 */

       public static void selectLastCheckboxes() {
    	   
    	   List<WebElement>checkboxList=driver.findElements(By.xpath("//p//input"));
			System.out.println(checkboxList.size());
			for(int i=checkboxList.size()-1;i<checkboxList.size();i++) {
				checkboxList.get(i).click();
				break;
			}
    	   
    	   
			/**
			 * Check/Select secondlast checkbox
			 */
			//using xpath last() function
       }
		public static void selectSecLastCheckbox() {
			
			driver.findElement(By.xpath("(//p//input)[last()-1]")).click();
		}

		/**
		 * Check/Select secondlast checkbox
		 */
    	   
		  public static void selectSecLastCheckboxes() {
	    	   
	    	   List<WebElement>checkboxList=driver.findElements(By.xpath("//p//input"));
				System.out.println(checkboxList.size());
				for(int i=checkboxList.size()-2;i<checkboxList.size();i++) {
					checkboxList.get(i).click();
					break;
				}
	    	   
	    	   
	       }
   
    	   
    	   
    	   
    	   
    	   
       }





