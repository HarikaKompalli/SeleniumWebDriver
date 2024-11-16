package Day35;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
public class MouseHoverAction {

	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com/");
		driver.manage().window().maximize();
		
		WebElement desktops = driver.findElement(By.xpath("//a[normalize-space()='Desktops']"));
		WebElement Mac = driver.findElement(By.xpath("(//a[normalize-space()='Mac (1)'])[1]"));
		
		//Create object for Actions class(Actions Class is a predefined class by Selenium)
		
		Actions act = new Actions(driver);
		
//		act.moveToElement(desktops).moveToElement(Mac).click().build().perform();//For every action we do in actions  method we need to call build(),perform() at end
		
		//Build will build/create the action
		//perform will perform/complete action
		
		act.moveToElement(desktops).moveToElement(Mac).click().perform();
		
		//we can only give perform as perform can internally where it will build and complete the action
		
	}

}
