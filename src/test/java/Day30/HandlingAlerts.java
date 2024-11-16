package Day30;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingAlerts {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.manage().window().maximize();
		
		//1)Normal alert with OK button
//		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Alert']")).click(); //open the alert
		
		//Approch1- save the alert to a variable using Alert method and the from that saved variable close it using 'accept()'
//		Alert myAlert = driver.switchTo().alert();
//		myAlert.accept();
		
		//Approch2 - Close the alert without saving to a variable
//		driver.switchTo().alert().accept();
		
		//2) Confirmation ALert - ok and cancel button
//		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Confirm']")).click(); //open the alert
		
//		driver.switchTo().alert().accept(); //close alert using ok button
//		driver.switchTo().alert().dismiss(); //close alert using cancel button
		
		//3)Prompt alert 
		
		driver.findElement(By.xpath("//button[normalize-space()='Click for JS Prompt']")).click(); //open the alert
		Alert myalert = driver.switchTo().alert();
		
		//validations
		System.out.println("Text message on my alert is: "+myalert.getText());//Get text which is there in above txt box in alert
		Thread.sleep(5000);
		myalert.sendKeys("Welcome");//Send/Enter text to text box in alert
		myalert.accept();
		
		//Validate text we passed and saved text is same or not
		
		String res = driver.findElement(By.xpath("//p[@id='result']")).getText();
		if(res.contains("Welcome")) {
			System.out.println("test passed");
		}else {
			System.out.println("test fail");
		}
		
		
		
		

	}

}
