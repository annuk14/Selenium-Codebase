package SeleniumScripts;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;


public class FindElementsConcept {

	
	/**
	 * Download a file and verify if it is downloaded completely
	 */
	
	static WebDriver driver;
	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","D:\\CodeBase\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
//		driver.manage().window().minimize();
		driver.get("https://archives.jenkins.io/windows-stable/2.346.3/jenkins.msi");
		File f=new File("\\Users\\Dell\\Downloads/jenkins.msi");
        FluentWait<File>wait=new FluentWait<File>(f)
                                 .withTimeout(Duration.ofMinutes(5))
                                 .pollingEvery(Duration.ofSeconds(2))
                                 .ignoring(Exception.class).withMessage("file is not downloaded");
        boolean isDownloaded=wait.until(e->e.exists() && e.canRead());
        if(isDownloaded) {
        System.out.println("file is loaded 100% completely");
        }else {
        	System.out.println("file is not completely downloaded");
        }
        
        
	}

}
