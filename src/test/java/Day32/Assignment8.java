
package Day32;

import java.time.Duration;
import java.util.Arrays;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment8 {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get(" https://blazedemo.com/");
		driver.manage().window().maximize();
		//Choose your departure city:
		WebElement depaCit = driver.findElement(By.xpath("//select[@name='fromPort']"));
		Select depaCity = new Select(depaCit);
		depaCity.selectByIndex(3);
		
		//Choose your destination city:
		WebElement destCit = driver.findElement(By.xpath("//select[@name='toPort']"));
		Select destCity = new Select(destCit);
		destCity.selectByIndex(2);
		
		driver.findElement(By.xpath("//input[@type=\"submit\"]")).click();
		
		//1) find total number of rows in a table
			
				int rows = driver.findElements(By.xpath("//table[@class='table']//tbody//tr")).size(); //This will also return no.of rows but it will return no of rows in entire page
				System.out.println("no.of rows: "+rows);
				
				//2) find total number of columns in a table
				int Coloums = driver.findElements(By.xpath("//table[@class='table']//tbody//th")).size(); //This will also return no.of Coloums but it will return no of rows in entire page
				System.out.println("no.of Coloums: "+Coloums);
		
//				capture prices then store in array
				
				String PriceArr[] = new String[rows];
				for(int i=2;i<rows;i++) {
					String value = driver.findElement(By.xpath("//table//tr["+i+"]//td[6]")).getText();
					PriceArr[i-1]=value;//adding price into array
					
				}
				for(String arrvalue:PriceArr)
				{
					System.out.println(arrvalue);
				}
				
//				Sort prices then find lower price value
				try {
				Arrays.sort(PriceArr);
				String lowestPrice=PriceArr[0];
				System.out.println("Lower price:"+lowestPrice);
				}catch(Exception e) {
					 System.out.println("An error occurred at row  " + e.getMessage());
				}

	}

}

/*//find lowest price
		int lowestPrice = Integer.MAX_VALUE;
		for(int i=2;i<rows;i++) {
			for(int j=1;j<Coloums;j++) {
				String value = driver.findElement(By.xpath("//table//tr["+i+"]//td[6]")).getText();
				  value = value.replace("$", "").trim();
				  try {
				  int price = Integer.parseInt(value);
				System.out.println(price);
				if (price < lowestPrice) {
                    lowestPrice = price;
                }
				  }catch (NumberFormatException e) {
		                System.out.println("Failed to parse price: " + value);
		            }
				
			}
		}  System.out.println("The lowest price is: $" + lowestPrice);
		*/
