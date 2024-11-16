package Day35;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class DoubleClickAction {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml5_ev_ondblclick3");
		driver.manage().window().maximize();
		
		driver.switchTo().frame("iframeResult");
		WebElement Box1 = driver.findElement(By.xpath("//input[@id='field1']"));
		WebElement Box2 = driver.findElement(By.xpath("//input[@id='field2']"));
		WebElement Button = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		Box1.clear();
		Box1.sendKeys("Selenium");
		
		//Double click actions
		
		Actions dc = new Actions(driver);
		dc.doubleClick(Button).perform();
		
		//Validation: check box2 have same text as box1
		
//		if(Box2.getText().equals("Selenium")) {
//			System.out.println("text copied");
//		}else {
//			System.out.println("Not copied properly");
//		}
//		
		/////OR/////////
		
//		String text1 = Box1.getText();
//		String text2 = Box2.getText();
//		if(text1.equals(text2)) {
//			System.out.println("text copied");
//		}else {
//			System.out.println("Not copied properly");
//		}
		
	/////OR/////////
		
		String text2 = Box2.getAttribute("value");
		if(text2.equals("Selenium")) {
			System.out.println("text copied");
		}else {
		System.out.println("Not copied properly");
	}
		
		
		
		
		
	}

}
