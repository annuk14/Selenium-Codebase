package SeleniumScripts;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot {

static WebDriver driver;
	
	
	
	public static void main(String[] args) throws IOException {

		System.setProperty("webdriver.chrome.driver","D:\\CodeBase\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().minimize();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		/**
		 * @param args      Page screenshot
		 * @throws IOException
		 */
		
//		         File file=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		         FileHandler.copy(file,new File(".\\screenshots\\page.png"));
		         
		        
		
		/**
		 * @param args      Element screenshot
		 * @throws IOException
		 */
		
		         WebElement ele=driver.findElement(By.linkText("Continue"));
		         File srcFile=ele.getScreenshotAs(OutputType.FILE);
		         FileHandler.copy(srcFile, new File(".\\screenshots\\continuebtn.png"));
	}

	
	
	
}
