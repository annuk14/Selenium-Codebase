package SeleniumScripts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ImageHandling {

		static WebDriver driver;
		public static void main(String[] args) {
			
			//print images having src and alt attributes 
			
			driver=new ChromeDriver();
			driver.get("https://selectorshub.com/xpath-practice-page/");
			List<WebElement> imglist = driver.findElements(By.xpath("//img[@src and @alt]"));
			System.out.println(imglist.size());
			for(WebElement e:imglist) {
				System.out.println("image text:"+e.getText()+"src attr:"+e.getAttribute("src")+"alt attr:"+e.getAttribute("alt"));
			}
			
		}



	}


