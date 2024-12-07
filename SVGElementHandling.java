package SeleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGElementHandling {

	static WebDriver driver;
	public static void main(String[] args) {

		driver=new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
//		driver.findElement(By.xpath("//*[name()='svg'and @class='e-font-icon-svg e-fab-twitter']//*[local-name()='path']")).click();
		
		By twitterSvgEle=By.xpath("//*[name()='svg'and @class='e-font-icon-svg e-fab-twitter']//*[local-name()='path']");
		
		clickOnSvgElement(twitterSvgEle);
	}
	
	
	public static void clickOnSvgElement(By locator) {
		
		getElement(locator).click();
	}
	
	public static WebElement getElement(By locator) {
		
		return driver.findElement(locator);
	}

}
