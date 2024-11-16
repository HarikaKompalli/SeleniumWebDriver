package Day30;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingFrame {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://ui.vision/demo/webtest/frames/");
		driver.manage().window().maximize();
		
		//Frame1
		WebElement frame1 = driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1);
		driver.findElement(By.xpath("//input[@type=\"text\" and @name=\"mytext1\"]")).sendKeys("Welcome");
		
		driver.switchTo().defaultContent();//Switch to main page
		
		//frame2
		WebElement frame2 = driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("hello");
		
		driver.switchTo().defaultContent();
		
		//frame3
		WebElement frame3 = driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Selenium");
		
		

		//switch to inner frame which is part of frame 3
		
		driver.switchTo().frame(0); //switched to inner frame
		driver.findElement(By.xpath("//div[@id='i5']//div[@class='vd3tt']")).click();
		
		driver.switchTo().defaultContent();
		
		
		
		
		
		
		
		

	}

}