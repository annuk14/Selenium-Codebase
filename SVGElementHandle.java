package SeleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SVGElementHandle {

	static WebDriver driver;

	public static void main(String[] args) {


		driver=new ChromeDriver();
		driver.get("file:///C:/Users/Dell/Desktop/svg.html");
		String svgEleColor=driver.findElement(By.xpath("//*[name()='svg']//*[local-name()='rect']")).getAttribute("fill");
	    System.out.println(svgEleColor);
	
	
	}

}
