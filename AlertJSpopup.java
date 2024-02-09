package SeleniumScripts;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertJSpopup {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","D:\\CodeBase\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.manage().window().minimize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		
		//JSAlert popup
		driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
		Alert alt=driver.switchTo().alert();
		String text=alt.getText();
		System.out.println(text);
		Thread.sleep(2000);
		alt.accept(); //accept the alert
		
		
		//JSConfirmation popup
		driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
		Alert alt1=driver.switchTo().alert();
		String text1=alt1.getText();
		System.out.println(text1);
		Thread.sleep(2000);
		alt1.accept(); //accept the alert
		alt1.dismiss(); //dismiss the alert
		
	    //JSPrompt popup
		driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
		Alert alt2=driver.switchTo().alert();
		String text2=alt2.getText();
		System.out.println(text2);
		alt2.sendKeys("ok");
		Thread.sleep(2000);
		alt2.accept(); //accept the alert
	}

}
