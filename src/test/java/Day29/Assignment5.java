package Day29;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment5 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://practice.expandtesting.com/radio-buttons");
		driver.manage().window().maximize();
		//count radiobuttons
//		List<WebElement> checkboxs = driver.findElements(By.xpath("//input[@name='sport']"));
//		System.out.println("total no of checkboxs: "+checkboxs.size());
//		
//		for(int i=0;i<checkboxs.size();i++) {
//			System.out.println("check which checkbox is selected: "+checkboxs.get(i).getText()+" "+checkboxs.get(i).isSelected());
//			
//		}
		WebElement basketball = driver.findElement(By.xpath("//input[@id='basketball']"));
		WebElement football = driver.findElement(By.xpath("//input[@id='football']"));
		WebElement tennis = driver.findElement(By.xpath("//input[@id='tennis']"));
		
		System.out.println("Before Selection....");
		System.out.println("Selection status of  basketball radio button: "+basketball.isSelected());
		System.out.println("Selection status of football radio button: "+football.isSelected());
		System.out.println("Selection status of tennis radio button: "+tennis.isSelected());
		
		tennis.click();
		
		System.out.println("After Selection....");
		System.out.println("Selection status of basketball radio button: "+basketball.isSelected());
		System.out.println("Selection status of football radio button: "+football.isSelected());
		System.out.println("Selection status of tennis radio button: "+tennis.isSelected());
		
		

	}

}
