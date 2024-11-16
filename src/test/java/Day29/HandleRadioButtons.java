package Day29;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleRadioButtons {
	public static void main(String[] args){
	WebDriver driver = new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	driver.get("https://testautomationpractice.blogspot.com/");
	driver.manage().window().maximize();
	//select check box
	WebElement female_rb = driver.findElement(By.xpath("//input[@id='female']"));
	WebElement male_rb = driver.findElement(By.xpath("//input[@id='male']"));
	System.out.println("Before Selection....");
	System.out.println("Selection status of female radio button: "+female_rb.isSelected());
	System.out.println("Selection status of male radio button: "+male_rb.isSelected());
	male_rb.click();
	
	System.out.println("After Selection....");
	System.out.println("Selection status of female radio button: "+female_rb.isSelected());
	System.out.println("Selection status of male radio button: "+male_rb.isSelected());
	
	
	}

}
