package SeleniumScripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomHandle {

	static WebDriver driver;
	public static void main(String[] args) {

		driver=new ChromeDriver();
		driver.get("https://selectorshub.com/shadow-dom-in-iframe/");
		driver.switchTo().frame("pact");
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement snacksElement=(WebElement)js.executeScript("return document.querySelector('#snacktime').shadowRoot.querySelector('#tea')");
		snacksElement.sendKeys("green tea");
		
	}

}
