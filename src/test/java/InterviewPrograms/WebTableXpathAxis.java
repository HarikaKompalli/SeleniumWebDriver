package InterviewPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableXpathAxis {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://cosmocode.io/automation-practice-webtable/#google_vignette");
		List<WebElement> checkbox = driver.findElements(By.xpath("(//table[@id=\"countries\"]//tbody//tr//td[4][contains(text(),\"Euro\")])/preceding-sibling::td//input[@type=\"checkbox\"]"));

		for(WebElement ch:checkbox) {
			ch.click();
			
		}
		driver.quit();
	}

}
