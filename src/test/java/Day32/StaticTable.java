package Day32;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticTable {

	public static void main(String[] args) {
		WebDriver driver =new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//1) find total number of rows in a table
		int rows = driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
//		int rows = driver.findElements(By.tagName("tr")).size(); //This will also return no.of rows but it will return no of rows in entire page
		System.out.println("no.of rows: "+rows);
		
		//2) find total number of columns in a table
		int Coloums = driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
//		int Coloums = driver.findElements(By.tagName("th")).size(); //This will also return no.of Coloums but it will return no of rows in entire page
		System.out.println("no.of Coloums: "+Coloums);
		
		//3) Read data from specific row and column (ex: 5th row and 1st colum)
		
		String Book_name = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr[5]//td[1]")).getText();
		System.out.println("Book name is: "+Book_name);
		
		//4) read data from all the rows and colums
		
		for(int i=2;i<rows;i++) {
			for(int j=1;j<Coloums;j++) {
				String value = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+i+"]//td["+j+"]")).getText();
				System.out.println(value+"\t");
			}
		}
		
		//5) Print book names whose author is Mukesh
		for(int i=2;i<rows;i++) {
			String authorName = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+i+"]//td[2]")).getText();
				if(authorName.equals("Mukesh")) {
					String bookName = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr[\"+i+\"]//td[1]")).getText();
					System.out.println(bookName+"\t"+authorName);
				}	
		}
		
		//6) Find total price of all the books
			int total =0;
			for(int i=2;i<rows;i++) {
				String toPrice = driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tr["+i+"]//td[4]")).getText();
				total = total+Integer.parseInt(toPrice);
				
			}System.out.println("total price of all books: "+total);
	}

}
