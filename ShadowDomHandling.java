package SeleniumScripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomHandling {

	static WebDriver driver;
	public static void main(String[] args) {

		driver=new ChromeDriver();
		driver.get("chrome://downloads/");
		
		JavascriptExecutor jse=(JavascriptExecutor)driver;
		WebElement searchElement=(WebElement)jse.executeScript("return document.querySelector('downloads-manager').shadowRoot.querySelector('downloads-toolbar#toolbar').shadowRoot.querySelector('cr-toolbar#toolbar').shadowRoot.querySelector('#search').shadowRoot.querySelector('#searchTerm >input#searchInput')");
	
		String script="arguments[0].setAttribute('value','jenkins')";
		
		jse.executeScript(script, searchElement);
	
	}

}
