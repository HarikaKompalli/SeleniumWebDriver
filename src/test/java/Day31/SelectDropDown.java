package Day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		WebElement dropDwnEle = driver.findElement(By.xpath("//select[@id='country']"));
		Select dropDwn = new Select(dropDwnEle);
		
		//Select Option from drop down
		
//		dropDwn.selectByVisibleText("Japan");  //Visible text is text which we see in UI
//		dropDwn.selectByValue("uk");  //Value is attribute of the select drop down
//		dropDwn.selectByIndex(3); //Index will not be visible in Developer tool/Inspection tab u need to count manually and give number
		
		
		//Capture/count full options in drop down
		
		List<WebElement> options = dropDwn.getOptions();
		System.out.println("Total no.of options: "+options.size());
		
		//Print all the options
		//Approch1
//		for(int i=0;i<options.size();i++) {
//			System.out.println(options.get(i).getText());
//		}
		//Approch2
		for(WebElement i:options) {
			System.out.println(i.getText());
		}
		
		

	}

}
