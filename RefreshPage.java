package SeleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

/**
 * Different ways to refresh the page
 */

public class RefreshPage {

	static WebDriver driver;
	public static void main(String[] args) {
		
	driver=new ChromeDriver();
	driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");

		refreshPage1();
//		refreshPage2();
//		refreshPage3();
//		refreshPage4();
//		refreshPage5();
		
		
	}
	
	  //1st way:using refresh()
	  public static void refreshPage1() {
		
		driver.navigate().refresh();
	}
	
	   //2nd way:using Actions class 
	   public static void refreshPage2() {
		
		Actions act=new Actions(driver);
		act.keyDown(Keys.CONTROL).sendKeys("r").perform();
		
//		act.keyDown(Keys.CONTROL).sendKeys(Keys.F5).perform();
	}
	
		
        //3rd way:using JavascriptExecutor
		public static void refreshPage3() {
			
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("history.go(0)");
		
		}
		
		 //4th way:using sendKeys()
		 public static void refreshPage4() {

		driver.findElement(By.name("search")).sendKeys(Keys.F5);
		
//		driver.findElement(By.name("search")).sendKeys("\uE035");
		
		}
		
		 //5th way:using get() and navigate()
		 public static void refreshPage5() {
			
		driver.get(driver.getCurrentUrl());
//		driver.navigate().to(driver.getCurrentUrl());
		}

		
		
		
		
		
		
		
		
		
		
		


}

