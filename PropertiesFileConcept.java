package SeleniumScripts;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PropertiesFileConcept {

	static WebDriver driver;
	public static void main(String[] args) throws IOException {
		
	   Properties prop=new Properties();
       FileInputStream ip=new FileInputStream("D:\\CodeBase\\src\\SeleniumScripts\\configuration.properties");
       prop.load(ip);
       String browserName=prop.getProperty("browser");
       System.out.println(browserName);
       if(browserName.equals("chrome")) {
    	   driver=new ChromeDriver();
       }else if(browserName.equals("Firefox")) {
    	   driver=new FirefoxDriver();
       }else {
    	   System.out.println("please pass correct browser name:"+browserName);
       }
       
       //reading test data and page objects(locator value) from properties file
       driver.get(prop.getProperty("url"));
       driver.manage().window().maximize();
       driver.manage().deleteAllCookies();
       driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
       driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
       driver.findElement(By.name(prop.getProperty("UserName_name"))).sendKeys(prop.getProperty("UserName"));
       driver.findElement(By.name(prop.getProperty("Password_name"))).sendKeys(prop.getProperty("Password"));
       driver.findElement(By.name(prop.getProperty("Company_name"))).sendKeys(prop.getProperty("Company"));
       driver.findElement(By.name(prop.getProperty("MobileNumber_name"))).sendKeys(prop.getProperty("MobileNumber"));
       driver.findElement(By.xpath(prop.getProperty("Submit_btn_xpath"))).click();
       driver.quit();
          
     
       
       
       
       
       
       
       
       
		
	}

}
