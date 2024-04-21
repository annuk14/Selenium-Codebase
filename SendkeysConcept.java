package SeleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class SendkeysConcept {

	static WebDriver driver;
	public static void main(String[] args) {

//		System.setProperty("webdriver.chrome.driver","D:\\CodeBase\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
//		driver.get("https://classic.crmpro.com/");
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		driver.manage().window().maximize();
		
		//1.enter the value
		driver.findElement(By.name("search")).sendKeys("iphone");		
		
		StringBuilder sb=new StringBuilder("testing");
		String s="automation";
		
		//2.
      //@output:it will enter iphoneautomationtesting in searchfield
		driver.findElement(By.name("search")).sendKeys("iphone",s,sb);		

		//3.
		//@output:it will throw IllegalArgumentException: Keys to send should be a not null CharSequence
		driver.findElement(By.name("search")).sendKeys(null);
		
		By searchField=By.name("search");
		
		//4.
		//@output:it will enter the value in searchfield with pause.
		Actions act=new Actions(driver);
		String st="testing";
		for(char c:st.toCharArray()) {
        act.sendKeys(driver.findElement(searchField),String.valueOf(c)).pause(500).build().perform();
		
	}
}
}
