package Day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropDown {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		
		//Select single option from drop down
		driver.findElement(By.xpath("//input[@value=\"Java\"]")).click();
		
		//Capture all the options and find the size
		
		List<WebElement> options = driver.findElements(By.xpath("//ul[contains(@class,'multiselect-container')]//label"));
		
		System.out.println("Number of options: "+options.size());
		
		//Print the options from drop down
		
//		for(WebElement i:options) {
//			System.out.println(i.getText());
//		}
		
		//Select multiple options 
		//Approah1
//		for(WebElement i:options) {
//			if(i.getText().equals("java") || i.getText().equals("Oracle") || i.getText().equals("Python") || i.getText().equals("Angular")) {
//				i.click();				
//			}			
//		}
		//Approch2
		for(WebElement i:options) {
			String opt = i.getText();
			if(opt.equals("java")||opt.equals("Angular")) {
				i.click();
			}
			
		}

	}

}
