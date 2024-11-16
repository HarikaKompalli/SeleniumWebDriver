package Day28;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClosingSpecificBrowserWindow {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']")).click();
		
		Set<String> windIds = driver.getWindowHandles();
		
//		List<String> WindowIds = new ArrayList(windIds);
//		String ParentId = WindowIds.get(0);
//		String ChildId = WindowIds.get(1);
		
		for(String WinId:windIds) {
			String title = driver.switchTo().window(WinId).getTitle();
			System.out.println(title);
			if(title.equals("OrangeHRM")|| title.equals("Some title")) {
				driver.close();
			}
		}
		
		
		

	}

}
