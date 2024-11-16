package Day31;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment7 {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

/*1) Handle country dropdown with/without  using Select class:
       https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/
			a) count total number of options
			b) print all the options 
		       c) select one option */

		
		driver.get("https://phppot.com/demo/jquery-dependent-dropdown-list-countries-and-states/");
		driver.manage().window().maximize();
		
		WebElement selDrp = driver.findElement(By.xpath("//select[@id='country-list']"));
		Select drp = new Select(selDrp);
		
		//Select single value
		
//		drp.selectByIndex(2);
//		drp.selectByValue("5");
//		drp.selectByVisibleText("India");
		
		//count total number of options
		List<WebElement> Lopt = drp.getOptions();
		System.out.println("no .of options: "+Lopt.size());
		
		// print all the options 
		for(WebElement i:Lopt) {
			System.out.println(i.getText());
			
		}
		
		
		/*2) Hidden dropdown
		Login to OrangeHRM--> pim--> employee status*/

		
//		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
//		//Login steps
//				driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
//				driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
//				driver.findElement(By.xpath("//button[@type='submit']")).click();
//				
//				//clicking on PIM  	
//				driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();
//				
//				driver.findElement(By.xpath("//body[1]/div[1]/div[1]/div[2]/div[2]/div[1]/div[1]/div[2]/form[1]/div[1]/div[1]/div[3]/div[1]/div[2]/div[1]/div[1]/div[2]")).click();
//				
//				//Select Single option
//
////				driver.findElement(By.xpath("//span[contains(normalize-space(),'Full-Time Permanent')]")).click();
//				
//				Thread.sleep(5000);
//				
//				List<WebElement> MulOpt = driver.findElements(By.xpath("//div[@role='listbox']//span"));
//				System.out.println("no .of options: "+MulOpt.size());
//				
//				for(WebElement i:MulOpt) {
//					System.out.println(i.getText());
//				}
				
		/*3) https://testautomationpractice.blogspot.com/
			colors multi select box */

//				driver.get("https://testautomationpractice.blogspot.com/");
//				driver.findElement(By.xpath("//select[@id='colors']"));
//				
//				//select single option
////				driver.findElement(By.xpath("//option[@value=\"blue\"]")).click();
//				
//				//Select multiple options
//				List<WebElement> mulCoOp = driver.findElements(By.xpath("//select[@id='colors']//option"));
//				System.out.println("No.of Colour: " +mulCoOp.size());
//				
//				
//				for(WebElement i:mulCoOp) {
////					String color = i.getText();
//					if(i.getText().equals("Blue")||i.getText().equals("Yellow")) {
//						i.click();
//					}
//				}
				
				/*4) Google search box 
				  - find number of options search
				 - select one option.*/
		driver.manage().deleteAllCookies(); //deletes all the cookies in your browser
		
				driver.get("https://www.google.com/");
				driver.findElement(By.name("q")).sendKeys("Selenium");
				
				List<WebElement> search = driver.findElements(By.xpath("//ul[@role='listbox']//li"));
				System.out.println("No.of options: " +search.size());
				
			
				
				for(int i=0;i<search.size();i++)
				{
					System.out.println(search.get(i).getText());
					if(search.get(i).getText().equals("selenium"))
					{
						search.get(i).click();
						break;
					}
				}

				
	}

}
