package Day22;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
public class LocatorsDemo {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\USER\\Downloads\\chromedriver-win64 (1)\\chromedriver-win64\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//to open chrome
		driver.get("https://demo.opencart.com/");
		//to maximize screen
		driver.manage().window().maximize();
		
		//to find element by name
//		driver.findElement(By.name("search")).sendKeys("Mac");
		
		///to find element by id
//		driver.findElement(By.id("logo")).isDisplayed();
		
		//linktext&partial link
//		driver.findElement(By.linkText("Tablets")).click(); //link text we give complete text 
//		driver.findElement(By.partialLinkText("Tabl")).click();//partial link text we give partial text i,e. text which is part of the actual text
		
		//tag and class locator is used to identify group of elements
		
		//class name
//		List<WebElement> headerLinks = driver.findElements(By.className("list-inline-item"));
//		System.out.println("total no of header links: "+headerLinks.size());
		
		//tag name
		
//		List<WebElement> links = driver.findElements(By.tagName("a"));
//		System.out.println("total no of  links: "+links.size());
		
//		List<WebElement> images = driver.findElements(By.tagName("img"));
//		System.out.println("total no of  images: "+images.size());
		
		
	}

}
