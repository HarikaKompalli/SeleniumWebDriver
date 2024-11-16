package Day22;
import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
public class Assignment2 {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/index.html");
		driver.manage().window().maximize();
		
		//total no.of links and print them
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total number of links: "+links.size());
		Iterator it = links.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		//Total no of images
		
		List<WebElement> images = driver.findElements(By.tagName("img"));
		System.out.println("Total number of images: "+images.size());
		
		//click on any product link using link text and partal link text
		
		driver.findElement(By.linkText("Samsung galaxy s6")).click();	

	}

}
