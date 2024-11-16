package Day23;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CSSLocators {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/");
		driver.manage().window().maximize();
		
		//CSS Selector
		
		//tag id  tag#id
//		driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("T-shirts");
		
		//tag class  tag.class
//		driver.findElement(By.cssSelector("input.search-box-text")).sendKeys("shirt");
		
		//tag attribute tag[attribute]
//		driver.findElement(By.cssSelector("input[placeholder='Search store']")).sendKeys("shirt");
		
		//tag class attribute  tag.classname[attribute]
		driver.findElement(By.cssSelector("input.search-box-text[name='q']")).sendKeys("shirt");
		
	}

}
