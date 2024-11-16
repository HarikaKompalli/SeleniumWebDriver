package Day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class HandleHiddenDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");
		
		driver.manage().window().maximize();
		
		//Login steps
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		//clicking on PIM  	
		driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();
		
		//clicked on dropdown
		driver.findElement(By.xpath("//div[6]//div[1]//div[2]//div[1]//div[1]//div[2]//i[1]")).click();
		
		//select single option 	
//		driver.findElement(By.xpath("//span[contains(text(),'Automaton Tester')]")).click();
		
		Thread.sleep(5000);
		//count number of options
		List<WebElement> options=driver.findElements(By.xpath("//div[@role='listbox']//span"));		
		System.out.println("Number of options:"+ options.size()); //29
		
		

		//printing options
		for(WebElement op:options)
		{
			System.out.println(op.getText());
		}

	}

}