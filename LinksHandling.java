package SeleniumScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinksHandling {
	
	static WebDriver driver;
	public static void main(String[] args) {
		
		//print links having href attributes 
		
		driver=new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		List<WebElement> list = driver.findElements(By.xpath("//a[@href]"));
		System.out.println(list.size());
		for(WebElement e:list) {
			if(e.getText().length()!=0) {
			System.out.println("link text:"+e.getText()+"href attr:"+e.getAttribute("href"));
		}
		
	}

}
}