package Day26;

import java.time.Duration;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment3 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		//get methods
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);
		System.out.println(driver.getTitle());
		System.out.println(driver.getCurrentUrl());
//		System.out.println(driver.getPageSource());
		System.out.println(driver.getWindowHandle());
		
		driver.findElement(By.xpath("//button[normalize-space()='New Browser Window']")).click();
		Set<String> multi_win = driver.getWindowHandles();
		System.out.println(multi_win);
		
		//Conditional Methods
		
		WebElement logo = driver.findElement(By.xpath("//h1[normalize-space()='Automation Testing Practice']"));
		System.out.println("logo is present: "+logo.isDisplayed());
		
		WebElement product = driver.findElement(By.xpath("//tbody/tr[1]/td[4]/input[1]"));
		System.out.println("Product 1 selected : "+product.isSelected());
		
		WebElement Submit = driver.findElement(By.xpath("//input[@id='FSsubmit']"));
		System.out.println("submit button is enabled : "+Submit.isEnabled());
		
		//Browser methods
		
		driver.close();
		driver.quit();
		
	
		
		

	}

}
