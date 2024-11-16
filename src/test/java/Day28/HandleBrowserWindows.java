package Day28;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindows {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Set<String> windoIds = driver.getWindowHandles();
		
		//Approch1
		List<String> windoList =  new ArrayList(windoIds);
		String parentId = windoList.get(0);
		String childId = windoList.get(1);
		
		//switch to child window
		driver.switchTo().window(childId);
		System.out.println(driver.getTitle());
		//switch to parent window
		driver.switchTo().window(parentId);
		System.out.println(driver.getTitle());
		
		
		//Approch2
//		for(String winID:windoIds) {
//			String title = driver.switchTo().window(winID).getTitle();
//			if(title.equals("OrangeHRM")) {
//				System.out.println(driver.getCurrentUrl());
//			}
//		}
		
//		//Approch3
//		
//		Iterator it = windoIds.iterator();
//		while(it.hasNext()) {
//			if(it.next().equals("OrangeHRM")) {
//				System.out.println(driver.getCurrentUrl());
//			}
//			
//		}
//		

	}

}
