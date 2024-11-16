package Day38;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class HeadlessTesting {

	public static void main(String[] args) {
		
	ChromeOptions options = new ChromeOptions()	;
	options.addArguments("--headless=new");//setting for headless mode of execution
	
	WebDriver driver = new ChromeDriver(options);
	driver.get("http://demo.opencart.com/");
	String act_title = driver.getTitle(); 
	if(act_title.equals("OpenCart - Open Source Shopping Cart Solution")) {
		System.out.println("Test Pass..");
	}else {
		System.out.println("Test Fail...");
	}
	driver.quit();

	}

}