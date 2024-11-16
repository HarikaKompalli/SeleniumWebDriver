package Day37;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavascriptExecutorDemo {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		//ChromeDriver driver=new ChromeDriver();
		
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		WebElement Name = driver.findElement(By.xpath("//input[@id=\"name\"]"));
		
		//Element intercepted exception 
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
//		JavascriptExecutor js = driver;
		
		//Send keys
		js.executeScript("arguments[0].setAttribute('value','Harika')", Name);
		
		//Click
		WebElement radioBtn = driver.findElement(By.xpath("//input[@id=\"male\"]"));
		js.executeScript("arguments[0].click()", radioBtn);
		
	}

}
