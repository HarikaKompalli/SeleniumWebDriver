package Day34;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment10 {
	static void selectFutureDate(WebDriver driver,String year,String month,String date) {
		//select year
				while(true) {
					String CurrentYear = driver.findElement(By.xpath("(//span[@class=\"ui-datepicker-year\"])")).getText();
					if(CurrentYear.equals(year)) {
						break;
						
					}
					driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
				}
				//select month
				WebElement select_month = driver.findElement(By.xpath("//select[@class=\"ui-datepicker-month\"]"));
				Select monDrp = new Select(select_month);
				monDrp.selectByVisibleText(month);
				
				//select date
				
				List<WebElement> Sel_date = driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//tbody//td"));
				for(WebElement i:Sel_date) {
					if(i.getText().equals(date)) {
						i.click();
						break;
					}
				}
	}
	static void selectPastDate(WebDriver driver,String year,String month,String date) {
		//select year
				while(true) {
					String CurrentYear = driver.findElement(By.xpath("(//span[@class=\"ui-datepicker-year\"])")).getText();
					if(CurrentYear.equals(year)) {
						break;
						
					}
					driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
				}
				//select month
				WebElement select_month = driver.findElement(By.xpath("//select[@class=\"ui-datepicker-month\"]"));
				Select monDrp = new Select(select_month);
				monDrp.selectByVisibleText(month);
				
				//select date
				
				List<WebElement> Sel_date = driver.findElements(By.xpath("//table[@class=\"ui-datepicker-calendar\"]//tbody//td"));
				for(WebElement i:Sel_date) {
					if(i.getText().equals(date)) {
						i.click();
						break;
					}
				}
	}

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		/* Test Case
		 1) Open https://dummy-tickets.com/buyticket
		 2) Click on Both
		 3) Select round trip
		 4) Under Flight,  select From, To, Departure, Return
		 
		 5) Under Hotel , select city, checkin, checkout
		 6) Click on submit
		  
		  
		 */
		
		driver.get("https://dummy-tickets.com/buyticket");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//a[normalize-space ()='Both']")).click();
		driver.findElement(By.xpath("//input[@value=\"roundtripfh\"]")).click();
		//Select from place
		driver.findElement(By.xpath("(//input[@name='source[]'])[5]")).sendKeys("Bhubaneswar ");
		
		List<WebElement> from=driver.findElements(By.xpath("//div[@class='suggestion-block']//p"));	
				
		for(WebElement fm:from)
			{
				if(fm.getText().contains("Bhubaneswar Airport"))
				{
					fm.click();
					break;
				}
					
			}
		
		//Select to Place
		driver.findElement(By.xpath("(//input[@name='destination[]'])[5]")).sendKeys("Bangalore International");
		List<WebElement> to=driver.findElements(By.xpath("(//ul[@class='suggestions-list'])//p"));	
		for(WebElement t:to)
		{
			if(t.getText().contains("HAL Bangalore International Airport,"))
			{
				t.click();
				break;
			}	
		}

		//expected data - departure
		String year="2025";
		String month="Jul";
		String date="10";
		
		//Select departure date
		driver.findElement(By.xpath("(//input[@name='departure[]'])[5]")).click();
		selectPastDate(driver,"2023","Aug","14");
		
		//select return data
		driver.findElement(By.xpath("(//input[@name=\"return[]\"])[2]")).click();
		selectFutureDate(driver,year,month,date);
		
		//Select city
		driver.findElement(By.xpath("((//input[@name=\"city[]\"]))[3]")).sendKeys("Adi");
		List<WebElement> citys = driver.findElements(By.xpath("(//ul[@class=\"suggestions-cities-list\"])[3]//li"));
		for(WebElement i:citys) {
			if(i.getText().equals("Adiyaman")) {
				i.click();
				break;
			}
		}
		
		//select checkIn
		driver.findElement(By.xpath("(//input[@name=\"checkin[]\"])[3]")).click();
		selectFutureDate(driver,"2025","Jul","13");
		//select checkOut
		driver.findElement(By.xpath("(//input[@name=\"checkout[]\"])[3]")).click();
		selectFutureDate(driver,"2025","Jul","19");
		
		//Select submit
		driver.findElement(By.xpath("(//input[@type=\"submit\"])[6]")).click();
		
		driver.quit();
		
		
		
	}

}
