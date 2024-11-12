package SeleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ElementTextTest {

	static WebDriver driver;
	public static void main(String[] args) {

		driver=new ChromeDriver();
		driver.get("https://naveenautomationlabs.com/opencart/index.php?route=account/login");
		
		By header=By.tagName("h2");
		By para=By.xpath("(//div[@class='well']//p)[1]");
		By forgotpwdLink=By.linkText("Forgotten Password");
		By emailAddressLabel=By.className("control-label");
		By headerLink=By.xpath("(//h5)[2]");
		
		String headerText=doElementGetText(header);
		System.out.println(headerText);
		String paraText=doElementGetText(para);
		System.out.println(paraText);
		String forgotPwdLinkText=doElementGetText(forgotpwdLink);
		System.out.println(forgotPwdLinkText);
		String emailAddressLabelText=doElementGetText(emailAddressLabel);
		System.out.println(emailAddressLabelText);
		String headerLinkText=doElementGetText(headerLink);
		System.out.println(headerLinkText);
		
	}
	
	
	public static String doElementGetText(By locator) {
		String eleText=getElement(locator).getText();
		if(eleText!=null) {
			return eleText;
		}else {
			System.out.println("element text is null:"+eleText);
			return null;
		}
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
