package Day28;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment4 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@id='Wikipedia1_wikipedia-search-input']")).sendKeys("Selenium");
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		WebElement SearchResult = driver.findElement(By.xpath("//div[@id=\"Wikipedia1_wikipedia-search-results\"]"));
		List<WebElement> links = SearchResult.findElements(By.tagName("a"));
		int LinksCount = links.size();
		System.out.println("Count of links: "+LinksCount);
		
		System.out.println("Print and hit links...");
		for(WebElement link:links) {
			System.out.println(link.getText());
			link.click();
		}

     	Set<String> WinIds = driver.getWindowHandles();
		
		for(String WindowId:WinIds) {
			String title = driver.switchTo().window(WindowId).getTitle();
			System.out.println(title);
			if(title.equals("Selenium in biology - Wikipedia")|| title.equals("Selenium - Wikipedia")||title.equals("Selenium disulfide - Wikipedia")) {
				driver.close();
			}
			
		}
		
	}

}
