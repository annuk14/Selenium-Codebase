package SeleniumScripts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.openqa.selenium.support.locators.RelativeLocator.*;

public class RelativeLocatorsConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		
		//Sel 4.x-RelativeLocators 
		//toLeftOf() toRightOf() below() above() near()
		
		driver=new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		
		WebElement label = driver.findElement(By.xpath("//label[text()='Choose a car:']"));
		driver.findElement(with(By.xpath("//button[text()='Checkout here']")).toLeftOf(label)).click();
		
//		WebElement link = driver.findElement(By.xpath("(//a[text()='Practice Page'])[2]"));
//		driver.findElement(with(By.xpath("//a[text()='Trainings']")).toRightOf(link)).click();

		
//		WebElement header = driver.findElement(By.xpath("//h3[text()='Food Time']"));
//		driver.findElement(with(By.xpath("//a[text()='Click to practice shadow dom inside iframe scenario']")).below(header)).click();
		
//		WebElement label = driver.findElement(By.xpath("//label[text()='Password']"));
//		driver.findElement(with(By.xpath("//input[@title='Email']")).above(label)).sendKeys("tom@gmail.com");
		
//		WebElement ele = driver.findElement(By.xpath("//a[text()='Products']"));
//		driver.findElement(with(By.xpath("//a[text()='Pro Plans']")).near(ele)).click();
		
			}
}
