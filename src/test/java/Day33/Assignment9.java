package Day33;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment9 {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
//		1) Orangehrm table:  
//			https://opensource-demo.orangehrmlive.com/web/index.php/admin/viewSystemUsers

/*		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().window().maximize();
		//Login steps
		
		driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		//clicking on Admin  	
		driver.findElement(By.xpath("//span[normalize-space()='Admin']")).click();
		//read data from table
		List<WebElement> Username = driver.findElements(By.xpath("//div[@class=\"oxd-table-card\"]//div[1]//div[2]"));
		for(WebElement i:Username) {
			System.out.println("UserName: ");
			System.out.println(i.getText());
		}
		
		List<WebElement> UserRole = driver.findElements(By.xpath("//div[@class=\"oxd-table-card\"]//div[1]//div[3]"));
		for(WebElement i:UserRole) {
			System.out.println("Password: ");
			System.out.println(i.getText());
		}
		*/
		
//		2) Dynamic Table
//		https://practice.expandtesting.com/dynamic-table
		
		/*driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://practice.expandtesting.com/dynamic-table");
		driver.manage().window().maximize();
		//read data
		//read data
		int rows = driver.findElements(By.xpath("//table[@class='table table-striped']//tbody//tr")).size();
		String cpuload=null;
		
		for(int r=1;r<=rows;r++)
		{
			WebElement name=driver.findElement(By.xpath("//table[@class='table table-striped']//tbody//tr["+r+"]/td[1]"));
			
			if(name.getText().equals("Chrome"))
			{
				cpuload=name.findElement(By.xpath("following-sibling::*[contains(text(),'%')]")).getText();
				System.out.println(cpuload);
				break;
			}
	
		}

		
		*/
		
		//3) Paginatin table
//		https://testautomationpractice.blogspot.com/
		/*
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		int pagination = driver.findElements(By.xpath("//ul[@id=\"pagination\"]//li")).size();		
		for(int i=1;i<=pagination;i++) {
			if(i>1)
			{
				WebElement active_page=driver.findElement(By.xpath("//ul[@id='pagination']//li["+i+"]"));
				active_page.click();
				Thread.sleep(3000);
			}
			int Rows = driver.findElements(By.xpath("//table[@id=\"productTable\"]//tbody//tr")).size();
			for(int r=1;r<=Rows;r++) {
				driver.findElement(By.xpath("//table[@id=\"productTable\"]//tbody//tr["+r+"]//td[4]//input")).click();
			}
						
		}
		*/
		
//		4) Pagination & Dynamic table ( Web Scrapping)
//		https://money.rediff.com/gainers/bse/daily/groupall
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://money.rediff.com/gainers/bse/daily/groupall");
		driver.manage().window().maximize();
		
			
	}

}
