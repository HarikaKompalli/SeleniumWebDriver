package Day37;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;

public class ScrollingPage {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		JavascriptExecutor js=(JavascriptExecutor)driver;
		//1) scroll down page by pixel number
		js.executeScript("window.scrollBy(0,1000)", "");
		System.out.println(js.executeScript("return window.pageYOffset;"));//1000
		
		//2) scroll the page till element is visible
		
		WebElement ele=driver.findElement(By.xpath("//strong[normalize-space()='Community poll']"));
		
		js.executeScript("arguments[0].scrollIntoView();", ele);
		System.out.println(js.executeScript("return window.pageYOffset;"));//1880.6666259765625
		
		//3)scroll to end of the page
		
		js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
		//if we have horizantal scroll bar we give body.scrollWidth
		System.out.println(js.executeScript("return window.pageYOffset;"));//2064.666748046875
		//scroll to top of the page
		
		js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
		System.out.println(js.executeScript("return window.pageYOffset;"));//0
		

	}

}
