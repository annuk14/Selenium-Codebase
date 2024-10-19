package SeleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Actions4LevelMenuHandling {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {

		driver=new ChromeDriver();
		driver.get("https://www.bigbasket.com/");
//		driver.findElement(By.xpath("(//button[contains(@id,'headlessui-menu-button')]//span[text()='Shop by'])[2]")).click();
//		Actions act=new Actions(driver);
//		act.moveToElement(driver.findElement(By.linkText("Beauty & Hygiene"))).perform();
//		Thread.sleep(2000);
//		act.moveToElement(driver.findElement(By.linkText("Makeup"))).perform();
//		Thread.sleep(2000);
//		driver.findElement(By.linkText("Face")).click();
		
		By level1=By.xpath("(//button[contains(@id,'headlessui-menu-button')]//span[text()='Shop by'])[2]");
		By level2=By.linkText("Beauty & Hygiene");
		By level3=By.linkText("Makeup");
		By level4=By.linkText("Face");
//		actions4levelMenuSubmenuHandle(level1,level2,level3,level4);
		action4LevelMenuSubmenuHnadling(level1,"Beauty & Hygiene","Makeup","Face");
	}
	

	public static void actions4levelMenuSubmenuHandle(By level1,By level2,By level3,By level4) throws InterruptedException {
		
		getElement(level1).click();
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.moveToElement(getElement(level2)).perform();
		Thread.sleep(2000);
		act.moveToElement(getElement(level3)).perform();
		Thread.sleep(2000);
		getElement(level4).click();
		
}
	
	public static void action4LevelMenuSubmenuHnadling(By level1,String l2,String l3,String l4) throws InterruptedException {
		
		getElement(level1).click();
		Thread.sleep(2000);
		Actions act=new Actions(driver);
		act.moveToElement(getElement(By.linkText(l2))).perform();
		Thread.sleep(2000);
		act.moveToElement(getElement(By.linkText(l3))).perform();
		Thread.sleep(2000);
		getElement(By.linkText(l4)).click();
		
		}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}

