package Day35;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Assignment11 {

	public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
		
		
		//Assignment 1
		//driver.get("https://testautomationpractice.blogspot.com/");
		//driver.manage().window().maximize();
		//Double Click
		/*
		WebElement field1 = driver.findElement(By.xpath("//input[@id=\"field1\"]"));
		WebElement field2 = driver.findElement(By.xpath("//input[@id=\"field2\"]"));
		WebElement button = driver.findElement(By.xpath("//button[normalize-space()='Copy Text']"));
		
		Actions act = new Actions(driver);
		act.doubleClick(button).perform();
		
		//Drag Drop
		
		WebElement drag = driver.findElement(By.xpath("//div[@id=\"draggable\"]"));
		WebElement drop = driver.findElement(By.xpath("//div[@id=\"droppable\"]"));
		
		act.dragAndDrop(drag, drop).perform();
		*/
		////Assignment 2
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		driver.manage().window().maximize();
		
		//Debt side
		//Element(BANK) which need to drag.		
    	 WebElement From1=driver.findElement(By.xpath("//*[@id='credit2']/a"));	
        
    	//Element(DEBIT SIDE) on which need to drop.		
    	WebElement To1=driver.findElement(By.xpath("//*[@id='bank']/li"));					
     
	//Element(SALES) which need to drag.		
    	WebElement From2=driver.findElement(By.xpath("//*[@id='credit1']/a"));
       
	//Element(CREDIT SIDE) on which need to drop.  		
    	WebElement To2=driver.findElement(By.xpath("//*[@id='loan']/li"));					
    
    	//Element(500) which need to drag.		
       WebElement From3=driver.findElement(By.xpath("//*[@id='fourth']/a"));					
       
       //Element(DEBIT SIDE) on which need to drop.		
    	WebElement To3=driver.findElement(By.xpath("//*[@id='amt7']/li"));					
        
	//Element(500) which need to drag.		
       WebElement From4=driver.findElement(By.xpath("//*[@id='fourth']/a"));					
       
       //Element(CREDIT SIDE) on which need to drop.		
    	WebElement To4=driver.findElement(By.xpath("//*[@id='amt8']/li"));					
     
	//Using Action class for drag and drop.		
    	Actions act=new Actions(driver);					

	//BANK drag and drop.		
    	act.dragAndDrop(From1, To1).build().perform();
       
	//SALES drag and drop.		
    	act.dragAndDrop(From2, To2).build().perform();
       
	//500 drag and drop debit side.		
    	act.dragAndDrop(From3, To3).build().perform();	
       
	//500 drag and drop credit side. 		
    	act.dragAndDrop(From4, To4).build().perform();		
     
		
		String button = driver.findElement(By.xpath("(//a[@class=\"button button-green\"])[1]")).getText();
		
		if(button.equals("Perfect!")) {
			System.out.println("Perfect displayed");
		}else {
			System.out.println("Perfect Not displayed");
		}
	}

}
