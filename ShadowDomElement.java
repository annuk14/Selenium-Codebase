package SeleniumScripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomElement {

	static WebDriver driver;
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\CodeBase\\drivers\\chromedriver.exe");
		driver=new ChromeDriver();
//		driver.manage().window().minimize();
		driver.get("chrome://downloads/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement search=(WebElement)js.executeScript("return document.querySelector('downloads-manager').shadowRoot.querySelector('downloads-toolbar#toolbar').shadowRoot.querySelector('cr-toolbar#toolbar').shadowRoot.querySelector('cr-toolbar-search-field#search').shadowRoot.querySelector('div#searchTerm >input#searchInput')\r\n");	
		String script="arguments[0].setAttribute('value','chrome')";
		js.executeScript(script, search);
		
	
	}
	


}
