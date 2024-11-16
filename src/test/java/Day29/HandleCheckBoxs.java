package Day29;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckBoxs {

	public static void main(String[] args){
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		//select check box
		WebElement checkbox = driver.findElement(By.xpath("//input[@id='sunday']"));
		
//		System.out.println("Before selction of check box: "+checkbox.isSelected());
//		checkbox.click();		
//		System.out.println("After selction of check box: "+checkbox.isSelected());
		
		//capturing all checkbox
		List<WebElement> checkBoxs = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
		
		System.out.println("Total checkboxs: "+checkBoxs.size());
		
		//Selecting all checkboxs
		//approch1
//		for(int i=0;i<checkBoxs.size();i++) {
//			checkBoxs.get(i).click();
//		}
		
//		for(WebElement i:checkBoxs) {
//			i.click();
//		}
		
		//select last 3 checkboxs
//		for(int i=4;i<checkBoxs.size();i++) {
//			checkBoxs.get(i).click();
//		}
		
		//select first 3 checkboxs
//		for(int i=0;i<3;i++) {
//			checkBoxs.get(i).click();
//		}
		//Select/unselect all checkboxs 
		//approch1 -for loop
//		for(int i=0;i<checkBoxs.size();i++) {
//				checkBoxs.get(i).click();
//			
//		}
		
		//approch2 -for each ..loop
//		for(WebElement i:checkBoxs) {
//			if(i.isSelected()) {
//				i.click();
//			}else {
//				i.click();
//			}
//			
//		}
		
		//Select specific checkbox randomly
		
//		for(int i=0;i<checkBoxs.size();i++) {
//			if(i==3||i==6||i==2) {
//				checkBoxs.get(i).click();
//			}
//		}
		
		
//		for(WebElement i:checkBoxs) {
//			if(i.equals("Sunday")||i.equals("Friday")) {
//				i.click();
//			}
//		}
		
		String weekname = "Sunday";
		
		switch(weekname)
		{
			case "Sunday" : driver.findElement(By.xpath("//input[@id='sunday']")).click();
							break;
			case "Monday" : driver.findElement(By.xpath("//input[@id='monday']")).click();
							break;
			case "Tuesday" : driver.findElement(By.xpath("//input[@id='tuesday']")).click();
							  break;
			case "Wednesday" : driver.findElement(By.xpath("//input[@id='wednesday']")).click();
							   break;
			case "Thursday" : driver.findElement(By.xpath("//input[@id='thursday']")).click();
							  break;
			case "Friday" : driver.findElement(By.xpath("//input[@id='friday']")).click();
							break;
			case "Saturday" : driver.findElement(By.xpath("//input[@id='saturday']")).click();
							   break;
			default   :System.out.println("Invalid week");				   
			
			
			
		}

	}

	

}
