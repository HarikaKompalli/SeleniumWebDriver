package Day26;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ConditionalMethods {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.nopcommerce.com/register");
		driver.manage().window().maximize();
		
		//isDisplayed();
		boolean logo = driver.findElement(By.xpath("//img[@alt='nopCommerce demo store']")).isDisplayed();
		System.out.println(logo);
		
		//isEnabled();
		boolean check_text = driver.findElement(By.cssSelector("input#small-searchterms")).isEnabled();
		System.out.println(check_text);
		
		WebElement firstName = driver.findElement(By.xpath("//input[@id='FirstName']"));
		System.out.println("FirstName text box isEnabled: "+firstName.isEnabled());
		
		//isSelected();
		
		WebElement isselect_male = driver.findElement(By.xpath("//input[@id='gender-male']"));
		WebElement isselect_female = driver.findElement(By.cssSelector("input[id='gender-female']"));

		System.out.println("Before selection........");	
		System.out.println("IS male selected: "+isselect_male.isSelected());		
		System.out.println("is female selected: "+isselect_female.isSelected());
		
		System.out.println("After selection........");	
		isselect_male.click();
//		isselect_female.click();
		System.out.println("IS male selected: "+isselect_male.isSelected());		
		System.out.println("is female selected: "+isselect_female.isSelected());
		
		boolean newsletterstatus=driver.findElement(By.xpath("//input[@id='Newsletter']")).isSelected();
		System.out.println("News letter checkbos status:"+newsletterstatus );  //true
		
		
		
		
		
		

	}

}
