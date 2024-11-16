

package Day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class XpathDemo {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo-opencart.com/");
		driver.manage().window().maximize();
		
		//Xpath with single attribute
//		driver.findElement(By.xpath("//input[@name='search']")).sendKeys("t-shirt");
		
		//Xpath with multiple attributes
//		 driver.findElement(By.xpath("//input[@name='search'][@placeholder='Search']")).sendKeys("T-shirts");
		 
		 //Xpath with 'and' 'or' operators
		
		//Xpath with 'and' operator
//		 driver.findElement(By.xpath("//input[@name='search'and @placeholder='Search']")).sendKeys("T-shirts");
		 

		//Xpath with 'or' operator
//		 driver.findElement(By.xpath("//input[@name='search'or @placeholder='find']")).sendKeys("T-shirts");
		
		//Xpath with innner text
//		driver.findElement(By.xpath("//a[text()='MacBook']")).click();
		
//		boolean featured = driver.findElement(By.xpath("//h3[text()='Featured']")).isDisplayed();
//		System.out.println("Featured is displayed: "+featured);
		 
		
		String displaytext = driver.findElement(By.xpath("//h3[text()='Featured']")).getText();
		System.out.println(displaytext);
		
		//Xpath with Contains
//		driver.findElement(By.xpath("//input[contains(@placeholder,'Sear')]")).sendKeys("Shirt");
		
		//Xpath with start-with
//		driver.findElement(By.xpath("//input[starts-with(@placeholder,'Sear')]")).sendKeys("Shirt");
		
		//chained Xpath
		boolean imageStatus=driver.findElement(By.xpath("//div[@id='logo']/a/img")).isDisplayed();
		System.out.println(imageStatus);
		
		 

	}

}
