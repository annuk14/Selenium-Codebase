package SeleniumScripts;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShadowDomElementHandle {

		static WebDriver driver;
		public static void main(String[] args) {
			System.setProperty("webdriver.chrome.driver","D:\\CodeBase\\drivers\\chromedriver.exe");
			driver=new ChromeDriver();
//			driver.manage().window().minimize();
			driver.get("https://shop.polymer-project.org/");
			JavascriptExecutor js=(JavascriptExecutor)driver;
			WebElement shopButton=(WebElement)js.executeScript("return document.querySelector('body >shop-app').shadowRoot.querySelector('iron-pages >shop-home').shadowRoot.querySelector('div > shop-button > a')\r\n");
			String script="arguments[0].click();";
			js.executeScript(script, shopButton);
	}

}
