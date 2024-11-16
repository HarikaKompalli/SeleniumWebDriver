package Day39;

import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

/*
1) Link    href="https://xyz.com"

2) https://xyz.com ---> server ---> status code

3)  status code>=400   broken link
 status code <400   not a broken link

 */
public class BrokenLinks {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.deadlinkcity.com/");
		driver.manage().window().maximize();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total no of links: "+links.size());
		
		int noOfBrokenLinks =0;
		for(WebElement i:links) {
			String hrefAtt = i.getAttribute("href");
			if(hrefAtt==null||hrefAtt.isEmpty()) 
			{
				System.out.println("href attribute value is null or empty so not possible to check");
				continue;
			}
			
			//hit URL to server
			try 
			{
				URL linkURL = new URL(hrefAtt);
				HttpURLConnection conn =(HttpURLConnection)linkURL.openConnection();
				conn.connect();
				
				if(conn.getResponseCode()>=400)
				{
				System.out.println(hrefAtt+"====>Broken links");
				noOfBrokenLinks++;
				}
				else
				{
				System.out.println(hrefAtt+"====>Not a Broken links");
				}
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		System.out.println("total no of broken links: "+noOfBrokenLinks);//total no of broken links: 42
	}

}
