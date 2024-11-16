
package Day26;
 import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethods {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		driver.manage().window().maximize();
		
		//Return title of web page
		System.out.println(driver.getTitle());
		
		//return current url
		System.out.println(driver.getCurrentUrl());
		
		//return page source
//		System.out.println(driver.getPageSource());
		
		//return ID of single browser window
//		String window_ID = driver.getWindowHandle();
//		System.out.println("Window ID: "+window_ID);
		
		//return ID of multiple browser window
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> Windows = driver.getWindowHandles();
		System.out.println(Windows);
		
		//return ID's of Muliple browser windows
		
		

	}

}
