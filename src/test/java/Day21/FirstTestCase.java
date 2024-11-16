package Day21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

/*
 Test Case 1 : - check  title of opencart
 1)launch browser(Chrome)
 2)open  url https://www.opencart.com/
 3)validate the title "your store"
 4)close browser
 * */
 

public class FirstTestCase {

	public static void main(String[] args) {
//		1)launch browser(Chrome)
		
//		ChromeDriver driver = new ChromeDriver();
		
		WebDriver driver = new ChromeDriver();
		
//		WebDriver driver = new EdgeDriver();
		
//		2)open  url https://www.opencart.com/ 
		driver.get("http://demo.opencart.com/");
		
//		3)validate the title "your store"
		
		String act_title = driver.getTitle(); 
		if(act_title.equals("OpenCart - Open Source Shopping Cart Solution")) {
			System.out.println("Test Pass..");
		}else {
			System.out.println("Test Fail...");
		}
		
//		 4)close browser
//		driver.close();
//		driver.quit();
		
		
		


	}

}
