package SeleniumScripts;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConfigReader {

static WebDriver driver;
public static Properties prop;
static FileInputStream ip;
	
	
	
	public static void main(String[] args) throws IOException {

		Properties prop=new Properties();
		FileInputStream ip=new FileInputStream("src\\SeleniumScripts\\config.properties");
		prop.load(ip);
		String browserName=prop.getProperty("browser");
		System.out.println(browserName);
		if(browserName.equalsIgnoreCase("chrome"))
		System.setProperty("webdriver.chrome.driver","D:\\CodeBase\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().minimize();
		driver.get(prop.getProperty("url"));
		String title=driver.getTitle();
		System.out.println(title);

		
	}
	
}

